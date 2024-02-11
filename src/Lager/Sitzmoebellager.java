package Lager;

import Kategorie.Sitzmoebel;
import Kategorie.Tische;

public class Sitzmoebellager extends Lager<Sitzmoebel> {

    public void removeTisch(Sitzmoebel.Sitzplaetze sitzplaetze){
        for (Object moebelstueck : moebelstueckArrayList){
            if (((Sitzmoebel) moebelstueck).getSitzplaetze() == sitzplaetze){
                moebelstueckArrayList.remove(moebelstueck);
                break;
            };
        }
    }

    public boolean addTisch(Sitzmoebel sitzmoebel) {
        return moebelstueckArrayList.add(sitzmoebel);
    }

}
