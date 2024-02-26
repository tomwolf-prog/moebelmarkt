package GUI;

import Kategorie.Lagerung;
import Kategorie.Liegemoebel;
import Kategorie.Sitzmoebel;
import Kategorie.Tische;
import Lager.Lagersystem;
import Moebelhaus.Moebelhaus;

import javax.swing.*;
import java.awt.*;

public class LagerbestandPanel {
    private static final JPanel addLagerbestandPanel = new JPanel();

    private static final Lagersystem lagersystem = Moebelhaus.getLagersystem();

    //Lagerung
    private static final JLabel Beistelltischlager = new JLabel();
    private static final JLabel BeistelltischlagerS = new JLabel();
    private static final JLabel BeistelltischlagerM = new JLabel();
    private static final JLabel BeistelltischlagerL = new JLabel();
    private static final JLabel BeistelltischlagerXL = new JLabel();
    private static final JLabel Kleiderschranklager = new JLabel();
    private static final JLabel KleiderschranklagerS = new JLabel();
    private static final JLabel KleiderschranklagerM = new JLabel();
    private static final JLabel KleiderschranklagerL = new JLabel();
    private static final JLabel KleiderschranklagerXL = new JLabel();
    private static final JLabel Kuechenregallager = new JLabel();
    private static final JLabel KuechenregallagerS = new JLabel();
    private static final JLabel KuechenregallagerM = new JLabel();
    private static final JLabel KuechenregallagerL = new JLabel();
    private static final JLabel KuechenregallagerXL = new JLabel();
    private static final JLabel Balkonliegelager = new JLabel();
    private static final JLabel BalkonliegelagerS = new JLabel();
    private static final JLabel BalkonliegelagerM = new JLabel();
    private static final JLabel BalkonliegelagerL = new JLabel();

    private static final JLabel Doppelbettlager = new JLabel();
    private static final JLabel DoppelbettlagerS = new JLabel();
    private static final JLabel DoppelbettlagerM = new JLabel();
    private static final JLabel DoppelbettlagerL = new JLabel();
    private static final JLabel Fernsehcouch = new JLabel();
    private static final JLabel FernsehcouchEins = new JLabel();
    private static final JLabel FernsehcouchZwei = new JLabel();
    private static final JLabel FernsehcouchDrei = new JLabel();
    private static final JLabel FernsehcouchVier = new JLabel();
    private static final JLabel Kuechenstuhl = new JLabel();
    private static final JLabel KuechenstuhlEins = new JLabel();
    private static final JLabel KuechenstuhlZwei = new JLabel();
    private static final JLabel KuechenstuhlDrei = new JLabel();
    private static final JLabel KuechenstuhlVier = new JLabel();
    private static final JLabel Ohrensessel = new JLabel();
    private static final JLabel OhrensesselEins = new JLabel();
    private static final JLabel OhrensesselZwei = new JLabel();
    private static final JLabel OhrensesselDrei = new JLabel();
    private static final JLabel OhrensesselVier = new JLabel();

    private static final JLabel Buerotischlager = new JLabel();
    private static final JLabel BuerotischlagerS = new JLabel();
    private static final JLabel BuerotischlagerM = new JLabel();
    private static final JLabel BuerotischlagerL = new JLabel();
    private static final JLabel Couchtischlager = new JLabel();
    private static final JLabel CouchtischlagerS = new JLabel();
    private static final JLabel CouchtischlagerM = new JLabel();
    private static final JLabel CouchtischlagerL = new JLabel();
    private static final JLabel Esstischlager = new JLabel();
    private static final JLabel EsstischlagerS = new JLabel();
    private static final JLabel EsstischlagerM = new JLabel();
    private static final JLabel EsstischlagerL = new JLabel();
    private static final JLabel Kuechentischlager = new JLabel();
    private static final JLabel KuechentischlagerS = new JLabel();
    private static final JLabel KuechentischlagerM = new JLabel();
    private static final JLabel KuechentischlagerL = new JLabel();


