package GUI.Liegemoebel;

import GUI.MyFrame;
import Kategorie.Liegemoebel;
import Lager.Lagersystem;
import Moebelhaus.Moebelhaus;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddDoppelbettPanel {

    private static final JPanel addDoppelbettPanel = new JPanel();
    private static final Lagersystem lagersystem = Moebelhaus.getLagersystem();
    //Erstellen des Frame

    public static JPanel Panel() {

        //Erstellen von AddItem Button
        JButton addDoppelbettS = new JButton("Add Doppelbett S");
        addDoppelbettS.setBounds(150, 50, 175, 30);
        addDoppelbettS.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lagersystem.addLiegemoebel(new Liegemoebel(Liegemoebel.Moebelart.Doppelbett, Liegemoebel.Laenge.s));

            }
        });
        addDoppelbettPanel.add(addDoppelbettS);

        //Erstellen von AddItem Button
        JButton addDoppelbettM = new JButton("Add Doppelbett M");
        addDoppelbettM.setBounds(150, 100, 175, 30);
        addDoppelbettM.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lagersystem.addLiegemoebel(new Liegemoebel(Liegemoebel.Moebelart.Doppelbett, Liegemoebel.Laenge.m));

            }
        });
        addDoppelbettPanel.add(addDoppelbettM);

        //Erstellen von AddItem Button
        JButton addDoppelbettL = new JButton("Add Doppelbett L");
        addDoppelbettL.setBounds(150, 150, 175, 30);
        addDoppelbettL.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lagersystem.addLiegemoebel(new Liegemoebel(Liegemoebel.Moebelart.Doppelbett, Liegemoebel.Laenge.l));

            }
        });
        addDoppelbettPanel.add(addDoppelbettL);


        //Erstellen von Back Button
        JButton back = new JButton("Back");
        back.setBounds(150, 200, 175, 30);
        back.addActionListener(e -> {
            MyFrame.addDoppelbettPanel.setVisible(false);
            MyFrame.addLiegemoebelPanel.setVisible(true);
        });
        addDoppelbettPanel.add(back);

        addDoppelbettPanel.add(back);
        addDoppelbettPanel.setLayout(null);
        addDoppelbettPanel.setBackground(Color.GRAY);
        addDoppelbettPanel.setBounds(100, 0, 1600, 900);
        addDoppelbettPanel.setVisible(false);


        return addDoppelbettPanel;

    }
}
