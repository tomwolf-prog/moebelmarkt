package GUI;

import Lager.Lagersystem;
import Moebelhaus.Moebelhaus;

import javax.swing.*;
import java.awt.*;

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
