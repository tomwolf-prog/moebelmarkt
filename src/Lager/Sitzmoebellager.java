package Lager;

import Kategorie.Sitzmoebel;

public class Sitzmoebellager extends Lager<Sitzmoebel> {

    public void removeSitzmoebel(Sitzmoebel.Sitzplaetze sitzplaetze){
        for (Object moebelstueck : moebelstueckArrayList){
            if (((Sitzmoebel) moebelstueck).getSitzplaetze() == sitzplaetze){
                moebelstueckArrayList.remove(moebelstueck);
                break;
            };
        }
    }

    public boolean addSitzmoebel(Sitzmoebel sitzmoebel) {
        return moebelstueckArrayList.add(sitzmoebel);
    }

}
