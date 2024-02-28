package GUI.Sitzmoebel;

import GUI.MyFrame;
import Lager.Lagersystem;
import Moebelhaus.Moebelhaus;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddSitzmoebelPanel {

    private static final JPanel changeSitzmoebelPanel = new JPanel();
    private static final Lagersystem lagersystem = Moebelhaus.getLagersystem();
    //Erstellen des Frame

    public static JPanel Panel() {

        //Erstellen von AddItem Button
        JButton addFernsehcouchPanel = new JButton("Add Fernsehcouch");
        addFernsehcouchPanel.setBounds(150, 50, 175, 30);
        addFernsehcouchPanel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                MyFrame.changeSitzmoebelPanel.setVisible(false);
                MyFrame.changeFernsehcouchPanel.setVisible(true);
            }
        });
        changeSitzmoebelPanel.add(addFernsehcouchPanel);

        //Erstellen von AddItem Button
        JButton addKuechenstuhlPanel = new JButton("Add Kuechenstuhl");
        addKuechenstuhlPanel.setBounds(150, 100, 175, 30);
        addKuechenstuhlPanel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                MyFrame.changeSitzmoebelPanel.setVisible(false);
                MyFrame.changeKuechenstuhlPanel.setVisible(true);
            }
        });
        changeSitzmoebelPanel.add(addKuechenstuhlPanel);


        //Erstellen von AddItem Button
        JButton addKuechenregalPanel = new JButton("Add Ohrensessel");
        addKuechenregalPanel.setBounds(150, 150, 175, 30);
        addKuechenregalPanel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                MyFrame.changeSitzmoebelPanel.setVisible(false);
                MyFrame.changeOhrensesselPanel.setVisible(true);
            }
        });
        changeSitzmoebelPanel.add(addKuechenregalPanel);

        //Erstellen von Back Button
        JButton back = new JButton("Back");
        back.setBounds(150, 200, 175, 30);
        back.addActionListener(e -> {
            MyFrame.changeSitzmoebelPanel.setVisible(false);
            MyFrame.changeItemPanel.setVisible(true);
        });
        changeSitzmoebelPanel.add(back);

        changeSitzmoebelPanel.add(back);
        changeSitzmoebelPanel.setLayout(null);
        changeSitzmoebelPanel.setBackground(Color.GRAY);
        changeSitzmoebelPanel.setBounds(105, 0, 1600, 900);
        changeSitzmoebelPanel.setVisible(false);


        return changeSitzmoebelPanel;

    }
}

