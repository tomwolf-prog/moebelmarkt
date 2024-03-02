package GUI.Lagerung;

import GUI.Frame;
import Kategorie.Lagerung;
import Lager.Lagersystem;
import Moebelhaus.Moebelhaus;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AendereBeistelltischeBestandPanel {
    private static final JPanel aendereBeistelltischeBestandPanel = new JPanel();

    public static JPanel Panel() {
        Lagersystem lagersystem = Moebelhaus.getLagersystem();

        JTextField t1 = new JTextField("1");
        t1.setBounds(500, 50, 215, 30);
        aendereBeistelltischeBestandPanel.add(t1);
        JButton addKleiderschrankS = new JButton("Ändere Beistelltisch Bestand S");
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
                    lagersystem.erhoeheBeistelltischlagerLagerbestand(i1, Lagerung.Flaeche.s);
                } else {
                    lagersystem.mindereBeistelltischlagerLagerbestand(Math.abs(i1), Lagerung.Flaeche.s);
                }

            }
        });
        aendereBeistelltischeBestandPanel.add(addKleiderschrankS);

        JTextField t2 = new JTextField("1");
        t2.setBounds(500, 100, 215, 30);
        aendereBeistelltischeBestandPanel.add(t2);
        //Erstellen von AddItem Button
        JButton addKleiderschrankM = new JButton("Ändere Beistelltisch Bestand M");
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
                    lagersystem.erhoeheBeistelltischlagerLagerbestand(i1, Lagerung.Flaeche.m);
                } else {
                    lagersystem.mindereBeistelltischlagerLagerbestand(Math.abs(i1), Lagerung.Flaeche.m);
                }

            }
        });
        aendereBeistelltischeBestandPanel.add(addKleiderschrankM);

        JTextField t3 = new JTextField("1");
        t3.setBounds(500, 150, 215, 30);
        aendereBeistelltischeBestandPanel.add(t3);
        //Erstellen von AddItem Button
        JButton addKleiderschrankL = new JButton("Ändere Beistelltisch Bestand L");
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
                    lagersystem.erhoeheBeistelltischlagerLagerbestand(i1, Lagerung.Flaeche.l);
                } else {
                    lagersystem.mindereBeistelltischlagerLagerbestand(Math.abs(i1), Lagerung.Flaeche.l);
                }

            }
        });
        aendereBeistelltischeBestandPanel.add(addKleiderschrankL);

        JTextField t4 = new JTextField("1");
        t4.setBounds(500, 200, 215, 30);
        aendereBeistelltischeBestandPanel.add(t4);
        //Erstellen von AddItem Button
        JButton addKleiderschrankXL = new JButton("Ändere Beistelltisch Bestand XL");
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
                    lagersystem.erhoeheBeistelltischlagerLagerbestand(i1, Lagerung.Flaeche.xl);
                } else {
                    lagersystem.mindereBeistelltischlagerLagerbestand(Math.abs(i1), Lagerung.Flaeche.xl);
                }
            }
        });
        aendereBeistelltischeBestandPanel.add(addKleiderschrankXL);

        //Erstellen von Back Button
        JButton back = new JButton("Back");
        back.setBounds(150, 250, 250, 30);
        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Frame.aendereBeistelltischeBestandPanel.setVisible(false);
                Frame.aendereLagerungBestandPanel.setVisible(true);
            }
        });
        aendereBeistelltischeBestandPanel.add(back);


        aendereBeistelltischeBestandPanel.setLayout(null);
        aendereBeistelltischeBestandPanel.setBackground(Color.WHITE);
        aendereBeistelltischeBestandPanel.setBounds(105, 0, 1600, 900);
        aendereBeistelltischeBestandPanel.setVisible(false);


        return aendereBeistelltischeBestandPanel;

    }
}

