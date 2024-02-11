package Kategorie;


import Moebelstueck.Moebelstueck;


public class Sitzmoebel extends Moebelstueck {

    public Sitzmoebel() {
        super();
    }

    public Sitzmoebel(Sitzplaetze sitzplaetze) {
        super();
        this.sitzplaetze = sitzplaetze;
    }

    public enum Moebelart{Kuechenstuhl,Ohrensessel,Fernsehcouch}

    public enum Sitzplaetze{eins,zwei,drei,vier}

    public Sitzplaetze getSitzplaetze() {
        return sitzplaetze;
    }

    public void setSitzplaetze(Sitzplaetze sitzplaetze) {
        this.sitzplaetze = sitzplaetze;
    }

    private Sitzplaetze sitzplaetze;


    public Moebelart getMoebelart() {
        return moebelart;
    }

    public void setMoebelart(Moebelart moebelart) {
        this.moebelart = moebelart;
    }

    private Moebelart moebelart;





}
