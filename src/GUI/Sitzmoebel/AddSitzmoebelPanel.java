package GUI.Sitzmoebel;

import GUI.MyFrame;
import Lager.Lagersystem;
import Moebelhaus.Moebelhaus;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddSitzmoebelPanel {

    private static final JPanel addSitzmoebelPanel = new JPanel();
    private static final Lagersystem lagersystem = Moebelhaus.getLagersystem();
    //Erstellen des Frame

    public static JPanel Panel() {

        //Erstellen von AddItem Button
        JButton addFernsehcouchPanel = new JButton("Add Fernsehcouch");
        addFernsehcouchPanel.setBounds(150, 50, 175, 30);
        addFernsehcouchPanel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                MyFrame.addSitzmoebelPanel.setVisible(false);
                MyFrame.addFernsehcouchPanel.setVisible(true);
            }
        });
        addSitzmoebelPanel.add(addFernsehcouchPanel);

        //Erstellen von AddItem Button
        JButton addKuechenstuhlPanel = new JButton("Add Kuechenstuhl");
        addKuechenstuhlPanel.setBounds(150, 100, 175, 30);
        addKuechenstuhlPanel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                MyFrame.addSitzmoebelPanel.setVisible(false);
                MyFrame.addKuechenstuhlPanel.setVisible(true);
            }
        });
        addSitzmoebelPanel.add(addKuechenstuhlPanel);


        //Erstellen von AddItem Button
        JButton addKuechenregallager = new JButton("Add Ohrensessel");
        addKuechenregallager.setBounds(150, 150, 175, 30);
        addKuechenregallager.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                MyFrame.addSitzmoebelPanel.setVisible(false);
                MyFrame.addOhrensesselPanel.setVisible(true);
            }
        });
        addSitzmoebelPanel.add(addKuechenregallager);

        //Erstellen von Back Button
        JButton back = new JButton("Back");
        back.setBounds(150, 200, 175, 30);
        back.addActionListener(e -> {
            MyFrame.addSitzmoebelPanel.setVisible(false);
            MyFrame.addItemPanel.setVisible(true);
        });
        addSitzmoebelPanel.add(back);

        addSitzmoebelPanel.add(back);
        addSitzmoebelPanel.setLayout(null);
        addSitzmoebelPanel.setBackground(Color.GRAY);
        addSitzmoebelPanel.setBounds(100, 0, 1600, 900);
        addSitzmoebelPanel.setVisible(false);


        return addSitzmoebelPanel;

    }
}

