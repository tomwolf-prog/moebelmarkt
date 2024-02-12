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

    public ArrayList<Lager<? extends Moebelstueck>> getMoebelstueckeLager(){      //private?
        ArrayList<Lager<? extends Moebelstueck>> moebelstuecke = new ArrayList<>();
        moebelstuecke.add(buerotischlager);
        moebelstuecke.add(couchtischlager);
        moebelstuecke.add(esstischlager);
        moebelstuecke.add(kuechentischlager);
        moebelstuecke.add(kuechenstuhllager);
        moebelstuecke.add(ohrensessellager);
        moebelstuecke.add(fernsehcouchlager);
        moebelstuecke.add(kuechenregallager);
        moebelstuecke.add(beistelltischlager);
        moebelstuecke.add(kleiderschranklager);
        moebelstuecke.add(doppelbettlager);
        moebelstuecke.add(balkonliegelager);
        return moebelstuecke;


    }
    // public ArrayList<ArrayList<Lager<? extends Moebelstueck>>> konstellationenBisBetrag(ArrayList<Lager<? extends Moebelstueck>> moebelstueckeLagerArrayList, int betragInCent){

    // }
    // public ArrayList<ArrayList<Lager<? extends Moebelstueck>>> konstellationenBisBetrag(ArrayList<Lager<? extends Moebelstueck>> moebelstueckeLagerArrayList, int betragInCent){
        
    //     ArrayList<ArrayList<Lager<? extends Moebelstueck>>> konstellationen = new ArrayList<ArrayList<Lager<? extends Moebelstueck>>>();
    //     if(moebelstueckeLagerArrayList.size() == 1){
    //         konstellationen.add(moebelstueckeLagerArrayList);
    //         return konstellationen;
    //     } else {
    //         for(int i = 0; i < moebelstueckeLagerArrayList.size(); i++){
    //             // ArrayList<Lager<? extends Moebelstueck>> copyMoebelstueckeLagerArrayList = new ArrayList<Lager<? extends Moebelstueck>>();

    //             // Collections.copy(copyMoebelstueckeLagerArrayList, moebelstueckeLagerArrayList);
    //             //create deep copy of moebelstueckeLagerArrayList
    //             ArrayList<Lager<? extends Moebelstueck>> copyMoebelstueckeLagerArrayList = moebelstueckeLagerArrayList.stream()
    //                 .collect(Collectors.toCollection(ArrayList::new));
                

    //             // copyMoebelstueckeLagerArrayList = moebelstueckeLagerArrayList.stream().map(Lager::new).collect(Collectors.toList());
    //             copyMoebelstueckeLagerArrayList.remove(i);
    //             int summe = 0;
    //             for (Lager<? extends Moebelstueck> l:  moebelstueckeLagerArrayList){
    //                 summe += l.getPreis();
    //             }
    //             if (summe > betragInCent){
    //                 konstellationen.addAll(konstellationenBisBetrag(copyMoebelstueckeLagerArrayList, betragInCent));              
    //             } else {
    //                 konstellationen.add(copyMoebelstueckeLagerArrayList);
    //                 return konstellationen;
    //             }

    //         }
    //         return konstellationen;
    //     }
    //     //return null; //Keine Konstellation; raise Error?
    // }
    public ArrayList<ArrayList<Lager<? extends Moebelstueck>>> konstellationenBisBetrag(ArrayList<Lager<? extends Moebelstueck>> moebelstueckeLagerArrayList, int betragInCent){
        ArrayList<Integer> konstellationIndex = new ArrayList<>();
        return konstellationenBisBetrag(moebelstueckeLagerArrayList, betragInCent, 0, 0, konstellationIndex);
    }
    


    public ArrayList<ArrayList<Lager<? extends Moebelstueck>>> konstellationenBisBetrag(ArrayList<Lager<? extends Moebelstueck>> moebelstueckeLagerArrayList,
     int betragInCent, int anfang, int summe, ArrayList<Integer> konstellationIndex){      
        
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
                if (!(anfang+1 == moebelstueckeLagerArrayList.size()))
                    konstellationen.addAll(konstellationenBisBetrag(moebelstueckeLagerArrayList, betragInCent, anfang+1, tmpSumme, copyKonstellationIndex));
                // for (int k = anfang+1; k < moebelstueckeLagerArrayList.size(); k++){
                //     ArrayList<Integer> copy2KonstellationIndex = new ArrayList<>();
                //     // ArrayList<Integer> unchangedCopyKonstellationIndex = new ArrayList<>();
                //     for (Integer j: konstellationIndex){
                //         copy2KonstellationIndex.add(j);
                //         // unchangedCopyKonstellationIndex.add(j);
                //     }
                //     konstellationen.addAll(konstellationenBisBetrag(moebelstueckeLagerArrayList, betragInCent, k, tmpSumme, copy2KonstellationIndex));
                // }
                    
            } else{
                if (!(anfang+1 == moebelstueckeLagerArrayList.size()))
                    konstellationen.addAll(konstellationenBisBetrag(moebelstueckeLagerArrayList, betragInCent, anfang+1, summe, copyKonstellationIndex));

                // for (int k = anfang+1; k < moebelstueckeLagerArrayList.size(); k++){
                //     ArrayList<Integer> copy2KonstellationIndex = new ArrayList<>();
                //     // ArrayList<Integer> unchangedCopyKonstellationIndex = new ArrayList<>();
                //     for (Integer j: konstellationIndex){
                //         copy2KonstellationIndex.add(j);
                //         // unchangedCopyKonstellationIndex.add(j);
                //     }
                //     konstellationen.addAll(konstellationenBisBetrag(moebelstueckeLagerArrayList, betragInCent, k, summe, copy2KonstellationIndex));
                // }    
                
            }

            // keine neue Konstellation
            if(!copyKonstellationIndex.equals(unchangedCopyKonstellationIndex)){

                // if (anfang+1 == moebelstueckeLagerArrayList.size()){

                // }

                ArrayList<Lager<? extends Moebelstueck>> konstellation = new ArrayList<>();
                for (Integer k: copyKonstellationIndex){
                    konstellation.add(moebelstueckeLagerArrayList.get(k));
                }
                konstellationen.add(konstellation);
            } 
            else {
                // konstellationIndex.remove(konstellationIndex.size()-1);
                ArrayList<Integer> copy2KonstellationIndex = new ArrayList<>();
                    for (Integer k: konstellationIndex){
                        copy2KonstellationIndex.add(k);
                    }
                if (anfang+2 < moebelstueckeLagerArrayList.size()-1){ 
                    konstellationen.addAll(konstellationenBisBetrag(moebelstueckeLagerArrayList, betragInCent, anfang+2, summe, copy2KonstellationIndex));
                }
            }
            if(!(anfang == i) /*&& anfang+1 == moebelstueckeLagerArrayList.size()*/){
                return konstellationen;  
            } /*else if (!(anfang == i) && !(anfang+1 == moebelstueckeLagerArrayList.size())) {
                // konstellationIndex.remove(konstellationIndex.size()-1);
                konstellationen.addAll(konstellationenBisBetrag(moebelstueckeLagerArrayList, betragInCent, anfang+1, summe, copyKonstellationIndex));

            }*/
            
            else {
            //     if(konstellationen.size() > 0 && anfang < moebelstueckeLagerArrayList.size()){
            //         ArrayList<Integer> copy2KonstellationIndex = new ArrayList<>();
            //         for (Integer k: konstellationIndex){
            //             copy2KonstellationIndex.add(k);
            //         }
            //         for (int j = konstellationIndex.get(konstellationen.size()-2); j > 0; j--){
            //             konstellationen.addAll(konstellationenBisBetrag(moebelstueckeLagerArrayList, betragInCent, konstellationIndex.get(konstellationen.size()-1), summe, copy2KonstellationIndex));
            //         }

                
                
                    anfang++;
                    konstellationIndex.clear();
                }
            // }    
            // return konstellationen;
            
        }
        
        return konstellationen;
            // for(int i = 0; i < moebelstueckeLagerArrayList.size(); i++){
            


            //     ArrayList<Lager<? extends Moebelstueck>> copyMoebelstueckeLagerArrayList = moebelstueckeLagerArrayList.stream()
            //         .collect(Collectors.toCollection(ArrayList::new));
            //         if (i==-1){
            //             copyMoebelstueckeLagerArrayList.remove(0);
            //         }
            //         else{
            //             copyMoebelstueckeLagerArrayList.remove(i);
            //         }
            //     for (int j = i; j < moebelstueckeLagerArrayList.size(); j++){
                    
            //         copyMoebelstueckeLagerArrayList.remove(i);//?
            //         copyMoebelstueckeLagerArrayList.remove(j);//?
            //         int summeTmp = summe + moebelstueckeLagerArrayList.get(j).getPreis();
            //         if (summeTmp > betragInCent){
            //             konstellationen.addAll(konstellationenBisBetrag(copyMoebelstueckeLagerArrayList, betragInCent));              
            //         } 

            //         // for (Lager<? extends Moebelstueck> l:  moebelstueckeLagerArrayList){
            //         //     summe += l.getPreis();
            //         // }
            //         // if (summe > betragInCent){
            //         //     konstellationen.addAll(konstellationenBisBetrag(copyMoebelstueckeLagerArrayList, betragInCent, summe));              
            //         // } else {
            //         //     konstellationen.add(copyMoebelstueckeLagerArrayList);
            //         //     return konstellationen;
            //         // }
            //     }
            //     if (konstellationen.size() == 0){
            //         konstellationen.add(copyMoebelstueckeLagerArrayList);
            //     }
            //     return konstellationen;
                // ArrayList<Lager<? extends Moebelstueck>> copyMoebelstueckeLagerArrayList = moebelstueckeLagerArrayList.stream()
                //     .collect(Collectors.toCollection(ArrayList::new));
                

                // // copyMoebelstueckeLagerArrayList = moebelstueckeLagerArrayList.stream().map(Lager::new).collect(Collectors.toList());
                // copyMoebelstueckeLagerArrayList.remove(0);
                // int summe = 0;
                // for (Lager<? extends Moebelstueck> l:  moebelstueckeLagerArrayList){
                //     summe += l.getPreis();
                // }
                // if (summe > betragInCent){
                //     konstellationen.addAll(konstellationenBisBetrag(copyMoebelstueckeLagerArrayList, betragInCent));              
                // } else {
                //     konstellationen.add(copyMoebelstueckeLagerArrayList);
                //     return konstellationen;
                // }

            
         
        // return konstellationen;
    }




    public ArrayList<Lager<? extends Moebelstueck>> besteKonstellation(){
        return null;
    }

    // public ArrayList<Moebelstueck> MoebelauswahlBisBetrag(int betragInCent){
    public ArrayList<ArrayList<Lager<? extends Moebelstueck>>> MoebelauswahlBisBetrag(int betragInCent){
        if (betragInCent < 0 || betragInCent >60000){
            return null; //raise some Error?
        }
        ArrayList<Lager<? extends Moebelstueck>> moebelstueckeLagerArrayList = getMoebelstueckeLager();
        ArrayList<Lager<? extends Moebelstueck>> copyMoebelstueckeLagerArrayList = moebelstueckeLagerArrayList.stream()
        .collect(Collectors.toCollection(ArrayList::new));

        for(Lager<? extends Moebelstueck> l: moebelstueckeLagerArrayList){
            if (l.getPreis() > betragInCent){
                copyMoebelstueckeLagerArrayList.remove(l);
            }
        }
        return konstellationenBisBetrag(copyMoebelstueckeLagerArrayList, betragInCent);

    }

}
