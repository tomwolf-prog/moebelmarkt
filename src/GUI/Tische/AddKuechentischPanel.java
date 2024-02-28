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

    private static final JPanel changeKuechentischPanel = new JPanel();
    private static final Lagersystem lagersystem = Moebelhaus.getLagersystem();
    //Erstellen des Frame

    public static JPanel Panel() {

        JTextField t1 = new JTextField("1");
        t1.setBounds(400, 50, 30, 30);
        changeKuechentischPanel.add(t1);
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
                if (i1 >= 0) {
                    lagersystem.erhoeheKuechentischlagerLagerbestand(i1, Tische.Hoehe.s);
                } else {
                    lagersystem.mindereKuechentischlagerLagerbestand(Math.abs(i1), Tische.Hoehe.s);
                }

            }
        });
        changeKuechentischPanel.add(addKuechentischS);

        JTextField t2 = new JTextField("1");
        t2.setBounds(400, 100, 30, 30);
        changeKuechentischPanel.add(t2);
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
                if (i1 >= 0) {
                    lagersystem.erhoeheKuechentischlagerLagerbestand(i1, Tische.Hoehe.m);
                } else {
                    lagersystem.mindereKuechentischlagerLagerbestand(Math.abs(i1), Tische.Hoehe.m);
                }

            }
        });
        changeKuechentischPanel.add(addKuechentischM);

        JTextField t3 = new JTextField("1");
        t3.setBounds(400, 150, 30, 30);
        changeKuechentischPanel.add(t3);
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
                if (i1 >= 0) {
                    lagersystem.erhoeheKuechentischlagerLagerbestand(i1, Tische.Hoehe.l);
                } else {
                    lagersystem.mindereKuechentischlagerLagerbestand(Math.abs(i1), Tische.Hoehe.l);
                }
            }
        });
        changeKuechentischPanel.add(addKuechentischL);


        //Erstellen von Back Button
        JButton back = new JButton("Back");
        back.setBounds(150, 200, 175, 30);
        back.addActionListener(e -> {
            MyFrame.changeKuechentischPanel.setVisible(false);
            MyFrame.changeTischePanel.setVisible(true);
        });
        changeKuechentischPanel.add(back);

        changeKuechentischPanel.add(back);
        changeKuechentischPanel.setLayout(null);
        changeKuechentischPanel.setBackground(Color.GRAY);
        changeKuechentischPanel.setBounds(105, 0, 1600, 900);
        changeKuechentischPanel.setVisible(false);


        return changeKuechentischPanel;

    }
}
