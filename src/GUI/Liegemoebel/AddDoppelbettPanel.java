package GUI.Liegemoebel;

import GUI.MyFrame;
import Kategorie.Liegemoebel;
import Lager.Lagersystem;
import Moebelhaus.Moebelhaus;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddDoppelbettPanel {

    private static final JPanel addDoppelbettPanel = new JPanel();
    private static final Lagersystem lagersystem = Moebelhaus.getLagersystem();
    //Erstellen des Frame

    public static JPanel Panel() {

        JTextField t1 = new JTextField("1");
        t1.setBounds(400, 50, 30, 30);
        addDoppelbettPanel.add(t1);
        //Erstellen von AddItem Button
        JButton addDoppelbettS = new JButton("Add Doppelbett S");
        addDoppelbettS.setBounds(150, 50, 175, 30);
        addDoppelbettS.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = t1.getText();
                int i1;
                try {
                    i1 = Integer.parseInt(String.valueOf(text));
                } catch (NumberFormatException a) {
                    i1 = 0;
                }
                lagersystem.erhoeheDoppelbettlagerLagerbestand(i1, Liegemoebel.Laenge.s);

            }
        });
        addDoppelbettPanel.add(addDoppelbettS);

        JTextField t2 = new JTextField("1");
        t2.setBounds(400, 100, 30, 30);
        addDoppelbettPanel.add(t2);
        //Erstellen von AddItem Button
        JButton addDoppelbettM = new JButton("Add Doppelbett M");
        addDoppelbettM.setBounds(150, 100, 175, 30);
        addDoppelbettM.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = t2.getText();
                int i1;
                try {
                    i1 = Integer.parseInt(String.valueOf(text));
                } catch (NumberFormatException a) {
                    i1 = 0;
                }
                lagersystem.erhoeheDoppelbettlagerLagerbestand(i1, Liegemoebel.Laenge.m);

            }
        });
        addDoppelbettPanel.add(addDoppelbettM);

        JTextField t3 = new JTextField("1");
        t3.setBounds(400, 150, 30, 30);
        addDoppelbettPanel.add(t3);
        //Erstellen von AddItem Button
        JButton addDoppelbettL = new JButton("Add Doppelbett L");
        addDoppelbettL.setBounds(150, 150, 175, 30);
        addDoppelbettL.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = t3.getText();
                int i1;
                try {
                    i1 = Integer.parseInt(String.valueOf(text));
                } catch (NumberFormatException a) {
                    i1 = 0;
                }
                lagersystem.erhoeheDoppelbettlagerLagerbestand(i1, Liegemoebel.Laenge.l);

            }
        });
        addDoppelbettPanel.add(addDoppelbettL);


        //Erstellen von Back Button
        JButton back = new JButton("Back");
        back.setBounds(150, 200, 175, 30);
        back.addActionListener(e -> {
            MyFrame.addDoppelbettPanel.setVisible(false);
            MyFrame.addLiegemoebelPanel.setVisible(true);
        });
        addDoppelbettPanel.add(back);

        addDoppelbettPanel.add(back);
        addDoppelbettPanel.setLayout(null);
        addDoppelbettPanel.setBackground(Color.GRAY);
        addDoppelbettPanel.setBounds(100, 0, 1600, 900);
        addDoppelbettPanel.setVisible(false);


        return addDoppelbettPanel;

    }
}
