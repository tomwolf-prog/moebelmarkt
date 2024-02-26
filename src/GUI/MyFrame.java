package GUI;

import GUI.Lagerung.AddBeistelltischePanel;
import GUI.Lagerung.AddKleiderschrankregalPanel;
import GUI.Lagerung.AddKuechenregalPanel;
import GUI.Lagerung.AddLagerungPanel;
import Lager.Lagersystem;
import Moebelhaus.Moebelhaus;

import javax.swing.*;
import java.awt.*;


public class MyFrame {

    static Lagersystem lagersystem = Moebelhaus.getLagersystem();
    static JFrame frame;

    public static JPanel addItemPanel = AddItemPanel.Panel();
    //Lagerung
    public static JPanel addLagerungPanel = AddLagerungPanel.Panel();
    public static JPanel addKuechenregalPanel = AddKuechenregalPanel.Panel();
    public static JPanel addKleiderschrankregalPanel = AddKleiderschrankregalPanel.Panel();
    public static JPanel addBeistelltischePanel = AddBeistelltischePanel.Panel();
    public static JPanel lagerbestandPanel = LagerbestandPanel.Panel();

    static

    private void addPanels() {
        frame.add(addLagerungPanel);
        frame.add(addItemPanel);
        frame.add(lagerbestandPanel);
        //Lagerung
        frame.add(addLagerungPanel);
        frame.add(addKuechenregalPanel);
        frame.add(addKleiderschrankregalPanel);
        frame.add(addBeistelltischePanel);

    }

    public static JFrame baseFrame() {
        frame = new JFrame("Möbelhaus");
        addPanels();

        frame.setSize(1600, 900);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);

        //Erstellen von Lager Button
        JButton LagerBestand = new JButton("Bestand");
        LagerBestand.setBounds(5, 720, 95, 30);
        LagerBestand.addActionListener(e -> {
            LagerbestandPanel.updateLabels();
            lagerbestandPanel.setVisible(true);
        });
        frame.add(LagerBestand);

        //Erstellen von AddItem Button
        JButton addItem = new JButton("Add Item Panel");
        addItem.setBounds(5, 755, 95, 30);
        addItem.addActionListener(e -> {
            addItemPanel.setVisible(true);
        });
        frame.add(addItem);

        //Erstellen von Home Button
        JButton home = new JButton("Home");
        home.setBounds(5, 790, 95, 30);
        home.addActionListener(e -> {

        });
        frame.add(home);

        //Erstellen von Exit Button
        JButton exit = new JButton("Exit");
        exit.setBounds(5, 825, 95, 30);
        exit.addActionListener(e -> {
            int confirmed = JOptionPane.showConfirmDialog(frame,
                    "Are you sure you want to quit?", "Confirm quit",
                    JOptionPane.YES_NO_OPTION);
            if (confirmed == JOptionPane.YES_OPTION) {
                // clean up code
                System.exit(0);
            }
        });
        frame.add(exit);

        frame.setSize(1600, 900);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 105, 1500);
        panel.setBackground(Color.lightGray);
        frame.add(panel);

        return frame;

    }

}
