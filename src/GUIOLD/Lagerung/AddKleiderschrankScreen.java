package GUIOLD.Lagerung;

import GUIOLD.Frame;
import Kategorie.Lagerung;
import Lager.Lagersystem;
import Moebelhaus.Moebelhaus;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddKleiderschrankScreen {

    public static void addKleiderschrank() {
        //Erstellen des Frame
        JFrame frame = Frame.baseFrame();
        Lagersystem lagersystem = Moebelhaus.getLagersystem();

        //Erstellen von AddItem Button
        JButton addKleiderschrankS = new JButton("Add Kleiderschrank S");
        addKleiderschrankS.setBounds(150, 50, 175, 30);
        addKleiderschrankS.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lagersystem.addLagerung(new Lagerung(Lagerung.Moebelart.Kleiderschrank, Lagerung.Flaeche.s));
            }
        });
        frame.add(addKleiderschrankS);

        //Erstellen von AddItem Button
        JButton addKleiderschrankM = new JButton("Add Kuechenregal M");
        addKleiderschrankM.setBounds(150, 100, 175, 30);
        addKleiderschrankM.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lagersystem.addLagerung(new Lagerung(Lagerung.Moebelart.Kleiderschrank, Lagerung.Flaeche.m));
            }
        });
        frame.add(addKleiderschrankM);

        //Erstellen von AddItem Button
        JButton addKleiderschrankL = new JButton("Add Kuechenregal L");
        addKleiderschrankL.setBounds(150, 150, 175, 30);
        addKleiderschrankL.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lagersystem.addLagerung(new Lagerung(Lagerung.Moebelart.Kleiderschrank, Lagerung.Flaeche.l));
            }
        });
        frame.add(addKleiderschrankL);

        //Erstellen von AddItem Button
        JButton addKleiderschrankXL = new JButton("Add Kuechenregal XL");
        addKleiderschrankXL.setBounds(150, 200, 175, 30);
        addKleiderschrankXL.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lagersystem.addLagerung(new Lagerung(Lagerung.Moebelart.Kleiderschrank, Lagerung.Flaeche.xl));
            }
        });
        frame.add(addKleiderschrankXL);

        //Erstellen von Back Button
        JButton back = new JButton("Back");
        back.setBounds(150, 250, 175, 30);
        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                AddLagerungScreen.addLagerung();
                frame.dispose();
            }
        });
        frame.add(back);


    }

}
