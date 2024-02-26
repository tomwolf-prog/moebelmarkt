package GUI.Tische;

import GUI.MyFrame;
import Kategorie.Tische;
import Lager.Lagersystem;
import Moebelhaus.Moebelhaus;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddEsstischPanel {

    private static final JPanel addEsstischPanel = new JPanel();
    private static final Lagersystem lagersystem = Moebelhaus.getLagersystem();
    //Erstellen des Frame

    public static JPanel Panel() {

        //Erstellen von AddItem Button
        JButton addEsstischS = new JButton("Add Esstisch S");
        addEsstischS.setBounds(150, 50, 175, 30);
        addEsstischS.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lagersystem.addTisch(new Tische(Tische.Moebelart.Esstisch, Tische.Hoehe.s));

            }
        });
        addEsstischPanel.add(addEsstischS);

        //Erstellen von AddItem Button
        JButton addEsstischM = new JButton("Add Esstisch M");
        addEsstischM.setBounds(150, 100, 175, 30);
        addEsstischM.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lagersystem.addTisch(new Tische(Tische.Moebelart.Esstisch, Tische.Hoehe.m));

            }
        });
        addEsstischPanel.add(addEsstischM);

        //Erstellen von AddItem Button
        JButton addEsstischL = new JButton("Add Esstisch L");
        addEsstischL.setBounds(150, 150, 175, 30);
        addEsstischL.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lagersystem.addTisch(new Tische(Tische.Moebelart.Esstisch, Tische.Hoehe.l));

            }
        });
        addEsstischPanel.add(addEsstischL);


        //Erstellen von Back Button
        JButton back = new JButton("Back");
        back.setBounds(150, 200, 175, 30);
        back.addActionListener(e -> {
            MyFrame.addEsstischPanel.setVisible(false);
            MyFrame.addTischePanel.setVisible(true);
        });
        addEsstischPanel.add(back);

        addEsstischPanel.add(back);
        addEsstischPanel.setLayout(null);
        addEsstischPanel.setBackground(Color.GRAY);
        addEsstischPanel.setBounds(100, 0, 1600, 900);
        addEsstischPanel.setVisible(false);


        return addEsstischPanel;

    }
}
