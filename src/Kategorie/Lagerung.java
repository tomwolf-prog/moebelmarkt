package Kategorie;

import Moebelstueck.Moebelstueck;

public class Lagerung extends Moebelstueck {

    public enum Flaeche{
        s(025), m(050), l(100), xl(200);

        private int numFlaeche;

        Flaeche(int Flaeche){
            this.numFlaeche = Flaeche;
        }

        public  int getNumFlaeche(){
            return numFlaeche;
        }
    }

    public enum Moebelart{Kuechenregal,Beistelltisch,Kleiderschrank}

    public Lagerung(Flaeche flaeche) {
        super();
        this.flaeche = flaeche;
    }

    private Flaeche flaeche;
    private Moebelart moebelart;

    public Flaeche getFlaeche() {
        return flaeche;
    }
    

    public void setFlaeche(Flaeche flaeche) {
        this.flaeche = flaeche;
    }

    public Moebelart getMoebelart() {
        return this.moebelart;
    }
    public void setMoebelart(Moebelart moebelart) {
        this.moebelart = moebelart;
    }
}
