package Lager;

import Kategorie.Tische;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Tischlager extends Lager<Tische> {

    public void removeTisch(Tische.Hoehe hoehe) {
        for (Tische moebelstueck : moebelstueckArrayList) {
            if (moebelstueck.getHoehe() == hoehe) {
                moebelstueckArrayList.remove(moebelstueck);
                break;
            }
            ;
        }
    }

    public List<Tische> listTischeMitEigenschaft(Tische.Hoehe hoehe) {
        List<Tische> tischeList = new ArrayList<Tische>();
        for (Tische moebelstueck : moebelstueckArrayList) {
            if (moebelstueck.getHoehe() == hoehe) {
                tischeList.add(moebelstueck);
            }
            ;
        }
        return tischeList;
    }

    public boolean addTisch(Tische tisch) {
        return moebelstueckArrayList.add(tisch);
    }

    public void writeToFile(Tischlager tischlager, String file) throws IOException {
        FileOutputStream f = new FileOutputStream(new File(file));
        ObjectOutputStream o = new ObjectOutputStream(f);

        o.writeObject(tischlager);
        o.close();
        f.close();
    }

    public Tischlager readFromFile(String file) throws IOException, ClassNotFoundException {
        FileInputStream fi = new FileInputStream(new File(file));
        ObjectInputStream oi = new ObjectInputStream(fi);

        // Read objects
        return (Tischlager) oi.readObject();

    }

}
