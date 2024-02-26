package GUI.Lagerung;

import GUI.MyFrame;
import Lager.Lagersystem;
import Moebelhaus.Moebelhaus;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddLagerungPanel {

    private static final JPanel addLagerungPanel = new JPanel();
    private static final Lagersystem lagersystem = Moebelhaus.getLagersystem();
    //Erstellen des Frame

    public static JPanel Panel() {

        //Erstellen von AddItem Button
        JButton addKleiderschrank = new JButton("Add Kleiderschrank");
        addKleiderschrank.setBounds(150, 50, 175, 30);
        addKleiderschrank.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                MyFrame.addLagerungPanel.setVisible(false);
                MyFrame.addKleiderschrankregalPanel.setVisible(true);
            }
        });
        addLagerungPanel.add(addKleiderschrank);

        //Erstellen von AddItem Button
        JButton addBeistelltisch = new JButton("Add Beistelltisch");
        addBeistelltisch.setBounds(150, 100, 175, 30);
        addBeistelltisch.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                MyFrame.addLagerungPanel.setVisible(false);
                MyFrame.addBeistelltischePanel.setVisible(true);
            }
        });
        addLagerungPanel.add(addBeistelltisch);


        //Erstellen von AddItem Button
        JButton addKuechenregallager = new JButton("Add Kuechenregal");
        addKuechenregallager.setBounds(150, 150, 175, 30);
        addKuechenregallager.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                MyFrame.addLagerungPanel.setVisible(false);
                MyFrame.addKuechenregalPanel.setVisible(true);
            }
        });
        addLagerungPanel.add(addKuechenregallager);

        //Erstellen von Back Button
        JButton back = new JButton("Back");
        back.setBounds(150, 200, 175, 30);
        back.addActionListener(e -> {
            MyFrame.addLagerungPanel.setVisible(false);
            MyFrame.addItemPanel.setVisible(true);
        });
        addLagerungPanel.add(back);

        addLagerungPanel.add(back);
        addLagerungPanel.setLayout(null);
        addLagerungPanel.setBackground(Color.GRAY);
        addLagerungPanel.setBounds(100, 0, 1600, 900);
        addLagerungPanel.setVisible(false);


        return addLagerungPanel;

    }
}
