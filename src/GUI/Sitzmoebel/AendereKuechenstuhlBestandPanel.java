package GUI.Sitzmoebel;

import GUI.MyFrame;
import Kategorie.Sitzmoebel;
import Lager.Lagersystem;
import Moebelhaus.Moebelhaus;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AendereKuechenstuhlBestandPanel {

    private static final JPanel AendereKuechenstuhlBestandPanel = new JPanel();
    private static final Lagersystem lagersystem = Moebelhaus.getLagersystem();
    //Erstellen des Frame

    public static JPanel Panel() {

        JTextField t1 = new JTextField("1");
        t1.setBounds(500, 50, 215, 30);
        AendereKuechenstuhlBestandPanel.add(t1);
        //Erstellen von AddItem Button
        JButton addKuechenstuhlEins = new JButton("Ändere Kuechenstuhl Bestand Eins");
        addKuechenstuhlEins.setBounds(150, 50, 250, 30);
        addKuechenstuhlEins.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = t1.getText();
                int i1;
                try {
                    i1 = Integer.parseInt(String.valueOf(text));
                } catch (NumberFormatException a) {
                    i1 = 0;
                }
                if (i1 >= 0) {
                    lagersystem.erhoeheKuechenstuhllagerLagerbestand(i1, Sitzmoebel.Sitzplaetze.eins);
                } else {
                    lagersystem.erhoeheKuechenstuhllagerLagerbestand(Math.abs(i1), Sitzmoebel.Sitzplaetze.eins);
                }

            }
        });
        AendereKuechenstuhlBestandPanel.add(addKuechenstuhlEins);

        JTextField t2 = new JTextField("1");
        t2.setBounds(500, 100, 215, 30);
        AendereKuechenstuhlBestandPanel.add(t2);
        //Erstellen von AddItem Button
        JButton addKuechenstuhlZwei = new JButton("Ändere Kuechenstuhl Bestand Zwei");
        addKuechenstuhlZwei.setBounds(150, 100, 250, 30);
        addKuechenstuhlZwei.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = t2.getText();
                int i1;
                try {
                    i1 = Integer.parseInt(String.valueOf(text));
                } catch (NumberFormatException a) {
                    i1 = 0;
                }
                if (i1 >= 0) {
                    lagersystem.erhoeheKuechenstuhllagerLagerbestand(i1, Sitzmoebel.Sitzplaetze.zwei);
                } else {
                    lagersystem.erhoeheKuechenstuhllagerLagerbestand(Math.abs(i1), Sitzmoebel.Sitzplaetze.zwei);
                }
            }
        });
        AendereKuechenstuhlBestandPanel.add(addKuechenstuhlZwei);

        JTextField t3 = new JTextField("1");
        t3.setBounds(500, 150, 215, 30);
        AendereKuechenstuhlBestandPanel.add(t3);
        //Erstellen von AddItem Button
        JButton addKuechenstuhlDrei = new JButton("Ändere Kuechenstuhl Bestand Drei");
        addKuechenstuhlDrei.setBounds(150, 150, 250, 30);
        addKuechenstuhlDrei.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = t3.getText();
                int i1;
                try {
                    i1 = Integer.parseInt(String.valueOf(text));
                } catch (NumberFormatException a) {
                    i1 = 0;
                }
                if (i1 >= 0) {
                    lagersystem.erhoeheKuechenstuhllagerLagerbestand(i1, Sitzmoebel.Sitzplaetze.drei);
                } else {
                    lagersystem.erhoeheKuechenstuhllagerLagerbestand(Math.abs(i1), Sitzmoebel.Sitzplaetze.drei);
                }

            }
        });
        AendereKuechenstuhlBestandPanel.add(addKuechenstuhlDrei);

        JTextField t4 = new JTextField("1");
        t4.setBounds(500, 200, 215, 30);
        AendereKuechenstuhlBestandPanel.add(t4);
        //Erstellen von AddItem Button
        JButton addKuechenstuhlVier = new JButton("Ändere Kuechenstuhl Bestand Vier");
        addKuechenstuhlVier.setBounds(150, 200, 250, 30);
        addKuechenstuhlVier.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = t4.getText();
                int i1;
                try {
                    i1 = Integer.parseInt(String.valueOf(text));
                } catch (NumberFormatException a) {
                    i1 = 0;
                }
                if (i1 >= 0) {
                    lagersystem.erhoeheKuechenstuhllagerLagerbestand(i1, Sitzmoebel.Sitzplaetze.vier);
                } else {
                    lagersystem.erhoeheKuechenstuhllagerLagerbestand(Math.abs(i1), Sitzmoebel.Sitzplaetze.vier);
                }

            }
        });
        AendereKuechenstuhlBestandPanel.add(addKuechenstuhlVier);

        //Erstellen von Back Button
        JButton back = new JButton("Back");
        back.setBounds(150, 250, 250, 30);
        back.addActionListener(e -> {
            MyFrame.aendereKuechenstuhlBestandPanel.setVisible(false);
            MyFrame.aendereSitzmoebelBestandPanel.setVisible(true);
        });
        AendereKuechenstuhlBestandPanel.add(back);

        AendereKuechenstuhlBestandPanel.add(back);
        AendereKuechenstuhlBestandPanel.setLayout(null);
        AendereKuechenstuhlBestandPanel.setBackground(Color.GRAY);
        AendereKuechenstuhlBestandPanel.setBounds(105, 0, 1600, 900);
        AendereKuechenstuhlBestandPanel.setVisible(false);


        return AendereKuechenstuhlBestandPanel;

    }
}

