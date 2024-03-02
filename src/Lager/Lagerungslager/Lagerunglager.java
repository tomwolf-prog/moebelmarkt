package Lager.Lagerungslager;

import Kategorie.Lagerung;
import Lager.Lager;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Diese Klasse repräsentiert ein Lagerungslager, das Möbelstücke der Kategorie Lagerung verwaltet.
 * Es erbt von der Klasse Lager und spezialisiert sich auf Lagerung-Objekte.
 * 
 * @see Lager
 * @author Sidney Schmidt, Tom Wolf
 */
public abstract class Lagerunglager extends Lager<Lagerung> {

    /**
     * Fügt eine Lagerung zum Lagerungslager hinzu.
     *
     * @param lagerung Die hinzuzufügende Lagerung.
     */
    public void addLagerung(Lagerung lagerung) {
        moebelstueckArrayList.add(lagerung);
    }

    /**
     * Entfernt eine Lagerung mit der angegebenen Fläche aus dem Lagerungslager.
     *
     * @param flaeche Die Fläche der zu entfernenden Lagerung.
     */
    public void removeLagerung(Lagerung.Flaeche flaeche) {
        for (Lagerung moebelstueck : moebelstueckArrayList) {
            if (moebelstueck.getFlaeche() == flaeche) {
                moebelstueckArrayList.remove(moebelstueck);
                break;
            }
        }
    }

    /**
     * Gibt eine Liste von Lagerungen zurück, die die angegebene Fläche haben.
     *
     * @param flaeche Die Fläche, nach der gesucht werden soll.
     * @return Eine Liste von Lagerungen mit der angegebenen Fläche.
     */
    public List<Lagerung> listMitEigenschaft(Lagerung.Flaeche flaeche) {
        List<Lagerung> lagerungList = new ArrayList<Lagerung>();
        for (Lagerung moebelstueck : moebelstueckArrayList) {
            if (moebelstueck.getFlaeche() == flaeche) {
                lagerungList.add(moebelstueck);
            }
            ;
        }
        return lagerungList;
    }

    /**
     * Gibt den Bestand des Lagerungslagers für eine bestimmte Fläche zurück.
     *
     * @param flaeche Die Fläche, für die der Bestand abgerufen werden soll.
     * @return Der Bestand des Lagerungslagers für die angegebene Fläche.
     */
    public int getLagerunglagerBestand(Lagerung.Flaeche flaeche) {
        int bestand = 0;
        for (Lagerung moebelstueck : moebelstueckArrayList) {
            if (moebelstueck.getFlaeche() == flaeche) {
                bestand++;
            }
        }
        return bestand;
    }

    /**
     * Schreibt das Lagerunglager-Objekt in eine Datei.
     * 
     * @param lagerunglager Das Lagerungslager-Objekt, das geschrieben werden soll.
     * @param file Der Dateipfad, in den das Objekt geschrieben werden soll.
     * @throws IOException Wenn ein Fehler beim Schreiben der Datei auftritt.
     */
    public void writeToFile(Lagerunglager lagerunglager, String file) throws IOException {
        FileOutputStream f = new FileOutputStream(new File(file));
        ObjectOutputStream o = new ObjectOutputStream(f);

        o.writeObject(lagerunglager);
        o.close();
        f.close();
    }

    /**
     * Liest das Lagerunglager-Objekt aus einer Datei.
     * 
     * @param file Der Dateipfad, aus dem das Objekt gelesen werden soll.
     * @throws IOException Wenn ein Fehler beim Schreiben der Datei auftritt.
     * @throws ClassNotFoundException Wenn die Klasse nicht gefunden wird.
     */
    public Lagerunglager readFromFile(String file) throws IOException, ClassNotFoundException {
        FileInputStream fi = new FileInputStream(new File(file));
        ObjectInputStream oi = new ObjectInputStream(fi);

        // Read objects
        return (Lagerunglager) oi.readObject();
    }

}