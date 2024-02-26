package GUI.Sitzmoebel;

import GUI.MyFrame;
import Kategorie.Sitzmoebel;
import Lager.Lagersystem;
import Moebelhaus.Moebelhaus;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddOhrensesselPanel {

    private static final JPanel addOhrensesselPanel = new JPanel();
    private static final Lagersystem lagersystem = Moebelhaus.getLagersystem();
    //Erstellen des Frame

    public static JPanel Panel() {

        //Erstellen von AddItem Button
        JButton addOhrensesselEins = new JButton("Add Ohrensessel Eins");
        addOhrensesselEins.setBounds(150, 50, 175, 30);
        addOhrensesselEins.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lagersystem.addSitzmoebel(new Sitzmoebel(Sitzmoebel.Moebelart.Ohrensessel, Sitzmoebel.Sitzplaetze.eins));

            }
        });
        addOhrensesselPanel.add(addOhrensesselEins);

        //Erstellen von AddItem Button
        JButton addOhrensesselZwei = new JButton("Add Ohrensessel Zwei");
        addOhrensesselZwei.setBounds(150, 100, 175, 30);
        addOhrensesselZwei.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lagersystem.addSitzmoebel(new Sitzmoebel(Sitzmoebel.Moebelart.Ohrensessel, Sitzmoebel.Sitzplaetze.zwei));
            }
        });
        addOhrensesselPanel.add(addOhrensesselZwei);

        //Erstellen von AddItem Button
        JButton addOhrensesselDrei = new JButton("Add Ohrensessel Drei");
        addOhrensesselDrei.setBounds(150, 150, 175, 30);
        addOhrensesselDrei.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lagersystem.addSitzmoebel(new Sitzmoebel(Sitzmoebel.Moebelart.Ohrensessel, Sitzmoebel.Sitzplaetze.drei));

            }
        });
        addOhrensesselPanel.add(addOhrensesselDrei);

        //Erstellen von AddItem Button
        JButton addOhrensesselVier = new JButton("Add Ohrensessel Vier");
        addOhrensesselVier.setBounds(150, 200, 175, 30);
        addOhrensesselVier.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lagersystem.addSitzmoebel(new Sitzmoebel(Sitzmoebel.Moebelart.Ohrensessel, Sitzmoebel.Sitzplaetze.vier));

            }
        });
        addOhrensesselPanel.add(addOhrensesselVier);

        //Erstellen von Back Button
        JButton back = new JButton("Back");
        back.setBounds(150, 250, 175, 30);
        back.addActionListener(e -> {
            MyFrame.addOhrensesselPanel.setVisible(false);
            MyFrame.addSitzmoebelPanel.setVisible(true);
        });
        addOhrensesselPanel.add(back);

        addOhrensesselPanel.add(back);
        addOhrensesselPanel.setLayout(null);
        addOhrensesselPanel.setBackground(Color.GRAY);
        addOhrensesselPanel.setBounds(100, 0, 1600, 900);
        addOhrensesselPanel.setVisible(false);


        return addOhrensesselPanel;

    }
}

