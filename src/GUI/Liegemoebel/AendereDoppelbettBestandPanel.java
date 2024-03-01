package GUI.Liegemoebel;

import GUI.Frame;
import Kategorie.Liegemoebel;
import Lager.Lagersystem;
import Moebelhaus.Moebelhaus;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AendereDoppelbettBestandPanel {

    private static final JPanel aendereDoppelbettBestandPanel = new JPanel();
    private static final Lagersystem lagersystem = Moebelhaus.getLagersystem();
    //Erstellen des Frame

    public static JPanel Panel() {

        JTextField t1 = new JTextField("1");
        t1.setBounds(500, 50, 215, 30);
        aendereDoppelbettBestandPanel.add(t1);
        //Erstellen von AddItem Button
        JButton addDoppelbettS = new JButton("Ändere Doppelbett Bestand S");
        addDoppelbettS.setBounds(150, 50, 250, 30);
        addDoppelbettS.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = t1.getText();
                int i1;
                try {
                    i1 = Integer.parseInt(String.valueOf(text));
                } catch (NumberFormatException a) {
                    i1 = 0;
                }
                if (i1 >= 0) {
                    lagersystem.erhoeheDoppelbettlagerLagerbestand(i1, Liegemoebel.Laenge.s);
                } else {
                    lagersystem.mindereDoppelbettlagerLagerbestand(Math.abs(i1), Liegemoebel.Laenge.s);
                }
            }
        });
        aendereDoppelbettBestandPanel.add(addDoppelbettS);

        JTextField t2 = new JTextField("1");
        t2.setBounds(500, 100, 215, 30);
        aendereDoppelbettBestandPanel.add(t2);
        //Erstellen von AddItem Button
        JButton addDoppelbettM = new JButton("Ändere Doppelbett Bestand M");
        addDoppelbettM.setBounds(150, 100, 250, 30);
        addDoppelbettM.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = t2.getText();
                int i1;
                try {
                    i1 = Integer.parseInt(String.valueOf(text));
                } catch (NumberFormatException a) {
                    i1 = 0;
                }
                if (i1 >= 0) {
                    lagersystem.erhoeheDoppelbettlagerLagerbestand(i1, Liegemoebel.Laenge.m);
                } else {
                    lagersystem.mindereDoppelbettlagerLagerbestand(Math.abs(i1), Liegemoebel.Laenge.m);
                }

            }
        });
        aendereDoppelbettBestandPanel.add(addDoppelbettM);

        JTextField t3 = new JTextField("1");
        t3.setBounds(500, 150, 215, 30);
        aendereDoppelbettBestandPanel.add(t3);
        //Erstellen von AddItem Button
        JButton addDoppelbettL = new JButton("Ändere Doppelbett Bestand L");
        addDoppelbettL.setBounds(150, 150, 250, 30);
        addDoppelbettL.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = t3.getText();
                int i1;
                try {
                    i1 = Integer.parseInt(String.valueOf(text));
                } catch (NumberFormatException a) {
                    i1 = 0;
                }
                if (i1 >= 0) {
                    lagersystem.erhoeheDoppelbettlagerLagerbestand(i1, Liegemoebel.Laenge.l);
                } else {
                    lagersystem.mindereDoppelbettlagerLagerbestand(Math.abs(i1), Liegemoebel.Laenge.l);
                }
            }
        });
        aendereDoppelbettBestandPanel.add(addDoppelbettL);


        //Erstellen von Back Button
        JButton back = new JButton("Back");
        back.setBounds(150, 200, 250, 30);
        back.addActionListener(e -> {
            Frame.aendereDoppelbettBestandPanel.setVisible(false);
            Frame.aendereLiegemoebelBestandPanel.setVisible(true);
        });
        aendereDoppelbettBestandPanel.add(back);

        aendereDoppelbettBestandPanel.add(back);
        aendereDoppelbettBestandPanel.setLayout(null);
        aendereDoppelbettBestandPanel.setBackground(Color.white);
        aendereDoppelbettBestandPanel.setBounds(105, 0, 1600, 900);
        aendereDoppelbettBestandPanel.setVisible(false);


        return aendereDoppelbettBestandPanel;

    }
}
