package GUI;

import GUI.Lagerung.ChangeBeistelltischePanel;
import GUI.Lagerung.ChangeKleiderschrankregalPanel;
import GUI.Lagerung.ChangeKuechenregalPanel;
import GUI.Lagerung.ChangeLagerungPanel;
import GUI.Liegemoebel.AddBalkonliegePanel;
import GUI.Liegemoebel.AddDoppelbettPanel;
import GUI.Liegemoebel.AddLiegemoebel;
import GUI.Sitzmoebel.AddFernsehcouchPanel;
import GUI.Sitzmoebel.AddKuechenstuhlPanel;
import GUI.Sitzmoebel.AddOhrensesselPanel;
import GUI.Sitzmoebel.AddSitzmoebelPanel;
import GUI.Tische.*;
import Lager.Lagersystem;
import Moebelhaus.Moebelhaus;

import javax.swing.*;
import java.awt.*;


public class MyFrame {

    static Lagersystem lagersystem = Moebelhaus.getLagersystem();
    static JFrame frame;
    public static JPanel changeItemPanel = AddItemPanel.Panel();
    public static JPanel lagerbestandPanel = LagerbestandPanel.Panel();
    public static JPanel verkaufspreisPanel = VerkaufspreisPanel.Panel();

    public static JPanel setPreisPanel = SetPreis.Panel();
    //Lagerung
    public static JPanel changeLagerungPanel = ChangeLagerungPanel.Panel();
    public static JPanel changeKuechenregalPanel = ChangeKuechenregalPanel.Panel();
    public static JPanel changeKleiderschrankregalPanel = ChangeKleiderschrankregalPanel.Panel();
    public static JPanel changeBeistelltischePanel = ChangeBeistelltischePanel.Panel();

    //Sitzmoebel
    public static JPanel changeFernsehcouchPanel = AddFernsehcouchPanel.Panel();
    public static JPanel changeKuechenstuhlPanel = AddKuechenstuhlPanel.Panel();
    public static JPanel changeOhrensesselPanel = AddOhrensesselPanel.Panel();
    public static JPanel changeSitzmoebelPanel = AddSitzmoebelPanel.Panel();

    //Tische
    public static JPanel changeBuerotischPanel = AddBuerotischPanel.Panel();
    public static JPanel changeCouchtischPanel = AddCouchtischPanel.Panel();
    public static JPanel changeEsstischPanel = AddEsstischPanel.Panel();
    public static JPanel changeKuechentischPanel = AddKuechentischPanel.Panel();
    public static JPanel changeTischePanel = AddTischePanel.Panel();

    //Liegemoebel
    public static JPanel changeBalkonliegePanel = AddBalkonliegePanel.Panel();
    public static JPanel changeDoppelbettPanel = AddDoppelbettPanel.Panel();
    public static JPanel changeLiegemoebelPanel = AddLiegemoebel.Panel();

    private static void addPanels() {
        frame.add(changeLagerungPanel);
        frame.add(changeItemPanel);
        frame.add(lagerbestandPanel);
        frame.add(verkaufspreisPanel);
        frame.add(setPreisPanel);
        //Lagerung
        frame.add(changeLagerungPanel);
        frame.add(changeKuechenregalPanel);
        frame.add(changeKleiderschrankregalPanel);
        frame.add(changeBeistelltischePanel);
        //Sitzmoebel
        frame.add(changeFernsehcouchPanel);
        frame.add(changeKuechenstuhlPanel);
        frame.add(changeOhrensesselPanel);
        frame.add(changeSitzmoebelPanel);
        //Tische
        frame.add(changeBuerotischPanel);
        frame.add(changeCouchtischPanel);
        frame.add(changeEsstischPanel);
        frame.add(changeKuechentischPanel);
        frame.add(changeTischePanel);
        //Liegemoebel
        frame.add(changeBalkonliegePanel);
        frame.add(changeDoppelbettPanel);
        frame.add(changeLiegemoebelPanel);

    }

    private static void setAllPanelsInvisible() {
        changeLagerungPanel.setVisible(false);
        changeItemPanel.setVisible(false);
        lagerbestandPanel.setVisible(false);
        verkaufspreisPanel.setVisible(false);
        setPreisPanel.setVisible(false);
        //Lagerung
        changeLagerungPanel.setVisible(false);
        changeKuechenregalPanel.setVisible(false);
        changeKleiderschrankregalPanel.setVisible(false);
        changeBeistelltischePanel.setVisible(false);
        //Sitzmoebel
        changeFernsehcouchPanel.setVisible(false);
        changeKuechenstuhlPanel.setVisible(false);
        changeOhrensesselPanel.setVisible(false);
        changeSitzmoebelPanel.setVisible(false);
        //Tische
        changeBuerotischPanel.setVisible(false);
        changeCouchtischPanel.setVisible(false);
        changeEsstischPanel.setVisible(false);
        changeKuechentischPanel.setVisible(false);
        changeTischePanel.setVisible(false);
        //Liegemoebel
        changeBalkonliegePanel.setVisible(false);
        changeDoppelbettPanel.setVisible(false);
        changeLiegemoebelPanel.setVisible(false);

    }

    public static JFrame baseFrame() {
        frame = new JFrame("Möbelhaus");
        addPanels();


        frame.setSize(1600, 900);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);

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
        JButton addItem = new JButton("Add Item Panel");
        addItem.setBounds(5, 755, 95, 30);
        addItem.addActionListener(e -> {
            setAllPanelsInvisible();
            changeItemPanel.setVisible(true);
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
