package GUI;

import GUI.Lagerung.AendereBeistelltischeBestandPanel;
import GUI.Lagerung.AendereKleiderschrankregalBestandPanel;
import GUI.Lagerung.AendereKuechenregalBestandPanel;
import GUI.Lagerung.AendereLagerungBestandPanel;
import GUI.Liegemoebel.AendereBalkonliegeBestandPanel;
import GUI.Liegemoebel.AendereDoppelbettBestandPanel;
import GUI.Liegemoebel.AendereLiegemoebelBestand;
import GUI.Sitzmoebel.AendereFernsehcouchBestandPanel;
import GUI.Sitzmoebel.AendereKuechenstuhlBestandPanel;
import GUI.Sitzmoebel.AendereOhrensesselBestandPanel;
import GUI.Sitzmoebel.AendereSitzmoebelBestandPanel;
import GUI.Tische.*;
import Lager.Lagersystem;
import Moebelhaus.Moebelhaus;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;


public class MyFrame {

    static Lagersystem lagersystem = Moebelhaus.getLagersystem();
    static JFrame frame;
    public static JPanel aendereBestandPanel = AendereBestandPanel.Panel();
    public static JPanel lagerbestandPanel = LagerbestandPanel.Panel();
    public static JPanel verkaufspreisPanel = VerkaufspreisPanel.Panel();
    public static JPanel rabattPanel = Rabatt.Panel();
    public static JPanel setPreisPanel = SetPreis.Panel();
    public static JPanel kombiPanel = Kombi.Panel();
    public static JPanel findEigenschaft = FindEigenschaft.Panel();
    //Lagerung
    public static JPanel aendereLagerungBestandPanel = AendereLagerungBestandPanel.Panel();
    public static JPanel aendereKuechenregalBestandPanel = AendereKuechenregalBestandPanel.Panel();
    public static JPanel aendereKleiderschrankregalBestandPanel = AendereKleiderschrankregalBestandPanel.Panel();
    public static JPanel aendereBeistelltischeBestandPanel = AendereBeistelltischeBestandPanel.Panel();

    //Sitzmoebel
    public static JPanel aendereFernsehcouchBestandPanel = AendereFernsehcouchBestandPanel.Panel();
    public static JPanel aendereKuechenstuhlBestandPanel = AendereKuechenstuhlBestandPanel.Panel();
    public static JPanel aendereOhrensesselBestandPanel = AendereOhrensesselBestandPanel.Panel();
    public static JPanel aendereSitzmoebelBestandPanel = AendereSitzmoebelBestandPanel.Panel();

    //Tische
    public static JPanel aendereBuerotischBestandPanel = AendereBuerotischBestandPanel.Panel();
    public static JPanel aendereCouchtischBestandPanel = AendereCouchtischBestandPanel.Panel();
    public static JPanel aendereEsstischBestandPanel = AendereEsstischBestandPanel.Panel();
    public static JPanel aendereKuechentischBestandPanel = AendereKuechentischBestandPanel.Panel();
    public static JPanel aendereTischeBestandPanel = AendereTischeBestandPanel.Panel();

    //Liegemoebel
    public static JPanel aendereBalkonliegeBestandPanel = AendereBalkonliegeBestandPanel.Panel();
    public static JPanel aendereDoppelbettBestandPanel = AendereDoppelbettBestandPanel.Panel();
    public static JPanel aendereLiegemoebelBestandPanel = AendereLiegemoebelBestand.Panel();

    private static void addPanels() {
        frame.add(aendereLagerungBestandPanel);
        frame.add(aendereBestandPanel);
        frame.add(lagerbestandPanel);
        frame.add(verkaufspreisPanel);
        frame.add(setPreisPanel);
        frame.add(rabattPanel);
        frame.add(kombiPanel);
        frame.add(findEigenschaft);
        //Lagerung
        frame.add(aendereLagerungBestandPanel);
        frame.add(aendereKuechenregalBestandPanel);
        frame.add(aendereKleiderschrankregalBestandPanel);
        frame.add(aendereBeistelltischeBestandPanel);
        //Sitzmoebel
        frame.add(aendereFernsehcouchBestandPanel);
        frame.add(aendereKuechenstuhlBestandPanel);
        frame.add(aendereOhrensesselBestandPanel);
        frame.add(aendereSitzmoebelBestandPanel);
        //Tische
        frame.add(aendereBuerotischBestandPanel);
        frame.add(aendereCouchtischBestandPanel);
        frame.add(aendereEsstischBestandPanel);
        frame.add(aendereKuechentischBestandPanel);
        frame.add(aendereTischeBestandPanel);
        //Liegemoebel
        frame.add(aendereBalkonliegeBestandPanel);
        frame.add(aendereDoppelbettBestandPanel);
        frame.add(aendereLiegemoebelBestandPanel);

    }

