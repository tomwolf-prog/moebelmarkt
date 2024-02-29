package Kategorie;

import Moebelstueck.Moebelstueck;

/**
 * Diese Klasse repräsentiert die Kategorie Lagerung eines Möbelstücks im Möbelmarkt.
 * Sie erbt von der Klasse Moebelstueck und erweitert sie um die Attribute Moebelart und Flaeche.
 */
public class Lagerung extends Moebelstueck {

    /**
     * Diese Enumeration repräsentiert verschiedene Flächenoptionen für die Lagerung.
     * Jede Flächenoption hat eine zugeordnete Nummer der Fläche.
     * Die Fläche ist die Sondereigenschaft der Kategorie Lagerung.
     */
    public enum Flaeche {
        s(25), m(50), l(100), xl(200);

        private int numFlaeche;

        Flaeche(int Flaeche) {
            this.numFlaeche = Flaeche;
        }

        /**
         * Gibt die Nummer der Fläche zurück.
         * 
         * @return die Nummer der Fläche
         */
        public int getNumFlaeche() {
            return numFlaeche;
        }
    }
    
    /**
    * Die verschiedenen Möbelarten, die in der Kategorie Lagerung vorhanden sind.
    */
    public enum Moebelart {Kuechenregal, Beistelltisch, Kleiderschrank}

    private Flaeche flaeche;
    private Moebelart moebelart;

    /**
     * Konstruktor für die Klasse Lagerung.
     * @param moebelart Die Art des Möbelstücks.
     * @param flaeche Die Fläche, die das Möbelstück einnimmt.
     * @param kategorie Die Kategorie, zu der das Möbelstück gehört.
     * @param bereich Der Bereich, in dem das Möbelstück gelagert wird.
     */
    public Lagerung(Moebelart moebelart, Flaeche flaeche, Kategorie kategorie, Bereich bereich) {
        super(kategorie, bereich);
        this.moebelart = moebelart;
        this.flaeche = flaeche;
    }

    /**
     * Gibt die Fläche der Lagerung zurück.
     *
     * @return Die Fläche der Lagerung.
     */
    public Flaeche getFlaeche() {
        return flaeche;
    }

    /**
     * Setzt die Fläche für die Lagerung.
     * 
     * @param flaeche die Fläche, die gesetzt werden soll
     */
    public void setFlaeche(Flaeche flaeche) {
        this.flaeche = flaeche;
    }

    /**
     * Gibt die Möbelart zurück.
     *
     * @return Die Möbelart.
     */
    public Moebelart getMoebelart() {
        return this.moebelart;
    }

    /**
     * Setzt die Möbelart für die Lagerung.
     * 
     * @param moebelart die Möbelart, die gesetzt werden soll
     */
    public void setMoebelart(Moebelart moebelart) {
        this.moebelart = moebelart;
    }

    /**
     * Gibt eine Zeichenkette zurück, die das Lagerungsobjekt repräsentiert.
     *
     * @return Eine Zeichenkette, die das Lagerungsobjekt repräsentiert.
     */
    @Override
    public String toString() {
        return "Lagerung{" +
                "flaeche=" + flaeche +
                ", moebelart=" + moebelart +
                '}';
    }
}
