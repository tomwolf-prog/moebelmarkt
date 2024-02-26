package GUI.Tische;

import GUI.MyFrame;
import Kategorie.Tische;
import Lager.Lagersystem;
import Moebelhaus.Moebelhaus;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddCouchtischPanel {

    private static final JPanel addCouchtischPanel = new JPanel();
    private static final Lagersystem lagersystem = Moebelhaus.getLagersystem();
    //Erstellen des Frame

    public static JPanel Panel() {

        //Erstellen von AddItem Button
        JButton addCouchtischS = new JButton("Add Couchtisch S");
        addCouchtischS.setBounds(150, 50, 175, 30);
        addCouchtischS.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lagersystem.addTisch(new Tische(Tische.Moebelart.Couchtisch, Tische.Hoehe.s));

            }
        });
        addCouchtischPanel.add(addCouchtischS);

        //Erstellen von AddItem Button
        JButton addCouchtischM = new JButton("Add Couchtisch M");
        addCouchtischM.setBounds(150, 100, 175, 30);
        addCouchtischM.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lagersystem.addTisch(new Tische(Tische.Moebelart.Couchtisch, Tische.Hoehe.m));

            }
        });
        addCouchtischPanel.add(addCouchtischM);

        //Erstellen von AddItem Button
        JButton addCouchtischL = new JButton("Add Couchtisch L");
        addCouchtischL.setBounds(150, 150, 175, 30);
        addCouchtischL.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lagersystem.addTisch(new Tische(Tische.Moebelart.Couchtisch, Tische.Hoehe.l));

            }
        });
        addCouchtischPanel.add(addCouchtischL);


        //Erstellen von Back Button
        JButton back = new JButton("Back");
        back.setBounds(150, 200, 175, 30);
        back.addActionListener(e -> {
            MyFrame.addCouchtischPanel.setVisible(false);
            MyFrame.addTischePanel.setVisible(true);
        });
        addCouchtischPanel.add(back);

        addCouchtischPanel.add(back);
        addCouchtischPanel.setLayout(null);
        addCouchtischPanel.setBackground(Color.GRAY);
        addCouchtischPanel.setBounds(100, 0, 1600, 900);
        addCouchtischPanel.setVisible(false);


        return addCouchtischPanel;

    }
}
