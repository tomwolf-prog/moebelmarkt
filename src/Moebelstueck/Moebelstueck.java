package Moebelstueck;
import java.io.Serializable;

/**
 * Die abstrakte Klasse Moebelstueck repräsentiert ein Möbelstück.
 * Sie enthält Informationen wie den Verkaufspreis, die Kategorie und den Bereich des Möbelstücks.
 */
public abstract class Moebelstueck implements Serializable {

    /**
     * Die Aufzählung der Kategorien für Möbelstücke.
     * Mögliche Kategorien sind: Sitzmöbel, Tische, Lagerung, Liegemöbel.
     */
    public enum Kategorie{Sitzmoebel, Tische, Lagerung, Liegemoebel}

    /**
     * Die Aufzählung der Bereiche für die Möbelstücke bestimmt sind.
     * Mögliche Bereiche sind: Küche, Wohnen, Schlafen, Andere.
     */
    public enum Bereich {Kueche, Wohnen, Schlafen, Andere}

    private int verkaufspreis;
    private Kategorie kategorie;

    private Bereich bereich;

    /**
     * Konstruktor für die Klasse Moebelstueck.
     * @param kategorie Die Kategorie, zu der das Möbelstück gehört.
     * @param bereich Der Bereich für das das Möbelstück bestimmt ist.
     */
    public Moebelstueck(Kategorie kategorie, Bereich bereich) {
        this.kategorie = kategorie;
        this.bereich = bereich;
    }

    /**
     * Gibt die Kategorie des Möbelstücks zurück.
     *
     * @return Die Kategorie des Möbelstücks.
     */
    public Kategorie getKategorie() {
        return kategorie;
    }

    /**
     * Setzt die Kategorie des Möbelstücks.
     *
     * @param kategorie Die Kategorie des Möbelstücks.
     */
    public void setKategorie(Kategorie kategorie) {
        this.kategorie = kategorie;
    }

    /**
     * Gibt den Verkaufspreis des Möbelstücks zurück.
     *
     * @return Der Verkaufspreis des Möbelstücks.
     */
    public int getVerkaufspreis() {
        return verkaufspreis;
    }

    /**
     * Setzt den Verkaufspreis des Möbelstücks.
     *
     * @param verkaufspreis Der Verkaufspreis des Möbelstücks.
     */
    public void setVerkaufspreis(int verkaufspreis) {
        this.verkaufspreis = verkaufspreis;
    }

    /**
     * Gibt den Bereich des Möbelstücks zurück.
     *
     * @return Der Bereich des Möbelstücks.
     */
    public Bereich getBereich() {
        return bereich;
    }

    /**
     * Setzt den Bereich des Möbelstücks.
     *
     * @param bereich Der Bereich des Möbelstücks.
     */
    public void setBereich(Bereich bereich) {
        this.bereich = bereich;
    }

    /**
     * Gibt eine String-Repräsentation des Möbelstücks zurück.
     *
     * @return Eine String-Repräsentation des Möbelstücks.
     */
    @Override
    public String toString() {
        return "Moebelstueck{" +
                "verkaufspreis=" + verkaufspreis +
                ", kategorie=" + kategorie +
                ", bereich=" + bereich +
                '}';
    }
}