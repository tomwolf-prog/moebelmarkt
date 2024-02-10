package Lager;
import Kategorie.Tische;
import Moebelstueck.Moebelstueck;
import java.util.ArrayList;

public class Couchtischlager extends Lager{

    private static Couchtischlager couchtischlager;

    public static Couchtischlager getCouchtischlager(){
        if (couchtischlager == null){
            couchtischlager = new Couchtischlager();
        }
        return couchtischlager;
    }

    ArrayList<Moebelstueck> couchtischArray = new ArrayList<Moebelstueck>();

    public void removeCouchtisch(Tische.Hoehe hoehe){
        for (Moebelstueck moebelstueck : couchtischArray){
            if (((Tische) moebelstueck).getHoehe() == hoehe);
        }

    }

    public void addCouchtisch(Moebelstueck moebelstuecks) {
        couchtischArray.add((Moebelstueck) moebelstuecks);
    }


}
