package GUI.Tische;

import GUI.Frame;
import Kategorie.Tische;
import Lager.Lagersystem;
import Moebelhaus.Moebelhaus;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AendereKuechentischBestandPanel {

    private static final JPanel aendereKuechentischBestandPanel = new JPanel();
    private static final Lagersystem lagersystem = Moebelhaus.getLagersystem();
    //Erstellen des Frame

    public static JPanel Panel() {

        JTextField t1 = new JTextField("1");
        t1.setBounds(500, 50, 215, 30);
        aendereKuechentischBestandPanel.add(t1);
        //Erstellen von AddItem Button
        JButton addKuechentischS = new JButton("Ändere Kuechentisch Bestand S");
        addKuechentischS.setBounds(150, 50, 250, 30);
        addKuechentischS.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = t1.getText();
                int i1;
                try {
                    i1 = Integer.parseInt(String.valueOf(text));
                } catch (NumberFormatException a) {
                    i1 = 0;
                }
                if (i1 >= 0) {
                    lagersystem.erhoeheKuechentischlagerLagerbestand(i1, Tische.Hoehe.s);
                } else {
                    lagersystem.mindereKuechentischlagerLagerbestand(Math.abs(i1), Tische.Hoehe.s);
                }

            }
        });
        aendereKuechentischBestandPanel.add(addKuechentischS);

        JTextField t2 = new JTextField("1");
        t2.setBounds(500, 100, 215, 30);
        aendereKuechentischBestandPanel.add(t2);
        //Erstellen von AddItem Button
        JButton addKuechentischM = new JButton("Ändere Kuechentisch Bestand M");
        addKuechentischM.setBounds(150, 100, 250, 30);
        addKuechentischM.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = t2.getText();
                int i1;
                try {
                    i1 = Integer.parseInt(String.valueOf(text));
                } catch (NumberFormatException a) {
                    i1 = 0;
                }
                if (i1 >= 0) {
                    lagersystem.erhoeheKuechentischlagerLagerbestand(i1, Tische.Hoehe.m);
                } else {
                    lagersystem.mindereKuechentischlagerLagerbestand(Math.abs(i1), Tische.Hoehe.m);
                }

            }
        });
        aendereKuechentischBestandPanel.add(addKuechentischM);

        JTextField t3 = new JTextField("1");
        t3.setBounds(500, 150, 215, 30);
        aendereKuechentischBestandPanel.add(t3);
        //Erstellen von AddItem Button
        JButton addKuechentischL = new JButton("Ändere Kuechentisch Bestand L");
        addKuechentischL.setBounds(150, 150, 250, 30);
        addKuechentischL.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = t3.getText();
                int i1;
                try {
                    i1 = Integer.parseInt(String.valueOf(text));
                } catch (NumberFormatException a) {
                    i1 = 0;
                }
                if (i1 >= 0) {
                    lagersystem.erhoeheKuechentischlagerLagerbestand(i1, Tische.Hoehe.l);
                } else {
                    lagersystem.mindereKuechentischlagerLagerbestand(Math.abs(i1), Tische.Hoehe.l);
                }
            }
        });
        aendereKuechentischBestandPanel.add(addKuechentischL);


        //Erstellen von Back Button
        JButton back = new JButton("Back");
        back.setBounds(150, 200, 250, 30);
        back.addActionListener(e -> {
            Frame.aendereKuechentischBestandPanel.setVisible(false);
            Frame.aendereTischeBestandPanel.setVisible(true);
        });
        aendereKuechentischBestandPanel.add(back);

        aendereKuechentischBestandPanel.add(back);
        aendereKuechentischBestandPanel.setLayout(null);
        aendereKuechentischBestandPanel.setBackground(Color.white);
        aendereKuechentischBestandPanel.setBounds(105, 0, 1600, 900);
        aendereKuechentischBestandPanel.setVisible(false);


        return aendereKuechentischBestandPanel;

    }
}
