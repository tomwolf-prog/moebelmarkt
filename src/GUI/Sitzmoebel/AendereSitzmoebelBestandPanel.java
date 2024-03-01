package GUI.Sitzmoebel;

import GUI.MyFrame;
import Lager.Lagersystem;
import Moebelhaus.Moebelhaus;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AendereSitzmoebelBestandPanel {

    private static final JPanel aendereSitzmoebelBestandPanel = new JPanel();
    private static final Lagersystem lagersystem = Moebelhaus.getLagersystem();
    //Erstellen des Frame

    public static JPanel Panel() {

        //Erstellen von AddItem Button
        JButton addFernsehcouchPanel = new JButton("Ändere Fernsehcouch Bestand");
        addFernsehcouchPanel.setBounds(150, 50, 250, 30);
        addFernsehcouchPanel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                MyFrame.aendereSitzmoebelBestandPanel.setVisible(false);
                MyFrame.aendereFernsehcouchBestandPanel.setVisible(true);
            }
        });
        aendereSitzmoebelBestandPanel.add(addFernsehcouchPanel);

        //Erstellen von AddItem Button
        JButton addKuechenstuhlPanel = new JButton("Ändere Kuechenstuhl Bestand");
        addKuechenstuhlPanel.setBounds(150, 100, 250, 30);
        addKuechenstuhlPanel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                MyFrame.aendereSitzmoebelBestandPanel.setVisible(false);
                MyFrame.aendereKuechenstuhlBestandPanel.setVisible(true);
            }
        });
        aendereSitzmoebelBestandPanel.add(addKuechenstuhlPanel);


        //Erstellen von AddItem Button
        JButton addKuechenregalPanel = new JButton("Ändere Ohrensessel Bestand");
        addKuechenregalPanel.setBounds(150, 150, 250, 30);
        addKuechenregalPanel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                MyFrame.aendereSitzmoebelBestandPanel.setVisible(false);
                MyFrame.aendereOhrensesselBestandPanel.setVisible(true);
            }
        });
        aendereSitzmoebelBestandPanel.add(addKuechenregalPanel);

        //Erstellen von Back Button
        JButton back = new JButton("Back");
        back.setBounds(150, 200, 250, 30);
        back.addActionListener(e -> {
            MyFrame.aendereSitzmoebelBestandPanel.setVisible(false);
            MyFrame.aendereBestandPanel.setVisible(true);
        });
        aendereSitzmoebelBestandPanel.add(back);

        aendereSitzmoebelBestandPanel.add(back);
        aendereSitzmoebelBestandPanel.setLayout(null);
        aendereSitzmoebelBestandPanel.setBackground(Color.GRAY);
        aendereSitzmoebelBestandPanel.setBounds(105, 0, 1600, 900);
        aendereSitzmoebelBestandPanel.setVisible(false);


        return aendereSitzmoebelBestandPanel;

    }
}

