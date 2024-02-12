package Lager;

import Kategorie.Lagerung;

public class Lagerunglager extends Lager<Lagerung> {

    public void removeLagerung(Lagerung.Flaeche flaeche){
        for (Object moebelstueck : moebelstueckArrayList){
            if (((Lagerung) moebelstueck).getFlaeche() == flaeche){
                moebelstueckArrayList.remove(moebelstueck);
                break;
            };
        }
    }

    public boolean addLagerung(Lagerung lagerung) {
        return moebelstueckArrayList.add(lagerung);
    }

}