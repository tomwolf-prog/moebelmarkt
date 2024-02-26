package GUI.Lagerung;

import GUI.MyFrame;
import Lager.Lagersystem;
import Moebelhaus.Moebelhaus;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChangeLagerungPanel {

    private static final JPanel changeLagerungPanel = new JPanel();
    private static final Lagersystem lagersystem = Moebelhaus.getLagersystem();
    //Erstellen des Frame

    public static JPanel Panel() {

        //Erstellen von AddItem Button
        JButton addKleiderschrank = new JButton("Add Kleiderschrank");
        addKleiderschrank.setBounds(150, 50, 175, 30);
        addKleiderschrank.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                MyFrame.changeLagerungPanel.setVisible(false);
                MyFrame.changeKleiderschrankregalPanel.setVisible(true);
            }
        });
        changeLagerungPanel.add(addKleiderschrank);

        //Erstellen von AddItem Button
        JButton addBeistelltisch = new JButton("Add Beistelltisch");
        addBeistelltisch.setBounds(150, 100, 175, 30);
        addBeistelltisch.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                MyFrame.changeLagerungPanel.setVisible(false);
                MyFrame.changeBeistelltischePanel.setVisible(true);
            }
        });
        changeLagerungPanel.add(addBeistelltisch);


        //Erstellen von AddItem Button
        JButton addKuechenregallager = new JButton("Add Kuechenregal");
        addKuechenregallager.setBounds(150, 150, 175, 30);
        addKuechenregallager.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                MyFrame.changeLagerungPanel.setVisible(false);
                MyFrame.changeKuechenregalPanel.setVisible(true);
            }
        });
        changeLagerungPanel.add(addKuechenregallager);

        //Erstellen von Back Button
        JButton back = new JButton("Back");
        back.setBounds(150, 200, 175, 30);
        back.addActionListener(e -> {
            MyFrame.changeLagerungPanel.setVisible(false);
            MyFrame.changeItemPanel.setVisible(true);
        });
        changeLagerungPanel.add(back);

        changeLagerungPanel.add(back);
        changeLagerungPanel.setLayout(null);
        changeLagerungPanel.setBackground(Color.GRAY);
        changeLagerungPanel.setBounds(100, 0, 1600, 900);
        changeLagerungPanel.setVisible(false);


        return changeLagerungPanel;

    }
}
