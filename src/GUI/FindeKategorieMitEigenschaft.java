package GUI;

import Kategorie.Lagerung;
import Kategorie.Liegemoebel;
import Kategorie.Sitzmoebel;
import Kategorie.Tische;
import Lager.Lagersystem;
import Moebelhaus.Moebelhaus;

import javax.swing.*;
import java.awt.*;
import java.util.List;
import java.util.Objects;

public class FindeKategorieMitEigenschaft {
    static final JPanel findeKategorieMitEigenschaft = new JPanel();
    private static JTextArea ta;
    private static JScrollPane ausgabeScrollPane;
    private static JTextArea Ausgabe = new JTextArea("Bitte geben Sie einen Betrage ein und drücken 'Kombi'");
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

    private static String formatText(List<?> list) {
        StringBuilder sb = new StringBuilder();
        for (Object o : list) {
            List<?> l = (List<?>) o;
            for (Object n : l) {
                sb.append(n.toString());
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    public static JPanel Panel() {


        ta = new JTextArea();
        ta.setLineWrap(true);
        ta.setWrapStyleWord(true);
        ausgabeScrollPane = new JScrollPane(ta);
        ausgabeScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        ausgabeScrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        ausgabeScrollPane.setBounds(50, 100, 1400, 500);
        findeKategorieMitEigenschaft.add(ausgabeScrollPane);

        findeKategorieMitEigenschaft.add(Ausgabe);
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
        findeKategorieMitEigenschaft.add(cbmk);


        cbsm.setBounds(300, 50, 175, 30);
        cbsm.setVisible(true);
        findeKategorieMitEigenschaft.add(cbsm);

        cbt.setBounds(300, 50, 175, 30);
        cbt.setVisible(false);
        findeKategorieMitEigenschaft.add(cbt);


        cbf.setBounds(300, 50, 175, 30);
        cbf.setVisible(false);
        findeKategorieMitEigenschaft.add(cbf);


        cbl.setBounds(300, 50, 175, 30);
        cbl.setVisible(false);
        findeKategorieMitEigenschaft.add(cbl);

        //Erstellen von Back Button
        JButton Go = new JButton("Go");
        Go.setBounds(700, 50, 150, 30);
        Go.addActionListener(e -> {
            switch (Objects.requireNonNull(cbmk.getSelectedItem()).toString()) {
                case "Sitzmoebel":
                    switch (Objects.requireNonNull(cbsm.getSelectedItem()).toString()) {
                        case "Eins":
                            ta.setText(formatText(lagersystem.searchSitzmoebelMitEigenschaft(Sitzmoebel.Sitzplaetze.eins).stream().toList()));
                            break;
                        case "Zwei":
                            ta.setText(formatText(lagersystem.searchSitzmoebelMitEigenschaft(Sitzmoebel.Sitzplaetze.zwei).stream().toList()));
                            break;
                        case "Drei":
                            ta.setText(formatText(lagersystem.searchSitzmoebelMitEigenschaft(Sitzmoebel.Sitzplaetze.drei).stream().toList()));
                            break;
                        case "Vier":
                            ta.setText(formatText(lagersystem.searchSitzmoebelMitEigenschaft(Sitzmoebel.Sitzplaetze.vier).stream().toList()));
                            break;
                    }
                    break;
                case "Tische":
                    switch (Objects.requireNonNull(cbt.getSelectedItem()).toString()) {
                        case "S":
                            ta.setText(formatText(lagersystem.searchTischMitEigenschaft(Tische.Hoehe.s).stream().toList()));
                            break;
                        case "M":
                            ta.setText(formatText(lagersystem.searchTischMitEigenschaft(Tische.Hoehe.m).stream().toList()));
                            break;
                        case "L":
                            ta.setText(formatText(lagersystem.searchTischMitEigenschaft(Tische.Hoehe.l).stream().toList()));
                            break;
                    }
                    break;
                case "Lagerung":
                    switch (Objects.requireNonNull(cbf.getSelectedItem()).toString()) {
                        case "S":
                            ta.setText(formatText(lagersystem.searchLagerungMitEigenschaft(Lagerung.Flaeche.s).stream().toList()));
                            break;
                        case "M":
                            ta.setText(formatText(lagersystem.searchLagerungMitEigenschaft(Lagerung.Flaeche.m).stream().toList()));
                            break;
                        case "L":
                            ta.setText(formatText(lagersystem.searchLagerungMitEigenschaft(Lagerung.Flaeche.l).stream().toList()));
                            break;
                        case "XL":
                            ta.setText(formatText(lagersystem.searchLagerungMitEigenschaft(Lagerung.Flaeche.xl).stream().toList()));
                            break;
                    }
                    break;
                case "Liegemoebel":
                    switch (Objects.requireNonNull(cbl.getSelectedItem()).toString()) {
                        case "S":
                            ta.setText(formatText(lagersystem.searchLiegemoebelMitEigenschaft(Liegemoebel.Laenge.s).stream().toList()));
                            break;
                        case "M":
                            ta.setText(formatText(lagersystem.searchLiegemoebelMitEigenschaft(Liegemoebel.Laenge.m).stream().toList()));

                            break;
                        case "L":
                            ta.setText(formatText(lagersystem.searchLiegemoebelMitEigenschaft(Liegemoebel.Laenge.l).stream().toList()));
                            break;
                    }
                    break;
                default:
                    // code block
            }

        });
        findeKategorieMitEigenschaft.add(Go);

        //Erstellen von Back Button
        JButton back = new JButton("Back");
        back.setBounds(100, 700, 150, 30);
        back.addActionListener(e -> {
            Frame.setAllPanelsInvisible();
            Frame.setAllHomeButtonsVisible();
        });
        findeKategorieMitEigenschaft.add(back);
        findeKategorieMitEigenschaft.setLayout(null);
        findeKategorieMitEigenschaft.setBackground(Color.white);
        findeKategorieMitEigenschaft.setBounds(105, 0, 1600, 900);
        findeKategorieMitEigenschaft.setVisible(false);

        return findeKategorieMitEigenschaft;
    }
}
