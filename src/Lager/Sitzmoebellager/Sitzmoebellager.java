package Lager.Sitzmoebellager;

import Kategorie.Sitzmoebel;
import Lager.Lager;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Das Sitzmoebellager ist eine spezialisierte Klasse des allgemeinen Lagers für Sitzmöbel.
 * Es enthält Methoden zum Hinzufügen, Entfernen und Abrufen von Sitzmöbeln basierend auf der Anzahl der Sitzplätze.
 * 
 * @see Lager
 * @author Sidney Schmidt, Tom Wolf
 */
public abstract class Sitzmoebellager extends Lager<Sitzmoebel> {

    /**
     * Fügt ein Sitzmöbelstück zum Lager hinzu.
     *
     * @param sitzmoebel Das hinzuzufügende Sitzmöbelstück.
     * @return true, wenn das Sitzmöbelstück erfolgreich hinzugefügt wurde, ansonsten false.
     */
    public boolean addSitzmoebel(Sitzmoebel sitzmoebel) {
        return moebelstueckArrayList.add(sitzmoebel);
    }

    /**
     * Entfernt ein Sitzmöbelstück aus dem Lager basierend auf der Anzahl der Sitzplätze eines Sitzmöbelstücks.
     *
     * @param sitzplaetze Die Anzahl der Sitzplätze des zu entfernenden Sitzmöbelstücks.
     */
    public void removeSitzmoebel(Sitzmoebel.Sitzplaetze sitzplaetze) {
        for (Sitzmoebel moebelstueck : moebelstueckArrayList) {
            if (moebelstueck.getSitzplaetze() == sitzplaetze) {
                moebelstueckArrayList.remove(moebelstueck);
                break;
            }
        }
    }

    /**
     * Gibt eine Liste von Sitzmöbeln zurück, die die angegebene Anzahl von Sitzplätzen haben.
     *
     * @param sitzplaetze Die Anzahl der Sitzplätze, nach der die Sitzmöbel gefiltert werden sollen.
     * @return Eine Liste von Sitzmöbeln mit der angegebenen Anzahl von Sitzplätzen.
     */
    public List<Sitzmoebel> listMitEigenschaft(Sitzmoebel.Sitzplaetze sitzplaetze) {
        List<Sitzmoebel> sitzmoebelList = new ArrayList<Sitzmoebel>();
        for (Sitzmoebel moebelstueck : moebelstueckArrayList) {
            if (moebelstueck.getSitzplaetze() == sitzplaetze) {
                sitzmoebelList.add(moebelstueck);
            }
        }
        return sitzmoebelList;
    }

    /**
     * Gibt den Bestand an Sitzmöbeln mit der angegebenen Anzahl von Sitzplätzen im Lager zurück.
     *
     * @param sitzplaetze Die Anzahl der Sitzplätze, nach der der Bestand abgerufen werden soll.
     * @return Die Anzahl der Sitzmöbel mit der angegebenen Anzahl von Sitzplätzen im Lager.
     */
    public int getSitzmoebellagerBestand(Sitzmoebel.Sitzplaetze sitzplaetze) {
        int bestand = 0;
        for (Sitzmoebel moebelstueck : moebelstueckArrayList) {
            if (moebelstueck.getSitzplaetze() == sitzplaetze) {
                bestand++;
            }
        }
        return bestand;
    }

    /**
     * Schreibt das Sitzmoebellager-Objekt in eine Datei.
     * 
     * @param sitzmoebellager Das Sitzmoebellager-Objekt, das geschrieben werden soll.
     * @param file Der Dateipfad, in den das Objekt geschrieben werden soll.
     * @throws IOException Wenn ein Fehler beim Schreiben in die Datei auftritt.
     */
    public void schreibeInDatei(Sitzmoebellager sitzmoebellager, String file) throws IOException {
        FileOutputStream f = new FileOutputStream(new File(file));
        ObjectOutputStream o = new ObjectOutputStream(f);

        o.writeObject(sitzmoebellager);
        o.close();
        f.close();
    }

    /**
     * Liest das Sitzmoebellager-Objekt aus einer Datei.
     * 
     * @param file Der Dateipfad, aus dem das Objekt gelesen werden soll.
     * @throws IOException Wenn ein Fehler beim Schreiben der Datei auftritt.
     * @throws ClassNotFoundException Wenn die Klasse nicht gefunden wird.
     */
    public Sitzmoebellager leseAusDatei(String file) throws IOException, ClassNotFoundException {
        FileInputStream fi = new FileInputStream(new File(file));
        ObjectInputStream oi = new ObjectInputStream(fi);

        // Lese Objekte
        return (Sitzmoebellager) oi.readObject();
    }

}
