import Kategorie.*;
import Lager.*;
import Lager.Lager;

import java.lang.*;


public class Moebelhaus {
    public static void main(String[] args){
        Tische tisch = new Tische();
        tisch.setHoehe(Tische.Hoehe.s);
        tisch.setMoebelart(Tische.Moebelart.Couchtisch);

        Couchtischlager couchtischlager = new Couchtischlager();
        couchtischlager.setPreis(100);
        System.out.println(couchtischlager.getPreis());
        Buerotischlager buerotischlager = new Buerotischlager();
        buerotischlager.setPreis(101);
        System.out.println(couchtischlager.getPreis());
        System.out.println(buerotischlager.getPreis());

        couchtischlager.addTisch(tisch);
        System.out.println(couchtischlager.getMoebel());
        System.out.println(buerotischlager.getMoebel());


    }
}
