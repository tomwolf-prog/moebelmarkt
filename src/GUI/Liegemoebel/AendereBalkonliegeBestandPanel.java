package GUI.Liegemoebel;

import GUI.Frame;
import Kategorie.Liegemoebel;
import Lager.Lagersystem;
import Moebelhaus.Moebelhaus;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AendereBalkonliegeBestandPanel {

    private static final JPanel aendereBalkonliegeBestandPanel = new JPanel();
    private static final Lagersystem lagersystem = Moebelhaus.getLagersystem();
    //Erstellen des Frame

    public static JPanel Panel() {

        JTextField t1 = new JTextField("1");
        t1.setBounds(500, 50, 215, 30);
        aendereBalkonliegeBestandPanel.add(t1);
        //Erstellen von AddItem Button
        JButton addBalkonliegeS = new JButton("Ändere Balkonliege Bestand S");
        addBalkonliegeS.setBounds(150, 50, 250, 30);
        addBalkonliegeS.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = t1.getText();
                int i1;
                try {
                    i1 = Integer.parseInt(String.valueOf(text));
                } catch (NumberFormatException a) {
                    i1 = 0;
                }
                if (i1 >= 0) {
                    lagersystem.erhoeheBalkonliegelagerLagerbestand(i1, Liegemoebel.Laenge.s);
                } else {
                    lagersystem.mindereBalkonliegelagerLagerbestand(Math.abs(i1), Liegemoebel.Laenge.s);
                }

            }
        });
        aendereBalkonliegeBestandPanel.add(addBalkonliegeS);

        JTextField t2 = new JTextField("1");
        t2.setBounds(500, 100, 215, 30);
        aendereBalkonliegeBestandPanel.add(t2);
        //Erstellen von AddItem Button
        JButton addBalkonliegeM = new JButton("Ändere Balkonliege Bestand M");
        addBalkonliegeM.setBounds(150, 100, 250, 30);
        addBalkonliegeM.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = t2.getText();
                int i1;
                try {
                    i1 = Integer.parseInt(String.valueOf(text));
                } catch (NumberFormatException a) {
                    i1 = 0;
                }
                if (i1 >= 0) {
                    lagersystem.erhoeheBalkonliegelagerLagerbestand(i1, Liegemoebel.Laenge.m);
                } else {
                    lagersystem.mindereBalkonliegelagerLagerbestand(Math.abs(i1), Liegemoebel.Laenge.m);
                }

            }
        });
        aendereBalkonliegeBestandPanel.add(addBalkonliegeM);

        JTextField t3 = new JTextField("1");
        t3.setBounds(500, 150, 215, 30);
        aendereBalkonliegeBestandPanel.add(t3);
        //Erstellen von AddItem Button
        JButton addBalkonliegeL = new JButton("Ändere Balkonliege Bestand L");
        addBalkonliegeL.setBounds(150, 150, 250, 30);
        addBalkonliegeL.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = t3.getText();
                int i1;
                try {
                    i1 = Integer.parseInt(String.valueOf(text));
                } catch (NumberFormatException a) {
                    i1 = 0;
                }
                if (i1 >= 0) {
                    lagersystem.erhoeheBalkonliegelagerLagerbestand(i1, Liegemoebel.Laenge.l);
                } else {
                    lagersystem.mindereBalkonliegelagerLagerbestand(Math.abs(i1), Liegemoebel.Laenge.l);
                }

            }
        });
        aendereBalkonliegeBestandPanel.add(addBalkonliegeL);


        //Erstellen von Back Button
        JButton back = new JButton("Back");
        back.setBounds(150, 200, 250, 30);
        back.addActionListener(e -> {
            Frame.aendereBalkonliegeBestandPanel.setVisible(false);
            Frame.aendereLiegemoebelBestandPanel.setVisible(true);
        });
        aendereBalkonliegeBestandPanel.add(back);

        aendereBalkonliegeBestandPanel.add(back);
        aendereBalkonliegeBestandPanel.setLayout(null);
        aendereBalkonliegeBestandPanel.setBackground(Color.white);
        aendereBalkonliegeBestandPanel.setBounds(105, 0, 1600, 900);
        aendereBalkonliegeBestandPanel.setVisible(false);


        return aendereBalkonliegeBestandPanel;

    }
}
