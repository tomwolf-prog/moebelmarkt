package GUI;

import Lager.Lagersystem;
import Moebelhaus.Moebelhaus;
import Moebelstueck.Moebelstueck;

import javax.swing.*;
import java.awt.*;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;

public class ShowVerkaufspreisPanel {
    private static final JPanel showVerkaufspreisPanel = new JPanel();

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

        showVerkaufspreisPanel.add(Bereich);
        Bereich.setBounds(50, 50, 275, 30);
        showVerkaufspreisPanel.add(Kueche);
        Kueche.setBounds(50, 100, 275, 30);
        showVerkaufspreisPanel.add(Wohnen);
        Wohnen.setBounds(50, 150, 275, 30);
        showVerkaufspreisPanel.add(Schlafen);
        Schlafen.setBounds(50, 200, 275, 30);
        showVerkaufspreisPanel.add(Andere);
        Andere.setBounds(50, 250, 275, 30);

        showVerkaufspreisPanel.add(Kategorie);
        Kategorie.setBounds(800, 50, 275, 30);
        showVerkaufspreisPanel.add(Lagerung);
        Lagerung.setBounds(800, 100, 275, 30);
        showVerkaufspreisPanel.add(Liegemoebel);
        Liegemoebel.setBounds(800, 150, 275, 30);
        showVerkaufspreisPanel.add(Sitzmoebel);
        Sitzmoebel.setBounds(800, 200, 275, 30);
        showVerkaufspreisPanel.add(Tische);
        Tische.setBounds(800, 250, 275, 30);

        showVerkaufspreisPanel.add(GesamtVerkaufspreis);
        GesamtVerkaufspreis.setBounds(400, 350, 275, 30);
        showVerkaufspreisPanel.add(GroessterBereich);
        GroessterBereich.setBounds(400, 400, 275, 30);

    }

    public static void updateLabels() {
        DecimalFormat formatter = (DecimalFormat) NumberFormat.getInstance(Locale.GERMAN);
        formatter.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.GERMAN));

        int kuecheGesamtPreis = lagersystem.berechenVerkaufspreisAllerMoebelEinesBereichs(Moebelstueck.Bereich.Kueche);
        Kueche.setText("Küche: " + formatter.format(((double) kuecheGesamtPreis) / 100) + " €");

        int wohnenGesamtPreis = lagersystem.berechenVerkaufspreisAllerMoebelEinesBereichs(Moebelstueck.Bereich.Wohnen);
        Wohnen.setText("Wohnen: " + formatter.format(((double) wohnenGesamtPreis) / 100) + " €");

        int schlafenGesamtPreis = lagersystem.berechenVerkaufspreisAllerMoebelEinesBereichs(Moebelstueck.Bereich.Schlafen);
        Schlafen.setText("Schlafen: " + formatter.format(((double) schlafenGesamtPreis) / 100) + " €");


        int andereGesamtPreis = lagersystem.berechenVerkaufspreisAllerMoebelEinesBereichs(Moebelstueck.Bereich.Andere);
        Andere.setText("Andere: " + formatter.format(((double) andereGesamtPreis) / 100) + " €");

        int lagerungGesamtPreis = lagersystem.berechenVerkaufspreisAllerMoebelEinerKategorie(Moebelstueck.Kategorie.Lagerung);
        Lagerung.setText("Lagerung: " + formatter.format(((double) lagerungGesamtPreis) / 100) + " €");

        int liegemoebelGesamtPreis = lagersystem.berechenVerkaufspreisAllerMoebelEinerKategorie(Moebelstueck.Kategorie.Liegemoebel);
        Liegemoebel.setText("Liegemoebel: " + formatter.format(((double) liegemoebelGesamtPreis) / 100) + " €");

        int sitmoebelGesamtPreis = lagersystem.berechenVerkaufspreisAllerMoebelEinerKategorie(Moebelstueck.Kategorie.Sitzmoebel);
        Sitzmoebel.setText("Sitzmoebel: " + formatter.format(((double) sitmoebelGesamtPreis) / 100) + " €");

        int tischeGesamtPreis = lagersystem.berechenVerkaufspreisAllerMoebelEinerKategorie(Moebelstueck.Kategorie.Tische);
        Tische.setText("Tische:" + formatter.format(((double) (tischeGesamtPreis)) / 100) + " €");

        GesamtVerkaufspreis.setText("Gesamt-Verkaufspreis: " + formatter.format(((double) (kuecheGesamtPreis + wohnenGesamtPreis + schlafenGesamtPreis + andereGesamtPreis)) / 100) + " €");

        int grossterBereichValue = 0;
        String grossterBereichName = "";
        if (kuecheGesamtPreis > grossterBereichValue) {
            grossterBereichValue = kuecheGesamtPreis;
            grossterBereichName = "Kueche";
        }

        if (wohnenGesamtPreis > grossterBereichValue) {
            grossterBereichValue = wohnenGesamtPreis;
            grossterBereichName = "Wohnen";
        }

        if (schlafenGesamtPreis > grossterBereichValue) {
            grossterBereichValue = schlafenGesamtPreis;
            grossterBereichName = "Schlafen";
        }

        if (andereGesamtPreis > grossterBereichValue) {
            grossterBereichValue = andereGesamtPreis;
            grossterBereichName = "Andere";
        }


        GroessterBereich.setText("Größter Gesamtpreis: " + grossterBereichName + " " + formatter.format(((double) grossterBereichValue) / 100) + " €");


    }

    public static JPanel Panel() {
        addLabels();

        //Erstellen von Back Button
        JButton back = new JButton("Back");
        back.setBounds(50, 700, 175, 30);
        back.addActionListener(e -> {
            Frame.setAllPanelsInvisible();
            Frame.setAllHomeButtonsVisible();

        });
        showVerkaufspreisPanel.add(back);
        showVerkaufspreisPanel.setLayout(null);
        showVerkaufspreisPanel.setBackground(Color.WHITE);
        showVerkaufspreisPanel.setBounds(105, 0, 1600, 900);
        showVerkaufspreisPanel.setVisible(false);

        return showVerkaufspreisPanel;
    }
}
