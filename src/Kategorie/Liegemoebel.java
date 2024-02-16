package Kategorie;

import Moebelstueck.Moebelstueck;

public class Liegemoebel extends Moebelstueck {

    public enum Laenge{
        s(160), m(180), l(220);

        private int numLaenge;

        Laenge(int Laenge){
            this.numLaenge = Laenge;
        }

        public  int getNumLaenge(){
            return numLaenge;
        }
    }

    public enum Moebelart{Doppelbett, Balkonliege}

    // public Liegemoebel(Moebelart moebelart) {
    //     super();
    //     this.moebelart = moebelart;
    // }

    // public Liegemoebel(Laenge laenge) {
    //     super();
    //     this.laenge = laenge;
    // }

    public Liegemoebel(Moebelart moebelart, Laenge laenge) {
        super();
        this.moebelart = moebelart;
        this.laenge = laenge;
    }

    private Laenge laenge;

    private Moebelart moebelart;

    public Laenge getLaenge() {
        return laenge;
    }

    public void setLaenge(Laenge laenge) {
        this.laenge = laenge;
    }

    public Moebelart getMoebelart() {
        return moebelart;
    }

    public void setMoebelart(Moebelart moebelart) {
        this.moebelart = moebelart;
    }
}
