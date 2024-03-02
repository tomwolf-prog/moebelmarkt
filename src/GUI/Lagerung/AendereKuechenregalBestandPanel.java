package GUI.Lagerung;

import GUI.Frame;
import Kategorie.Lagerung;
import Lager.Lagersystem;
import Moebelhaus.Moebelhaus;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AendereKuechenregalBestandPanel {
    private static final JPanel aendereKuechenregalBestandPanel = new JPanel();

    public static JPanel Panel() {
        Lagersystem lagersystem = Moebelhaus.getLagersystem();

        JTextField t1 = new JTextField("1");
        t1.setBounds(500, 50, 215, 30);
        aendereKuechenregalBestandPanel.add(t1);
        //Erstellen von AddItem Button
        JButton addKuechenregalS = new JButton("Ändere Kuechenregal Bestand S");
        addKuechenregalS.setBounds(150, 50, 250, 30);
        addKuechenregalS.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = t1.getText();
                int i1;
                try {
                    i1 = Integer.parseInt(String.valueOf(text));
                } catch (NumberFormatException a) {
                    i1 = 0;
                }
                if (i1 >= 0) {
                    lagersystem.erhoeheKuechenregallagerLagerbestand(i1, Lagerung.Flaeche.s);
                } else {
                    lagersystem.mindereKuechenregallagerLagerbestand(Math.abs(i1), Lagerung.Flaeche.s);
                }
            }
        });
        aendereKuechenregalBestandPanel.add(addKuechenregalS);

        JTextField t2 = new JTextField("1");
        t2.setBounds(500, 100, 215, 30);
        aendereKuechenregalBestandPanel.add(t2);
        //Erstellen von AddItem Button
        JButton addKuechenregalM = new JButton("Ändere Kuechenregal Bestand M");
        addKuechenregalM.setBounds(150, 100, 250, 30);
        addKuechenregalM.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = t2.getText();
                int i1;
                try {
                    i1 = Integer.parseInt(String.valueOf(text));
                } catch (NumberFormatException a) {
                    i1 = 0;
                }
                if (i1 >= 0) {
                    lagersystem.erhoeheKuechenregallagerLagerbestand(i1, Lagerung.Flaeche.m);
                } else {
                    lagersystem.mindereKuechenregallagerLagerbestand(Math.abs(i1), Lagerung.Flaeche.m);
                }
            }
        });
        aendereKuechenregalBestandPanel.add(addKuechenregalM);

        JTextField t3 = new JTextField("1");
        t3.setBounds(500, 150, 215, 30);
        aendereKuechenregalBestandPanel.add(t3);
        //Erstellen von AddItem Button
        JButton addKuechenregalL = new JButton("Ändere Kuechenregal Bestand L");
        addKuechenregalL.setBounds(150, 150, 250, 30);
        addKuechenregalL.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = t3.getText();
                int i1;
                try {
                    i1 = Integer.parseInt(String.valueOf(text));
                } catch (NumberFormatException a) {
                    i1 = 0;
                }
                if (i1 >= 0) {
                    lagersystem.erhoeheKuechenregallagerLagerbestand(i1, Lagerung.Flaeche.l);
                } else {
                    lagersystem.mindereKuechenregallagerLagerbestand(Math.abs(i1), Lagerung.Flaeche.l);
                }
            }
        });
        aendereKuechenregalBestandPanel.add(addKuechenregalL);

        JTextField t4 = new JTextField("1");
        t4.setBounds(500, 200, 215, 30);
        aendereKuechenregalBestandPanel.add(t4);
        //Erstellen von AddItem Button
        JButton addKuechenregalXL = new JButton("Ändere Kuechenregal Bestand XL");
        addKuechenregalXL.setBounds(150, 200, 250, 30);
        addKuechenregalXL.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = t4.getText();
                int i1;
                try {
                    i1 = Integer.parseInt(String.valueOf(text));
                } catch (NumberFormatException a) {
                    i1 = 0;
                }
                if (i1 >= 0) {
                    lagersystem.erhoeheKuechenregallagerLagerbestand(i1, Lagerung.Flaeche.xl);
                } else {
                    lagersystem.mindereKuechenregallagerLagerbestand(Math.abs(i1), Lagerung.Flaeche.xl);
                }

            }
        });
        aendereKuechenregalBestandPanel.add(addKuechenregalXL);

        //Erstellen von Back Button
        JButton back = new JButton("Back");
        back.setBounds(150, 250, 250, 30);
        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Frame.aendereKuechenregalBestandPanel.setVisible(false);
                Frame.aendereLagerungBestandPanel.setVisible(true);
            }
        });
        aendereKuechenregalBestandPanel.add(back);


        aendereKuechenregalBestandPanel.setLayout(null);
        aendereKuechenregalBestandPanel.setBackground(Color.WHITE);
        aendereKuechenregalBestandPanel.setBounds(105, 0, 1600, 900);
        aendereKuechenregalBestandPanel.setVisible(false);


        return aendereKuechenregalBestandPanel;

    }
}
