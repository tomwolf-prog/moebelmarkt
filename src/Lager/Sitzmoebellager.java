package Lager;

import Kategorie.Sitzmoebel;
import Kategorie.Tische;

import java.util.ArrayList;
import java.util.List;

public class Sitzmoebellager extends Lager<Sitzmoebel> {

    public void removeSitzmoebel(Sitzmoebel.Sitzplaetze sitzplaetze){
        for (Sitzmoebel moebelstueck : moebelstueckArrayList){
            if (moebelstueck.getSitzplaetze() == sitzplaetze){
                moebelstueckArrayList.remove(moebelstueck);
                break;
            };
        }
    }

    public List<Sitzmoebel> listMitEigenschaft(Sitzmoebel.Sitzplaetze sitzplaetze){
        List<Sitzmoebel> sitzmoebelList = new ArrayList<Sitzmoebel>();
        for (Sitzmoebel moebelstueck : moebelstueckArrayList){
            if (moebelstueck.getSitzplaetze() == sitzplaetze){
                sitzmoebelList.add(moebelstueck);
            };
        }
        return sitzmoebelList;
    }

    public boolean addSitzmoebel(Sitzmoebel sitzmoebel) {
        return moebelstueckArrayList.add(sitzmoebel);
    }

}
