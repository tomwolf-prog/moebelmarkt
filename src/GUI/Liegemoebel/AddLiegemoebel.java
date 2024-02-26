package GUI.Liegemoebel;

import GUI.MyFrame;
import Lager.Lagersystem;
import Moebelhaus.Moebelhaus;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddLiegemoebel {

    private static final JPanel addLiegemoebelPanel = new JPanel();
    private static final Lagersystem lagersystem = Moebelhaus.getLagersystem();
    //Erstellen des Frame

    public static JPanel Panel() {

        //Erstellen von AddItem Button
        JButton addBalkonliege = new JButton("Add Balkonliege");
        addBalkonliege.setBounds(150, 50, 175, 30);
        addBalkonliege.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                MyFrame.addLiegemoebelPanel.setVisible(false);
                MyFrame.addBalkonliegePanel.setVisible(true);
            }
        });
        addLiegemoebelPanel.add(addBalkonliege);

        //Erstellen von AddItem Button
        JButton addDoppelbett = new JButton("Add Doppelbett");
        addDoppelbett.setBounds(150, 100, 175, 30);
        addDoppelbett.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                MyFrame.addLiegemoebelPanel.setVisible(false);
                MyFrame.addDoppelbettPanel.setVisible(true);
            }
        });
        addLiegemoebelPanel.add(addDoppelbett);


        //Erstellen von Back Button
        JButton back = new JButton("Back");
        back.setBounds(150, 150, 175, 30);
        back.addActionListener(e -> {
            MyFrame.addLiegemoebelPanel.setVisible(false);
            MyFrame.addItemPanel.setVisible(true);
        });
        addLiegemoebelPanel.add(back);

        addLiegemoebelPanel.add(back);
        addLiegemoebelPanel.setLayout(null);
        addLiegemoebelPanel.setBackground(Color.GRAY);
        addLiegemoebelPanel.setBounds(100, 0, 1600, 900);
        addLiegemoebelPanel.setVisible(false);


        return addLiegemoebelPanel;

    }
}
