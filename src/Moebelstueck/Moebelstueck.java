package Moebelstueck;
import java.io.Serializable;

/**
 * Die abstrakte Klasse Moebelstueck repräsentiert ein Möbelstück.
 * Sie enthält Informationen wie den Verkaufspreis, die Kategorie und den Bereich des Möbelstücks.
 */
public abstract class Moebelstueck implements Serializable {



    public enum Kategorie{Sitzmoebel, Tische, Lagerung, Liegemoebel}

    public enum Bereich {Kueche, Wohnen, Schlafen, Andere}

    private int verkaufspreis;
    private Kategorie kategorie;

    private Bereich bereich;

    public Kategorie getKategorie() {
        return kategorie;
    }

    public void setKategorie(Kategorie kategorie) {
        this.kategorie = kategorie;
    }

    public int getVerkaufspreis() {
        return verkaufspreis;
    }

    public void setVerkaufspreis(int verkaufspreis) {
        this.verkaufspreis = verkaufspreis;
    }

    public Bereich getBereich() {
        return bereich;
    }

    public void setBereich(Bereich bereich) {
        this.bereich = bereich;
    }

    public String toString() {
        return "Moebelstueck{" +
                "verkaufspreis=" + verkaufspreis +
                ", kategorie=" + kategorie +
                ", bereich=" + bereich +
                '}';
    }
}