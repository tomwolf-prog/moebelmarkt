package GUI.Lagerung;

import GUI.MyFrame;
import Kategorie.Lagerung;
import Lager.Lagersystem;
import Moebelhaus.Moebelhaus;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChangeKuechenregalPanel {
    private static final JPanel changeKuechenregalPanel = new JPanel();

    public static JPanel Panel() {
        Lagersystem lagersystem = Moebelhaus.getLagersystem();

        JTextField t1 = new JTextField("1");
        t1.setBounds(400, 50, 30, 30);
        changeKuechenregalPanel.add(t1);
        //Erstellen von AddItem Button
        JButton addKuechenregalS = new JButton("Add Kuechenregal S");
        addKuechenregalS.setBounds(150, 50, 175, 30);
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
        changeKuechenregalPanel.add(addKuechenregalS);

        JTextField t2 = new JTextField("1");
        t2.setBounds(400, 100, 30, 30);
        changeKuechenregalPanel.add(t2);
        //Erstellen von AddItem Button
        JButton addKuechenregalM = new JButton("Add Kuechenregal M");
        addKuechenregalM.setBounds(150, 100, 175, 30);
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
        changeKuechenregalPanel.add(addKuechenregalM);

        JTextField t3 = new JTextField("1");
        t3.setBounds(400, 150, 30, 30);
        changeKuechenregalPanel.add(t3);
        //Erstellen von AddItem Button
        JButton addKuechenregalL = new JButton("Add Kuechenregal L");
        addKuechenregalL.setBounds(150, 150, 175, 30);
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
        changeKuechenregalPanel.add(addKuechenregalL);

        JTextField t4 = new JTextField("1");
        t4.setBounds(400, 200, 30, 30);
        changeKuechenregalPanel.add(t4);
        //Erstellen von AddItem Button
        JButton addKuechenregalXL = new JButton("Add Kuechenregal XL");
        addKuechenregalXL.setBounds(150, 200, 175, 30);
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
        changeKuechenregalPanel.add(addKuechenregalXL);

        //Erstellen von Back Button
        JButton back = new JButton("Back");
        back.setBounds(150, 250, 175, 30);
        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                MyFrame.changeKuechenregalPanel.setVisible(false);
                MyFrame.changeLagerungPanel.setVisible(true);
            }
        });
        changeKuechenregalPanel.add(back);


        changeKuechenregalPanel.setLayout(null);
        changeKuechenregalPanel.setBackground(Color.GRAY);
        changeKuechenregalPanel.setBounds(100, 0, 1600, 900);
        changeKuechenregalPanel.setVisible(false);


        return changeKuechenregalPanel;

    }
}
