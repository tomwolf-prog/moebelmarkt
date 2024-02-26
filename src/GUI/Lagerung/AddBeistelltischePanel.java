package GUI.Lagerung;

import GUI.MyFrame;
import Kategorie.Lagerung;
import Lager.Lagersystem;
import Moebelhaus.Moebelhaus;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddBeistelltischePanel {
    private static final JPanel addBeistelltischePanel = new JPanel();

    public static JPanel Panel() {
        Lagersystem lagersystem = Moebelhaus.getLagersystem();


        //Erstellen von AddItem Button
        JButton addKleiderschrankS = new JButton("Add Beistelltisch S");
        addKleiderschrankS.setBounds(150, 50, 175, 30);
        addKleiderschrankS.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lagersystem.addLagerung(new Lagerung(Lagerung.Moebelart.Beistelltisch, Lagerung.Flaeche.s));

            }
        });
        addBeistelltischePanel.add(addKleiderschrankS);

        //Erstellen von AddItem Button
        JButton addKleiderschrankM = new JButton("Add Beistelltisch M");
        addKleiderschrankM.setBounds(150, 100, 175, 30);
        addKleiderschrankM.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lagersystem.addLagerung(new Lagerung(Lagerung.Moebelart.Beistelltisch, Lagerung.Flaeche.m));
            }
        });
        addBeistelltischePanel.add(addKleiderschrankM);

        //Erstellen von AddItem Button
        JButton addKleiderschrankL = new JButton("Add Beistelltisch L");
        addKleiderschrankL.setBounds(150, 150, 175, 30);
        addKleiderschrankL.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lagersystem.addLagerung(new Lagerung(Lagerung.Moebelart.Beistelltisch, Lagerung.Flaeche.l));

            }
        });
        addBeistelltischePanel.add(addKleiderschrankL);

        //Erstellen von AddItem Button
        JButton addKleiderschrankXL = new JButton("Add Beistelltisch XL");
        addKleiderschrankXL.setBounds(150, 200, 175, 30);
        addKleiderschrankXL.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lagersystem.addLagerung(new Lagerung(Lagerung.Moebelart.Beistelltisch, Lagerung.Flaeche.xl));

            }
        });
        addBeistelltischePanel.add(addKleiderschrankXL);

        //Erstellen von Back Button
        JButton back = new JButton("Back");
        back.setBounds(150, 250, 175, 30);
        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                MyFrame.addBeistelltischePanel.setVisible(false);
                MyFrame.addLagerungPanel.setVisible(true);
            }
        });
        addBeistelltischePanel.add(back);


        addBeistelltischePanel.setLayout(null);
        addBeistelltischePanel.setBackground(Color.GRAY);
        addBeistelltischePanel.setBounds(100, 0, 1600, 900);
        addBeistelltischePanel.setVisible(false);


        return addBeistelltischePanel;

    }
}