    private static void setAllPanelsInvisible() {
        aendereLagerungBestandPanel.setVisible(false);
        aendereBestandPanel.setVisible(false);
        lagerbestandPanel.setVisible(false);
        verkaufspreisPanel.setVisible(false);
        setPreisPanel.setVisible(false);
        rabattPanel.setVisible(false);
        kombiPanel.setVisible(false);
        findEigenschaft.setVisible(false);
        //Lagerung
        aendereLagerungBestandPanel.setVisible(false);
        aendereKuechenregalBestandPanel.setVisible(false);
        aendereKleiderschrankregalBestandPanel.setVisible(false);
        aendereBeistelltischeBestandPanel.setVisible(false);
        //Sitzmoebel
        aendereFernsehcouchBestandPanel.setVisible(false);
        aendereKuechenstuhlBestandPanel.setVisible(false);
        aendereOhrensesselBestandPanel.setVisible(false);
        aendereSitzmoebelBestandPanel.setVisible(false);
        //Tische
        aendereBuerotischBestandPanel.setVisible(false);
        aendereCouchtischBestandPanel.setVisible(false);
        aendereEsstischBestandPanel.setVisible(false);
        aendereKuechentischBestandPanel.setVisible(false);
        aendereTischeBestandPanel.setVisible(false);
        //Liegemoebel
        aendereBalkonliegeBestandPanel.setVisible(false);
        aendereDoppelbettBestandPanel.setVisible(false);
        aendereLiegemoebelBestandPanel.setVisible(false);

    }

    public static JFrame baseFrame() {
        frame = new JFrame("Möbelhaus");
        addPanels();


        frame.setSize(1600, 900);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);

        //Erstellen von Lager Button
        JButton findEigenschaftButton = new JButton("findEigenschaft");
        findEigenschaftButton.setBounds(5, 545, 95, 30);
        findEigenschaftButton.addActionListener(e -> {
            setAllPanelsInvisible();
            findEigenschaft.setVisible(true);
        });
        frame.add(findEigenschaftButton);

        //Erstellen von Lager Button
        JButton geKombi = new JButton("Kombi");
        geKombi.setBounds(5, 580, 95, 30);
        geKombi.addActionListener(e -> {
            setAllPanelsInvisible();
            Rabatt.updateLabels();
            kombiPanel.setVisible(true);
        });
        frame.add(geKombi);

        //Erstellen von Lager Button
        JButton setRabatt = new JButton("Rabatt");
        setRabatt.setBounds(5, 615, 95, 30);
        setRabatt.addActionListener(e -> {
            setAllPanelsInvisible();
            Rabatt.updateLabels();
            rabattPanel.setVisible(true);
        });
        frame.add(setRabatt);

        //Erstellen von Lager Button
        JButton setPreis = new JButton("SetPreis");
        setPreis.setBounds(5, 650, 95, 30);
        setPreis.addActionListener(e -> {
            setAllPanelsInvisible();
            SetPreis.updateLabels();
            setPreisPanel.setVisible(true);
        });
        frame.add(setPreis);


        //Erstellen von Lager Button
        JButton Verkaufspreis = new JButton("Verkaufspreis");
        Verkaufspreis.setBounds(5, 685, 95, 30);
        Verkaufspreis.addActionListener(e -> {
            setAllPanelsInvisible();
            VerkaufspreisPanel.updateLabels();
            verkaufspreisPanel.setVisible(true);
        });
        frame.add(Verkaufspreis);

        //Erstellen von Lager Button
        JButton LagerBestand = new JButton("Bestand");
        LagerBestand.setBounds(5, 720, 95, 30);
        LagerBestand.addActionListener(e -> {
            setAllPanelsInvisible();
            LagerbestandPanel.updateLabels();
            lagerbestandPanel.setVisible(true);
        });
        frame.add(LagerBestand);

        //Erstellen von AddItem Button
        JButton addItem = new JButton("Aendere Bestand Panel");
        addItem.setBounds(5, 755, 95, 30);
        addItem.addActionListener(e -> {
            setAllPanelsInvisible();
            aendereBestandPanel.setVisible(true);
        });
        frame.add(addItem);

        //Erstellen von Home Button
        JButton home = new JButton("Home");
        home.setBounds(5, 790, 95, 30);
        home.addActionListener(e -> {
            setAllPanelsInvisible();
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
                try {
                    lagersystem.writeToFile(lagersystem, "Moebelhaus.txt");
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
                System.exit(0);
            }
        });
        frame.add(exit);

        frame.setSize(1600, 900);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.addWindowListener(new WindowAdapter()
        {
            @Override
            public void windowClosing(WindowEvent e)
            {
                exit();
            }
        });
        frame.setResizable(false);

        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 105, 1500);
        panel.setBackground(Color.lightGray);
        frame.add(panel);

        return frame;

    }

    private static void exit(){
        int confirmed = JOptionPane.showConfirmDialog(frame,
                "Are you sure you want to quit?", "Confirm quit",
                JOptionPane.YES_NO_OPTION);
        if (confirmed == JOptionPane.YES_OPTION) {
            try {
                lagersystem.writeToFile(lagersystem, "Moebelhaus.txt");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }
    }

}
