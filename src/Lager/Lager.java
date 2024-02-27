/**
 * Die Lager-Klasse repräsentiert einen Speicher für Möbelstücke.
 * Sie speichert die Preis- und Rabattinformationen für die Möbelstücke.
 * Die Klasse bietet Methoden zum Abrufen und Festlegen des Preises und Rabatts,
 * sowie zum Abrufen der Liste der im Lager gespeicherten Möbelstücke.
 */
package Lager;
import java.io.Serializable;
import java.util.ArrayList;

public class Lager<Moebelstueck> implements Serializable {
    private int preis;
    private boolean rabatt10;

    public ArrayList<Moebelstueck> moebelstueckArrayList = new ArrayList<Moebelstueck>();

    public Lager(){
        this.preis = 0;
        this.rabatt10 = false;
    }

    public Lager(int preis){
        this.preis = preis;
        this.rabatt10 = false;
    }

    /**
     * Gibt die Liste der im Lager gespeicherten Möbelstücke zurück.
     * @return Die Liste der Möbelstücke im Lager.
     */
    public ArrayList<Moebelstueck> getMoebel(){
        return moebelstueckArrayList;
    }

        /**
     * Gibt den Preis des Möbelstücks zurück.
     * Wenn der Rabatt aktiviert ist, wird der rabattierte Preis zurückgegeben.
     * Dabei wird der Preis um ein Cent erhöht (aufgerundet), wenn die Nachkommazahl über 5 ist.
     * @return Der Preis des Möbelstücks.
     */
    public int getPreis() {
        return rabatt10 ? (((preis * 9%10) >= 5) ? (preis*9/10)+1 : (preis*9/10) ) : preis;
    }

    /**
     * Legt den Preis des Möbelstücks fest.
     * @param preis Der Preis des Möbelstücks.
     */
    public void setPreis(int preis) {
        this.preis = preis;
    }

    /**
     * Gibt den Rabattstatus des Möbelstücks zurück.
     * @return Der Rabattstatus des Möbelstücks.
     */
    public boolean getRabatt10() {
        return rabatt10;
    }

    /**
     * Legt den Rabattstatus des Möbelstücks fest.
     * @param rabatt10 Der Rabattstatus des Möbelstücks.
     */
    public void setRabatt10(boolean rabatt10) {
        this.rabatt10 = rabatt10;
    }

    @Override
    public String toString() {
        return "Lager{" +
                "preis=" + preis +
                ", rabatt10=" + rabatt10 +
                '}';
    }
}