    private static void addLabels() {
        //Lagerung

        addLagerbestandPanel.add(Beistelltischlager);
        Beistelltischlager.setBounds(50, 50, 175, 30);

        addLagerbestandPanel.add(BeistelltischlagerS);
        BeistelltischlagerS.setBounds(60, 70, 175, 30);

        addLagerbestandPanel.add(BeistelltischlagerM);
        BeistelltischlagerM.setBounds(60, 90, 175, 30);

        addLagerbestandPanel.add(BeistelltischlagerL);
        BeistelltischlagerL.setBounds(60, 110, 175, 30);

        addLagerbestandPanel.add(BeistelltischlagerXL);
        BeistelltischlagerXL.setBounds(60, 130, 175, 30);

        addLagerbestandPanel.add(Kleiderschranklager);
        Kleiderschranklager.setBounds(50, 200, 175, 30);

        addLagerbestandPanel.add(KleiderschranklagerS);
        KleiderschranklagerS.setBounds(60, 220, 175, 30);

        addLagerbestandPanel.add(KleiderschranklagerM);
        KleiderschranklagerM.setBounds(60, 240, 175, 30);

        addLagerbestandPanel.add(KleiderschranklagerL);
        KleiderschranklagerL.setBounds(60, 260, 175, 30);

        addLagerbestandPanel.add(KleiderschranklagerXL);
        KleiderschranklagerXL.setBounds(60, 280, 175, 30);

        addLagerbestandPanel.add(Kuechenregallager);
        Kuechenregallager.setBounds(50, 350, 175, 30);

        addLagerbestandPanel.add(KuechenregallagerS);
        KuechenregallagerS.setBounds(60, 370, 175, 30);

        addLagerbestandPanel.add(KuechenregallagerM);
        KuechenregallagerM.setBounds(60, 390, 175, 30);

        addLagerbestandPanel.add(KuechenregallagerL);
        KuechenregallagerL.setBounds(60, 410, 175, 30);

        addLagerbestandPanel.add(KuechenregallagerXL);
        KuechenregallagerXL.setBounds(60, 430, 175, 30);

        addLagerbestandPanel.add(Balkonliegelager);
        Balkonliegelager.setBounds(300, 50, 175, 30);

        addLagerbestandPanel.add(BalkonliegelagerS);
        BalkonliegelagerS.setBounds(310, 70, 175, 30);

        addLagerbestandPanel.add(BalkonliegelagerM);
        BalkonliegelagerM.setBounds(310, 90, 175, 30);

        addLagerbestandPanel.add(BalkonliegelagerL);
        BalkonliegelagerL.setBounds(310, 110, 175, 30);

        addLagerbestandPanel.add(Doppelbettlager);
        Doppelbettlager.setBounds(300, 200, 175, 30);

        addLagerbestandPanel.add(DoppelbettlagerS);
        DoppelbettlagerS.setBounds(310, 220, 175, 30);

        addLagerbestandPanel.add(DoppelbettlagerM);
        DoppelbettlagerM.setBounds(310, 240, 175, 30);

        addLagerbestandPanel.add(DoppelbettlagerL);
        DoppelbettlagerL.setBounds(310, 260, 175, 30);

        addLagerbestandPanel.add(Fernsehcouch);
        Fernsehcouch.setBounds(500, 50, 175, 30);
        addLagerbestandPanel.add(FernsehcouchEins);
        FernsehcouchEins.setBounds(510, 70, 175, 30);
        addLagerbestandPanel.add(FernsehcouchZwei);
        FernsehcouchZwei.setBounds(510, 90, 175, 30);
        addLagerbestandPanel.add(FernsehcouchDrei);
        FernsehcouchDrei.setBounds(510, 110, 175, 30);
        addLagerbestandPanel.add(FernsehcouchVier);
        FernsehcouchVier.setBounds(510, 130, 175, 30);

        addLagerbestandPanel.add(Kuechenstuhl);
        Kuechenstuhl.setBounds(500, 200, 175, 30);
        addLagerbestandPanel.add(KuechenstuhlEins);
        KuechenstuhlEins.setBounds(510, 220, 175, 30);
        addLagerbestandPanel.add(KuechenstuhlZwei);
        KuechenstuhlZwei.setBounds(510, 240, 175, 30);
        addLagerbestandPanel.add(KuechenstuhlDrei);
        KuechenstuhlDrei.setBounds(510, 260, 175, 30);
        addLagerbestandPanel.add(KuechenstuhlVier);
        KuechenstuhlVier.setBounds(510, 280, 175, 30);

        addLagerbestandPanel.add(Ohrensessel);
        Ohrensessel.setBounds(500, 350, 175, 30);
        addLagerbestandPanel.add(OhrensesselEins);
        OhrensesselEins.setBounds(510, 370, 175, 30);
        addLagerbestandPanel.add(OhrensesselZwei);
        OhrensesselZwei.setBounds(510, 390, 175, 30);
        addLagerbestandPanel.add(OhrensesselDrei);
        OhrensesselDrei.setBounds(510, 410, 175, 30);
        addLagerbestandPanel.add(OhrensesselVier);
        OhrensesselVier.setBounds(510, 430, 175, 30);

        addLagerbestandPanel.add(Buerotischlager);
        Buerotischlager.setBounds(700, 50, 175, 30);
        addLagerbestandPanel.add(BuerotischlagerS);
        BuerotischlagerS.setBounds(710, 70, 175, 30);
        addLagerbestandPanel.add(BuerotischlagerM);
        BuerotischlagerM.setBounds(710, 90, 175, 30);
        addLagerbestandPanel.add(BuerotischlagerL);
        BuerotischlagerL.setBounds(710, 110, 175, 30);

        addLagerbestandPanel.add(Couchtischlager);
        Couchtischlager.setBounds(700, 200, 175, 30);
        addLagerbestandPanel.add(CouchtischlagerS);
        CouchtischlagerS.setBounds(710, 220, 175, 30);
        addLagerbestandPanel.add(CouchtischlagerM);
        CouchtischlagerM.setBounds(710, 240, 175, 30);
        addLagerbestandPanel.add(CouchtischlagerL);
        CouchtischlagerL.setBounds(710, 260, 175, 30);

        addLagerbestandPanel.add(Esstischlager);
        Esstischlager.setBounds(700, 350, 175, 30);
        addLagerbestandPanel.add(EsstischlagerS);
        EsstischlagerS.setBounds(710, 370, 175, 30);
        addLagerbestandPanel.add(EsstischlagerM);
        EsstischlagerM.setBounds(710, 390, 175, 30);
        addLagerbestandPanel.add(EsstischlagerL);
        EsstischlagerL.setBounds(710, 410, 175, 30);

        addLagerbestandPanel.add(Kuechentischlager);
        Kuechentischlager.setBounds(700, 500, 175, 30);
        addLagerbestandPanel.add(KuechentischlagerS);
        KuechentischlagerS.setBounds(710, 520, 175, 30);
        addLagerbestandPanel.add(KuechentischlagerM);
        KuechentischlagerM.setBounds(710, 540, 175, 30);
        addLagerbestandPanel.add(KuechentischlagerL);
        KuechentischlagerL.setBounds(710, 560, 175, 30);


    }

