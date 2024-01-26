package Kategorie;


import Moebstueck.Moebelstueck;
enum Moebelart{

}

public class Sitzmoebel extends Moebelstueck {

    public enum Moebelart{Kuechenstuhl,Ohrensessel,Fernsehcouch}

    public int getPlaetze() {
        return plaetze;
    }

    public void setPlaetze(int plaetze) {
        this.plaetze = plaetze;
    }

    private int plaetze;





}
