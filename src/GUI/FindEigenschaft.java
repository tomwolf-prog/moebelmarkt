package GUI;

import Kategorie.Lagerung;
import Kategorie.Liegemoebel;
import Kategorie.Sitzmoebel;
import Kategorie.Tische;
import Lager.Lagersystem;
import Moebelhaus.Moebelhaus;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class FindEigenschaft {
    static final JPanel findEigenschaftPanel = new JPanel();
    private static final JTextArea Ausgabe = new JTextArea("Bitte geben Sie einen Betrage ein und drücken 'Kombi'");
    private static final Lagersystem lagersystem = Moebelhaus.getLagersystem();
    private static final String[] choicesMoebelkategorie = {"Sitzmoebel", "Tische", "Lagerung", "Liegemoebel"};
    private static final JComboBox<String> cbmk = new JComboBox<String>(choicesMoebelkategorie);
    private static final String[] choicesSitzmoebel = {"Eins", "Zwei", "Drei", "Vier"};
    private static final JComboBox<String> cbsm = new JComboBox<String>(choicesSitzmoebel);

    private static final String[] choicesTische = {"S", "M", "L"};
    private static final JComboBox<String> cbt = new JComboBox<String>(choicesTische);
    private static final String[] choicesFlaeche = {"S", "M", "L", "XL"};
    private static final JComboBox<String> cbf = new JComboBox<String>(choicesFlaeche);
    private static final String[] choicesLiegemoebel = {"S", "M", "L"};
    private static final JComboBox<String> cbl = new JComboBox<String>(choicesLiegemoebel);


    private static void updateLabels() {
        cbsm.setVisible(false);
        cbf.setVisible(false);
        cbl.setVisible(false);
        cbt.setVisible(false);

    }

    public static JPanel Panel() {
        //Erstellen von Find Eigenschaft Panel

        Ausgabe.setBounds(50, 200, 500, 300);
        findEigenschaftPanel.add(Ausgabe);
        cbmk.setBounds(50, 50, 175, 30);
        cbmk.addActionListener(e -> {
            updateLabels();
            switch (Objects.requireNonNull(cbmk.getSelectedItem()).toString()) {
                case "Sitzmoebel":
                    cbsm.setVisible(true);
                    break;
                case "Tische":
                    cbt.setVisible(true);
                    break;
                case "Lagerung":
                    cbf.setVisible(true);
                    break;
                case "Liegemoebel":
                    cbl.setVisible(true);
                    break;
                default:
                    // code block
            }
        });
        cbmk.setVisible(true);
        findEigenschaftPanel.add(cbmk);


        cbsm.setBounds(300, 50, 175, 30);
        cbsm.setVisible(true);
        findEigenschaftPanel.add(cbsm);

        cbt.setBounds(300, 50, 175, 30);
        cbt.setVisible(false);
        findEigenschaftPanel.add(cbt);


        cbf.setBounds(300, 50, 175, 30);
        cbf.setVisible(false);
        findEigenschaftPanel.add(cbf);


        cbl.setBounds(300, 50, 175, 30);
        cbl.setVisible(false);
        findEigenschaftPanel.add(cbl);

        //Erstellen von Back Button
        JButton Go = new JButton("Go");
        Go.setBounds(700, 50, 150, 30);
        Go.addActionListener(e -> {
            switch (Objects.requireNonNull(cbmk.getSelectedItem()).toString()) {
                case "Sitzmoebel":
                    switch (Objects.requireNonNull(cbsm.getSelectedItem()).toString()) {
                        case "Eins":
                            Ausgabe.setText(lagersystem.searchSitzmoebelMitEigenschaft(Sitzmoebel.Sitzplaetze.eins).stream().toList().toString());
                            break;
                        case "Zwei":
                            Ausgabe.setText(lagersystem.searchSitzmoebelMitEigenschaft(Sitzmoebel.Sitzplaetze.zwei).stream().toList().toString());
                            break;
                        case "Drei":
                            Ausgabe.setText(lagersystem.searchSitzmoebelMitEigenschaft(Sitzmoebel.Sitzplaetze.drei).stream().toList().toString());
                            break;
                        case "Vier":
                            Ausgabe.setText(lagersystem.searchSitzmoebelMitEigenschaft(Sitzmoebel.Sitzplaetze.vier).stream().toList().toString());
                            break;
                    }
                    break;
                case "Tische":
                    switch (Objects.requireNonNull(cbt.getSelectedItem()).toString()) {
                        case "S":
                            Ausgabe.setText(lagersystem.searchTischMitEigenschaft(Tische.Hoehe.s).stream().toList().toString());
                            break;
                        case "M":
                            Ausgabe.setText(lagersystem.searchTischMitEigenschaft(Tische.Hoehe.m).stream().toList().toString());
                            break;
                        case "L":
                            Ausgabe.setText(lagersystem.searchTischMitEigenschaft(Tische.Hoehe.l).stream().toList().toString());
                            break;
                    }
                    break;
                case "Lagerung":
                    switch (Objects.requireNonNull(cbf.getSelectedItem()).toString()) {
                        case "S":
                            Ausgabe.setText(lagersystem.searchLagerungMitEigenschaft(Lagerung.Flaeche.s).stream().toList().toString());
                            break;
                        case "M":
                            Ausgabe.setText(lagersystem.searchLagerungMitEigenschaft(Lagerung.Flaeche.m).stream().toList().toString());
                            break;
                        case "L":
                            Ausgabe.setText(lagersystem.searchLagerungMitEigenschaft(Lagerung.Flaeche.l).stream().toList().toString());
                            break;
                        case "XL":
                            Ausgabe.setText(lagersystem.searchLagerungMitEigenschaft(Lagerung.Flaeche.xl).stream().toList().toString());
                            break;
                    }
                    break;
                case "Liegemoebel":
                    switch (Objects.requireNonNull(cbl.getSelectedItem()).toString()) {
                        case "S":
                            Ausgabe.setText(lagersystem.searchLiegemoebelMitEigenschaft(Liegemoebel.Laenge.s).stream().toList().toString());
                            break;
                        case "M":
                            Ausgabe.setText(lagersystem.searchLiegemoebelMitEigenschaft(Liegemoebel.Laenge.m).stream().toList().toString());

                            break;
                        case "L":
                            Ausgabe.setText(lagersystem.searchLiegemoebelMitEigenschaft(Liegemoebel.Laenge.l).stream().toList().toString());
                            break;
                    }
                    break;
                default:
                    // code block
            }

        });
        findEigenschaftPanel.add(Go);

        //Erstellen von Back Button
        JButton back = new JButton("Back");
        back.setBounds(100, 700, 150, 30);
        back.addActionListener(e -> {
            MyFrame.lagerbestandPanel.setVisible(false);

        });
        findEigenschaftPanel.add(back);
        findEigenschaftPanel.setLayout(null);
        findEigenschaftPanel.setBackground(Color.white);
        findEigenschaftPanel.setBounds(105, 0, 1600, 900);
        findEigenschaftPanel.setVisible(false);

        return findEigenschaftPanel;
    }
}
