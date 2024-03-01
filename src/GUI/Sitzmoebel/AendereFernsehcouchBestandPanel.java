package GUI.Sitzmoebel;

import GUI.Frame;
import Kategorie.Sitzmoebel;
import Lager.Lagersystem;
import Moebelhaus.Moebelhaus;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AendereFernsehcouchBestandPanel {

    private static final JPanel aendereFernsehcouchBestandPanel = new JPanel();
    private static final Lagersystem lagersystem = Moebelhaus.getLagersystem();

    //Erstellen des Frame
    public static JPanel Panel() {

        JTextField t1 = new JTextField("1");
        t1.setBounds(500, 50, 215, 30);
        aendereFernsehcouchBestandPanel.add(t1);
        //Erstellen von AddItem Button
        //Erstellen von AddItem Button
        JButton addFernsehcouchEins = new JButton("Ändere Fernsehcouch Bestand Eins");
        addFernsehcouchEins.setBounds(150, 50, 250, 30);
        addFernsehcouchEins.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = t1.getText();
                int i1;
                try {
                    i1 = Integer.parseInt(String.valueOf(text));
                } catch (NumberFormatException a) {
                    i1 = 0;
                }
                if (i1 >= 0) {
                    lagersystem.erhoeheFernsehcouchlagerLagerbestand(i1, Sitzmoebel.Sitzplaetze.eins);
                } else {
                    lagersystem.mindereFernsehcouchlagerLagerbestand(Math.abs(i1), Sitzmoebel.Sitzplaetze.eins);
                }


            }
        });
        aendereFernsehcouchBestandPanel.add(addFernsehcouchEins);

        JTextField t2 = new JTextField("1");
        t2.setBounds(500, 100, 215, 30);
        aendereFernsehcouchBestandPanel.add(t2);
        //Erstellen von AddItem Button
        JButton addFernsehcouchZwei = new JButton("Ändere Fernsehcouch Bestand Zwei");
        addFernsehcouchZwei.setBounds(150, 100, 250, 30);
        addFernsehcouchZwei.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = t2.getText();
                int i1;
                try {
                    i1 = Integer.parseInt(String.valueOf(text));
                } catch (NumberFormatException a) {
                    i1 = 0;
                }
                if (i1 >= 0) {
                    lagersystem.erhoeheFernsehcouchlagerLagerbestand(i1, Sitzmoebel.Sitzplaetze.zwei);
                } else {
                    lagersystem.mindereFernsehcouchlagerLagerbestand(Math.abs(i1), Sitzmoebel.Sitzplaetze.zwei);
                }
            }
        });
        aendereFernsehcouchBestandPanel.add(addFernsehcouchZwei);

        JTextField t3 = new JTextField("1");
        t3.setBounds(500, 150, 215, 30);
        aendereFernsehcouchBestandPanel.add(t3);
        //Erstellen von AddItem Button
        JButton addFernsehcouchDrei = new JButton("Ändere Fernsehcouch Bestand Drei");
        addFernsehcouchDrei.setBounds(150, 150, 250, 30);
        addFernsehcouchDrei.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = t3.getText();
                int i1;
                try {
                    i1 = Integer.parseInt(String.valueOf(text));
                } catch (NumberFormatException a) {
                    i1 = 0;
                }
                if (i1 >= 0) {
                    lagersystem.erhoeheFernsehcouchlagerLagerbestand(i1, Sitzmoebel.Sitzplaetze.drei);
                } else {
                    lagersystem.mindereFernsehcouchlagerLagerbestand(Math.abs(i1), Sitzmoebel.Sitzplaetze.drei);
                }

            }
        });
        aendereFernsehcouchBestandPanel.add(addFernsehcouchDrei);

        JTextField t4 = new JTextField("1");
        t4.setBounds(500, 200, 215, 30);
        aendereFernsehcouchBestandPanel.add(t4);
        //Erstellen von AddItem Button
        JButton addFernsehcouchVier = new JButton("Ändere Fernsehcouch Bestand Vier");
        addFernsehcouchVier.setBounds(150, 200, 250, 30);
        addFernsehcouchVier.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = t4.getText();
                int i1;
                try {
                    i1 = Integer.parseInt(String.valueOf(text));
                } catch (NumberFormatException a) {
                    i1 = 0;
                }
                if (i1 >= 0) {
                    lagersystem.erhoeheFernsehcouchlagerLagerbestand(i1, Sitzmoebel.Sitzplaetze.vier);
                } else {
                    lagersystem.mindereFernsehcouchlagerLagerbestand(Math.abs(i1), Sitzmoebel.Sitzplaetze.vier);
                }

            }
        });
        aendereFernsehcouchBestandPanel.add(addFernsehcouchVier);

        //Erstellen von Back Button
        JButton back = new JButton("Back");
        back.setBounds(150, 250, 250, 30);
        back.addActionListener(e -> {
            Frame.aendereFernsehcouchBestandPanel.setVisible(false);
            Frame.aendereSitzmoebelBestandPanel.setVisible(true);
        });
        aendereFernsehcouchBestandPanel.add(back);

        aendereFernsehcouchBestandPanel.add(back);
        aendereFernsehcouchBestandPanel.setLayout(null);
        aendereFernsehcouchBestandPanel.setBackground(Color.white);
        aendereFernsehcouchBestandPanel.setBounds(105, 0, 1600, 900);
        aendereFernsehcouchBestandPanel.setVisible(false);


        return aendereFernsehcouchBestandPanel;

    }
}

