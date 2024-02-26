package GUI.Tische;

import GUI.MyFrame;
import Lager.Lagersystem;
import Moebelhaus.Moebelhaus;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddTischePanel {

    private static final JPanel addTischePanel = new JPanel();
    private static final Lagersystem lagersystem = Moebelhaus.getLagersystem();
    //Erstellen des Frame

    public static JPanel Panel() {

        //Erstellen von AddItem Button
        JButton addBuerotisch = new JButton("Add Buerotisch");
        addBuerotisch.setBounds(150, 50, 175, 30);
        addBuerotisch.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                MyFrame.addTischePanel.setVisible(false);
                MyFrame.addBuerotischPanel.setVisible(true);
            }
        });
        addTischePanel.add(addBuerotisch);

        //Erstellen von AddItem Button
        JButton addCouchtisch = new JButton("Add Couchtisch");
        addCouchtisch.setBounds(150, 100, 175, 30);
        addCouchtisch.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                MyFrame.addTischePanel.setVisible(false);
                MyFrame.addCouchtischPanel.setVisible(true);
            }
        });
        addTischePanel.add(addCouchtisch);


        //Erstellen von AddItem Button
        JButton addEsstisch = new JButton("Add Esstisch");
        addEsstisch.setBounds(150, 150, 175, 30);
        addEsstisch.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                MyFrame.addTischePanel.setVisible(false);
                MyFrame.addEsstischPanel.setVisible(true);
            }
        });
        addTischePanel.add(addEsstisch);

        //Erstellen von AddItem Button
        JButton addKuechentisch = new JButton("Add Kuechentisch");
        addKuechentisch.setBounds(150, 200, 175, 30);
        addKuechentisch.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                MyFrame.addTischePanel.setVisible(false);
                MyFrame.addKuechentischPanel.setVisible(true);
            }
        });
        addTischePanel.add(addKuechentisch);

        //Erstellen von Back Button
        JButton back = new JButton("Back");
        back.setBounds(150, 250, 175, 30);
        back.addActionListener(e -> {
            MyFrame.addTischePanel.setVisible(false);
            MyFrame.addItemPanel.setVisible(true);
        });
        addTischePanel.add(back);

        addTischePanel.add(back);
        addTischePanel.setLayout(null);
        addTischePanel.setBackground(Color.GRAY);
        addTischePanel.setBounds(100, 0, 1600, 900);
        addTischePanel.setVisible(false);


        return addTischePanel;

    }
}

