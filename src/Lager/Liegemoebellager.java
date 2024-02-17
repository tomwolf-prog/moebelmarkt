package Lager;

import Kategorie.Liegemoebel;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Liegemoebellager extends Lager<Liegemoebel> {

    public void removeLiegemoebel(Liegemoebel.Laenge laenge) {
        for (Liegemoebel moebelstueck : moebelstueckArrayList) {
            if (moebelstueck.getLaenge() == laenge) {
                moebelstueckArrayList.remove(moebelstueck);
                break;
            }
            ;
        }
    }

    public List<Liegemoebel> listMitEigenschaft(Liegemoebel.Laenge laenge) {
        List<Liegemoebel> liegemoebelList = new ArrayList<Liegemoebel>();
        for (Liegemoebel moebelstueck : moebelstueckArrayList) {
            if (moebelstueck.getLaenge() == laenge) {
                liegemoebelList.add(moebelstueck);
            }
            ;
        }
        return liegemoebelList;
    }

    public boolean addLiegemoebel(Liegemoebel liegemoebel) {
        return moebelstueckArrayList.add(liegemoebel);
    }

    public void writeToFile(Liegemoebellager liegemoebellager, String file) throws IOException {
        FileOutputStream f = new FileOutputStream(new File(file));
        ObjectOutputStream o = new ObjectOutputStream(f);

        o.writeObject(liegemoebellager);
        o.close();
        f.close();
    }

    public Liegemoebellager readFromFile(String file) throws IOException, ClassNotFoundException {
        FileInputStream fi = new FileInputStream(new File(file));
        ObjectInputStream oi = new ObjectInputStream(fi);

        // Read objects
        return (Liegemoebellager) oi.readObject();

    }

}