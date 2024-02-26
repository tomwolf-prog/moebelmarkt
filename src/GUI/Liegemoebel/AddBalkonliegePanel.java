package GUI.Liegemoebel;

import GUI.MyFrame;
import Kategorie.Liegemoebel;
import Lager.Lagersystem;
import Moebelhaus.Moebelhaus;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddBalkonliegePanel {

    private static final JPanel addBalkonliegePanel = new JPanel();
    private static final Lagersystem lagersystem = Moebelhaus.getLagersystem();
    //Erstellen des Frame

    public static JPanel Panel() {

        //Erstellen von AddItem Button
        JButton addBalkonliegeS = new JButton("Add Balkonliege S");
        addBalkonliegeS.setBounds(150, 50, 175, 30);
        addBalkonliegeS.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lagersystem.addLiegemoebel(new Liegemoebel(Liegemoebel.Moebelart.Balkonliege, Liegemoebel.Laenge.s));

            }
        });
        addBalkonliegePanel.add(addBalkonliegeS);

        //Erstellen von AddItem Button
        JButton addBalkonliegeM = new JButton("Add Balkonliege M");
        addBalkonliegeM.setBounds(150, 100, 175, 30);
        addBalkonliegeM.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lagersystem.addLiegemoebel(new Liegemoebel(Liegemoebel.Moebelart.Balkonliege, Liegemoebel.Laenge.m));

            }
        });
        addBalkonliegePanel.add(addBalkonliegeM);

        //Erstellen von AddItem Button
        JButton addBalkonliegeL = new JButton("Add Balkonliege L");
        addBalkonliegeL.setBounds(150, 150, 175, 30);
        addBalkonliegeL.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lagersystem.addLiegemoebel(new Liegemoebel(Liegemoebel.Moebelart.Balkonliege, Liegemoebel.Laenge.l));

            }
        });
        addBalkonliegePanel.add(addBalkonliegeL);


        //Erstellen von Back Button
        JButton back = new JButton("Back");
        back.setBounds(150, 200, 175, 30);
        back.addActionListener(e -> {
            MyFrame.addBalkonliegePanel.setVisible(false);
            MyFrame.addLiegemoebelPanel.setVisible(true);
        });
        addBalkonliegePanel.add(back);

        addBalkonliegePanel.add(back);
        addBalkonliegePanel.setLayout(null);
        addBalkonliegePanel.setBackground(Color.GRAY);
        addBalkonliegePanel.setBounds(100, 0, 1600, 900);
        addBalkonliegePanel.setVisible(false);


        return addBalkonliegePanel;

    }
}
