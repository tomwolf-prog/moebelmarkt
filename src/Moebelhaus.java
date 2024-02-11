import Kategorie.*;
import Lager.*;



public class Moebelhaus {
    public static void main(String[] args){
        Tische tisch = new Tische();
        tisch.setHoehe(Tische.Hoehe.s);
        tisch.setMoebelart(Tische.Moebelart.Couchtisch);

        Tische tisch2 = new Tische();
        tisch2.setHoehe(Tische.Hoehe.s);
        tisch2.setMoebelart(Tische.Moebelart.Buerotisch);

        Tische tisch3 = new Tische();
        tisch3.setHoehe(Tische.Hoehe.s);
        tisch3.setMoebelart(Tische.Moebelart.Buerotisch);

        Tische tisch4 = new Tische();
        tisch4.setHoehe(Tische.Hoehe.s);
        tisch4.setMoebelart(Tische.Moebelart.Buerotisch);

        Sitzmoebel sitzmoebel = new Sitzmoebel();
        sitzmoebel.setSitzplaetze(Sitzmoebel.Sitzplaetze.eins);
        sitzmoebel.setMoebelart(Sitzmoebel.Moebelart.Fernsehcouch);

        Lagersystem lagersystem = new Lagersystem();
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
