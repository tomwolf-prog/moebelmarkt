package GUI.Lagerung;

import GUI.Frame;
import Lager.Lagersystem;
import Moebelhaus.Moebelhaus;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AendereLagerungBestandPanel {

    private static final JPanel aendereLagerungBestandPanel = new JPanel();
    private static final Lagersystem lagersystem = Moebelhaus.getLagersystem();
    //Erstellen des Frame

    public static JPanel Panel() {

        //Erstellen von AddItem Button
        JButton addKleiderschrank = new JButton("Ändere Kleiderschrank Bestand");
        addKleiderschrank.setBounds(150, 50, 250, 30);
        addKleiderschrank.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Frame.aendereLagerungBestandPanel.setVisible(false);
                Frame.aendereKleiderschrankregalBestandPanel.setVisible(true);
            }
        });
        aendereLagerungBestandPanel.add(addKleiderschrank);

        //Erstellen von AddItem Button
        JButton addBeistelltisch = new JButton("Ändere Beistelltisch Bestand");
        addBeistelltisch.setBounds(150, 100, 250, 30);
        addBeistelltisch.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Frame.aendereLagerungBestandPanel.setVisible(false);
                Frame.aendereBeistelltischeBestandPanel.setVisible(true);
            }
        });
        aendereLagerungBestandPanel.add(addBeistelltisch);


        //Erstellen von AddItem Button
        JButton addKuechenregallager = new JButton("Ändere Kuechenregal Bestand");
        addKuechenregallager.setBounds(150, 150, 250, 30);
        addKuechenregallager.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Frame.aendereLagerungBestandPanel.setVisible(false);
                Frame.aendereKuechenregalBestandPanel.setVisible(true);
            }
        });
        aendereLagerungBestandPanel.add(addKuechenregallager);

        //Erstellen von Back Button
        JButton back = new JButton("Back");
        back.setBounds(150, 200, 250, 30);
        back.addActionListener(e -> {
            Frame.aendereLagerungBestandPanel.setVisible(false);
            Frame.aendereBestandPanel.setVisible(true);
        });
        aendereLagerungBestandPanel.add(back);

        aendereLagerungBestandPanel.add(back);
        aendereLagerungBestandPanel.setLayout(null);
        aendereLagerungBestandPanel.setBackground(Color.WHITE);
        aendereLagerungBestandPanel.setBounds(105, 0, 1600, 900);
        aendereLagerungBestandPanel.setVisible(false);


        return aendereLagerungBestandPanel;

    }
}
