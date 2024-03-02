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


public class Frame {

    static Lagersystem lagersystem = Moebelhaus.getLagersystem();
    static JFrame frame;
    public static JPanel aendereBestandPanel = AendereBestandPanel.Panel();
    public static JPanel lagerbestandPanel = LagerbestandPanel.Panel();
    public static JPanel verkaufspreisPanel = ShowVerkaufspreisPanel.Panel();
    public static JPanel rabattPanel = RabattPanel.Panel();
    public static JPanel setPreisPanel = SetVerkaufspreisPanel.Panel();
    public static JPanel kombiPanel = KombinationsPanel.Panel();
    public static JPanel findeKategorieMitEigenschaft = FindeKategorieMitEigenschaft.Panel();
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
    //Home-Buttons
    private static final JButton findEigenschaftButton = new JButton("Möbel mit Eigenschaft");
    private static final JButton getKombiButton = new JButton("Möbelkombination erstellen");
    private static final JButton setRabattButton = new JButton("Rabatt Setzen");
    private static final JButton setPreisButton = new JButton("Preis Setzen");
    private static final JButton showGesamtverkaufspreisButton = new JButton("Gesmatverkaufspreis anzeigen");
    private static final JButton aendereBestandButton = new JButton("Möbelbestand ändern");
    private static final JButton showLagerBestandPanel = new JButton("Bestand Auflisten");

    private static void addPanels() {
        frame.add(aendereLagerungBestandPanel);
        frame.add(aendereBestandPanel);
        frame.add(lagerbestandPanel);
        frame.add(verkaufspreisPanel);
        frame.add(setPreisPanel);
        frame.add(rabattPanel);
        frame.add(kombiPanel);
        frame.add(findeKategorieMitEigenschaft);
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
        frame.add(showLagerBestandPanel);
    }

    public static void setAllPanelsInvisible() {
        aendereLagerungBestandPanel.setVisible(false);
        aendereBestandPanel.setVisible(false);
        lagerbestandPanel.setVisible(false);
        verkaufspreisPanel.setVisible(false);
        setPreisPanel.setVisible(false);
        rabattPanel.setVisible(false);
        kombiPanel.setVisible(false);
        findeKategorieMitEigenschaft.setVisible(false);
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
        //Home-Buttons
        findEigenschaftButton.setVisible(false);
        getKombiButton.setVisible(false);
        setRabattButton.setVisible(false);
        setPreisButton.setVisible(false);
        showGesamtverkaufspreisButton.setVisible(false);
        aendereBestandButton.setVisible(false);
        showLagerBestandPanel.setVisible(false);
    }

    public static void setAllHomeButtonsVisible() {
        findEigenschaftButton.setVisible(true);
        getKombiButton.setVisible(true);
        setRabattButton.setVisible(true);
        setPreisButton.setVisible(true);
        showGesamtverkaufspreisButton.setVisible(true);
        aendereBestandButton.setVisible(true);
        showLagerBestandPanel.setVisible(true);
    }

    public static void baseFrame() {
        frame = new JFrame("Möbelhaus");
        addPanels();

        frame.setSize(1600, 900);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);


        //Erstellen von Lager Button
        findEigenschaftButton.setBounds(200, 50, 250, 30);
        findEigenschaftButton.addActionListener(e -> {
            setAllPanelsInvisible();
            findeKategorieMitEigenschaft.setVisible(true);
        });
        frame.add(findEigenschaftButton);

        //Erstellen von Kombi Button
        getKombiButton.setBounds(200, 100, 250, 30);
        getKombiButton.addActionListener(e -> {
            setAllPanelsInvisible();
            RabattPanel.updateLabels();
            kombiPanel.setVisible(true);
        });
        frame.add(getKombiButton);

        //Erstellen von Lager Button
        setRabattButton.setBounds(200, 150, 250, 30);
        setRabattButton.addActionListener(e -> {
            setAllPanelsInvisible();
            RabattPanel.updateLabels();
            rabattPanel.setVisible(true);
        });
        frame.add(setRabattButton);

        //Erstellen von Lager Button
        setPreisButton.setBounds(200, 200, 250, 30);
        setPreisButton.addActionListener(e -> {
            setAllPanelsInvisible();
            SetVerkaufspreisPanel.updateLabels();
            setPreisPanel.setVisible(true);
        });
        frame.add(setPreisButton);


        //Erstellen von Lager Button
        showGesamtverkaufspreisButton.setBounds(200, 250, 250, 30);
        showGesamtverkaufspreisButton.addActionListener(e -> {
            setAllPanelsInvisible();
            ShowVerkaufspreisPanel.updateLabels();
            verkaufspreisPanel.setVisible(true);
        });
        frame.add(showGesamtverkaufspreisButton);

        //Erstellen von Lager Button
        showLagerBestandPanel.setBounds(200, 300, 250, 30);
        showLagerBestandPanel.addActionListener(e -> {
            setAllPanelsInvisible();
            LagerbestandPanel.updateLabels();
            lagerbestandPanel.setVisible(true);
        });
        frame.add(showLagerBestandPanel);

        //Erstellen von AddItem Button
        aendereBestandButton.setBounds(200, 350, 250, 30);
        aendereBestandButton.addActionListener(e -> {
            setAllPanelsInvisible();
            aendereBestandPanel.setVisible(true);
        });
        frame.add(aendereBestandButton);

        //Erstellen von Home Button
        JButton home = new JButton("Home");
        home.setBounds(5, 790, 95, 30);
        home.addActionListener(e -> {
            setAllPanelsInvisible();
            setAllHomeButtonsVisible();
        });
        frame.add(home);

        //Erstellen von Exit Button
        JButton exit = new JButton("Exit");
        exit.setBounds(5, 825, 95, 30);
        exit.addActionListener(e -> {
            exit();
        });
        frame.add(exit);

        frame.setSize(1600, 900);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                exit();
            }
        });
        frame.setResizable(false);

        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 105, 1500);
        panel.setBackground(Color.lightGray);
        frame.add(panel);

    }

    private static void exit() {
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
    }
}
