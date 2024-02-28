package GUI.Tische;

import GUI.MyFrame;
import Kategorie.Tische;
import Lager.Lagersystem;
import Moebelhaus.Moebelhaus;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddCouchtischPanel {

    private static final JPanel changeCouchtischPanel = new JPanel();
    private static final Lagersystem lagersystem = Moebelhaus.getLagersystem();
    //Erstellen des Frame

    public static JPanel Panel() {

        JTextField t1 = new JTextField("1");
        t1.setBounds(400, 50, 30, 30);
        changeCouchtischPanel.add(t1);
        //Erstellen von AddItem Button
        JButton addCouchtischS = new JButton("Add Couchtisch S");
        addCouchtischS.setBounds(150, 50, 175, 30);
        addCouchtischS.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = t1.getText();
                int i1;
                try {
                    i1 = Integer.parseInt(String.valueOf(text));
                } catch (NumberFormatException a) {
                    i1 = 0;
                }
                if (i1 >= 0) {
                    lagersystem.erhoeheCouchtischlagerLagerbestand(i1, Tische.Hoehe.s);
                } else {
                    lagersystem.mindereCouchtischlagerLagerbestand(Math.abs(i1), Tische.Hoehe.s);
                }

            }
        });
        changeCouchtischPanel.add(addCouchtischS);

        JTextField t2 = new JTextField("1");
        t2.setBounds(400, 100, 30, 30);
        changeCouchtischPanel.add(t2);
        //Erstellen von AddItem Button
        JButton addCouchtischM = new JButton("Add Couchtisch M");
        addCouchtischM.setBounds(150, 100, 175, 30);
        addCouchtischM.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = t2.getText();
                int i1;
                try {
                    i1 = Integer.parseInt(String.valueOf(text));
                } catch (NumberFormatException a) {
                    i1 = 0;
                }
                if (i1 >= 0) {
                    lagersystem.erhoeheCouchtischlagerLagerbestand(i1, Tische.Hoehe.m);
                } else {
                    lagersystem.mindereCouchtischlagerLagerbestand(Math.abs(i1), Tische.Hoehe.m);
                }

            }
        });
        changeCouchtischPanel.add(addCouchtischM);

        JTextField t3 = new JTextField("1");
        t3.setBounds(400, 150, 30, 30);
        changeCouchtischPanel.add(t3);
        //Erstellen von AddItem Button
        JButton addCouchtischL = new JButton("Add Couchtisch L");
        addCouchtischL.setBounds(150, 150, 175, 30);
        addCouchtischL.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = t3.getText();
                int i1;
                try {
                    i1 = Integer.parseInt(String.valueOf(text));
                } catch (NumberFormatException a) {
                    i1 = 0;
                }
                if (i1 >= 0) {
                    lagersystem.erhoeheCouchtischlagerLagerbestand(i1, Tische.Hoehe.l);
                } else {
                    lagersystem.mindereCouchtischlagerLagerbestand(Math.abs(i1), Tische.Hoehe.l);
                }

            }
        });
        changeCouchtischPanel.add(addCouchtischL);


        //Erstellen von Back Button
        JButton back = new JButton("Back");
        back.setBounds(150, 200, 175, 30);
        back.addActionListener(e -> {
            MyFrame.changeCouchtischPanel.setVisible(false);
            MyFrame.changeTischePanel.setVisible(true);
        });
        changeCouchtischPanel.add(back);

        changeCouchtischPanel.add(back);
        changeCouchtischPanel.setLayout(null);
        changeCouchtischPanel.setBackground(Color.GRAY);
        changeCouchtischPanel.setBounds(105, 0, 1600, 900);
        changeCouchtischPanel.setVisible(false);


        return changeCouchtischPanel;

    }
}
