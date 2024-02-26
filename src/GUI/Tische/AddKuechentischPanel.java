package GUI.Tische;

import GUI.MyFrame;
import Kategorie.Tische;
import Lager.Lagersystem;
import Moebelhaus.Moebelhaus;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddKuechentischPanel {

    private static final JPanel addKuechentischPanel = new JPanel();
    private static final Lagersystem lagersystem = Moebelhaus.getLagersystem();
    //Erstellen des Frame

    public static JPanel Panel() {

        JTextField t1 = new JTextField("1");
        t1.setBounds(400, 50, 30, 30);
        addKuechentischPanel.add(t1);
        //Erstellen von AddItem Button
        JButton addKuechentischS = new JButton("Add Kuechentisch S");
        addKuechentischS.setBounds(150, 50, 175, 30);
        addKuechentischS.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = t1.getText();
                int i1;
                try {
                    i1 = Integer.parseInt(String.valueOf(text));
                } catch (NumberFormatException a) {
                    i1 = 0;
                }
                lagersystem.erhoeheKuechentischlagerLagerbestand(i1, Tische.Hoehe.s);

            }
        });
        addKuechentischPanel.add(addKuechentischS);

        JTextField t2 = new JTextField("1");
        t2.setBounds(400, 100, 30, 30);
        addKuechentischPanel.add(t2);
        //Erstellen von AddItem Button
        JButton addKuechentischM = new JButton("Add Kuechentisch M");
        addKuechentischM.setBounds(150, 100, 175, 30);
        addKuechentischM.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = t2.getText();
                int i1;
                try {
                    i1 = Integer.parseInt(String.valueOf(text));
                } catch (NumberFormatException a) {
                    i1 = 0;
                }
                lagersystem.erhoeheKuechentischlagerLagerbestand(i1, Tische.Hoehe.m);

            }
        });
        addKuechentischPanel.add(addKuechentischM);

        JTextField t3 = new JTextField("1");
        t3.setBounds(400, 150, 30, 30);
        addKuechentischPanel.add(t3);
        //Erstellen von AddItem Button
        JButton addKuechentischL = new JButton("Add Kuechentisch L");
        addKuechentischL.setBounds(150, 150, 175, 30);
        addKuechentischL.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = t3.getText();
                int i1;
                try {
                    i1 = Integer.parseInt(String.valueOf(text));
                } catch (NumberFormatException a) {
                    i1 = 0;
                }
                lagersystem.erhoeheKuechentischlagerLagerbestand(i1, Tische.Hoehe.l);

            }
        });
        addKuechentischPanel.add(addKuechentischL);


        //Erstellen von Back Button
        JButton back = new JButton("Back");
        back.setBounds(150, 200, 175, 30);
        back.addActionListener(e -> {
            MyFrame.addKuechentischPanel.setVisible(false);
            MyFrame.addTischePanel.setVisible(true);
        });
        addKuechentischPanel.add(back);

        addKuechentischPanel.add(back);
        addKuechentischPanel.setLayout(null);
        addKuechentischPanel.setBackground(Color.GRAY);
        addKuechentischPanel.setBounds(100, 0, 1600, 900);
        addKuechentischPanel.setVisible(false);


        return addKuechentischPanel;

    }
}
