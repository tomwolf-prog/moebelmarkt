package GUI.Tische;

import GUI.Frame;
import Kategorie.Tische;
import Lager.Lagersystem;
import Moebelhaus.Moebelhaus;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AendereEsstischBestandPanel {

    private static final JPanel aendereEsstischBestandPanel = new JPanel();
    private static final Lagersystem lagersystem = Moebelhaus.getLagersystem();
    //Erstellen des Frame

    public static JPanel Panel() {

        JTextField t1 = new JTextField("1");
        t1.setBounds(500, 50, 215, 30);
        aendereEsstischBestandPanel.add(t1);
        //Erstellen von AddItem Button
        JButton addEsstischS = new JButton("Ändere Esstisch Bestand S");
        addEsstischS.setBounds(150, 50, 250, 30);
        addEsstischS.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = t1.getText();
                int i1;
                try {
                    i1 = Integer.parseInt(String.valueOf(text));
                } catch (NumberFormatException a) {
                    i1 = 0;
                }
                if (i1 >= 0) {
                    lagersystem.erhoeheEsstischlagerLagerbestand(i1, Tische.Hoehe.s);
                } else {
                    lagersystem.mindereEsstischlagerLagerbestand(Math.abs(i1), Tische.Hoehe.s);
                }

            }
        });
        aendereEsstischBestandPanel.add(addEsstischS);

        JTextField t2 = new JTextField("1");
        t2.setBounds(500, 100, 215, 30);
        aendereEsstischBestandPanel.add(t2);
        //Erstellen von AddItem Button
        JButton addEsstischM = new JButton("Ändere Esstisch Bestand M");
        addEsstischM.setBounds(150, 100, 250, 30);
        addEsstischM.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = t2.getText();
                int i1;
                try {
                    i1 = Integer.parseInt(String.valueOf(text));
                } catch (NumberFormatException a) {
                    i1 = 0;
                }
                if (i1 >= 0) {
                    lagersystem.erhoeheEsstischlagerLagerbestand(i1, Tische.Hoehe.m);
                } else {
                    lagersystem.mindereEsstischlagerLagerbestand(Math.abs(i1), Tische.Hoehe.m);
                }

            }
        });
        aendereEsstischBestandPanel.add(addEsstischM);

        JTextField t3 = new JTextField("1");
        t3.setBounds(500, 150, 215, 30);
        aendereEsstischBestandPanel.add(t3);
        //Erstellen von AddItem Button
        JButton addEsstischL = new JButton("Ändere Esstisch Bestand L");
        addEsstischL.setBounds(150, 150, 250, 30);
        addEsstischL.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = t3.getText();
                int i1;
                try {
                    i1 = Integer.parseInt(String.valueOf(text));
                } catch (NumberFormatException a) {
                    i1 = 0;
                }
                if (i1 >= 0) {
                    lagersystem.erhoeheEsstischlagerLagerbestand(i1, Tische.Hoehe.l);
                } else {
                    lagersystem.mindereEsstischlagerLagerbestand(Math.abs(i1), Tische.Hoehe.l);
                }

            }
        });
        aendereEsstischBestandPanel.add(addEsstischL);


        //Erstellen von Back Button
        JButton back = new JButton("Back");
        back.setBounds(150, 200, 250, 30);
        back.addActionListener(e -> {
            Frame.aendereEsstischBestandPanel.setVisible(false);
            Frame.aendereTischeBestandPanel.setVisible(true);
        });
        aendereEsstischBestandPanel.add(back);

        aendereEsstischBestandPanel.add(back);
        aendereEsstischBestandPanel.setLayout(null);
        aendereEsstischBestandPanel.setBackground(Color.white);
        aendereEsstischBestandPanel.setBounds(105, 0, 1600, 900);
        aendereEsstischBestandPanel.setVisible(false);


        return aendereEsstischBestandPanel;

    }
}
