package GUI.Sitzmoebel;

import GUI.MyFrame;
import Kategorie.Sitzmoebel;
import Lager.Lagersystem;
import Moebelhaus.Moebelhaus;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddOhrensesselPanel {

    private static final JPanel changeOhrensesselPanel = new JPanel();
    private static final Lagersystem lagersystem = Moebelhaus.getLagersystem();
    //Erstellen des Frame

    public static JPanel Panel() {

        JTextField t1 = new JTextField("1");
        t1.setBounds(400, 50, 30, 30);
        changeOhrensesselPanel.add(t1);
        //Erstellen von AddItem Button
        JButton addOhrensesselEins = new JButton("Add Ohrensessel Eins");
        addOhrensesselEins.setBounds(150, 50, 175, 30);
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
        changeOhrensesselPanel.add(addOhrensesselEins);

        JTextField t2 = new JTextField("1");
        t2.setBounds(400, 100, 30, 30);
        changeOhrensesselPanel.add(t2);
        //Erstellen von AddItem Button
        JButton addOhrensesselZwei = new JButton("Add Ohrensessel Zwei");
        addOhrensesselZwei.setBounds(150, 100, 175, 30);
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
        changeOhrensesselPanel.add(addOhrensesselZwei);

        JTextField t3 = new JTextField("1");
        t3.setBounds(400, 150, 30, 30);
        changeOhrensesselPanel.add(t3);
        //Erstellen von AddItem Button
        JButton addOhrensesselDrei = new JButton("Add Ohrensessel Drei");
        addOhrensesselDrei.setBounds(150, 150, 175, 30);
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
        changeOhrensesselPanel.add(addOhrensesselDrei);

        JTextField t4 = new JTextField("1");
        t4.setBounds(400, 200, 30, 30);
        changeOhrensesselPanel.add(t4);
        //Erstellen von AddItem Button
        JButton addOhrensesselVier = new JButton("Add Ohrensessel Vier");
        addOhrensesselVier.setBounds(150, 200, 175, 30);
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
        changeOhrensesselPanel.add(addOhrensesselVier);

        //Erstellen von Back Button
        JButton back = new JButton("Back");
        back.setBounds(150, 250, 175, 30);
        back.addActionListener(e -> {
            MyFrame.changeOhrensesselPanel.setVisible(false);
            MyFrame.changeSitzmoebelPanel.setVisible(true);
        });
        changeOhrensesselPanel.add(back);

        changeOhrensesselPanel.add(back);
        changeOhrensesselPanel.setLayout(null);
        changeOhrensesselPanel.setBackground(Color.GRAY);
        changeOhrensesselPanel.setBounds(105, 0, 1600, 900);
        changeOhrensesselPanel.setVisible(false);


        return changeOhrensesselPanel;

    }
}

