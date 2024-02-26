package GUI.Sitzmoebel;

import GUI.MyFrame;
import Kategorie.Sitzmoebel;
import Lager.Lagersystem;
import Moebelhaus.Moebelhaus;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddKuechenstuhlPanel {

    private static final JPanel addKuechenstuhlPanel = new JPanel();
    private static final Lagersystem lagersystem = Moebelhaus.getLagersystem();
    //Erstellen des Frame

    public static JPanel Panel() {

        JTextField t1 = new JTextField("1");
        t1.setBounds(400, 50, 30, 30);
        addKuechenstuhlPanel.add(t1);
        //Erstellen von AddItem Button
        JButton addKuechenstuhlEins = new JButton("Add Kuechenstuhl Eins");
        addKuechenstuhlEins.setBounds(150, 50, 175, 30);
        addKuechenstuhlEins.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = t1.getText();
                int i1;
                try {
                    i1 = Integer.parseInt(String.valueOf(text));
                } catch (NumberFormatException a) {
                    i1 = 0;
                }
                lagersystem.erhoeheKuechenstuhllagerLagerbestand(i1, Sitzmoebel.Sitzplaetze.eins);

            }
        });
        addKuechenstuhlPanel.add(addKuechenstuhlEins);

        JTextField t2 = new JTextField("1");
        t2.setBounds(400, 100, 30, 30);
        addKuechenstuhlPanel.add(t2);
        //Erstellen von AddItem Button
        JButton addKuechenstuhlZwei = new JButton("Add Kuechenstuhl Zwei");
        addKuechenstuhlZwei.setBounds(150, 100, 175, 30);
        addKuechenstuhlZwei.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = t2.getText();
                int i1;
                try {
                    i1 = Integer.parseInt(String.valueOf(text));
                } catch (NumberFormatException a) {
                    i1 = 0;
                }
                lagersystem.erhoeheKuechenstuhllagerLagerbestand(i1, Sitzmoebel.Sitzplaetze.zwei);
            }
        });
        addKuechenstuhlPanel.add(addKuechenstuhlZwei);

        JTextField t3 = new JTextField("1");
        t3.setBounds(400, 150, 30, 30);
        addKuechenstuhlPanel.add(t3);
        //Erstellen von AddItem Button
        JButton addKuechenstuhlDrei = new JButton("Add Kuechenstuhl Drei");
        addKuechenstuhlDrei.setBounds(150, 150, 175, 30);
        addKuechenstuhlDrei.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = t3.getText();
                int i1;
                try {
                    i1 = Integer.parseInt(String.valueOf(text));
                } catch (NumberFormatException a) {
                    i1 = 0;
                }
                lagersystem.erhoeheKuechenstuhllagerLagerbestand(i1, Sitzmoebel.Sitzplaetze.drei);

            }
        });
        addKuechenstuhlPanel.add(addKuechenstuhlDrei);

        JTextField t4 = new JTextField("1");
        t4.setBounds(400, 200, 30, 30);
        addKuechenstuhlPanel.add(t4);
        //Erstellen von AddItem Button
        JButton addKuechenstuhlVier = new JButton("Add Kuechenstuhl Vier");
        addKuechenstuhlVier.setBounds(150, 200, 175, 30);
        addKuechenstuhlVier.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = t4.getText();
                int i1;
                try {
                    i1 = Integer.parseInt(String.valueOf(text));
                } catch (NumberFormatException a) {
                    i1 = 0;
                }
                lagersystem.erhoeheKuechenstuhllagerLagerbestand(i1, Sitzmoebel.Sitzplaetze.vier);

            }
        });
        addKuechenstuhlPanel.add(addKuechenstuhlVier);

        //Erstellen von Back Button
        JButton back = new JButton("Back");
        back.setBounds(150, 250, 175, 30);
        back.addActionListener(e -> {
            MyFrame.addKuechenstuhlPanel.setVisible(false);
            MyFrame.addSitzmoebelPanel.setVisible(true);
        });
        addKuechenstuhlPanel.add(back);

        addKuechenstuhlPanel.add(back);
        addKuechenstuhlPanel.setLayout(null);
        addKuechenstuhlPanel.setBackground(Color.GRAY);
        addKuechenstuhlPanel.setBounds(100, 0, 1600, 900);
        addKuechenstuhlPanel.setVisible(false);


        return addKuechenstuhlPanel;

    }
}

