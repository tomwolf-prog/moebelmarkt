package Lager;
import Kategorie.Liegemoebel;

public class Liegemoebellager extends Lager<Liegemoebel> {

    public void removeLiegemoebel(Liegemoebel.Laenge laenge){
        for (Object moebelstueck : moebelstueckArrayList){
            if (((Liegemoebel) moebelstueck).getLaenge() == laenge){
                moebelstueckArrayList.remove(moebelstueck);
                break;
            };
        }
    }

    public boolean addLiegemoebel(Liegemoebel liegemoebel) {
        return moebelstueckArrayList.add(liegemoebel);
    }

}