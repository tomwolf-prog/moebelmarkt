package GUI.Tische;

import GUI.MyFrame;
import Lager.Lagersystem;
import Moebelhaus.Moebelhaus;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AendereTischeBestandPanel {

    private static final JPanel aendereTischePanel = new JPanel();
    private static final Lagersystem lagersystem = Moebelhaus.getLagersystem();
    //Erstellen des Frame

    public static JPanel Panel() {

        //Erstellen von AddItem Button
        JButton addBuerotisch = new JButton("Ändere Buerotisch Bestand");
        addBuerotisch.setBounds(150, 50, 250, 30);
        addBuerotisch.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                MyFrame.aendereTischeBestandPanel.setVisible(false);
                MyFrame.aendereBuerotischBestandPanel.setVisible(true);
            }
        });
        aendereTischePanel.add(addBuerotisch);

        //Erstellen von AddItem Button
        JButton addCouchtisch = new JButton("Ändere Couchtisch Bestand");
        addCouchtisch.setBounds(150, 100, 250, 30);
        addCouchtisch.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                MyFrame.aendereTischeBestandPanel.setVisible(false);
                MyFrame.aendereCouchtischBestandPanel.setVisible(true);
            }
        });
        aendereTischePanel.add(addCouchtisch);


        //Erstellen von AddItem Button
        JButton addEsstisch = new JButton("Ändere Esstisch Bestand");
        addEsstisch.setBounds(150, 150, 250, 30);
        addEsstisch.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                MyFrame.aendereTischeBestandPanel.setVisible(false);
                MyFrame.aendereEsstischBestandPanel.setVisible(true);
            }
        });
        aendereTischePanel.add(addEsstisch);

        //Erstellen von AddItem Button
        JButton addKuechentisch = new JButton("Ändere Kuechentisch Bestand");
        addKuechentisch.setBounds(150, 200, 250, 30);
        addKuechentisch.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                MyFrame.aendereTischeBestandPanel.setVisible(false);
                MyFrame.aendereKuechentischBestandPanel.setVisible(true);
            }
        });
        aendereTischePanel.add(addKuechentisch);

        //Erstellen von Back Button
        JButton back = new JButton("Back");
        back.setBounds(150, 250, 250, 30);
        back.addActionListener(e -> {
            MyFrame.aendereTischeBestandPanel.setVisible(false);
            MyFrame.aendereBestandPanel.setVisible(true);
        });
        aendereTischePanel.add(back);

        aendereTischePanel.add(back);
        aendereTischePanel.setLayout(null);
        aendereTischePanel.setBackground(Color.GRAY);
        aendereTischePanel.setBounds(105, 0, 1600, 900);
        aendereTischePanel.setVisible(false);


        return aendereTischePanel;

    }
}

