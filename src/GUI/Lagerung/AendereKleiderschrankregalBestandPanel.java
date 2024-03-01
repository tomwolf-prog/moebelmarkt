package GUI.Lagerung;

import GUI.MyFrame;
import Kategorie.Lagerung;
import Lager.Lagersystem;
import Moebelhaus.Moebelhaus;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AendereKleiderschrankregalBestandPanel {
    private static final JPanel aendereKleiderschrankregalBestandPanel = new JPanel();

    public static JPanel Panel() {
        Lagersystem lagersystem = Moebelhaus.getLagersystem();

        JTextField t1 = new JTextField("1");
        t1.setBounds(500, 50, 215, 30);
        aendereKleiderschrankregalBestandPanel.add(t1);
        //Erstellen von AddItem Button
        JButton addKleiderschrankS = new JButton("Ändere Kleiderschrank Bestand S");
        addKleiderschrankS.setBounds(150, 50, 250, 30);
        addKleiderschrankS.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = t1.getText();
                int i1;
                try {
                    i1 = Integer.parseInt(String.valueOf(text));
                } catch (NumberFormatException a) {
                    i1 = 0;
                }
                if (i1 >= 0) {
                    lagersystem.erhoeheKleiderschranklagerLagerbestand(i1, Lagerung.Flaeche.s);
                } else {
                    lagersystem.mindereKleiderschranklagerLagerbestand(Math.abs(i1), Lagerung.Flaeche.s);
                }
            }
        });
        aendereKleiderschrankregalBestandPanel.add(addKleiderschrankS);

        JTextField t2 = new JTextField("1");
        t2.setBounds(500, 100, 215, 30);
        aendereKleiderschrankregalBestandPanel.add(t2);
        //Erstellen von AddItem Button
        JButton addKleiderschrankM = new JButton("Ändere Kuechenregal Bestand M");
        addKleiderschrankM.setBounds(150, 100, 250, 30);
        addKleiderschrankM.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = t2.getText();
                int i1;
                try {
                    i1 = Integer.parseInt(String.valueOf(text));
                } catch (NumberFormatException a) {
                    i1 = 0;
                }
                if (i1 >= 0) {
                    lagersystem.erhoeheKleiderschranklagerLagerbestand(i1, Lagerung.Flaeche.m);
                } else {
                    lagersystem.mindereKleiderschranklagerLagerbestand(Math.abs(i1), Lagerung.Flaeche.m);
                }
                ;
            }
        });
        aendereKleiderschrankregalBestandPanel.add(addKleiderschrankM);

        JTextField t3 = new JTextField("1");
        t3.setBounds(500, 150, 215, 30);
        aendereKleiderschrankregalBestandPanel.add(t3);
        //Erstellen von AddItem Button
        JButton addKleiderschrankL = new JButton("Ändere Kuechenregal Bestand L");
        addKleiderschrankL.setBounds(150, 150, 250, 30);
        addKleiderschrankL.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = t3.getText();
                int i1;
                try {
                    i1 = Integer.parseInt(String.valueOf(text));
                } catch (NumberFormatException a) {
                    i1 = 0;
                }
                if (i1 >= 0) {
                    lagersystem.erhoeheKleiderschranklagerLagerbestand(i1, Lagerung.Flaeche.l);
                } else {
                    lagersystem.mindereKleiderschranklagerLagerbestand(Math.abs(i1), Lagerung.Flaeche.l);
                }
            }
        });
        aendereKleiderschrankregalBestandPanel.add(addKleiderschrankL);

        JTextField t4 = new JTextField("1");
        t4.setBounds(500, 200, 215, 30);
        aendereKleiderschrankregalBestandPanel.add(t4);
        //Erstellen von AddItem Button
        JButton addKleiderschrankXL = new JButton("Ändere Kuechenregal Bestand XL");
        addKleiderschrankXL.setBounds(150, 200, 250, 30);
        addKleiderschrankXL.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = t4.getText();
                int i1;
                try {
                    i1 = Integer.parseInt(String.valueOf(text));
                } catch (NumberFormatException a) {
                    i1 = 0;
                }
                if (i1 >= 0) {
                    lagersystem.erhoeheKleiderschranklagerLagerbestand(i1, Lagerung.Flaeche.xl);
                } else {
                    lagersystem.mindereKleiderschranklagerLagerbestand(Math.abs(i1), Lagerung.Flaeche.xl);
                }
            }
        });
        aendereKleiderschrankregalBestandPanel.add(addKleiderschrankXL);

        //Erstellen von Back Button
        JButton back = new JButton("Back");
        back.setBounds(150, 250, 250, 30);
        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                MyFrame.aendereKleiderschrankregalBestandPanel.setVisible(false);
                MyFrame.aendereLagerungBestandPanel.setVisible(true);
            }
        });
        aendereKleiderschrankregalBestandPanel.add(back);


        aendereKleiderschrankregalBestandPanel.setLayout(null);
        aendereKleiderschrankregalBestandPanel.setBackground(Color.GRAY);
        aendereKleiderschrankregalBestandPanel.setBounds(105, 0, 1600, 900);
        aendereKleiderschrankregalBestandPanel.setVisible(false);


        return aendereKleiderschrankregalBestandPanel;

    }
}

