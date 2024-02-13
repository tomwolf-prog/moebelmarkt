package Lager;

import Kategorie.Sitzmoebel;
import Kategorie.Tische;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
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

    public Buerotischlager getBuerotischlager() {
        return buerotischlager;
    }

    public void setBuerotischlager(Buerotischlager buerotischlager) {
        this.buerotischlager = buerotischlager;
    }
    
    public Couchtischlager getCouchtischlager() {
        return couchtischlager;
    }

    public void setCouchtischlager(Couchtischlager couchtischlager) {
        this.couchtischlager = couchtischlager;
    }

    public Esstischlager getEsstischlager() {return esstischlager;}

    public void setEsstischlager(Esstischlager esstischlager) {this.esstischlager = esstischlager;}

    public Kuechentischlager getKuechentischlager() {return kuechentischlager;}

    public void setKuechentischlager(Kuechentischlager kuechentischlager) {this.kuechentischlager = kuechentischlager;}



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

    public Kuechenstuhllager getKuechenstuhllager() {
        return kuechenstuhllager;
    }

    public void setKuechenstuhllager(Kuechenstuhllager kuechenstuhllager) {
        this.kuechenstuhllager = kuechenstuhllager;
    }

    public Ohrensessellager getOhrensessellager() {
        return ohrensessellager;
    }

    public void setOhrensessellager(Ohrensessellager ohrensessellager) {
        this.ohrensessellager = ohrensessellager;
    }

    public Fernsehcouchlager getFernsehcouchlager() {
        return fernsehcouchlager;
    }

    public void setFernsehcouchlager(Fernsehcouchlager fernsehcouchlager) {
        this.fernsehcouchlager = fernsehcouchlager;
    }

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
    public Beistelltischlager getBeistelltischlager() {return beistelltischlager;}
    public void setBeistelltischlager(Beistelltischlager beistelltischlager) {this.beistelltischlager = beistelltischlager;}
    public Kleiderschranklager getKleiderschranklager() {return kleiderschranklager;}
    public void setKleiderschranklager(Kleiderschranklager kleiderschranklager) {this.kleiderschranklager = kleiderschranklager;}

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
    public Balkonliegelager getBalkonliegelager() {return balkonliegelager;}
    public void setBalkonliegelager(Balkonliegelager balkonliegelager) {this.balkonliegelager = balkonliegelager;}

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
     * Calculates all possible combinations of furniture storage configurations
     * that have a total price less than or equal to the specified amount.
     * Only furniture storage configurations with different furniture are created.
     * 
     * @param moebelstueckeLagerArrayList The list of furniture storage areas.
     * @param betragInCent The maximum total price in cents.
     * @param anfang The starting index for calculating combinations.
     * @param summe The current total price.
     * @param konstellationIndex The list of indices representing the current combination.
     * @return A list of lists, where each inner list represents a valid combination of furniture storage areas.
     *         Returns null if no valid combinations are found.
     */
    public ArrayList<ArrayList<Lager<? extends Moebelstueck>>> konstellationenBisBetrag(ArrayList<Lager<? extends Moebelstueck>> moebelstueckeLagerArrayList,
     int betragInCent, int anfang, int summe, ArrayList<Integer> konstellationIndex){      
        // All possible combinations of furniture storage configurations that have a total price less than or equal to the specified amount. 
        ArrayList<ArrayList<Lager<? extends Moebelstueck>>> konstellationen = new ArrayList<ArrayList<Lager<? extends Moebelstueck>>>();
        
        for(int i = 0; i < moebelstueckeLagerArrayList.size(); i++){

        ArrayList<Integer> copyKonstellationIndex = new ArrayList<>();
        ArrayList<Integer> unchangedCopyKonstellationIndex = new ArrayList<>();
        for (Integer j: konstellationIndex){
            copyKonstellationIndex.add(j);
            unchangedCopyKonstellationIndex.add(j);
        }
            int tmpSumme = summe + moebelstueckeLagerArrayList.get(anfang).getPreis();
            if (tmpSumme <= betragInCent){
                copyKonstellationIndex.add(anfang); 
                ArrayList<Lager<? extends Moebelstueck>> konstellation = new ArrayList<>();
                for (Integer k: copyKonstellationIndex){
                    konstellation.add(moebelstueckeLagerArrayList.get(k));
                }
                konstellationen.add(konstellation);
                if (!(anfang+1 == moebelstueckeLagerArrayList.size())){
                    for (int k = anfang+1; k < moebelstueckeLagerArrayList.size(); k++){
                        ArrayList<ArrayList<Lager<? extends Moebelstueck>>> weitereKonstellationen = konstellationenBisBetrag(moebelstueckeLagerArrayList, betragInCent, k, tmpSumme, copyKonstellationIndex);
                        if (weitereKonstellationen != null){
                            konstellationen.addAll(weitereKonstellationen);
                        }
                    }
                }    
            } else{
                return null;
            }
            if(!(anfang == i)){
                return konstellationen;  
            } else {
                    anfang++;
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


    public ArrayList<Lager<? extends Moebelstueck>> MoebelauswahlBisBetrag(int betragInCent){
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
