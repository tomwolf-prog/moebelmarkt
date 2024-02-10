package Lager;

import Kategorie.Tische;
import Moebelstueck.Moebelstueck;

import java.util.ArrayList;

public class Tischlager extends Lager {

    public void removeTisch(Tische.Hoehe hoehe){
        for (Object moebelstueck : moebelstueckArrayList){
            if (((Tische) moebelstueck).getHoehe() == hoehe){
                moebelstueckArrayList.remove(moebelstueck);
                break;
            };
        }
    }

    public void addTisch(Moebelstueck moebelstuecks) {
        moebelstueckArrayList.add(moebelstuecks);
    }


}
