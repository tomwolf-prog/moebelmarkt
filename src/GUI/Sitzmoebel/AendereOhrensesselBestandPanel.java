package GUI.Sitzmoebel;

import GUI.Frame;
import Kategorie.Sitzmoebel;
import Lager.Lagersystem;
import Moebelhaus.Moebelhaus;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AendereOhrensesselBestandPanel {

    private static final JPanel AendereOhrensesselBestandPanel = new JPanel();
    private static final Lagersystem lagersystem = Moebelhaus.getLagersystem();
    //Erstellen des Frame

    public static JPanel Panel() {

        JTextField t1 = new JTextField("1");
        t1.setBounds(500, 50, 215, 30);
        AendereOhrensesselBestandPanel.add(t1);
        //Erstellen von AddItem Button
        JButton addOhrensesselEins = new JButton("Ändere Ohrensessel Bestand Eins");
        addOhrensesselEins.setBounds(150, 50, 250, 30);
        addOhrensesselEins.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = t1.getText();
                int i1;
                try {
                    i1 = Integer.parseInt(String.valueOf(text));
                } catch (NumberFormatException a) {
                    i1 = 0;
                }
                if (i1 >= 0) {
                    lagersystem.erhoeheOhrensessellagerLagerbestand(i1, Sitzmoebel.Sitzplaetze.eins);
                } else {
                    lagersystem.mindereOhrensessellagerLagerbestand(Math.abs(i1), Sitzmoebel.Sitzplaetze.eins);
                }

            }
        });
        AendereOhrensesselBestandPanel.add(addOhrensesselEins);

        JTextField t2 = new JTextField("1");
        t2.setBounds(500, 100, 215, 30);
        AendereOhrensesselBestandPanel.add(t2);
        //Erstellen von AddItem Button
        JButton addOhrensesselZwei = new JButton("Ändere Ohrensessel Bestand Zwei");
        addOhrensesselZwei.setBounds(150, 100, 250, 30);
        addOhrensesselZwei.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = t2.getText();
                int i1;
                try {
                    i1 = Integer.parseInt(String.valueOf(text));
                } catch (NumberFormatException a) {
                    i1 = 0;
                }
                if (i1 >= 0) {
                    lagersystem.erhoeheOhrensessellagerLagerbestand(i1, Sitzmoebel.Sitzplaetze.zwei);
                } else {
                    lagersystem.mindereOhrensessellagerLagerbestand(Math.abs(i1), Sitzmoebel.Sitzplaetze.zwei);
                }
            }
        });
        AendereOhrensesselBestandPanel.add(addOhrensesselZwei);

        JTextField t3 = new JTextField("1");
        t3.setBounds(500, 150, 215, 30);
        AendereOhrensesselBestandPanel.add(t3);
        //Erstellen von AddItem Button
        JButton addOhrensesselDrei = new JButton("Ändere Ohrensessel Bestand Drei");
        addOhrensesselDrei.setBounds(150, 150, 250, 30);
        addOhrensesselDrei.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = t3.getText();
                int i1;
                try {
                    i1 = Integer.parseInt(String.valueOf(text));
                } catch (NumberFormatException a) {
                    i1 = 0;
                }
                if (i1 >= 0) {
                    lagersystem.erhoeheOhrensessellagerLagerbestand(i1, Sitzmoebel.Sitzplaetze.drei);
                } else {
                    lagersystem.mindereOhrensessellagerLagerbestand(Math.abs(i1), Sitzmoebel.Sitzplaetze.drei);
                }

            }
        });
        AendereOhrensesselBestandPanel.add(addOhrensesselDrei);

        JTextField t4 = new JTextField("1");
        t4.setBounds(500, 200, 215, 30);
        AendereOhrensesselBestandPanel.add(t4);
        //Erstellen von AddItem Button
        JButton addOhrensesselVier = new JButton("Ändere Ohrensessel Bestand Vier");
        addOhrensesselVier.setBounds(150, 200, 250, 30);
        addOhrensesselVier.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = t4.getText();
                int i1;
                try {
                    i1 = Integer.parseInt(String.valueOf(text));
                } catch (NumberFormatException a) {
                    i1 = 0;
                }
                if (i1 >= 0) {
                    lagersystem.erhoeheOhrensessellagerLagerbestand(i1, Sitzmoebel.Sitzplaetze.vier);
                } else {
                    lagersystem.mindereOhrensessellagerLagerbestand(Math.abs(i1), Sitzmoebel.Sitzplaetze.vier);
                }

            }
        });
        AendereOhrensesselBestandPanel.add(addOhrensesselVier);

        //Erstellen von Back Button
        JButton back = new JButton("Back");
        back.setBounds(150, 250, 250, 30);
        back.addActionListener(e -> {
            Frame.aendereOhrensesselBestandPanel.setVisible(false);
            Frame.aendereSitzmoebelBestandPanel.setVisible(true);
        });
        AendereOhrensesselBestandPanel.add(back);

        AendereOhrensesselBestandPanel.add(back);
        AendereOhrensesselBestandPanel.setLayout(null);
        AendereOhrensesselBestandPanel.setBackground(Color.white);
        AendereOhrensesselBestandPanel.setBounds(105, 0, 1600, 900);
        AendereOhrensesselBestandPanel.setVisible(false);


        return AendereOhrensesselBestandPanel;

    }
}

