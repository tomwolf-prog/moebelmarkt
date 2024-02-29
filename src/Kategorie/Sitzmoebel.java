package Kategorie;


import Moebelstueck.Moebelstueck;


/**
 * Die Klasse Sitzmoebel repräsentiert ein Möbelstück der Kategorie "Sitzmoebel".
 * Sie erweitert die Klasse Moebelstueck.
 */
public class Sitzmoebel extends Moebelstueck {

    /**
     * Die Enumeration Sitzplaetze definiert die Anzahl der Sitzplätze für das Sitzmöbel.
     */
    public enum Sitzplaetze {
        eins(1), zwei(2), drei(3), vier(4);

        private int numSitzplaetze;

        Sitzplaetze(int numSitzplaetze) {
            this.numSitzplaetze = numSitzplaetze;
        }

        /**
         * Gibt die Anzahl der Sitzplätze zurück.
         * @return die Anzahl der Sitzplätze
         */
        public int getNumHoehe() {
            return numSitzplaetze;
        }
    }

    /**
     * Die Enumeration Moebelart definiert die verschiedenen Arten von Sitzmöbeln.
     */
    public enum Moebelart {Kuechenstuhl, Ohrensessel, Fernsehcouch}

    private Sitzplaetze sitzplaetze;
    private Moebelart moebelart;

    /**
     * Konstruktor für die Klasse Sitzmoebel.
     * @param moebelart die Art des Sitzmöbels
     * @param sitzplaetze die Anzahl der Sitzplätze
     * @param kategorie die Kategorie des Möbelstücks
     * @param bereich der Bereich, in dem das Möbelstück sich befindet
     */
    public Sitzmoebel(Moebelart moebelart, Sitzplaetze sitzplaetze, Kategorie kategorie, Bereich bereich) {
        super(kategorie, bereich);
        this.moebelart = moebelart;
        this.sitzplaetze = sitzplaetze;
    }

    /**
     * Gibt die Anzahl der Sitzplätze zurück.
     * @return die Anzahl der Sitzplätze
     */
    public Sitzplaetze getSitzplaetze() {
        return sitzplaetze;
    }

    /**
     * Setzt die Anzahl der Sitzplätze.
     * @param sitzplaetze die Anzahl der Sitzplätze
     */
    public void setSitzplaetze(Sitzplaetze sitzplaetze) {
        this.sitzplaetze = sitzplaetze;
    }

    /**
     * Gibt die Art des Sitzmöbels zurück.
     * @return die Art des Sitzmöbels
     */
    public Moebelart getMoebelart() {
        return moebelart;
    }

    /**
     * Setzt die Art des Sitzmöbels.
     * @param moebelart die Art des Sitzmöbels
     */
    public void setMoebelart(Moebelart moebelart) {
        this.moebelart = moebelart;
    }

    /**
     * Gibt eine String-Repräsentation des Sitzmöbels zurück.
     * @return eine String-Repräsentation des Sitzmöbels
     */
    @Override
    public String toString() {
        return "Sitzmoebel{" +
                "sitzplaetze=" + sitzplaetze +
                ", moebelart=" + moebelart +
                '}';
    }
}