    public static void updateLabels() {
        //Lagerung

        Beistelltischlager.setText("Beistelltischlager: " + String.valueOf((lagersystem.getBeistelltischlager().getMoebel().size())));
        Beistelltischlager.setText("Beistelltischlager: " + String.valueOf((lagersystem.getBeistelltischlager().getMoebel().size())));
        BeistelltischlagerS.setText("Beistelltischlager S: " + String.valueOf(lagersystem.getBeistelltischlagerBestand(Kategorie.Lagerung.Flaeche.s)));
        BeistelltischlagerM.setText("Beistelltischlager M: " + String.valueOf(lagersystem.getBeistelltischlagerBestand(Kategorie.Lagerung.Flaeche.m)));
        BeistelltischlagerL.setText("Beistelltischlager L: " + String.valueOf(lagersystem.getBeistelltischlagerBestand(Kategorie.Lagerung.Flaeche.l)));
        BeistelltischlagerXL.setText("Beistelltischlager XL: " + String.valueOf(lagersystem.getBeistelltischlagerBestand(Kategorie.Lagerung.Flaeche.xl)));

        Kleiderschranklager.setText("Kleiderschranklager: " + String.valueOf(lagersystem.getKleiderschranklager().getMoebel().size()));
        KleiderschranklagerS.setText("Kleiderschranklager S: " + String.valueOf(lagersystem.getKleiderschranklagerBestand(Lagerung.Flaeche.s)));
        KleiderschranklagerM.setText("Kleiderschranklager M: " + String.valueOf(lagersystem.getKleiderschranklagerBestand(Lagerung.Flaeche.m)));
        KleiderschranklagerL.setText("Kleiderschranklager L: " + String.valueOf(lagersystem.getKleiderschranklagerBestand(Lagerung.Flaeche.l)));
        KleiderschranklagerXL.setText("Kleiderschranklager XL: " + String.valueOf(lagersystem.getKleiderschranklagerBestand(Lagerung.Flaeche.xl)));

        Kuechenregallager.setText("Kuechenregallagerlager: " + String.valueOf(lagersystem.getKuechenregallager().getMoebel().size()));
        KuechenregallagerS.setText("Kuechenregallagerlager S: " + String.valueOf(lagersystem.getKuechenregallagerBestand(Lagerung.Flaeche.s)));
        KuechenregallagerM.setText("Kuechenregallagerlager M: " + String.valueOf(lagersystem.getKuechenregallagerBestand(Lagerung.Flaeche.m)));
        KuechenregallagerL.setText("Kuechenregallagerlager L: " + String.valueOf(lagersystem.getKuechenregallagerBestand(Lagerung.Flaeche.l)));
        KuechenregallagerXL.setText("Kuechenregallagerlager XL: " + String.valueOf(lagersystem.getKuechenregallagerBestand(Lagerung.Flaeche.xl)));

        Balkonliegelager.setText("Balkonliegelager: " + String.valueOf(lagersystem.getBalkonliegelager().getMoebel().size()));
        BalkonliegelagerS.setText("Balkonliegelager S: " + String.valueOf(lagersystem.getBalkonliegelagerBestand(Liegemoebel.Laenge.s)));
        BalkonliegelagerM.setText("Balkonliegelager M: " + String.valueOf(lagersystem.getBalkonliegelagerBestand(Liegemoebel.Laenge.m)));
        BalkonliegelagerL.setText("Balkonliegelager L: " + String.valueOf(lagersystem.getBalkonliegelagerBestand(Liegemoebel.Laenge.l)));

        Doppelbettlager.setText("Doppelbettlager: " + String.valueOf(lagersystem.getDoppelbettlager().getMoebel().size()));
        DoppelbettlagerS.setText("Doppelbettlager S: " + String.valueOf(lagersystem.getDoppelbettlagerBestand(Liegemoebel.Laenge.s)));
        DoppelbettlagerM.setText("Doppelbettlager M: " + String.valueOf(lagersystem.getDoppelbettlagerBestand(Liegemoebel.Laenge.m)));
        DoppelbettlagerL.setText("Doppelbettlager L: " + String.valueOf(lagersystem.getDoppelbettlagerBestand(Liegemoebel.Laenge.l)));

        Fernsehcouch.setText("Fernsehcouch: " + String.valueOf(lagersystem.getFernsehcouchlager().getMoebel().size()));
        FernsehcouchEins.setText("Fernsehcouch Eins: " + String.valueOf(lagersystem.getFernsehcouchlagerBestand(Sitzmoebel.Sitzplaetze.eins)));
        FernsehcouchZwei.setText("Fernsehcouch Zwei: " + String.valueOf(lagersystem.getFernsehcouchlagerBestand(Sitzmoebel.Sitzplaetze.zwei)));
        FernsehcouchDrei.setText("Fernsehcouch Drei: " + String.valueOf(lagersystem.getFernsehcouchlagerBestand(Sitzmoebel.Sitzplaetze.drei)));
        FernsehcouchVier.setText("Fernsehcouch Vier: " + String.valueOf(lagersystem.getFernsehcouchlagerBestand(Sitzmoebel.Sitzplaetze.vier)));

        Kuechenstuhl.setText("Kuechenstuhl: " + String.valueOf(lagersystem.getKuechenstuhllager().getMoebel().size()));
        KuechenstuhlEins.setText("Kuechenstuhl Eins: " + String.valueOf(lagersystem.getKuechenstuhllagerBestand(Sitzmoebel.Sitzplaetze.eins)));
        KuechenstuhlZwei.setText("Kuechenstuhl Zwei: " + String.valueOf(lagersystem.getKuechenstuhllagerBestand(Sitzmoebel.Sitzplaetze.zwei)));
        KuechenstuhlDrei.setText("Kuechenstuhl Drei: " + String.valueOf(lagersystem.getKuechenstuhllagerBestand(Sitzmoebel.Sitzplaetze.drei)));
        KuechenstuhlVier.setText("Kuechenstuhl Vier: " + String.valueOf(lagersystem.getKuechenstuhllagerBestand(Sitzmoebel.Sitzplaetze.vier)));

        Ohrensessel.setText("Ohrensessel: " + String.valueOf(lagersystem.getOhrensessellager().getMoebel().size()));
        OhrensesselEins.setText("Ohrensessel Eins: " + String.valueOf(lagersystem.getOhrensessellagerBestand(Sitzmoebel.Sitzplaetze.eins)));
        OhrensesselZwei.setText("Ohrensessel Zwei: " + String.valueOf(lagersystem.getOhrensessellagerBestand(Sitzmoebel.Sitzplaetze.zwei)));
        OhrensesselDrei.setText("Ohrensessel Drei: " + String.valueOf(lagersystem.getOhrensessellagerBestand(Sitzmoebel.Sitzplaetze.drei)));
        OhrensesselVier.setText("Ohrensessel Vier: " + String.valueOf(lagersystem.getOhrensessellagerBestand(Sitzmoebel.Sitzplaetze.vier)));

        Buerotischlager.setText("Buerotischlager: " + String.valueOf(lagersystem.getBuerotischlager().getMoebel().size()));
        BuerotischlagerS.setText("Buerotischlager S: " + String.valueOf(lagersystem.getBuerotischlagerBestand(Tische.Hoehe.s)));
        BuerotischlagerM.setText("Buerotischlager M: " + String.valueOf(lagersystem.getBuerotischlagerBestand(Tische.Hoehe.m)));
        BuerotischlagerL.setText("Buerotischlager L: " + String.valueOf(lagersystem.getBuerotischlagerBestand(Tische.Hoehe.l)));

        Couchtischlager.setText("Couchtischlager: " + String.valueOf(lagersystem.getCouchtischlager().getMoebel().size()));
        CouchtischlagerS.setText("Couchtischlager S: " + String.valueOf(lagersystem.getCouchtischlagerBestand(Tische.Hoehe.s)));
        CouchtischlagerM.setText("Couchtischlager M: " + String.valueOf(lagersystem.getCouchtischlagerBestand(Tische.Hoehe.m)));
        CouchtischlagerL.setText("Couchtischlager L: " + String.valueOf(lagersystem.getCouchtischlagerBestand(Tische.Hoehe.l)));

        Esstischlager.setText("Esstischlager: " + String.valueOf(lagersystem.getEsstischlager().getMoebel().size()));
        EsstischlagerS.setText("Esstischlager S: " + String.valueOf(lagersystem.getEsstischlagerBestand(Tische.Hoehe.s)));
        EsstischlagerM.setText("Esstischlager M: " + String.valueOf(lagersystem.getEsstischlagerBestand(Tische.Hoehe.m)));
        EsstischlagerL.setText("Esstischlager L: " + String.valueOf(lagersystem.getEsstischlagerBestand(Tische.Hoehe.l)));

        Kuechentischlager.setText("Kuechentischlager: " + String.valueOf(lagersystem.getKuechentischlager().getMoebel().size()));
        KuechentischlagerS.setText("Kuechentischlager S: " + String.valueOf(lagersystem.getKuechentischlagerBestand(Tische.Hoehe.s)));
        KuechentischlagerM.setText("Kuechentischlager M: " + String.valueOf(lagersystem.getKuechentischlagerBestand(Tische.Hoehe.m)));
        KuechentischlagerL.setText("Kuechentischlager L: " + String.valueOf(lagersystem.getKuechentischlagerBestand(Tische.Hoehe.l)));


    }

    public static JPanel Panel() {
        addLabels();

        //Erstellen von Back Button
        JButton back = new JButton("Back");
        back.setBounds(100, 700, 150, 30);
        back.addActionListener(e -> {
            MyFrame.lagerbestandPanel.setVisible(false);

        });
        addLagerbestandPanel.add(back);
        addLagerbestandPanel.setLayout(null);
        addLagerbestandPanel.setBackground(Color.WHITE);
        addLagerbestandPanel.setBounds(100, 0, 1600, 900);
        addLagerbestandPanel.setVisible(false);

        return addLagerbestandPanel;
    }

}
