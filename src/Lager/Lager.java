package Lager;

import java.util.ArrayList;

public class Lager<Moebelstueck> {
    private int preis;

    public ArrayList<Moebelstueck> moebelstueckArrayList = new ArrayList<Moebelstueck>();

    public Lager(){
        this.preis = 0;
    }

    public Lager(int preis){
        this.preis = preis;
    }

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
