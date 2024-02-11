package Lager;

import java.util.ArrayList;

class Lager<Moebelstueck> {
    private int preis;

    public ArrayList<Moebelstueck> moebelstueckArrayList = new ArrayList<Moebelstueck>();

    public ArrayList<Moebelstueck> getMoebel(){
        return moebelstueckArrayList;
    }

    public int getPreis() {
        return preis;
    }

    public void setPreis(int preis) {
        this.preis = preis;
    }

}
