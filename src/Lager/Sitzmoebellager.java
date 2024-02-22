package Lager;

import Kategorie.Sitzmoebel;
import Kategorie.Tische;

import java.util.ArrayList;
import java.util.List;

/**
 * Das Sitzmoebellager ist eine spezialisierte Klasse des allgemeinen Lagers für Sitzmöbel.
 * Es enthält Methoden zum Hinzufügen, Entfernen und Abrufen von Sitzmöbeln basierend auf der Anzahl der Sitzplätze.
 */
public class Sitzmoebellager extends Lager<Sitzmoebel> {

    /**
     * Entfernt ein Sitzmöbelstück aus dem Lager basierend auf der Anzahl der Sitzplätze.
     *
     * @param sitzplaetze Die Anzahl der Sitzplätze des zu entfernenden Sitzmöbelstücks.
     */
    public void removeSitzmoebel(Sitzmoebel.Sitzplaetze sitzplaetze){
        for (Sitzmoebel moebelstueck : moebelstueckArrayList){
            if (moebelstueck.getSitzplaetze() == sitzplaetze){
                moebelstueckArrayList.remove(moebelstueck);
                break;
            };
        }
    }

    /**
     * Gibt eine Liste von Sitzmöbeln zurück, die die angegebene Anzahl von Sitzplätzen haben.
     *
     * @param sitzplaetze Die Anzahl der Sitzplätze, nach der die Sitzmöbel gefiltert werden sollen.
     * @return Eine Liste von Sitzmöbeln mit der angegebenen Anzahl von Sitzplätzen.
     */
    public List<Sitzmoebel> listMitEigenschaft(Sitzmoebel.Sitzplaetze sitzplaetze){
        List<Sitzmoebel> sitzmoebelList = new ArrayList<Sitzmoebel>();
        for (Sitzmoebel moebelstueck : moebelstueckArrayList){
            if (moebelstueck.getSitzplaetze() == sitzplaetze){
                sitzmoebelList.add(moebelstueck);
            };
        }
        return sitzmoebelList;
    }

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
     * Gibt den Bestand an Sitzmöbeln mit der angegebenen Anzahl von Sitzplätzen im Lager zurück.
     *
     * @param sitzplaetze Die Anzahl der Sitzplätze, nach der der Bestand abgerufen werden soll.
     * @return Die Anzahl der Sitzmöbel mit der angegebenen Anzahl von Sitzplätzen im Lager.
     */
    public int getSitzmoebellagerBestand(Sitzmoebel.Sitzplaetze sitzplaetze){
        int bestand = 0;
        for (Sitzmoebel moebelstueck : moebelstueckArrayList){
            if (moebelstueck.getSitzplaetze() == sitzplaetze){
                bestand++;
            }
        }
        return bestand;
    }

}
