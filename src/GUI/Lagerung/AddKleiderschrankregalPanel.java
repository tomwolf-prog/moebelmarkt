package GUI.Lagerung;

import GUI.MyFrame;
import Kategorie.Lagerung;
import Lager.Lagersystem;
import Moebelhaus.Moebelhaus;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddKleiderschrankregalPanel {
    private static final JPanel addKleiderschrankregalPanel = new JPanel();

    public static JPanel Panel() {
        Lagersystem lagersystem = Moebelhaus.getLagersystem();

        //Erstellen von AddItem Button
        JButton addKleiderschrankS = new JButton("Add Kleiderschrank S");
        addKleiderschrankS.setBounds(150, 50, 175, 30);
        addKleiderschrankS.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lagersystem.addLagerung(new Lagerung(Lagerung.Moebelart.Kleiderschrank, Lagerung.Flaeche.s));
            }
        });
        addKleiderschrankregalPanel.add(addKleiderschrankS);

        //Erstellen von AddItem Button
        JButton addKleiderschrankM = new JButton("Add Kuechenregal M");
        addKleiderschrankM.setBounds(150, 100, 175, 30);
        addKleiderschrankM.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lagersystem.addLagerung(new Lagerung(Lagerung.Moebelart.Kleiderschrank, Lagerung.Flaeche.m));
            }
        });
        addKleiderschrankregalPanel.add(addKleiderschrankM);

        //Erstellen von AddItem Button
        JButton addKleiderschrankL = new JButton("Add Kuechenregal L");
        addKleiderschrankL.setBounds(150, 150, 175, 30);
        addKleiderschrankL.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lagersystem.addLagerung(new Lagerung(Lagerung.Moebelart.Kleiderschrank, Lagerung.Flaeche.l));
            }
        });
        addKleiderschrankregalPanel.add(addKleiderschrankL);

        //Erstellen von AddItem Button
        JButton addKleiderschrankXL = new JButton("Add Kuechenregal XL");
        addKleiderschrankXL.setBounds(150, 200, 175, 30);
        addKleiderschrankXL.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lagersystem.addLagerung(new Lagerung(Lagerung.Moebelart.Kleiderschrank, Lagerung.Flaeche.xl));
            }
        });
        addKleiderschrankregalPanel.add(addKleiderschrankXL);

        //Erstellen von Back Button
        JButton back = new JButton("Back");
        back.setBounds(150, 250, 175, 30);
        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                MyFrame.addKleiderschrankregalPanel.setVisible(false);
                MyFrame.addLagerungPanel.setVisible(true);
            }
        });
        addKleiderschrankregalPanel.add(back);


        addKleiderschrankregalPanel.setLayout(null);
        addKleiderschrankregalPanel.setBackground(Color.GRAY);
        addKleiderschrankregalPanel.setBounds(100, 0, 1600, 900);
        addKleiderschrankregalPanel.setVisible(false);


        return addKleiderschrankregalPanel;

    }
}

