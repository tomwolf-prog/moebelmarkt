package Lager;
import Kategorie.Tische;
import Kategorie.Tische.Moebelart;

public class Couchtischlager extends Tischlager{

    private Moebelart moebelart = Tische.Moebelart.Couchtisch;

    public boolean addTisch(Tische couchtisch) {
        if(couchtisch.getMoebelart().equals(moebelart)){
            moebelstueckArrayList.add(couchtisch);
            return true;
        }
        return false;
    }
}
