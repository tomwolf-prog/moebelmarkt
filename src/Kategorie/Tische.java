package Kategorie;

import Moebelstueck.Moebelstueck;

public class Tische extends Moebelstueck {

    public enum Moebelart{Kuechentisch, Couchtisch, Buerotisch, Esstisch}

    public enum Hoehe{
        A(50), B(76), C(80);

         private int numHoehe;

         Hoehe(int numHoehe){
             this.numHoehe = numHoehe;
         }

         public  int getNumHoehe(){
             return numHoehe;
         }
    }

    public Tische() {super();}

    public Tische(Moebelart moebelart) {
        super();
        this.moebelart = moebelart;
    }

    public Tische(Moebelart moebelart, Hoehe hoehe) {
        super();
        this.moebelart = moebelart;
        this.hoehe = hoehe;
    }

    private Moebelart moebelart;
    private Hoehe hoehe;

    public Moebelart getMoebelart() {
        return moebelart;
    }

    public void setMoebelart(Moebelart moebelart) {
        this.moebelart = moebelart;
    }

    public Hoehe getHoehe() {
        return hoehe;
    }

    public void setHoehe(Hoehe hoehe) {
        this.hoehe = hoehe;
    }
}
