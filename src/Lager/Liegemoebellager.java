package Lager;
import Kategorie.Liegemoebel;
import Kategorie.Sitzmoebel;

import java.util.ArrayList;
import java.util.List;

public class Liegemoebellager extends Lager<Liegemoebel> {

    public void removeLiegemoebel(Liegemoebel.Laenge laenge){
        for (Liegemoebel moebelstueck : moebelstueckArrayList){
            if (moebelstueck.getLaenge() == laenge){
                moebelstueckArrayList.remove(moebelstueck);
                break;
            };
        }
    }

    public List<Liegemoebel> listMitEigenschaft(Liegemoebel.Laenge laenge){
        List<Liegemoebel> liegemoebelList = new ArrayList<Liegemoebel>();
        for (Liegemoebel moebelstueck : moebelstueckArrayList){
            if (moebelstueck.getLaenge() == laenge){
                liegemoebelList.add(moebelstueck);
            };
        }
        return liegemoebelList;
    }

    public boolean addLiegemoebel(Liegemoebel liegemoebel) {
        return moebelstueckArrayList.add(liegemoebel);
    }

    public int getLiegemoebellagerBestand(Liegemoebel.Laenge laenge){
        int bestand = 0;
        for (Liegemoebel moebelstueck : moebelstueckArrayList){
            if (moebelstueck.getLaenge() == laenge){
                bestand++;
            }
        }
        return bestand;
    }
}