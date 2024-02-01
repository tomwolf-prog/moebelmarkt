package Kategorie;

import Moebelstueck.Moebelstueck;

public class Liegemoebel extends Moebelstueck {

    public enum Laenge{
        A(160), B(180), C(220);

        private int numLaenge;

        Laenge(int Laenge){
            this.numLaenge = Laenge;
        }

        public  int getNumLaenge(){
            return numLaenge;
        }
    }

    public enum Moebelart{Doppelbett, Balkonliege}

    public Liegemoebel(Laenge laenge, Moebelart moebelart) {
        super();
        this.laenge = laenge;
        this.moebelart = moebelart;
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
