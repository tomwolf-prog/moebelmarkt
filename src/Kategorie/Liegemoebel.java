package Kategorie;

import Moebelstueck.Moebelstueck;

/**
 * Die Klasse Liegemoebel repräsentiert ein Möbelstück der Kategorie "Liegemoebel".
 * Sie erbt von der Klasse Moebelstueck und enthält Informationen über die Länge und Art des Möbelstücks.
 * 
 * @see Moebelstueck
 * @author Sidney Schmidt, Tom Wolf
 */
public class Liegemoebel extends Moebelstueck {

    /**
     * Die Enumeration Laenge definiert die verfügbaren Längen für das Liegemoebel.
     * Jede Länge hat eine zugehörige numerische Länge.
     */
    public enum Laenge{
        s(160), m(180), l(220);

        private int numLaenge;

        Laenge(int Laenge){
            this.numLaenge = Laenge;
        }

        /**
         * Gibt die numerische Länge des Liegemoebels zurück.
         * @return Die numerische Länge des Liegemoebels.
         */
        public  int getNumLaenge(){
            return numLaenge;
        }
    }

    /**
     * Die Enumeration Moebelart definiert die verfügbaren Arten von Liegemoebeln.
     */
    public enum Moebelart{Doppelbett, Balkonliege}

    private Laenge laenge;
    private Moebelart moebelart;

    /**
     * Erzeugt ein neues Liegemoebel-Objekt mit der angegebenen Möbelart, Länge, Kategorie und Bereich.
     * @param moebelart Die Möbelart des Liegemoebels.
     * @param laenge Die Länge des Liegemoebels.
     * @param kategorie Die Kategorie des Liegemoebels.
     * @param bereich Der Bereich, in dem sich das Liegemoebel befindet.
     */
    public Liegemoebel(Moebelart moebelart, Laenge laenge, Kategorie kategorie, Bereich bereich) {
        super(kategorie, bereich);
        this.moebelart = moebelart;
        this.laenge = laenge;
    }

    /**
     * Gibt die Länge des Liegemoebels zurück.
     * @return Die Länge des Liegemoebels.
     */
    public Laenge getLaenge() {
        return laenge;
    }

    /**
     * Legt die Länge des Liegemoebels fest.
     * @param laenge Die Länge des Liegemoebels.
     */
    public void setLaenge(Laenge laenge) {
        this.laenge = laenge;
    }

    /**
     * Gibt die Möbelart des Liegemoebels zurück.
     * @return Die Möbelart des Liegemoebels.
     */
    public Moebelart getMoebelart() {
        return moebelart;
    }

    /**
     * Legt die Möbelart des Liegemoebels fest.
     * @param moebelart Die Möbelart des Liegemoebels.
     */
    public void setMoebelart(Moebelart moebelart) {
        this.moebelart = moebelart;
    }

    /**
     * Gibt eine String-Repräsentation des Liegemoebels zurück.
     * @return Eine String-Repräsentation des Liegemoebels.
     */
    @Override
    public String toString() {
        return "Liegemoebel{" +
                "laenge=" + laenge +
                ", moebelart=" + moebelart +
                '}';
    }
}
