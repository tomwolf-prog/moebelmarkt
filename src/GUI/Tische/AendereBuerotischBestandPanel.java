package GUI.Tische;

import GUI.Frame;
import Kategorie.Tische;
import Lager.Lagersystem;
import Moebelhaus.Moebelhaus;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AendereBuerotischBestandPanel {

    private static final JPanel aendereBuerotischBestandPanel = new JPanel();
    private static final Lagersystem lagersystem = Moebelhaus.getLagersystem();
    //Erstellen des Frame

    public static JPanel Panel() {

        JTextField t1 = new JTextField("1");
        t1.setBounds(500, 50, 215, 30);
        aendereBuerotischBestandPanel.add(t1);
        //Erstellen von AddItem Button
        JButton addBuerotischS = new JButton("Ändere Buerotisch Bestand S");
        addBuerotischS.setBounds(150, 50, 250, 30);
        addBuerotischS.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = t1.getText();
                int i1;
                try {
                    i1 = Integer.parseInt(String.valueOf(text));
                } catch (NumberFormatException a) {
                    i1 = 0;
                }
                if (i1 >= 0) {
                    lagersystem.erhoeheBuerotischlagerLagerbestand(i1, Tische.Hoehe.s);
                } else {
                    lagersystem.mindereBuerotischlagerLagerbestand(Math.abs(i1), Tische.Hoehe.s);
                }

            }
        });
        aendereBuerotischBestandPanel.add(addBuerotischS);

        JTextField t2 = new JTextField("1");
        t2.setBounds(500, 100, 215, 30);
        aendereBuerotischBestandPanel.add(t2);
        //Erstellen von AddItem Button
        JButton addBuerotischM = new JButton("Ändere Buerotisch Bestand M");
        addBuerotischM.setBounds(150, 100, 250, 30);
        addBuerotischM.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = t2.getText();
                int i1;
                try {
                    i1 = Integer.parseInt(String.valueOf(text));
                } catch (NumberFormatException a) {
                    i1 = 0;
                }
                if (i1 >= 0) {
                    lagersystem.erhoeheBuerotischlagerLagerbestand(i1, Tische.Hoehe.m);
                } else {
                    lagersystem.mindereBuerotischlagerLagerbestand(Math.abs(i1), Tische.Hoehe.m);
                }

            }
        });
        aendereBuerotischBestandPanel.add(addBuerotischM);

        JTextField t3 = new JTextField("1");
        t3.setBounds(500, 150, 215, 30);
        aendereBuerotischBestandPanel.add(t3);
        //Erstellen von AddItem Button
        JButton addBuerotischL = new JButton("Ändere Buerotisch Bestand L");
        addBuerotischL.setBounds(150, 150, 250, 30);
        addBuerotischL.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = t3.getText();
                int i1;
                try {
                    i1 = Integer.parseInt(String.valueOf(text));
                } catch (NumberFormatException a) {
                    i1 = 0;
                }
                if (i1 >= 0) {
                    lagersystem.erhoeheBuerotischlagerLagerbestand(i1, Tische.Hoehe.l);
                } else {
                    lagersystem.mindereBuerotischlagerLagerbestand(Math.abs(i1), Tische.Hoehe.l);
                }

            }
        });
        aendereBuerotischBestandPanel.add(addBuerotischL);


        //Erstellen von Back Button
        JButton back = new JButton("Back");
        back.setBounds(150, 200, 250, 30);
        back.addActionListener(e -> {
            Frame.aendereBuerotischBestandPanel.setVisible(false);
            Frame.aendereTischeBestandPanel.setVisible(true);
        });
        aendereBuerotischBestandPanel.add(back);

        aendereBuerotischBestandPanel.add(back);
        aendereBuerotischBestandPanel.setLayout(null);
        aendereBuerotischBestandPanel.setBackground(Color.white);
        aendereBuerotischBestandPanel.setBounds(105, 0, 1600, 900);
        aendereBuerotischBestandPanel.setVisible(false);


        return aendereBuerotischBestandPanel;

    }
}