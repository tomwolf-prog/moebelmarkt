package Lager;

import Kategorie.Sitzmoebel;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Sitzmoebellager extends Lager<Sitzmoebel> {

    public void removeSitzmoebel(Sitzmoebel.Sitzplaetze sitzplaetze) {
        for (Sitzmoebel moebelstueck : moebelstueckArrayList) {
            if (moebelstueck.getSitzplaetze() == sitzplaetze) {
                moebelstueckArrayList.remove(moebelstueck);
                break;
            }
            ;
        }
    }

    public List<Sitzmoebel> listMitEigenschaft(Sitzmoebel.Sitzplaetze sitzplaetze) {
        List<Sitzmoebel> sitzmoebelList = new ArrayList<Sitzmoebel>();
        for (Sitzmoebel moebelstueck : moebelstueckArrayList) {
            if (moebelstueck.getSitzplaetze() == sitzplaetze) {
                sitzmoebelList.add(moebelstueck);
            }
            ;
        }
        return sitzmoebelList;
    }

    public boolean addSitzmoebel(Sitzmoebel sitzmoebel) {
        return moebelstueckArrayList.add(sitzmoebel);
    }

    public void writeToFile(Sitzmoebellager sitzmoebellager, String file) throws IOException {
        FileOutputStream f = new FileOutputStream(new File(file));
        ObjectOutputStream o = new ObjectOutputStream(f);

        o.writeObject(sitzmoebellager);
        o.close();
        f.close();
    }

    public Sitzmoebellager readFromFile(String file) throws IOException, ClassNotFoundException {
        FileInputStream fi = new FileInputStream(new File(file));
        ObjectInputStream oi = new ObjectInputStream(fi);

        // Read objects
        return (Sitzmoebellager) oi.readObject();

    }

}
