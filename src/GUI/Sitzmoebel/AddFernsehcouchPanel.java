package GUI.Sitzmoebel;

import GUI.MyFrame;
import Kategorie.Sitzmoebel;
import Lager.Lagersystem;
import Moebelhaus.Moebelhaus;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddFernsehcouchPanel {

    private static final JPanel addFernsehcouchPanel = new JPanel();
    private static final Lagersystem lagersystem = Moebelhaus.getLagersystem();

    //Erstellen des Frame
    public static JPanel Panel() {

        //Erstellen von AddItem Button
        JButton addFernsehcouchEins = new JButton("Add Fernsehcouch Eins");
        addFernsehcouchEins.setBounds(150, 50, 175, 30);
        addFernsehcouchEins.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lagersystem.addSitzmoebel(new Sitzmoebel(Sitzmoebel.Moebelart.Fernsehcouch, Sitzmoebel.Sitzplaetze.eins));

            }
        });
        addFernsehcouchPanel.add(addFernsehcouchEins);

        //Erstellen von AddItem Button
        JButton addFernsehcouchZwei = new JButton("Add Fernsehcouch Zwei");
        addFernsehcouchZwei.setBounds(150, 100, 175, 30);
        addFernsehcouchZwei.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lagersystem.addSitzmoebel(new Sitzmoebel(Sitzmoebel.Moebelart.Fernsehcouch, Sitzmoebel.Sitzplaetze.zwei));
            }
        });
        addFernsehcouchPanel.add(addFernsehcouchZwei);

        //Erstellen von AddItem Button
        JButton addFernsehcouchDrei = new JButton("Add Fernsehcouch Drei");
        addFernsehcouchDrei.setBounds(150, 150, 175, 30);
        addFernsehcouchDrei.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lagersystem.addSitzmoebel(new Sitzmoebel(Sitzmoebel.Moebelart.Fernsehcouch, Sitzmoebel.Sitzplaetze.drei));

            }
        });
        addFernsehcouchPanel.add(addFernsehcouchDrei);

        //Erstellen von AddItem Button
        JButton addFernsehcouchVier = new JButton("Add Fernsehcouch Vier");
        addFernsehcouchVier.setBounds(150, 200, 175, 30);
        addFernsehcouchVier.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lagersystem.addSitzmoebel(new Sitzmoebel(Sitzmoebel.Moebelart.Fernsehcouch, Sitzmoebel.Sitzplaetze.vier));

            }
        });
        addFernsehcouchPanel.add(addFernsehcouchVier);

        //Erstellen von Back Button
        JButton back = new JButton("Back");
        back.setBounds(150, 250, 175, 30);
        back.addActionListener(e -> {
            MyFrame.addFernsehcouchPanel.setVisible(false);
            MyFrame.addSitzmoebelPanel.setVisible(true);
        });
        addFernsehcouchPanel.add(back);

        addFernsehcouchPanel.add(back);
        addFernsehcouchPanel.setLayout(null);
        addFernsehcouchPanel.setBackground(Color.GRAY);
        addFernsehcouchPanel.setBounds(100, 0, 1600, 900);
        addFernsehcouchPanel.setVisible(false);


        return addFernsehcouchPanel;

    }
}

