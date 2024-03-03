package Lager.Liegemoebellager;

import Kategorie.Liegemoebel;
import Lager.Lager;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Diese Klasse repräsentiert ein Lager für Liegemoebel.
 * Es erbt von der Klasse Lager und spezialisiert sich auf Liegemoebel-Objekte.
 * 
 * @see Lager
 * @author Sidney Schmidt, Tom Wolf
 */
public abstract class Liegemoebellager extends Lager<Liegemoebel> {
    
    /**
     * Fügt ein Liegemoebel-Objekt zum Lager hinzu.
     *
     * @param liegemoebel Das Liegemoebel-Objekt, das zum Lager hinzugefügt werden soll.
     */
    public void addLiegemoebel(Liegemoebel liegemoebel) {
        moebelstueckArrayList.add(liegemoebel);
    }

    /**
     * Entfernt ein Liegemoebel-Objekt mit der angegebenen Länge aus dem Lager.
     *
     * @param laenge Die Länge des Liegemoebel-Objekts, das entfernt werden soll.
     */
    public void removeLiegemoebel(Liegemoebel.Laenge laenge) {
        for (Liegemoebel moebelstueck : moebelstueckArrayList) {
            if (moebelstueck.getLaenge() == laenge) {
                moebelstueckArrayList.remove(moebelstueck);
                break;
            }
        }
    }

    /**
     * Gibt eine Liste von Liegemoebel-Objekten zurück, die die angegebene Länge haben.
     *
     * @param laenge Die Länge der Liegemoebel-Objekte, die in der Liste enthalten sein sollen.
     * @return Eine Liste von Liegemoebel-Objekten mit der angegebenen Länge.
     */
    public List<Liegemoebel> listMitEigenschaft(Liegemoebel.Laenge laenge) {
        List<Liegemoebel> liegemoebelList = new ArrayList<Liegemoebel>();
        for (Liegemoebel moebelstueck : moebelstueckArrayList) {
            if (moebelstueck.getLaenge() == laenge) {
                liegemoebelList.add(moebelstueck);
            }
        }
        return liegemoebelList;
    }

    /**
     * Gibt den Bestand an Liegemoebel-Objekten mit der angegebenen Länge im Lager zurück.
     *
     * @param laenge Die Länge der Liegemoebel-Objekte, deren Bestand zurückgegeben werden soll.
     * @return Der Bestand an Liegemoebel-Objekten mit der angegebenen Länge im Lager.
     */
    public int getLiegemoebellagerBestand(Liegemoebel.Laenge laenge) {
        int bestand = 0;
        for (Liegemoebel moebelstueck : moebelstueckArrayList) {
            if (moebelstueck.getLaenge() == laenge) {
                bestand++;
            }
        }
        return bestand;
    }

    /**
     * Schreibt das Liegemoebellager-Objekt in eine Datei.
     * 
     * @param liegemoebellager Das Liegemoebellager-Objekt, das geschrieben werden soll.
     * @param file Der Dateipfad, in den das Liegemoebellager-Objekt geschrieben werden soll.
     * @throws IOException Wenn ein Fehler beim Schreiben in die Datei auftritt.
     */
    public void writeToFile(Liegemoebellager liegemoebellager, String file) throws IOException {
        FileOutputStream f = new FileOutputStream(new File(file));
        ObjectOutputStream o = new ObjectOutputStream(f);

        o.writeObject(liegemoebellager);
        o.close();
        f.close();
    }

    /**
     * Liest das Liegemoebellager-Objekt aus einer Datei.
     * 
     * @param file Der Dateipfad, aus dem das Objekt gelesen werden soll.
     * @throws IOException Wenn ein Fehler beim Schreiben der Datei auftritt.
     * @throws ClassNotFoundException Wenn die Klasse nicht gefunden wird.
     */
    public Liegemoebellager readFromFile(String file) throws IOException, ClassNotFoundException {
        FileInputStream fi = new FileInputStream(new File(file));
        ObjectInputStream oi = new ObjectInputStream(fi);

        // Read objects
        return (Liegemoebellager) oi.readObject();
    }
}