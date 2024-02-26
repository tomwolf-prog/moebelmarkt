package GUI.Lagerung;

import GUI.MyFrame;
import Kategorie.Lagerung;
import Lager.Lagersystem;
import Moebelhaus.Moebelhaus;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddKleiderschrankregalPanel {
    private static final JPanel addKleiderschrankregalPanel = new JPanel();

    public static JPanel Panel() {
        Lagersystem lagersystem = Moebelhaus.getLagersystem();

        JTextField t1 = new JTextField("1");
        t1.setBounds(400, 50, 30, 30);
        addKleiderschrankregalPanel.add(t1);
        //Erstellen von AddItem Button
        JButton addKleiderschrankS = new JButton("Add Kleiderschrank S");
        addKleiderschrankS.setBounds(150, 50, 175, 30);
        addKleiderschrankS.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = t1.getText();
                int i1;
                try {
                    i1 = Integer.parseInt(String.valueOf(text));
                } catch (NumberFormatException a) {
                    i1 = 0;
                }
                lagersystem.erhoeheKleiderschranklagerLagerbestand(i1, Lagerung.Flaeche.s);
            }
        });
        addKleiderschrankregalPanel.add(addKleiderschrankS);

        JTextField t2 = new JTextField("1");
        t2.setBounds(400, 100, 30, 30);
        addKleiderschrankregalPanel.add(t2);
        //Erstellen von AddItem Button
        JButton addKleiderschrankM = new JButton("Add Kuechenregal M");
        addKleiderschrankM.setBounds(150, 100, 175, 30);
        addKleiderschrankM.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = t2.getText();
                int i1;
                try {
                    i1 = Integer.parseInt(String.valueOf(text));
                } catch (NumberFormatException a) {
                    i1 = 0;
                }
                lagersystem.erhoeheKleiderschranklagerLagerbestand(i1, Lagerung.Flaeche.m);
                ;
            }
        });
        addKleiderschrankregalPanel.add(addKleiderschrankM);

        JTextField t3 = new JTextField("1");
        t3.setBounds(400, 150, 30, 30);
        addKleiderschrankregalPanel.add(t3);
        //Erstellen von AddItem Button
        JButton addKleiderschrankL = new JButton("Add Kuechenregal L");
        addKleiderschrankL.setBounds(150, 150, 175, 30);
        addKleiderschrankL.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = t3.getText();
                int i1;
                try {
                    i1 = Integer.parseInt(String.valueOf(text));
                } catch (NumberFormatException a) {
                    i1 = 0;
                }
                lagersystem.erhoeheKleiderschranklagerLagerbestand(i1, Lagerung.Flaeche.l);
                ;
            }
        });
        addKleiderschrankregalPanel.add(addKleiderschrankL);

        JTextField t4 = new JTextField("1");
        t4.setBounds(400, 200, 30, 30);
        addKleiderschrankregalPanel.add(t4);
        //Erstellen von AddItem Button
        JButton addKleiderschrankXL = new JButton("Add Kuechenregal XL");
        addKleiderschrankXL.setBounds(150, 200, 175, 30);
        addKleiderschrankXL.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = t4.getText();
                int i1;
                try {
                    i1 = Integer.parseInt(String.valueOf(text));
                } catch (NumberFormatException a) {
                    i1 = 0;
                }
                lagersystem.erhoeheKleiderschranklagerLagerbestand(i1, Lagerung.Flaeche.xl);
            }
        });
        addKleiderschrankregalPanel.add(addKleiderschrankXL);

        //Erstellen von Back Button
        JButton back = new JButton("Back");
        back.setBounds(150, 250, 175, 30);
        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                MyFrame.addKleiderschrankregalPanel.setVisible(false);
                MyFrame.addLagerungPanel.setVisible(true);
            }
        });
        addKleiderschrankregalPanel.add(back);


        addKleiderschrankregalPanel.setLayout(null);
        addKleiderschrankregalPanel.setBackground(Color.GRAY);
        addKleiderschrankregalPanel.setBounds(100, 0, 1600, 900);
        addKleiderschrankregalPanel.setVisible(false);


        return addKleiderschrankregalPanel;

    }
}

