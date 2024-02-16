package Lager;

import Kategorie.Sitzmoebel;
import Kategorie.Tische;
import Kategorie.Tische.Moebelart;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import Kategorie.Lagerung;
import Kategorie.Liegemoebel;
import Moebelstueck.Moebelstueck;
import Moebelstueck.Moebelstueck.Bereich;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Lagersystem {
    //Tische
    private Buerotischlager buerotischlager;
    private Couchtischlager couchtischlager;
    private Esstischlager esstischlager;
    private Kuechentischlager kuechentischlager;

    //Sitzmoebel
    private Kuechenstuhllager kuechenstuhllager;
    private Ohrensessellager ohrensessellager;
    private Fernsehcouchlager fernsehcouchlager;

    //Lagerung
    private Kuechenregallager kuechenregallager;
    private Beistelltischlager beistelltischlager;  
    private Kleiderschranklager kleiderschranklager;

    //Liegemoebel
    private Doppelbettlager doppelbettlager;
    private Balkonliegelager balkonliegelager;


    public Lagersystem(){
        buerotischlager = new Buerotischlager();
        couchtischlager = new Couchtischlager();
        esstischlager = new Esstischlager();
        kuechentischlager = new Kuechentischlager();

        kuechenstuhllager = new Kuechenstuhllager();
        ohrensessellager = new Ohrensessellager();
        fernsehcouchlager = new Fernsehcouchlager();

        kuechenregallager = new Kuechenregallager();
        beistelltischlager = new Beistelltischlager();
        kleiderschranklager = new Kleiderschranklager();

        doppelbettlager = new Doppelbettlager();
        balkonliegelager = new Balkonliegelager();
    }

    public ArrayList<Lager<? extends Moebelstueck>> getLager(){
        ArrayList<Lager<? extends Moebelstueck>> lager = new ArrayList<>();
        lager.add(buerotischlager);
        lager.add(couchtischlager);
        lager.add(esstischlager);
        lager.add(kuechentischlager);
        lager.add(kuechenstuhllager);
        lager.add(ohrensessellager);
        lager.add(fernsehcouchlager);
        lager.add(kuechenregallager);
        lager.add(beistelltischlager);
        lager.add(kleiderschranklager);
        lager.add(doppelbettlager);
        lager.add(balkonliegelager);
        return lager;
    }

    public int berechenVerkaufspreisAllerMoebelImLager(){
        ArrayList<Lager<? extends Moebelstueck>> lager = getLager();
        int summe = 0;
        for (Lager<? extends Moebelstueck> l: lager){
            summe+= l.getPreis()*l.getMoebel().size();
        }
        return summe;
    }

    public int berechenVerkaufspreisAllerMoebelEinesBereichs(Bereich bereich){
        ArrayList<Lager<? extends Moebelstueck>> lager = getLager();
        int summe = 0;

        for (Lager<? extends Moebelstueck> l: lager){
            try {
                if (l.getMoebel().get(0).getBereich() == bereich){
                    summe+= l.getPreis()*l.getMoebel().size();
                }
            } catch (IndexOutOfBoundsException e){
                continue;
            }
        }
        return summe;
    }

    public int berechenVerkaufspreisAllerMoebelEinerKategorie(Moebelstueck.Kategorie kategorie){
        ArrayList<Lager<? extends Moebelstueck>> lager = getLager();
        int summe = 0;

        for (Lager<? extends Moebelstueck> l: lager){
            try {
                if (l.getMoebel().get(0).getKategorie() == kategorie){
                    summe+= l.getPreis()*l.getMoebel().size();
                }
            } catch (IndexOutOfBoundsException e){
                continue;
            }
        }
        return summe;
    }
    public Bereich getBereichMitGroesstemGesamtwert (){
        int kueche = berechenVerkaufspreisAllerMoebelEinesBereichs(Bereich.Kueche);
        int wohnen = berechenVerkaufspreisAllerMoebelEinesBereichs(Bereich.Wohnen);
        int schlafen = berechenVerkaufspreisAllerMoebelEinesBereichs(Bereich.Schlafen);
        int andere = berechenVerkaufspreisAllerMoebelEinesBereichs(Bereich.Andere);
        int max = Math.max(kueche, Math.max(wohnen, Math.max(schlafen, andere)));

        if (max == kueche){
            return Bereich.Kueche;
        } else if (max == wohnen){
            return Bereich.Wohnen;
        } else if (max == schlafen){
            return Bereich.Schlafen;
        } else {
            return Bereich.Andere;
        }
    }




    public Buerotischlager getBuerotischlager() {return buerotischlager;}
    public void setBuerotischlager(Buerotischlager buerotischlager) {this.buerotischlager = buerotischlager;}
    public void aendereBuerotischlagerPreis(int neuerPreisInCent){this.buerotischlager.setPreis(neuerPreisInCent);}
    public void erhoeheBuerotischlagerLagerbestand(int quantitativerBetrag, Tische.Hoehe hoehe){IntStream.range(0, quantitativerBetrag).forEach(i -> buerotischlager.addTisch(new Tische(Moebelart.Buerotisch, hoehe)));}
    public void mindereBuerotischlagerLagerbestand(int quantitativerBetrag, Tische.Hoehe hoehe){IntStream.range(0, quantitativerBetrag).forEach(i -> buerotischlager.removeTisch(hoehe));}
    
    public Couchtischlager getCouchtischlager() {return couchtischlager;}
    public void setCouchtischlager(Couchtischlager couchtischlager) {this.couchtischlager = couchtischlager;}
    public void aendereCouchtischlagerPreis(int neuerPreisInCent){this.couchtischlager.setPreis(neuerPreisInCent);}
    public void erhoeheCouchtischlagerLagerbestand(int quantitativerBetrag, Tische.Hoehe hoehe){IntStream.range(0, quantitativerBetrag).forEach(i -> couchtischlager.addTisch(new Tische(Moebelart.Couchtisch, hoehe)));}
    public void mindereCouchtischlagerLagerbestand(int quantitativerBetrag, Tische.Hoehe hoehe){IntStream.range(0, quantitativerBetrag).forEach(i -> couchtischlager.removeTisch(hoehe));}

    public Esstischlager getEsstischlager() {return esstischlager;}
    public void setEsstischlager(Esstischlager esstischlager) {this.esstischlager = esstischlager;}
    public void aendereEsstischlagerPreis(int neuerPreisInCent){this.esstischlager.setPreis(neuerPreisInCent);}
    public void erhoeheEsstischlagerLagerbestand(int quantitativerBetrag, Tische.Hoehe hoehe){IntStream.range(0, quantitativerBetrag).forEach(i -> esstischlager.addTisch(new Tische(Moebelart.Esstisch, hoehe)));}
    public void mindereEsstischlagerLagerbestand(int quantitativerBetrag, Tische.Hoehe hoehe){IntStream.range(0, quantitativerBetrag).forEach(i -> esstischlager.removeTisch(hoehe));}

    public Kuechentischlager getKuechentischlager() {return kuechentischlager;}
    public void setKuechentischlager(Kuechentischlager kuechentischlager) {this.kuechentischlager = kuechentischlager;}
    public void aendereKuechentischlagerPreis(int neuerPreisInCent){this.kuechentischlager.setPreis(neuerPreisInCent);}
    public void erhoeheKuechentischlagerLagerbestand(int quantitativerBetrag, Tische.Hoehe hoehe){IntStream.range(0, quantitativerBetrag).forEach(i -> kuechentischlager.addTisch(new Tische(Moebelart.Kuechentisch, hoehe)));}
    public void mindereKuechentischlagerLagerbestand(int quantitativerBetrag, Tische.Hoehe hoehe){IntStream.range(0, quantitativerBetrag).forEach(i -> kuechentischlager.removeTisch(hoehe));}



    public void addTisch(Tische tisch) {
        switch (tisch.getMoebelart()) {
            case Buerotisch:
                buerotischlager.addTisch(tisch);
                break;
            case Couchtisch:
                couchtischlager.addTisch(tisch);
                break;
            case Esstisch:
                esstischlager.addTisch(tisch);
            default:
                break;
        }
    }

    //Sitzmoebel
    public Kuechenstuhllager getKuechenstuhllager() {return kuechenstuhllager;}
    public void setKuechenstuhllager(Kuechenstuhllager kuechenstuhllager) {this.kuechenstuhllager = kuechenstuhllager;}
    public void aendereKuechenstuhllagerPreis(int neuerPreisInCent){this.kuechenstuhllager.setPreis(neuerPreisInCent);}
    public void erhoeheKuechenstuhllagerLagerbestand(int quantitativerBetrag, Sitzmoebel.Sitzplaetze sitzplaetze){IntStream.range(0, quantitativerBetrag).forEach(i -> kuechenstuhllager.addSitzmoebel(new Sitzmoebel(Sitzmoebel.Moebelart.Kuechenstuhl, sitzplaetze)));}
    public void mindereKuechenstuhllagerLagerbestand(int quantitativerBetrag, Sitzmoebel.Sitzplaetze sitzplaetze){IntStream.range(0, quantitativerBetrag).forEach(i -> kuechenstuhllager.removeSitzmoebel(sitzplaetze));}

    public Ohrensessellager getOhrensessellager() {return ohrensessellager;}
    public void setOhrensessellager(Ohrensessellager ohrensessellager) {this.ohrensessellager = ohrensessellager;}
    public void aendereOhrensessellagerPreis(int neuerPreisInCent){this.ohrensessellager.setPreis(neuerPreisInCent);}
    public void erhoeheOhrensessellagerLagerbestand(int quantitativerBetrag, Sitzmoebel.Sitzplaetze sitzplaetze){IntStream.range(0, quantitativerBetrag).forEach(i -> ohrensessellager.addSitzmoebel(new Sitzmoebel(Sitzmoebel.Moebelart.Ohrensessel, sitzplaetze)));}
    public void mindereOhrensessellagerLagerbestand(int quantitativerBetrag, Sitzmoebel.Sitzplaetze sitzplaetze){IntStream.range(0, quantitativerBetrag).forEach(i -> ohrensessellager.removeSitzmoebel(sitzplaetze));}

    public Fernsehcouchlager getFernsehcouchlager() {return fernsehcouchlager;}
    public void setFernsehcouchlager(Fernsehcouchlager fernsehcouchlager) {this.fernsehcouchlager = fernsehcouchlager;}
    public void aendereFernsehcouchlagerPreis(int neuerPreisInCent){this.fernsehcouchlager.setPreis(neuerPreisInCent);}
    public void erhoeheFernsehcouchlagerLagerbestand(int quantitativerBetrag, Sitzmoebel.Sitzplaetze sitzplaetze){IntStream.range(0, quantitativerBetrag).forEach(i -> fernsehcouchlager.addSitzmoebel(new Sitzmoebel(Sitzmoebel.Moebelart.Fernsehcouch, sitzplaetze)));}
    public void mindereFernsehcouchlagerLagerbestand(int quantitativerBetrag, Sitzmoebel.Sitzplaetze sitzplaetze){IntStream.range(0, quantitativerBetrag).forEach(i -> fernsehcouchlager.removeSitzmoebel(sitzplaetze));}

    public void addSitzmoebel(Sitzmoebel sitzmoebel) {
        switch (sitzmoebel.getMoebelart()) {
            case Kuechenstuhl:
                kuechenstuhllager.addSitzmoebel(sitzmoebel);
                break;
            case Ohrensessel:
                ohrensessellager.addSitzmoebel(sitzmoebel);
                break;
            case Fernsehcouch:
                fernsehcouchlager.addSitzmoebel(sitzmoebel);
            default:
                break;
        }
    }


    //Lagerung
    public Kuechenregallager getKuechenregallager() {return kuechenregallager;}
    public void setKuechenregallager(Kuechenregallager kuechenregallager) {this.kuechenregallager = kuechenregallager;}
    public void aendereKuechenregallagerPreis(int neuerPreisInCent){this.kuechenregallager.setPreis(neuerPreisInCent);}
    public void erhoeheKuechenregallagerLagerbestand(int quantitativerBetrag, Lagerung.Flaeche flaeche){IntStream.range(0, quantitativerBetrag).forEach(i -> kuechenregallager.addLagerung(new Lagerung(Lagerung.Moebelart.Kuechenregal, flaeche)));}
    public void mindereKuechenregallagerLagerbestand(int quantitativerBetrag, Lagerung.Flaeche flaeche){IntStream.range(0, quantitativerBetrag).forEach(i -> kuechenregallager.removeLagerung(flaeche));}

    public Beistelltischlager getBeistelltischlager() {return beistelltischlager;}
    public void setBeistelltischlager(Beistelltischlager beistelltischlager) {this.beistelltischlager = beistelltischlager;}
    public void aendereBeistelltischlagerPreis(int neuerPreisInCent){this.beistelltischlager.setPreis(neuerPreisInCent);}
    public void erhoeheBeistelltischlagerLagerbestand(int quantitativerBetrag, Lagerung.Flaeche flaeche){IntStream.range(0, quantitativerBetrag).forEach(i -> beistelltischlager.addLagerung(new Lagerung(Lagerung.Moebelart.Beistelltisch, flaeche)));}
    public void mindereBeistelltischlagerLagerbestand(int quantitativerBetrag, Lagerung.Flaeche flaeche){IntStream.range(0, quantitativerBetrag).forEach(i -> beistelltischlager.removeLagerung(flaeche));}

    public Kleiderschranklager getKleiderschranklager() {return kleiderschranklager;}
    public void setKleiderschranklager(Kleiderschranklager kleiderschranklager) {this.kleiderschranklager = kleiderschranklager;}
    public void aendereKleiderschranklagerPreis(int neuerPreisInCent){this.kleiderschranklager.setPreis(neuerPreisInCent);}
    public void erhoeheKleiderschranklagerLagerbestand(int quantitativerBetrag, Lagerung.Flaeche flaeche){IntStream.range(0, quantitativerBetrag).forEach(i -> kleiderschranklager.addLagerung(new Lagerung(Lagerung.Moebelart.Kleiderschrank, flaeche)));}
    public void mindereKleiderschranklagerLagerbestand(int quantitativerBetrag, Lagerung.Flaeche flaeche){IntStream.range(0, quantitativerBetrag).forEach(i -> kleiderschranklager.removeLagerung(flaeche));}

    public void addLagerung(Lagerung lagerung) {
        switch (lagerung.getMoebelart()) {
            case Kuechenregal:
                kuechenregallager.addLagerung(lagerung);
                break;
            case Kleiderschrank:
                kleiderschranklager.addLagerung(lagerung);
                break;
            default:
                break;
        }
    }
    public void removeLagerung(Lagerung.Moebelart moebelart, Lagerung.Flaeche flaeche) {
        switch (moebelart) {
            case Kuechenregal:
                kuechenregallager.removeLagerung(flaeche);
                break;
            case Kleiderschrank:
                kleiderschranklager.removeLagerung(flaeche);
                break;
            default:
                break;
        }
    }

    //Liegemoebel
    public Doppelbettlager getDoppelbettlager() {return doppelbettlager;}
    public void setDoppelbettlager(Doppelbettlager doppelbettlager) {this.doppelbettlager = doppelbettlager;}
    public void aendereDoppelbettlagerPreis(int neuerPreisInCent){this.doppelbettlager.setPreis(neuerPreisInCent);}
    public void erhoeheDoppelbettlagerLagerbestand(int quantitativerBetrag, Liegemoebel.Laenge laenge){IntStream.range(0, quantitativerBetrag).forEach(i -> doppelbettlager.addLiegemoebel(new Liegemoebel(Liegemoebel.Moebelart.Doppelbett, laenge)));}
    public void mindereDoppelbettlagerLagerbestand(int quantitativerBetrag, Liegemoebel.Laenge laenge){IntStream.range(0, quantitativerBetrag).forEach(i -> doppelbettlager.removeLiegemoebel(laenge));}
    

    public Balkonliegelager getBalkonliegelager() {return balkonliegelager;}
    public void setBalkonliegelager(Balkonliegelager balkonliegelager) {this.balkonliegelager = balkonliegelager;}
    public void aendereBalkonliegelagerPreis(int neuerPreisInCent){this.balkonliegelager.setPreis(neuerPreisInCent);}
    public void erhoeheBalkonliegelagerLagerbestand(int quantitativerBetrag, Liegemoebel.Laenge laenge){IntStream.range(0, quantitativerBetrag).forEach(i -> balkonliegelager.addLiegemoebel(new Liegemoebel(Liegemoebel.Moebelart.Balkonliege, laenge)));}
    public void mindereBalkonliegelagerLagerbestand(int quantitativerBetrag, Liegemoebel.Laenge laenge){IntStream.range(0, quantitativerBetrag).forEach(i -> balkonliegelager.removeLiegemoebel(laenge));}

    public void addLiegemoebel(Liegemoebel liegemoebel) {
        switch (liegemoebel.getMoebelart()) {
            case Doppelbett:
                doppelbettlager.addLiegemoebel(liegemoebel);
                break;
            case Balkonliege:
                balkonliegelager.addLiegemoebel(liegemoebel);
                break;
            default:
                break;
        }
    }
    public void removeLiegemoebel(Liegemoebel.Moebelart moebelart, Liegemoebel.Laenge laenge) {
        switch (moebelart) {
            case Doppelbett:
                doppelbettlager.removeLiegemoebel(laenge);
                break;
            case Balkonliege:
                balkonliegelager.removeLiegemoebel(laenge);
                break;
            default:
                break;
        }
    }

    public void addMoebelstueck(Moebelstueck moebelstueck) {
        switch (moebelstueck.getKategorie()) {
            case Lagerung:
                addLagerung((Lagerung) moebelstueck);
                break;
            case Liegemoebel:
                addLiegemoebel((Liegemoebel) moebelstueck);
                break;
            case Tische:
                addTisch((Tische) moebelstueck);
                break;
            case Sitzmoebel:
                addSitzmoebel((Sitzmoebel) moebelstueck);
            default:
                break;
        }
    }
 
    /**
     * Berechnet alle möglichen Kombinationen von Möbellager-Konfigurationen,
     * deren Gesamtpreis kleiner oder gleich dem angegebenen Betrag ist.
     * Es werden nur Möbellager-Konfigurationen mit unterschiedlichen Möbeln erstellt.
     * 
     * @param moebelstueckeLagerArrayList Die Liste der Möbellagerbereiche.
     * @param maximalBetragInCent Der maximale Gesamtpreis in Cent.
     * @param rekursionsIndex Der Startindex für die Berechnung der Kombinationen.
     * @param aktuelleSumme Der aktuelle Gesamtpreis.
     * @param konstellationIndex Die Liste der Indizes, die die aktuelle Kombination repräsentieren.
     * @return Eine Liste von Listen, wobei jede innere Liste eine gültige Kombination von Möbellagerbereichen darstellt.
     *         Gibt null zurück, wenn keine gültigen Kombinationen gefunden werden.
     */
    public ArrayList<ArrayList<Lager<? extends Moebelstueck>>> konstellationenBisBetrag(ArrayList<Lager<? extends Moebelstueck>> moebelstueckeLagerArrayList,
     int maximalBetragInCent, int rekursionsIndex, int aktuelleSumme, ArrayList<Integer> konstellationIndex){      
        // Alle möglichen Kombinationen von Möbellager-Konfigurationen, deren Gesamtpreis kleiner oder gleich dem angegebenen Betrag ist.
        ArrayList<ArrayList<Lager<? extends Moebelstueck>>> konstellationen = new ArrayList<ArrayList<Lager<? extends Moebelstueck>>>();
        
        for(int i = 0; i < moebelstueckeLagerArrayList.size(); i++){

        ArrayList<Integer> copyKonstellationIndex = new ArrayList<>();
        for (Integer j: konstellationIndex){
            copyKonstellationIndex.add(j);
        }
            int tmpaktuelleSumme = aktuelleSumme + moebelstueckeLagerArrayList.get(rekursionsIndex).getPreis();
            if (tmpaktuelleSumme <= maximalBetragInCent){
                copyKonstellationIndex.add(rekursionsIndex); 
                ArrayList<Lager<? extends Moebelstueck>> konstellation = new ArrayList<>();
                for (Integer k: copyKonstellationIndex){
                    konstellation.add(moebelstueckeLagerArrayList.get(k));
                }
                konstellationen.add(konstellation);
                if (!(rekursionsIndex+1 == moebelstueckeLagerArrayList.size())){
                    for (int k = rekursionsIndex+1; k < moebelstueckeLagerArrayList.size(); k++){
                        ArrayList<ArrayList<Lager<? extends Moebelstueck>>> weitereKonstellationen = konstellationenBisBetrag(moebelstueckeLagerArrayList, maximalBetragInCent, k, tmpaktuelleSumme, copyKonstellationIndex);
                        if (weitereKonstellationen != null){
                            konstellationen.addAll(weitereKonstellationen);
                        }
                    }
                }    
            } else{
                return null;
            }
            if(!(rekursionsIndex == i)){
                return konstellationen;  
            } else {
                    rekursionsIndex++;
                    konstellationIndex.clear();
                }
        }
        return konstellationen;
    }


    private ArrayList<Lager<? extends Moebelstueck>> besteKonstellation(ArrayList<ArrayList<Lager<? extends Moebelstueck>>> konstellationen){
        if (konstellationen.size() == 0){
            return null;
        }
        Collections.sort(konstellationen, (a, b) -> {
            int sumA = a.stream().mapToInt(lager -> lager.getPreis()).sum();
            int sumB = b.stream().mapToInt(lager -> lager.getPreis()).sum();
            return sumB - sumA;
        });
        return konstellationen.get(0);
    }


    public ArrayList<Lager<? extends Moebelstueck>> moebelauswahlBisBetrag(int betragInCent){
        if (betragInCent < 0 || betragInCent >60000){
            return null; //raise some Error?
        }
        ArrayList<Lager<? extends Moebelstueck>> lager = getLager();

        ArrayList<Lager<? extends Moebelstueck>> copyLager = lager.stream()
        .collect(Collectors.toCollection(ArrayList::new));

        for(Lager<? extends Moebelstueck> l: lager){
            if (l.getPreis() > betragInCent){
                copyLager.remove(l);
            }
        }
        ArrayList<Integer> konstellationIndex = new ArrayList<>();

        return besteKonstellation(konstellationenBisBetrag(copyLager, betragInCent, 0, 0, konstellationIndex));

    }

public void displayMoebelMitEigenschaft(){
    ArrayList<Lager<? extends Moebelstueck>> lager = getLager();
    for (Lager<? extends Moebelstueck> l: lager){
        for (Moebelstueck m: l.getMoebel()){
            System.out.println(m.toString());
        }

    }
}
    public List<Lagerung> searchLagerungMitEigenschaft(Lagerung.Flaeche flaeche) {
        List<Lagerung> lagerungList = kleiderschranklager.listMitEigenschaft(flaeche);
        lagerungList.add((Lagerung) kuechenregallager.listMitEigenschaft(flaeche));
        return lagerungList;
    }

    public List<Liegemoebel> searchLiegemoebelMitEigenschaft(Liegemoebel.Laenge laenge) {
        List<Liegemoebel> liegemoebelList = doppelbettlager.listMitEigenschaft(laenge);
        liegemoebelList.add((Liegemoebel) balkonliegelager.listMitEigenschaft(laenge));
        return liegemoebelList;
    }

    public List<Tische> searchTischMitEigenschaft(Tische.Hoehe hoehe) {
        List tischeList = new ArrayList<>();
        tischeList.add(buerotischlager.listTischeMitEigenschaft(hoehe));
        tischeList.add(couchtischlager.listTischeMitEigenschaft(hoehe));
        tischeList.add(esstischlager.listTischeMitEigenschaft(hoehe));
        return tischeList;
    }

    public List<Sitzmoebel> searchSitzmoebelMitEigenschaft(Sitzmoebel.Sitzplaetze sitzplaetze) {
        List<Sitzmoebel> sitzmoebelList = kuechenstuhllager.listMitEigenschaft(sitzplaetze);
        sitzmoebelList.add((Sitzmoebel) ohrensessellager.listMitEigenschaft(sitzplaetze));
        sitzmoebelList.add((Sitzmoebel) fernsehcouchlager.listMitEigenschaft(sitzplaetze));
        return sitzmoebelList;
    }

}
