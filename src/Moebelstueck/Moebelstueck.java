package Moebelstueck;

/**
 * Die abstrakte Klasse Moebelstueck repräsentiert ein Möbelstück.
 * Sie enthält Informationen wie den Verkaufspreis, die Kategorie und den Bereich des Möbelstücks.
 */
public abstract class Moebelstueck {


    public enum Kategorie{Sitzmoebel, Tische, Lagerung, Liegemoebel}

    public enum Bereich {Kueche, Wohnen, Schlafen, Andere}

    private int verkauspreis;
    private Kategorie kategorie;

    private Bereich bereich;

    public Kategorie getKategorie() {
        return kategorie;
    }

    public void setKategorie(Kategorie kategorie) {
        this.kategorie = kategorie;
    }

    public int getVerkauspreis() {
        return verkauspreis;
    }

    public void setVerkauspreis(int verkauspreis) {
        this.verkauspreis = verkauspreis;
    }

    public Bereich getBereich() {
        return bereich;
    }

    public void setBereich(Bereich bereich) {
        this.bereich = bereich;
    }

    public String toString() {
        return "Moebelstueck{" +
                "verkauspreis=" + verkauspreis +
                ", kategorie=" + kategorie +
                ", bereich=" + bereich +
                '}';
    }
}