package Lager;

import java.util.ArrayList;

public class Lager<Moebelstueck> {
    private int preis;
    private boolean rabatt10;

    public ArrayList<Moebelstueck> moebelstueckArrayList = new ArrayList<Moebelstueck>();

    public Lager(){
        this.preis = 0;
        this.rabatt10 = false;
    }

    public Lager(int preis){
        this.preis = preis;
        this.rabatt10 = false;
    }



    public ArrayList<Moebelstueck> getMoebel(){
        return moebelstueckArrayList;
    }

    public int getPreis() {
        return rabatt10 ? (preis * 90/100) : preis;
    }

    public void setPreis(int preis) {
        this.preis = preis;
    }

    public boolean getRabatt10() {
        return rabatt10;
    }

    public void setRabatt10(boolean rabatt10) {
        this.rabatt10 = rabatt10;
    }
}
