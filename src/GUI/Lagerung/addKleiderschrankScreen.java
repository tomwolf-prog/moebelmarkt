package GUI.Lagerung;

import GUI.startScreen;
import Kategorie.Lagerung;
import Lager.Lagersystem;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class addKleiderschrankScreen {

    public static void addKleiderschrank(Lagersystem lagersystem){
        //Erstellen des Frame
        JFrame addKleiderschank = new JFrame("Button Example");

        //Erstellen von AddItem Button
        JButton addKleiderschrankS=new JButton("Add Kleiderschrank S");
        addKleiderschrankS.setBounds(150,50,150,30);
        addKleiderschrankS.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lagersystem.addLagerung(new Lagerung(Lagerung.Moebelart.Kleiderschrank, Lagerung.Flaeche.s));
                startScreen.start(lagersystem);
                addKleiderschank.dispose();
            }
        });
        addKleiderschank.add(addKleiderschrankS);

        //Erstellen von AddItem Button
        JButton addKleiderschrankM=new JButton("Add Kuechenregallager M");
        addKleiderschrankM.setBounds(150,100,150,30);
        addKleiderschrankM.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lagersystem.addLagerung(new Lagerung(Lagerung.Moebelart.Kleiderschrank, Lagerung.Flaeche.m));
                startScreen.start(lagersystem);
                addKleiderschank.dispose();
            }
        });
        addKleiderschank.add(addKleiderschrankM);

        //Erstellen von AddItem Button
        JButton addKleiderschrankL=new JButton("Add Kuechenregallager L");
        addKleiderschrankL.setBounds(150,150,150,30);
        addKleiderschrankL.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lagersystem.addLagerung(new Lagerung(Lagerung.Moebelart.Kleiderschrank, Lagerung.Flaeche.l));
                startScreen.start(lagersystem);
                addKleiderschank.dispose();
            }
        });
        addKleiderschank.add(addKleiderschrankL);

        //Erstellen von AddItem Button
        JButton addKleiderschrankXL=new JButton("Add Kuechenregallager XL");
        addKleiderschrankXL.setBounds(150,200,150,30);
        addKleiderschrankXL.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lagersystem.addLagerung(new Lagerung(Lagerung.Moebelart.Kleiderschrank, Lagerung.Flaeche.xl));
                startScreen.start(lagersystem);
                addKleiderschank.dispose();
            }
        });
        addKleiderschank.add(addKleiderschrankXL);

        //Erstellen von AddItem Button
        JButton cancel=new JButton("Cancel");
        cancel.setBounds(150,250,150,30);
        cancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                startScreen.start(lagersystem);
                addKleiderschank.dispose();
            }
        });
        addKleiderschank.add(cancel);



        //Erstellen von Exit Button
        JButton exit=new JButton("Exit");
        exit.setBounds(150,300,150,30);
        exit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //myMethod();
                addKleiderschank.dispose();
            }
        });
        addKleiderschank.add(exit);

        addKleiderschank.setSize(1600,900);
        addKleiderschank.setLayout(null);
        addKleiderschank.setVisible(true);
        addKleiderschank.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}
