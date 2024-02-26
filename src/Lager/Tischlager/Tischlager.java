package Lager.Tischlager;

import Kategorie.Tische;
import Lager.Lager;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Das Tischlager ist eine spezielle Art von Lager, das Tische verwaltet.
 * Es erbt von der generischen Klasse Lager<Tische>.
 */
public class Tischlager extends Lager<Tische> {

    /**
     * Entfernt einen Tisch aus dem Lager basierend auf der angegebenen Höhe.
     *
     * @param hoehe Die Höhe des zu entfernenden Tisches.
     */
    public void removeTisch(Tische.Hoehe hoehe) {
        for (Tische moebelstueck : moebelstueckArrayList) {
            if (moebelstueck.getHoehe() == hoehe) {
                moebelstueckArrayList.remove(moebelstueck);
                break;
            }
        }
    }

    /**
     * Gibt eine Liste von Tischen zurück, die die angegebene Höhe haben.
     *
     * @param hoehe Die Höhe der gesuchten Tische.
     * @return Eine Liste von Tischen mit der angegebenen Höhe.
     */
    public List<Tische> listTischeMitEigenschaft(Tische.Hoehe hoehe) {
        List<Tische> tischeList = new ArrayList<Tische>();
        for (Tische moebelstueck : moebelstueckArrayList) {
            if (moebelstueck.getHoehe() == hoehe) {
                tischeList.add(moebelstueck);
            }
            ;
        }
        return tischeList;
    }

    /**
     * Fügt einen Tisch zum Lager hinzu.
     *
     * @param tisch Der hinzuzufügende Tisch.
     * @return true, wenn der Tisch erfolgreich hinzugefügt wurde, ansonsten false.
     */
    public boolean addTisch(Tische tisch) {
        return moebelstueckArrayList.add(tisch);
    }

    /**
     * Gibt den Bestand an Tischen im Lager basierend auf der angegebenen Höhe zurück.
     *
     * @param hoehe Die Höhe der gesuchten Tische.
     * @return Der Bestand an Tischen mit der angegebenen Höhe.
     */
    public int getTischlagerBestand(Tische.Hoehe hoehe) {
        int bestand = 0;
        for (Tische moebelstueck : moebelstueckArrayList) {
            if (moebelstueck.getHoehe() == hoehe) {
                bestand++;
            }
        }
        return bestand;
    }

    public void writeToFile(Tischlager tischlager, String file) throws IOException {
        FileOutputStream f = new FileOutputStream(new File(file));
        ObjectOutputStream o = new ObjectOutputStream(f);

        o.writeObject(tischlager);
        o.close();
        f.close();
    }

    public Tischlager readFromFile(String file) throws IOException, ClassNotFoundException {
        FileInputStream fi = new FileInputStream(new File(file));
        ObjectInputStream oi = new ObjectInputStream(fi);

        // Read objects
        return (Tischlager) oi.readObject();

    }

}
