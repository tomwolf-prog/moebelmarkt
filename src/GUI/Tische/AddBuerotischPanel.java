package GUI.Tische;

import GUI.MyFrame;
import Kategorie.Tische;
import Lager.Lagersystem;
import Moebelhaus.Moebelhaus;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddBuerotischPanel {

    private static final JPanel addBuerotischPanel = new JPanel();
    private static final Lagersystem lagersystem = Moebelhaus.getLagersystem();
    //Erstellen des Frame

    public static JPanel Panel() {

        //Erstellen von AddItem Button
        JButton addBuerotischS = new JButton("Add Buerotisch S");
        addBuerotischS.setBounds(150, 50, 175, 30);
        addBuerotischS.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lagersystem.addTisch(new Tische(Tische.Moebelart.Buerotisch, Tische.Hoehe.s));

            }
        });
        addBuerotischPanel.add(addBuerotischS);

        //Erstellen von AddItem Button
        JButton addBuerotischM = new JButton("Add Buerotisch M");
        addBuerotischM.setBounds(150, 100, 175, 30);
        addBuerotischM.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lagersystem.addTisch(new Tische(Tische.Moebelart.Buerotisch, Tische.Hoehe.m));

            }
        });
        addBuerotischPanel.add(addBuerotischM);

        //Erstellen von AddItem Button
        JButton addBuerotischL = new JButton("Add Buerotisch L");
        addBuerotischL.setBounds(150, 150, 175, 30);
        addBuerotischL.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lagersystem.addTisch(new Tische(Tische.Moebelart.Buerotisch, Tische.Hoehe.l));

            }
        });
        addBuerotischPanel.add(addBuerotischL);


        //Erstellen von Back Button
        JButton back = new JButton("Back");
        back.setBounds(150, 200, 175, 30);
        back.addActionListener(e -> {
            MyFrame.addBuerotischPanel.setVisible(false);
            MyFrame.addTischePanel.setVisible(true);
        });
        addBuerotischPanel.add(back);

        addBuerotischPanel.add(back);
        addBuerotischPanel.setLayout(null);
        addBuerotischPanel.setBackground(Color.GRAY);
        addBuerotischPanel.setBounds(100, 0, 1600, 900);
        addBuerotischPanel.setVisible(false);


        return addBuerotischPanel;

    }
}