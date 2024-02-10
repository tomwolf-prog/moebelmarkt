package Lager;
import Kategorie.*;

import java.util.ArrayList;
import java.util.Objects;

public class Lager<Moebelstueck> {

    private int preis;
    ArrayList<Moebelstueck> moebelstuecksArray = new ArrayList<Moebelstueck>();

    /*
    public static Lager<Moebelstueck> getLager(Lager<Moebelstueck> moebelstueckLager){
        if (moebelstueckLager == null){
            moebelstueckLager = new Lager<Moebelstueck>();
        }
        return moebelstueckLager;
    }
     */

    public int getPreis() {
        return preis;
    }

    public void setPreis(int preis) {
        this.preis = preis;
    }

}
