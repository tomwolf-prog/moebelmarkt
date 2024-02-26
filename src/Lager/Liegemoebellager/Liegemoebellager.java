package Lager.Liegemoebellager;

import Kategorie.Liegemoebel;
import Lager.Lager;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Diese Klasse repräsentiert ein Lager für Liegemoebel.
 * Es erbt von der Klasse Lager und spezialisiert sich auf Liegemoebel-Objekte.
 */
public abstract class Liegemoebellager extends Lager<Liegemoebel> {
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
            ;
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
            ;
        }
        return liegemoebelList;
    }

    /**
     * Fügt ein Liegemoebel-Objekt zum Lager hinzu.
     *
     * @param liegemoebel Das Liegemoebel-Objekt, das zum Lager hinzugefügt werden soll.
     * @return true, wenn das Liegemoebel-Objekt erfolgreich hinzugefügt wurde, ansonsten false.
     */
    public boolean addLiegemoebel(Liegemoebel liegemoebel) {
        return moebelstueckArrayList.add(liegemoebel);
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

    public void writeToFile(Liegemoebellager liegemoebellager, String file) throws IOException {
        FileOutputStream f = new FileOutputStream(new File(file));
        ObjectOutputStream o = new ObjectOutputStream(f);

        o.writeObject(liegemoebellager);
        o.close();
        f.close();
    }

    public Liegemoebellager readFromFile(String file) throws IOException, ClassNotFoundException {
        FileInputStream fi = new FileInputStream(new File(file));
        ObjectInputStream oi = new ObjectInputStream(fi);

        // Read objects
        return (Liegemoebellager) oi.readObject();

    }
}