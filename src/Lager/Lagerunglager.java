package Lager;

import Kategorie.Lagerung;

import java.util.ArrayList;
import java.util.List;

public class Lagerunglager extends Lager<Lagerung> {

    public void removeLagerung(Lagerung.Flaeche flaeche){
        for (Lagerung moebelstueck : moebelstueckArrayList){
            if (moebelstueck.getFlaeche() == flaeche){
                moebelstueckArrayList.remove(moebelstueck);
                break;
            };
        }
    }

    public List<Lagerung> listMitEigenschaft(Lagerung.Flaeche flaeche){
        List<Lagerung> lagerungList = new ArrayList<Lagerung>();
        for (Lagerung moebelstueck : moebelstueckArrayList){
            if (moebelstueck.getFlaeche() == flaeche){
                lagerungList.add(moebelstueck);
            };
        }
        return lagerungList;
    }

    public boolean addLagerung(Lagerung lagerung) {
        return moebelstueckArrayList.add(lagerung);
    }

}