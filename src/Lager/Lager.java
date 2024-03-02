package Lager;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Die Lager-Klasse repräsentiert einen Speicher für Möbelstücke.
 * Sie speichert die Preis- und Rabattinformationen für die Möbelstücke.
 * Die Klasse bietet Methoden zum Abrufen und Festlegen des Preises und Rabatts,
 * sowie zum Abrufen der Liste der im Lager gespeicherten Möbelstücke.
 *
 * @param <K> Die Kategorie des Möbelstücks, das im Lager gespeichert wird.
 * @author Sidney Schmidt, Tom Wolf
 * @see Serializable
 */
public abstract class Lager<K> implements Serializable {
    private int preis;
    private boolean rabatt10;

    public ArrayList<K> moebelstueckArrayList = new ArrayList<K>();

    /**
     * Konstruktor für die Klasse Lager.
     * Setzt den Preis des Möbelstücks auf den angegebenen Wert und deaktiviert den Rabatt.
     *
     * @param preis Der Preis des Möbelstücks.
     */
    public Lager(int preis) {
        this.preis = preis;
        this.rabatt10 = false;
    }

    /**
     * Konstruktor für die Klasse Lager.
     * Setzt den Preis des Möbelstücks auf 0 und deaktiviert den Rabatt.
     */
    public Lager() {
        this.preis = 0;
        this.rabatt10 = false;
    }


    /**
     * Gibt die Liste der im Lager gespeicherten Möbelstücke zurück.
     *
     * @return Die Liste der Möbelstücke im Lager.
     */
    public ArrayList<K> getMoebel() {
        return moebelstueckArrayList;
    }

    /**
     * Gibt den Preis des Möbelstücks zurück.
     * Wenn der Rabatt aktiviert ist, wird der rabattierte Preis zurückgegeben.
     * Dabei wird der Preis um ein Cent erhöht (aufgerundet), wenn die Nachkommazahl über 5 ist.
     *
     * @return Der Preis des Möbelstücks.
     */
    public int getPreis() {
        return rabatt10 ? (((preis * 9 % 10) >= 5) ? (preis * 9 / 10) + 1 : (preis * 9 / 10)) : preis;
    }

    /**
     * Gibt den Preis des Möbelstücks zurück ohne Berücksichtigung des Rabatts.
     * Dabei wird der Preis um ein Cent erhöht (aufgerundet), wenn die Nachkommazahl über 5 ist.
     *
     * @return Der Preis des Möbelstücks.
     */
    public int getPreisOhneRabatt() {
        return preis;
    }

    /**
     * Legt den Preis des Möbelstücks fest.
     *
     * @param preis Der Preis des Möbelstücks.
     */
    public void setPreis(int preis) {
        this.preis = preis;
    }

    /**
     * Gibt den Rabattstatus des Möbelstücks zurück.
     *
     * @return Der Rabattstatus des Möbelstücks.
     */
    public boolean getRabatt10() {
        return rabatt10;
    }

    /**
     * Legt den Rabattstatus des Möbelstücks fest.
     *
     * @param rabatt10 Der Rabattstatus des Möbelstücks.
     */
    public void setRabatt10(boolean rabatt10) {
        this.rabatt10 = rabatt10;
    }

    /**
     * Gibt eine Zeichenkette zurück, die das Lager-Objekt repräsentiert.
     *
     * @return Eine Zeichenkette, die das Lager-Objekt repräsentiert.
     */
    @Override
    public String toString() {
        return moebelstueckArrayList.toString();
    }
}
