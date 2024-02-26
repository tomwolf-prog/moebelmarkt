package GUI.Sitzmoebel;

import GUI.MyFrame;
import Kategorie.Sitzmoebel;
import Lager.Lagersystem;
import Moebelhaus.Moebelhaus;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddKuechenstuhlPanel {

    private static final JPanel addKuechenstuhlPanel = new JPanel();
    private static final Lagersystem lagersystem = Moebelhaus.getLagersystem();
    //Erstellen des Frame

    public static JPanel Panel() {

        //Erstellen von AddItem Button
        JButton addKuechenstuhlEins = new JButton("Add Kuechenstuhl Eins");
        addKuechenstuhlEins.setBounds(150, 50, 175, 30);
        addKuechenstuhlEins.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lagersystem.addSitzmoebel(new Sitzmoebel(Sitzmoebel.Moebelart.Kuechenstuhl, Sitzmoebel.Sitzplaetze.eins));

            }
        });
        addKuechenstuhlPanel.add(addKuechenstuhlEins);

        //Erstellen von AddItem Button
        JButton addKuechenstuhlZwei = new JButton("Add Kuechenstuhl Zwei");
        addKuechenstuhlZwei.setBounds(150, 100, 175, 30);
        addKuechenstuhlZwei.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lagersystem.addSitzmoebel(new Sitzmoebel(Sitzmoebel.Moebelart.Kuechenstuhl, Sitzmoebel.Sitzplaetze.zwei));
            }
        });
        addKuechenstuhlPanel.add(addKuechenstuhlZwei);

        //Erstellen von AddItem Button
        JButton addKuechenstuhlDrei = new JButton("Add Kuechenstuhl Drei");
        addKuechenstuhlDrei.setBounds(150, 150, 175, 30);
        addKuechenstuhlDrei.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lagersystem.addSitzmoebel(new Sitzmoebel(Sitzmoebel.Moebelart.Kuechenstuhl, Sitzmoebel.Sitzplaetze.drei));

            }
        });
        addKuechenstuhlPanel.add(addKuechenstuhlDrei);

        //Erstellen von AddItem Button
        JButton addKuechenstuhlVier = new JButton("Add Kuechenstuhl Vier");
        addKuechenstuhlVier.setBounds(150, 200, 175, 30);
        addKuechenstuhlVier.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lagersystem.addSitzmoebel(new Sitzmoebel(Sitzmoebel.Moebelart.Kuechenstuhl, Sitzmoebel.Sitzplaetze.vier));

            }
        });
        addKuechenstuhlPanel.add(addKuechenstuhlVier);

        //Erstellen von Back Button
        JButton back = new JButton("Back");
        back.setBounds(150, 250, 175, 30);
        back.addActionListener(e -> {
            MyFrame.addKuechenstuhlPanel.setVisible(false);
            MyFrame.addSitzmoebelPanel.setVisible(true);
        });
        addKuechenstuhlPanel.add(back);

        addKuechenstuhlPanel.add(back);
        addKuechenstuhlPanel.setLayout(null);
        addKuechenstuhlPanel.setBackground(Color.GRAY);
        addKuechenstuhlPanel.setBounds(100, 0, 1600, 900);
        addKuechenstuhlPanel.setVisible(false);


        return addKuechenstuhlPanel;

    }
}

