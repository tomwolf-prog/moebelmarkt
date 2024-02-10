package Lager;

import Kategorie.Tische;
import Moebelstueck.Moebelstueck;

import java.util.ArrayList;

public class Tischlager extends Lager {

    public void removeTisch(Tische.Hoehe hoehe, ArrayList<Tische> TischArray){
        for (Tische tische : TischArray){
            if (tische.getHoehe() == hoehe){
                TischArray.remove(tische);
                break;
            };
        }
    }

    public void addTisch(Moebelstueck moebelstuecks/*, ArrayList<Tische> TischArray*/) {
        moebelstueckArrayList.add(moebelstuecks);
    }


}
