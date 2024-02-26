package GUI.Sitzmoebel;

import GUI.MyFrame;
import Kategorie.Sitzmoebel;
import Lager.Lagersystem;
import Moebelhaus.Moebelhaus;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddFernsehcouchPanel {

    private static final JPanel changeFernsehcouchPanel = new JPanel();
    private static final Lagersystem lagersystem = Moebelhaus.getLagersystem();

    //Erstellen des Frame
    public static JPanel Panel() {

        JTextField t1 = new JTextField("1");
        t1.setBounds(400, 50, 30, 30);
        changeFernsehcouchPanel.add(t1);
        //Erstellen von AddItem Button
        //Erstellen von AddItem Button
        JButton addFernsehcouchEins = new JButton("Add Fernsehcouch Eins");
        addFernsehcouchEins.setBounds(150, 50, 175, 30);
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
        changeFernsehcouchPanel.add(addFernsehcouchEins);

        JTextField t2 = new JTextField("1");
        t2.setBounds(400, 100, 30, 30);
        changeFernsehcouchPanel.add(t2);
        //Erstellen von AddItem Button
        JButton addFernsehcouchZwei = new JButton("Add Fernsehcouch Zwei");
        addFernsehcouchZwei.setBounds(150, 100, 175, 30);
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
        changeFernsehcouchPanel.add(addFernsehcouchZwei);

        JTextField t3 = new JTextField("1");
        t3.setBounds(400, 150, 30, 30);
        changeFernsehcouchPanel.add(t3);
        //Erstellen von AddItem Button
        JButton addFernsehcouchDrei = new JButton("Add Fernsehcouch Drei");
        addFernsehcouchDrei.setBounds(150, 150, 175, 30);
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
        changeFernsehcouchPanel.add(addFernsehcouchDrei);

        JTextField t4 = new JTextField("1");
        t4.setBounds(400, 200, 30, 30);
        changeFernsehcouchPanel.add(t4);
        //Erstellen von AddItem Button
        JButton addFernsehcouchVier = new JButton("Add Fernsehcouch Vier");
        addFernsehcouchVier.setBounds(150, 200, 175, 30);
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
        changeFernsehcouchPanel.add(addFernsehcouchVier);

        //Erstellen von Back Button
        JButton back = new JButton("Back");
        back.setBounds(150, 250, 175, 30);
        back.addActionListener(e -> {
            MyFrame.changeFernsehcouchPanel.setVisible(false);
            MyFrame.changeSitzmoebelPanel.setVisible(true);
        });
        changeFernsehcouchPanel.add(back);

        changeFernsehcouchPanel.add(back);
        changeFernsehcouchPanel.setLayout(null);
        changeFernsehcouchPanel.setBackground(Color.GRAY);
        changeFernsehcouchPanel.setBounds(100, 0, 1600, 900);
        changeFernsehcouchPanel.setVisible(false);


        return changeFernsehcouchPanel;

    }
}

