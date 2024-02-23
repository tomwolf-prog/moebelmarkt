package GUI.Lagerung;

import GUI.startScreen;
import Kategorie.Lagerung;
import Lager.Lagersystem;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class addBeistelltischeScreen {
    public static void addBeistelltisch(Lagersystem lagersystem){
        //Erstellen des Frame
        JFrame addBeistelltisch = new JFrame("Button Example");

        //Erstellen von AddItem Button
        JButton addKleiderschrankS=new JButton("Add Beistelltisch S");
        addKleiderschrankS.setBounds(150,50,150,30);
        addKleiderschrankS.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lagersystem.addLagerung(new Lagerung(Lagerung.Moebelart.Beistelltisch, Lagerung.Flaeche.s));
                startScreen.start(lagersystem);
                addBeistelltisch.dispose();
            }
        });
        addBeistelltisch.add(addKleiderschrankS);

        //Erstellen von AddItem Button
        JButton addKleiderschrankM=new JButton("Add BeistelltischM");
        addKleiderschrankM.setBounds(150,100,150,30);
        addKleiderschrankM.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lagersystem.addLagerung(new Lagerung(Lagerung.Moebelart.Beistelltisch, Lagerung.Flaeche.m));
                startScreen.start(lagersystem);
                addBeistelltisch.dispose();
            }
        });
        addBeistelltisch.add(addKleiderschrankM);

        //Erstellen von AddItem Button
        JButton addKleiderschrankL=new JButton("Add BeistelltischL");
        addKleiderschrankL.setBounds(150,150,150,30);
        addKleiderschrankL.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lagersystem.addLagerung(new Lagerung(Lagerung.Moebelart.Beistelltisch, Lagerung.Flaeche.l));
                startScreen.start(lagersystem);
                addBeistelltisch.dispose();
            }
        });
        addBeistelltisch.add(addKleiderschrankL);

        //Erstellen von AddItem Button
        JButton addKleiderschrankXL=new JButton("Add BeistelltischXL");
        addKleiderschrankXL.setBounds(150,200,150,30);
        addKleiderschrankXL.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lagersystem.addLagerung(new Lagerung(Lagerung.Moebelart.Beistelltisch, Lagerung.Flaeche.xl));
                startScreen.start(lagersystem);
                addBeistelltisch.dispose();
            }
        });
        addBeistelltisch.add(addKleiderschrankXL);

        //Erstellen von AddItem Button
        JButton cancel=new JButton("Cancel");
        cancel.setBounds(150,250,150,30);
        cancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                startScreen.start(lagersystem);
                addBeistelltisch.dispose();
            }
        });
        addBeistelltisch.add(cancel);



        //Erstellen von Exit Button
        JButton exit=new JButton("Exit");
        exit.setBounds(150,300,150,30);
        exit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addBeistelltisch.dispose();
            }
        });
        addBeistelltisch.add(exit);

        addBeistelltisch.setSize(1600,900);
        addBeistelltisch.setLayout(null);
        addBeistelltisch.setVisible(true);
        addBeistelltisch.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
