package GUI.Tische;

import GUI.MyFrame;
import Kategorie.Tische;
import Lager.Lagersystem;
import Moebelhaus.Moebelhaus;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddBuerotischPanel {

    private static final JPanel changeBuerotischPanel = new JPanel();
    private static final Lagersystem lagersystem = Moebelhaus.getLagersystem();
    //Erstellen des Frame

    public static JPanel Panel() {

        JTextField t1 = new JTextField("1");
        t1.setBounds(400, 50, 30, 30);
        changeBuerotischPanel.add(t1);
        //Erstellen von AddItem Button
        JButton addBuerotischS = new JButton("Add Buerotisch S");
        addBuerotischS.setBounds(150, 50, 175, 30);
        addBuerotischS.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = t1.getText();
                int i1;
                try {
                    i1 = Integer.parseInt(String.valueOf(text));
                } catch (NumberFormatException a) {
                    i1 = 0;
                }
                if (i1 >= 0) {
                    lagersystem.erhoeheBuerotischlagerLagerbestand(i1, Tische.Hoehe.s);
                } else {
                    lagersystem.mindereBuerotischlagerLagerbestand(Math.abs(i1), Tische.Hoehe.s);
                }

            }
        });
        changeBuerotischPanel.add(addBuerotischS);

        JTextField t2 = new JTextField("1");
        t2.setBounds(400, 100, 30, 30);
        changeBuerotischPanel.add(t2);
        //Erstellen von AddItem Button
        JButton addBuerotischM = new JButton("Add Buerotisch M");
        addBuerotischM.setBounds(150, 100, 175, 30);
        addBuerotischM.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = t2.getText();
                int i1;
                try {
                    i1 = Integer.parseInt(String.valueOf(text));
                } catch (NumberFormatException a) {
                    i1 = 0;
                }
                if (i1 >= 0) {
                    lagersystem.erhoeheBuerotischlagerLagerbestand(i1, Tische.Hoehe.m);
                } else {
                    lagersystem.mindereBuerotischlagerLagerbestand(Math.abs(i1), Tische.Hoehe.m);
                }

            }
        });
        changeBuerotischPanel.add(addBuerotischM);

        JTextField t3 = new JTextField("1");
        t3.setBounds(400, 150, 30, 30);
        changeBuerotischPanel.add(t3);
        //Erstellen von AddItem Button
        JButton addBuerotischL = new JButton("Add Buerotisch L");
        addBuerotischL.setBounds(150, 150, 175, 30);
        addBuerotischL.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = t3.getText();
                int i1;
                try {
                    i1 = Integer.parseInt(String.valueOf(text));
                } catch (NumberFormatException a) {
                    i1 = 0;
                }
                if (i1 >= 0) {
                    lagersystem.erhoeheBuerotischlagerLagerbestand(i1, Tische.Hoehe.l);
                } else {
                    lagersystem.mindereBuerotischlagerLagerbestand(Math.abs(i1), Tische.Hoehe.l);
                }

            }
        });
        changeBuerotischPanel.add(addBuerotischL);


        //Erstellen von Back Button
        JButton back = new JButton("Back");
        back.setBounds(150, 200, 175, 30);
        back.addActionListener(e -> {
            MyFrame.changeBuerotischPanel.setVisible(false);
            MyFrame.changeTischePanel.setVisible(true);
        });
        changeBuerotischPanel.add(back);

        changeBuerotischPanel.add(back);
        changeBuerotischPanel.setLayout(null);
        changeBuerotischPanel.setBackground(Color.GRAY);
        changeBuerotischPanel.setBounds(105, 0, 1600, 900);
        changeBuerotischPanel.setVisible(false);


        return changeBuerotischPanel;

    }
}