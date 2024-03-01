package GUI.Tische;

import GUI.Frame;
import Kategorie.Tische;
import Lager.Lagersystem;
import Moebelhaus.Moebelhaus;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AendereCouchtischBestandPanel {

    private static final JPanel aendereCouchtischBestandPanel = new JPanel();
    private static final Lagersystem lagersystem = Moebelhaus.getLagersystem();
    //Erstellen des Frame

    public static JPanel Panel() {

        JTextField t1 = new JTextField("1");
        t1.setBounds(500, 50, 215, 30);
        aendereCouchtischBestandPanel.add(t1);
        //Erstellen von AddItem Button
        JButton addCouchtischS = new JButton("Ändere Couchtisch Bestand S");
        addCouchtischS.setBounds(150, 50, 250, 30);
        addCouchtischS.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = t1.getText();
                int i1;
                try {
                    i1 = Integer.parseInt(String.valueOf(text));
                } catch (NumberFormatException a) {
                    i1 = 0;
                }
                if (i1 >= 0) {
                    lagersystem.erhoeheCouchtischlagerLagerbestand(i1, Tische.Hoehe.s);
                } else {
                    lagersystem.mindereCouchtischlagerLagerbestand(Math.abs(i1), Tische.Hoehe.s);
                }

            }
        });
        aendereCouchtischBestandPanel.add(addCouchtischS);

        JTextField t2 = new JTextField("1");
        t2.setBounds(500, 100, 215, 30);
        aendereCouchtischBestandPanel.add(t2);
        //Erstellen von AddItem Button
        JButton addCouchtischM = new JButton("Ändere Couchtisch Bestand M");
        addCouchtischM.setBounds(150, 100, 250, 30);
        addCouchtischM.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = t2.getText();
                int i1;
                try {
                    i1 = Integer.parseInt(String.valueOf(text));
                } catch (NumberFormatException a) {
                    i1 = 0;
                }
                if (i1 >= 0) {
                    lagersystem.erhoeheCouchtischlagerLagerbestand(i1, Tische.Hoehe.m);
                } else {
                    lagersystem.mindereCouchtischlagerLagerbestand(Math.abs(i1), Tische.Hoehe.m);
                }

            }
        });
        aendereCouchtischBestandPanel.add(addCouchtischM);

        JTextField t3 = new JTextField("1");
        t3.setBounds(500, 150, 215, 30);
        aendereCouchtischBestandPanel.add(t3);
        //Erstellen von AddItem Button
        JButton addCouchtischL = new JButton("Ändere Couchtisch Bestand L");
        addCouchtischL.setBounds(150, 150, 250, 30);
        addCouchtischL.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = t3.getText();
                int i1;
                try {
                    i1 = Integer.parseInt(String.valueOf(text));
                } catch (NumberFormatException a) {
                    i1 = 0;
                }
                if (i1 >= 0) {
                    lagersystem.erhoeheCouchtischlagerLagerbestand(i1, Tische.Hoehe.l);
                } else {
                    lagersystem.mindereCouchtischlagerLagerbestand(Math.abs(i1), Tische.Hoehe.l);
                }

            }
        });
        aendereCouchtischBestandPanel.add(addCouchtischL);


        //Erstellen von Back Button
        JButton back = new JButton("Back");
        back.setBounds(150, 200, 250, 30);
        back.addActionListener(e -> {
            Frame.aendereCouchtischBestandPanel.setVisible(false);
            Frame.aendereTischeBestandPanel.setVisible(true);
        });
        aendereCouchtischBestandPanel.add(back);

        aendereCouchtischBestandPanel.add(back);
        aendereCouchtischBestandPanel.setLayout(null);
        aendereCouchtischBestandPanel.setBackground(Color.white);
        aendereCouchtischBestandPanel.setBounds(105, 0, 1600, 900);
        aendereCouchtischBestandPanel.setVisible(false);


        return aendereCouchtischBestandPanel;

    }
}
