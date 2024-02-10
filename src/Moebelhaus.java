import Kategorie.*;
import Lager.Couchtischlager;
import java.lang.*;


public class Moebelhaus {
    public static void main(String[] args){

        Couchtischlager.getCouchtischlager();
        Tische tisch = new Tische();
        tisch.setMoebelart(Tische.Moebelart.Couchtisch);
    }
}
