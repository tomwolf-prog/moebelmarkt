package Kategorie;


import Moebelstueck.Moebelstueck;


public class Sitzmoebel extends Moebelstueck {

    // public Sitzmoebel() {
    //     super();
    // }

    // public Sitzmoebel(Moebelart moebelart) {
    //     super();
    //     this.moebelart = moebelart;
    // }

    // public Sitzmoebel(Sitzplaetze sitzplaetze) {
    //     super();
    //     this.sitzplaetze = sitzplaetze;
    // }

    public Sitzmoebel(Moebelart moebelart, Sitzplaetze sitzplaetze, Kategorie kategorie, Bereich bereich) {
        super(kategorie, bereich);
        this.moebelart = moebelart;
        this.sitzplaetze = sitzplaetze;
    }

    public enum Moebelart {Kuechenstuhl, Ohrensessel, Fernsehcouch}

    public enum Sitzplaetze {
        eins(1), zwei(2), drei(3), vier(4);

        private int numSitzplaetze;

        Sitzplaetze(int numSitzplaetze) {
            this.numSitzplaetze = numSitzplaetze;
        }

        public int getNumHoehe() {
            return numSitzplaetze;
        }
    }

    public Sitzplaetze getSitzplaetze() {
        return sitzplaetze;
    }

    public void setSitzplaetze(Sitzplaetze sitzplaetze) {
        this.sitzplaetze = sitzplaetze;
    }

    private Sitzplaetze sitzplaetze;
    private Moebelart moebelart;


    public Moebelart getMoebelart() {
        return moebelart;
    }

    public void setMoebelart(Moebelart moebelart) {
        this.moebelart = moebelart;
    }

    @Override
    public String toString() {
        return "Sitzmoebel{" +
                "sitzplaetze=" + sitzplaetze +
                ", moebelart=" + moebelart +
                '}';
    }
}
