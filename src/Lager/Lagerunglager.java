package Lager;

import Kategorie.Lagerung;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Lagerunglager extends Lager<Lagerung> {

    public void removeLagerung(Lagerung.Flaeche flaeche) {
        for (Lagerung moebelstueck : moebelstueckArrayList) {
            if (moebelstueck.getFlaeche() == flaeche) {
                moebelstueckArrayList.remove(moebelstueck);
                break;
            }
            ;
        }
    }

    public List<Lagerung> listMitEigenschaft(Lagerung.Flaeche flaeche) {
        List<Lagerung> lagerungList = new ArrayList<Lagerung>();
        for (Lagerung moebelstueck : moebelstueckArrayList) {
            if (moebelstueck.getFlaeche() == flaeche) {
                lagerungList.add(moebelstueck);
            }
            ;
        }
        return lagerungList;
    }

    public boolean addLagerung(Lagerung lagerung) {
        return moebelstueckArrayList.add(lagerung);
    }

    public void writeToFile(Lagerunglager lagerunglager, String file) throws IOException {
        FileOutputStream f = new FileOutputStream(new File(file));
        ObjectOutputStream o = new ObjectOutputStream(f);

        o.writeObject(lagerunglager);
        o.close();
        f.close();
    }

    public Lagerunglager readFromFile(String file) throws IOException, ClassNotFoundException {
        FileInputStream fi = new FileInputStream(new File(file));
        ObjectInputStream oi = new ObjectInputStream(fi);

        // Read objects
        return (Lagerunglager) oi.readObject();

    }

}