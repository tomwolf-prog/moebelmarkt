package Lager;

import Kategorie.Sitzmoebel;
import Kategorie.Tische;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

import Kategorie.Lagerung;
import Kategorie.Liegemoebel;
import Moebelstueck.Moebelstueck;

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

    public Buerotischlager getBuerotischlager() {return buerotischlager;}
    public void setBuerotischlager(Buerotischlager buerotischlager) {this.buerotischlager = buerotischlager;}
    public void aendereBuerotischlagerPreis(int neuerPreisInCent){this.buerotischlager.setPreis(neuerPreisInCent);}
    
    public Couchtischlager getCouchtischlager() {return couchtischlager;}
    public void setCouchtischlager(Couchtischlager couchtischlager) {this.couchtischlager = couchtischlager;}
    public void aendereCouchtischlagerPreis(int neuerPreisInCent){this.couchtischlager.setPreis(neuerPreisInCent);}

    public Esstischlager getEsstischlager() {return esstischlager;}
    public void setEsstischlager(Esstischlager esstischlager) {this.esstischlager = esstischlager;}
    public void aendereEsstischlagerPreis(int neuerPreisInCent){this.esstischlager.setPreis(neuerPreisInCent);}

    public Kuechentischlager getKuechentischlager() {return kuechentischlager;}
    public void setKuechentischlager(Kuechentischlager kuechentischlager) {this.kuechentischlager = kuechentischlager;}
    public void aendereKuechentischlagerPreis(int neuerPreisInCent){this.kuechentischlager.setPreis(neuerPreisInCent);}



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

    public Kuechenstuhllager getKuechenstuhllager() {return kuechenstuhllager;}
    public void setKuechenstuhllager(Kuechenstuhllager kuechenstuhllager) {this.kuechenstuhllager = kuechenstuhllager;}
    public void aendereKuechenstuhllagerPreis(int neuerPreisInCent){this.kuechenstuhllager.setPreis(neuerPreisInCent);}

    public Ohrensessellager getOhrensessellager() {return ohrensessellager;}
    public void setOhrensessellager(Ohrensessellager ohrensessellager) {this.ohrensessellager = ohrensessellager;}
    public void aendereOhrensessellagerPreis(int neuerPreisInCent){this.ohrensessellager.setPreis(neuerPreisInCent);}

    public Fernsehcouchlager getFernsehcouchlager() {return fernsehcouchlager;}
    public void setFernsehcouchlager(Fernsehcouchlager fernsehcouchlager) {this.fernsehcouchlager = fernsehcouchlager;}
    public void aendereFernsehcouchlagerPreis(int neuerPreisInCent){this.fernsehcouchlager.setPreis(neuerPreisInCent);}

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

    public Beistelltischlager getBeistelltischlager() {return beistelltischlager;}
    public void setBeistelltischlager(Beistelltischlager beistelltischlager) {this.beistelltischlager = beistelltischlager;}
    public void aendereBeistelltischlagerPreis(int neuerPreisInCent){this.beistelltischlager.setPreis(neuerPreisInCent);}

    public Kleiderschranklager getKleiderschranklager() {return kleiderschranklager;}
    public void setKleiderschranklager(Kleiderschranklager kleiderschranklager) {this.kleiderschranklager = kleiderschranklager;}
    public void aendereKleiderschranklagerPreis(int neuerPreisInCent){this.kleiderschranklager.setPreis(neuerPreisInCent);}

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

    public Balkonliegelager getBalkonliegelager() {return balkonliegelager;}
    public void setBalkonliegelager(Balkonliegelager balkonliegelager) {this.balkonliegelager = balkonliegelager;}
    public void aendereBalkonliegelagerPreis(int neuerPreisInCent){this.balkonliegelager.setPreis(neuerPreisInCent);}

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
     * @param betragInCent Der maximale Gesamtpreis in Cent.
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
        ArrayList<Lager<? extends Moebelstueck>> moebelstueckeLagerArrayList = new ArrayList<>();

        moebelstueckeLagerArrayList.add(buerotischlager);
        moebelstueckeLagerArrayList.add(couchtischlager);
        moebelstueckeLagerArrayList.add(esstischlager);
        moebelstueckeLagerArrayList.add(kuechentischlager);
        moebelstueckeLagerArrayList.add(kuechenstuhllager);
        moebelstueckeLagerArrayList.add(ohrensessellager);
        moebelstueckeLagerArrayList.add(fernsehcouchlager);
        moebelstueckeLagerArrayList.add(kuechenregallager);
        moebelstueckeLagerArrayList.add(beistelltischlager);
        moebelstueckeLagerArrayList.add(kleiderschranklager);
        moebelstueckeLagerArrayList.add(doppelbettlager);
        moebelstueckeLagerArrayList.add(balkonliegelager);

        ArrayList<Lager<? extends Moebelstueck>> copyMoebelstueckeLagerArrayList = moebelstueckeLagerArrayList.stream()
        .collect(Collectors.toCollection(ArrayList::new));

        for(Lager<? extends Moebelstueck> l: moebelstueckeLagerArrayList){
            if (l.getPreis() > betragInCent){
                copyMoebelstueckeLagerArrayList.remove(l);
            }
        }
        ArrayList<Integer> konstellationIndex = new ArrayList<>();

        return besteKonstellation(konstellationenBisBetrag(copyMoebelstueckeLagerArrayList, betragInCent, 0, 0, konstellationIndex));

    }

    

}
