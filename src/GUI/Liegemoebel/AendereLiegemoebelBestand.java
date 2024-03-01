package GUI.Liegemoebel;

import GUI.MyFrame;
import Lager.Lagersystem;
import Moebelhaus.Moebelhaus;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AendereLiegemoebelBestand {

    private static final JPanel aendereLiegemoebelBestandPanel = new JPanel();
    private static final Lagersystem lagersystem = Moebelhaus.getLagersystem();
    //Erstellen des Frame

    public static JPanel Panel() {

        //Erstellen von AddItem Button
        JButton addBalkonliege = new JButton("Ändere Balkonliege Bestand");
        addBalkonliege.setBounds(150, 50, 250, 30);
        addBalkonliege.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                MyFrame.aendereLiegemoebelBestandPanel.setVisible(false);
                MyFrame.aendereBalkonliegeBestandPanel.setVisible(true);
            }
        });
        aendereLiegemoebelBestandPanel.add(addBalkonliege);

        //Erstellen von AddItem Button
        JButton addDoppelbett = new JButton("Ändere Doppelbett Bestand");
        addDoppelbett.setBounds(150, 100, 250, 30);
        addDoppelbett.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                MyFrame.aendereLiegemoebelBestandPanel.setVisible(false);
                MyFrame.aendereDoppelbettBestandPanel.setVisible(true);
            }
        });
        aendereLiegemoebelBestandPanel.add(addDoppelbett);


        //Erstellen von Back Button
        JButton back = new JButton("Back");
        back.setBounds(150, 150, 250, 30);
        back.addActionListener(e -> {
            MyFrame.aendereLiegemoebelBestandPanel.setVisible(false);
            MyFrame.aendereBestandPanel.setVisible(true);
        });
        aendereLiegemoebelBestandPanel.add(back);

        aendereLiegemoebelBestandPanel.add(back);
        aendereLiegemoebelBestandPanel.setLayout(null);
        aendereLiegemoebelBestandPanel.setBackground(Color.GRAY);
        aendereLiegemoebelBestandPanel.setBounds(105, 0, 1600, 900);
        aendereLiegemoebelBestandPanel.setVisible(false);


        return aendereLiegemoebelBestandPanel;

    }
}
