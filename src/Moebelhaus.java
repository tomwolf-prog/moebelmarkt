import Kategorie.Sitzmoebel;
import Kategorie.Tische;
import Lager.Buerotischlager;
import Lager.Lagersystem;

import java.io.IOException;


public class Moebelhaus {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Tische tisch = new Tische(Tische.Moebelart.Buerotisch, Tische.Hoehe.s);
        tisch.setHoehe(Tische.Hoehe.s);
        tisch.setMoebelart(Tische.Moebelart.Couchtisch);

        Tische tisch2 = new Tische(Tische.Moebelart.Buerotisch, Tische.Hoehe.s);
        tisch2.setHoehe(Tische.Hoehe.s);
        tisch2.setMoebelart(Tische.Moebelart.Buerotisch);

        Tische tisch3 = new Tische(Tische.Moebelart.Buerotisch, Tische.Hoehe.s);
        tisch3.setHoehe(Tische.Hoehe.s);
        tisch3.setMoebelart(Tische.Moebelart.Buerotisch);

        Tische tisch4 = new Tische(Tische.Moebelart.Buerotisch, Tische.Hoehe.s);
        tisch4.setHoehe(Tische.Hoehe.s);
        tisch4.setMoebelart(Tische.Moebelart.Buerotisch);

        Sitzmoebel sitzmoebel = new Sitzmoebel(Sitzmoebel.Moebelart.Fernsehcouch, Sitzmoebel.Sitzplaetze.eins);
        sitzmoebel.setSitzplaetze(Sitzmoebel.Sitzplaetze.eins);
        sitzmoebel.setMoebelart(Sitzmoebel.Moebelart.Fernsehcouch);

        Lagersystem lagersystem = new Lagersystem();

        lagersystem.setBuerotischlager((Buerotischlager) lagersystem.getBuerotischlager().readFromFile("myObject.txt"));
        lagersystem.addTisch(tisch);
        lagersystem.addTisch(tisch2);
        lagersystem.addTisch(tisch3);
        lagersystem.addTisch(tisch4);
        lagersystem.getBuerotischlager().setPreis(100);
        lagersystem.getCouchtischlager().setPreis(101);
        System.out.println(lagersystem.getBuerotischlager());
        System.out.println(lagersystem.getBuerotischlager().getMoebel());
        System.out.println(lagersystem.getBuerotischlager().getPreis());


        System.out.println(lagersystem.getCouchtischlager());
        System.out.println(lagersystem.getCouchtischlager().getMoebel());
        System.out.println(lagersystem.getCouchtischlager().getPreis());
        System.out.println(lagersystem.searchTischMitEigenschaft(Tische.Hoehe.s));

        lagersystem.getBuerotischlager().writeToFile(lagersystem.getBuerotischlager(), "myObject.txt");
        // Couchtischlager couchtischlager = lagersystem.getCouchtischlager();
        // couchtischlager.setPreis(100);
        // System.out.println(couchtischlager.getPreis());
        // Buerotischlager buerotischlager = new Buerotischlager();
        // buerotischlager.setPreis(101);
        // System.out.println(couchtischlager.getPreis());
        // System.out.println(buerotischlager.getPreis());

        // System.out.println(couchtischlager.addTisch(tisch));
        // System.out.println(buerotischlager.addTisch(tisch));
        // System.out.println(couchtischlager.getMoebel());
        // System.out.println(buerotischlager.getMoebel());

        // couchtischlager.removeTisch(Tische.Hoehe.m);
        // System.out.println(couchtischlager.getMoebel());
        // System.out.println(buerotischlager.getMoebel());

        // couchtischlager.removeTisch(Tische.Hoehe.s);
        // System.out.println(couchtischlager.getMoebel());
        // System.out.println(buerotischlager.getMoebel());

    }
}
