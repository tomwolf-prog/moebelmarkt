package GUI;

import Lager.Lagersystem;
import Moebelhaus.Moebelhaus;

import javax.swing.*;
import java.awt.*;

public class VerkaufspreisPanel {
    private static final JPanel verkaufspreisPanel = new JPanel();

    private static final Lagersystem lagersystem = Moebelhaus.getLagersystem();

    private static final JLabel Bereich = new JLabel("Bereich:");
    private static final JLabel Kueche = new JLabel();
    private static final JLabel Wohnen = new JLabel();
    private static final JLabel Schlafen = new JLabel();
    private static final JLabel Andere = new JLabel();
    private static final JLabel Kategorie = new JLabel("Kategorie:");
    private static final JLabel Lagerung = new JLabel();
    private static final JLabel Liegemoebel = new JLabel();
    private static final JLabel Sitzmoebel = new JLabel();
    private static final JLabel Tische = new JLabel();
    private static final JLabel GesamtVerkaufspreis = new JLabel();
    private static final JLabel GroessterBereich = new JLabel();


    private static void addLabels() {

        verkaufspreisPanel.add(Bereich);
        Bereich.setBounds(50, 50, 175, 30);
        verkaufspreisPanel.add(Kueche);
        Kueche.setBounds(50, 100, 175, 30);
        verkaufspreisPanel.add(Wohnen);
        Wohnen.setBounds(50, 150, 175, 30);
        verkaufspreisPanel.add(Schlafen);
        Schlafen.setBounds(50, 200, 175, 30);
        verkaufspreisPanel.add(Andere);
        Andere.setBounds(50, 250, 175, 30);

        verkaufspreisPanel.add(Kategorie);
        Kategorie.setBounds(300, 50, 175, 30);
        verkaufspreisPanel.add(Lagerung);
        Lagerung.setBounds(300, 100, 175, 30);
        verkaufspreisPanel.add(Liegemoebel);
        Liegemoebel.setBounds(300, 150, 175, 30);
        verkaufspreisPanel.add(Sitzmoebel);
        Sitzmoebel.setBounds(300, 200, 175, 30);
        verkaufspreisPanel.add(Tische);
        Tische.setBounds(300, 250, 175, 30);

        verkaufspreisPanel.add(GesamtVerkaufspreis);
        GesamtVerkaufspreis.setBounds(200, 350, 175, 30);
        verkaufspreisPanel.add(GroessterBereich);
        GroessterBereich.setBounds(200, 400, 175, 30);

    }

