package Lager;
import Kategorie.Tische;
import Kategorie.Tische.Moebelart;

public class Buerotischlager extends Tischlager{
    private Moebelart moebelart = Tische.Moebelart.Buerotisch;

    public boolean addTisch(Tische couchtisch) {
        if(couchtisch.getMoebelart().equals(moebelart)){
            moebelstueckArrayList.add(couchtisch);
            return true;
        }
        return false;
    }


 }
