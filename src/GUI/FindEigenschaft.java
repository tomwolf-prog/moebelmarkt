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

    static String s = "Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. \n" +
            "\n" +
            "Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie consequat, vel illum dolore eu feugiat nulla facilisis at vero eros et accumsan et iusto odio dignissim qui blandit praesent luptatum zzril delenit augue duis dolore te feugait nulla facilisi. Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. \n" +
            "\n" +
            "Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat. Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie consequat, vel illum dolore eu feugiat nulla facilisis at vero eros et accumsan et iusto odio dignissim qui blandit praesent luptatum zzril delenit augue duis dolore te feugait nulla facilisi. \n" +
            "\n" +
            "Nam liber tempor cum soluta nobis eleifend option congue nihil imperdiet doming id quod mazim placerat facer possim assum. Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat. \n" +
            "\n" +
            "Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie consequat, vel illum dolore eu feugiat nulla facilisis. \n" +
            "\n" +
            "At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. Lorem ipsum dolor sit amet, consetetur sadipscing elitr, At accusam aliquyam diam diam dolore dolores duo eirmod eos erat, et nonumy sed tempor et et invidunt justo labore Stet clita ea et gubergren, kasd magna no rebum. sanctus sea sed takimata ut vero voluptua. est Lorem ipsum dolor sit amet. Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat. \n" +
            "\n" +
            "Consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus. \n" +
            "\n" +
            "Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. \n" +
            "\n" +
            "Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie consequat, vel illum dolore eu feugiat nulla facilisis at vero eros et accumsan et iusto odio dignissim qui blandit praesent luptatum zzril delenit augue duis dolore te feugait nulla facilisi. Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. \n" +
            "\n" +
            "Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat. Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie consequat, vel illum dolore eu feugiat nulla facilisis at vero eros et accumsan et iusto odio dignissim qui blandit praesent luptatum zzril delenit augue duis dolore te feugait nulla facilisi. ";


    private static void updateLabels() {
        cbsm.setVisible(false);
        cbf.setVisible(false);
        cbl.setVisible(false);
        cbt.setVisible(false);

    }

    public static JPanel Panel() {


        ta = new JTextArea(s);
        ta.setLineWrap(true);
        ta.setWrapStyleWord(true);
        ausgabeScrollPane = new JScrollPane(ta);
        ausgabeScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        ausgabeScrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        ausgabeScrollPane.setBounds(50, 100, 1400, 500);
        findEigenschaftPanel.add(ausgabeScrollPane);

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
                            ta.setText(lagersystem.searchSitzmoebelMitEigenschaft(Sitzmoebel.Sitzplaetze.eins).stream().toList().toString());
                            break;
                        case "Zwei":
                            ta.setText(lagersystem.searchSitzmoebelMitEigenschaft(Sitzmoebel.Sitzplaetze.zwei).stream().toList().toString());
                            break;
                        case "Drei":
                            ta.setText(lagersystem.searchSitzmoebelMitEigenschaft(Sitzmoebel.Sitzplaetze.drei).stream().toList().toString());
                            break;
                        case "Vier":
                            ta.setText(lagersystem.searchSitzmoebelMitEigenschaft(Sitzmoebel.Sitzplaetze.vier).stream().toList().toString());
                            break;
                    }
                    break;
                case "Tische":
                    switch (Objects.requireNonNull(cbt.getSelectedItem()).toString()) {
                        case "S":
                            ta.setText(lagersystem.searchTischMitEigenschaft(Tische.Hoehe.s).stream().toList().toString());
                            break;
                        case "M":
                            ta.setText(lagersystem.searchTischMitEigenschaft(Tische.Hoehe.m).stream().toList().toString());
                            break;
                        case "L":
                            ta.setText(lagersystem.searchTischMitEigenschaft(Tische.Hoehe.l).stream().toList().toString());
                            break;
                    }
                    break;
                case "Lagerung":
                    switch (Objects.requireNonNull(cbf.getSelectedItem()).toString()) {
                        case "S":
                            ta.setText(lagersystem.searchLagerungMitEigenschaft(Lagerung.Flaeche.s).stream().toList().toString());
                            break;
                        case "M":
                            ta.setText(lagersystem.searchLagerungMitEigenschaft(Lagerung.Flaeche.m).stream().toList().toString());
                            break;
                        case "L":
                            ta.setText(lagersystem.searchLagerungMitEigenschaft(Lagerung.Flaeche.l).stream().toList().toString());
                            break;
                        case "XL":
                            ta.setText(lagersystem.searchLagerungMitEigenschaft(Lagerung.Flaeche.xl).stream().toList().toString());
                            break;
                    }
                    break;
                case "Liegemoebel":
                    switch (Objects.requireNonNull(cbl.getSelectedItem()).toString()) {
                        case "S":
                            ta.setText(lagersystem.searchLiegemoebelMitEigenschaft(Liegemoebel.Laenge.s).stream().toList().toString());
                            break;
                        case "M":
                            ta.setText(lagersystem.searchLiegemoebelMitEigenschaft(Liegemoebel.Laenge.m).stream().toList().toString());

                            break;
                        case "L":
                            ta.setText(lagersystem.searchLiegemoebelMitEigenschaft(Liegemoebel.Laenge.l).stream().toList().toString());
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