    public static void updateLabels() {

        int kuecheGesamtPreis = lagersystem.getKuechenregallager().getMoebel().size() * lagersystem.getKuechenregallager().getPreis() +
                lagersystem.getKuechentischlager().getMoebel().size() * lagersystem.getKuechentischlager().getPreis() +
                lagersystem.getKuechenstuhllager().getMoebel().size() * lagersystem.getKuechenstuhllager().getPreis();
        Kueche.setText("Küche: " + kuecheGesamtPreis);

        int wohnenGesamtPreis = lagersystem.getOhrensessellager().getMoebel().size() * lagersystem.getOhrensessellager().getPreis() +
                lagersystem.getCouchtischlager().getMoebel().size() * lagersystem.getCouchtischlager().getPreis() +
                lagersystem.getFernsehcouchlager().getMoebel().size() * lagersystem.getFernsehcouchlager().getPreis();
        Wohnen.setText("Wohnen: " + wohnenGesamtPreis);

        int schlafenGesamtPreis = lagersystem.getBeistelltischlager().getMoebel().size() * lagersystem.getBeistelltischlager().getPreis() +
                lagersystem.getDoppelbettlager().getMoebel().size() * lagersystem.getDoppelbettlager().getPreis() +
                lagersystem.getKleiderschranklager().getMoebel().size() * lagersystem.getKleiderschranklager().getPreis();
        Schlafen.setText("Schlafen: " + schlafenGesamtPreis);


        int andereGesamtPreis = lagersystem.getBuerotischlager().getMoebel().size() * lagersystem.getBuerotischlager().getPreis() +
                lagersystem.getEsstischlager().getMoebel().size() * lagersystem.getEsstischlager().getPreis() +
                lagersystem.getBalkonliegelager().getMoebel().size() * lagersystem.getBalkonliegelager().getPreis();
        Andere.setText("Andere: " + andereGesamtPreis);

        int lagerungGesamtPreis = lagersystem.getBeistelltischlager().getMoebel().size() * lagersystem.getBeistelltischlager().getPreis() +
                lagersystem.getKleiderschranklager().getMoebel().size() * lagersystem.getKleiderschranklager().getPreis() +
                lagersystem.getKuechenregallager().getMoebel().size() * lagersystem.getKuechenregallager().getPreis();
        Lagerung.setText("Lagerung: " + lagerungGesamtPreis);

        int liegemoebelGesamtPreis = lagersystem.getBalkonliegelager().getMoebel().size() * lagersystem.getBalkonliegelager().getPreis() +
                lagersystem.getDoppelbettlager().getMoebel().size() * lagersystem.getDoppelbettlager().getPreis();
        Liegemoebel.setText("Liegemoebel: " + liegemoebelGesamtPreis);

        int sitmoebelGesamtPreis = lagersystem.getFernsehcouchlager().getMoebel().size() * lagersystem.getFernsehcouchlager().getPreis() +
                lagersystem.getKuechenstuhllager().getMoebel().size() * lagersystem.getKuechenstuhllager().getPreis() +
                lagersystem.getOhrensessellager().getMoebel().size() * lagersystem.getOhrensessellager().getPreis();
        Sitzmoebel.setText("Sitzmoebel: " + sitmoebelGesamtPreis);


        int tischeGesamtPreis = lagersystem.getBuerotischlager().getMoebel().size() * lagersystem.getBuerotischlager().getPreis() +
                lagersystem.getCouchtischlager().getMoebel().size() * lagersystem.getCouchtischlager().getPreis() +
                lagersystem.getEsstischlager().getMoebel().size() * lagersystem.getEsstischlager().getPreis() +
                lagersystem.getKuechentischlager().getMoebel().size() * lagersystem.getKuechentischlager().getPreis();

        Tische.setText("Tische:" + tischeGesamtPreis);

        GesamtVerkaufspreis.setText("Gesamt.Verkaufspreis: " + String.valueOf(kuecheGesamtPreis + wohnenGesamtPreis + schlafenGesamtPreis + andereGesamtPreis));

        int grossterBereichValue = 0;
        String grossterBereichName;
        if (kuecheGesamtPreis > grossterBereichValue)
            grossterBereichValue = kuecheGesamtPreis;
        grossterBereichName = "Kueche";

        if (wohnenGesamtPreis > grossterBereichValue)
            grossterBereichValue = wohnenGesamtPreis;
        grossterBereichName = "Wohnen";

        if (schlafenGesamtPreis > grossterBereichValue)
            grossterBereichValue = schlafenGesamtPreis;
        grossterBereichName = "Schlafen";

        if (andereGesamtPreis > grossterBereichValue)
            grossterBereichValue = andereGesamtPreis;
        grossterBereichName = "Andere";


        GroessterBereich.setText("Größter Gesamtpreis: " + grossterBereichName);


    }

    public static JPanel Panel() {
        addLabels();

        //Erstellen von Back Button
        JButton back = new JButton("Back");
        back.setBounds(100, 700, 150, 30);
        back.addActionListener(e -> {
            MyFrame.lagerbestandPanel.setVisible(false);

        });
        verkaufspreisPanel.add(back);
        verkaufspreisPanel.setLayout(null);
        verkaufspreisPanel.setBackground(Color.WHITE);
        verkaufspreisPanel.setBounds(105, 0, 1600, 900);
        verkaufspreisPanel.setVisible(false);

        return verkaufspreisPanel;
    }
}
