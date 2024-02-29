package Kategorie;

import Moebelstueck.Moebelstueck;

/**
 * Die Klasse Tische repräsentiert ein Möbelstück der Kategorie "Tische".
 * Sie erbt von der Klasse Moebelstueck und enthält Informationen über die Höhe und Art des Möbelstücks.
 * 
 * @see Moebelstueck
 * @author Sidney Schmidt, Tom Wolf
 */
public class Tische extends Moebelstueck {

    /**
     * Die Enumeration Hoehe definiert die verfügbaren Hoehen für Tische.
     * Jede Höhe hat eine zugehörige numerische Länge.
     */
    public enum Hoehe{
        s(50), m(76), l(80);

        private int numHoehe;

        Hoehe(int numHoehe){
            this.numHoehe = numHoehe;
        }

        /**
         * Gibt die Höhe des Tisches zurück.
         *
         * @return Die Höhe des Tisches.
         */
        public int getNumHoehe(){
            return numHoehe;
        }
    }

    public enum Moebelart{Kuechentisch, Couchtisch, Buerotisch, Esstisch}

    private Moebelart moebelart;
    private Hoehe hoehe;

    /**
     * Konstruktor für die Klasse Tische.
     * 
     * @param moebelart die Art des Tisches
     * @param hoehe die Höhe des Tisches
     * @param kategorie die Kategorie des Tisches
     * @param bereich der Bereich, in dem der Tisch sich befindet
     */
    public Tische(Moebelart moebelart, Hoehe hoehe, Kategorie kategorie, Bereich bereich) {
        super(kategorie, bereich);
        this.moebelart = moebelart;
        this.hoehe = hoehe;
    }

    /**
     * Gibt die Art des Tisches zurück.
     * 
     * @return die Art des Tisches
     */
    public Moebelart getMoebelart() {
        return moebelart;
    }

    /**
     * Setzt die Art des Tisches.
     * 
     * @param moebelart die Art des Tisches
     */
    public void setMoebelart(Moebelart moebelart) {
        this.moebelart = moebelart;
    }

    /**
     * Gibt die Höhe des Tisches zurück.
     * 
     * @return die Höhe des Tisches
     */
    public Hoehe getHoehe() {
        return hoehe;
    }

    /**
     * Setzt die Höhe des Tisches.
     * 
     * @param hoehe die Höhe des Tisches
     */
    public void setHoehe(Hoehe hoehe) {
        this.hoehe = hoehe;
    }
    /**
     * Gibt eine String-Repräsentation des Tisches zurück.
     * 
     * @return eine String-Repräsentation des Tisches
     */
    @Override
    public String toString() {
        return "Tische{" +
                "moebelart=" + moebelart +
                ", hoehe=" + hoehe +
                '}';
    }
}
