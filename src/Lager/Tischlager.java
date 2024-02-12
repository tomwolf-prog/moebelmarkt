package Lager;

import Kategorie.Tische;

public class Tischlager extends Lager<Tische> {

    public void removeTisch(Tische.Hoehe hoehe){
        for (Object moebelstueck : moebelstueckArrayList){
            if (((Tische) moebelstueck).getHoehe() == hoehe){
                moebelstueckArrayList.remove(moebelstueck);
                break;
            };
        }
    }

    public boolean addTisch(Tische tisch) {
        return moebelstueckArrayList.add(tisch);
    }

}
