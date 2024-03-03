package GUI;

import Kategorie.Lagerung;
import Kategorie.Liegemoebel;
import Kategorie.Sitzmoebel;
import Kategorie.Tische;
import Lager.Lagersystem;
import Moebelhaus.Moebelhaus;

import javax.swing.*;
import java.awt.*;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;

public class LagerbestandPanel {
    private static final JPanel aendereLagerbestandPanel = new JPanel();

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

        aendereLagerbestandPanel.add(Beistelltischlager);
        Beistelltischlager.setBounds(50, 50, 215, 30);

        aendereLagerbestandPanel.add(BeistelltischlagerS);
        BeistelltischlagerS.setBounds(60, 70, 215, 30);

        aendereLagerbestandPanel.add(BeistelltischlagerM);
        BeistelltischlagerM.setBounds(60, 90, 215, 30);

        aendereLagerbestandPanel.add(BeistelltischlagerL);
        BeistelltischlagerL.setBounds(60, 110, 215, 30);

        aendereLagerbestandPanel.add(BeistelltischlagerXL);
        BeistelltischlagerXL.setBounds(60, 130, 215, 30);

        aendereLagerbestandPanel.add(Kleiderschranklager);
        Kleiderschranklager.setBounds(50, 200, 215, 30);

        aendereLagerbestandPanel.add(KleiderschranklagerS);
        KleiderschranklagerS.setBounds(60, 220, 215, 30);

        aendereLagerbestandPanel.add(KleiderschranklagerM);
        KleiderschranklagerM.setBounds(60, 240, 215, 30);

        aendereLagerbestandPanel.add(KleiderschranklagerL);
        KleiderschranklagerL.setBounds(60, 260, 215, 30);

        aendereLagerbestandPanel.add(KleiderschranklagerXL);
        KleiderschranklagerXL.setBounds(60, 280, 215, 30);

        aendereLagerbestandPanel.add(Kuechenregallager);
        Kuechenregallager.setBounds(50, 350, 215, 30);

        aendereLagerbestandPanel.add(KuechenregallagerS);
        KuechenregallagerS.setBounds(60, 370, 215, 30);

        aendereLagerbestandPanel.add(KuechenregallagerM);
        KuechenregallagerM.setBounds(60, 390, 215, 30);

        aendereLagerbestandPanel.add(KuechenregallagerL);
        KuechenregallagerL.setBounds(60, 410, 215, 30);

        aendereLagerbestandPanel.add(KuechenregallagerXL);
        KuechenregallagerXL.setBounds(60, 430, 215, 30);

        aendereLagerbestandPanel.add(Balkonliegelager);
        Balkonliegelager.setBounds(400, 50, 215, 30);

        aendereLagerbestandPanel.add(BalkonliegelagerS);
        BalkonliegelagerS.setBounds(410, 70, 215, 30);

        aendereLagerbestandPanel.add(BalkonliegelagerM);
        BalkonliegelagerM.setBounds(410, 90, 215, 30);

        aendereLagerbestandPanel.add(BalkonliegelagerL);
        BalkonliegelagerL.setBounds(410, 110, 215, 30);

        aendereLagerbestandPanel.add(Doppelbettlager);
        Doppelbettlager.setBounds(400, 200, 215, 30);

        aendereLagerbestandPanel.add(DoppelbettlagerS);
        DoppelbettlagerS.setBounds(410, 220, 215, 30);

        aendereLagerbestandPanel.add(DoppelbettlagerM);
        DoppelbettlagerM.setBounds(410, 240, 215, 30);

        aendereLagerbestandPanel.add(DoppelbettlagerL);
        DoppelbettlagerL.setBounds(410, 260, 215, 30);

        aendereLagerbestandPanel.add(Fernsehcouch);
        Fernsehcouch.setBounds(750, 50, 215, 30);
        aendereLagerbestandPanel.add(FernsehcouchEins);
        FernsehcouchEins.setBounds(760, 70, 215, 30);
        aendereLagerbestandPanel.add(FernsehcouchZwei);
        FernsehcouchZwei.setBounds(760, 90, 215, 30);
        aendereLagerbestandPanel.add(FernsehcouchDrei);
        FernsehcouchDrei.setBounds(760, 110, 215, 30);
        aendereLagerbestandPanel.add(FernsehcouchVier);
        FernsehcouchVier.setBounds(760, 130, 215, 30);

        aendereLagerbestandPanel.add(Kuechenstuhl);
        Kuechenstuhl.setBounds(750, 200, 215, 30);
        aendereLagerbestandPanel.add(KuechenstuhlEins);
        KuechenstuhlEins.setBounds(760, 220, 215, 30);
        aendereLagerbestandPanel.add(KuechenstuhlZwei);
        KuechenstuhlZwei.setBounds(760, 240, 215, 30);
        aendereLagerbestandPanel.add(KuechenstuhlDrei);
        KuechenstuhlDrei.setBounds(760, 260, 215, 30);
        aendereLagerbestandPanel.add(KuechenstuhlVier);
        KuechenstuhlVier.setBounds(760, 280, 215, 30);

        aendereLagerbestandPanel.add(Ohrensessel);
        Ohrensessel.setBounds(750, 350, 215, 30);
        aendereLagerbestandPanel.add(OhrensesselEins);
        OhrensesselEins.setBounds(760, 370, 215, 30);
        aendereLagerbestandPanel.add(OhrensesselZwei);
        OhrensesselZwei.setBounds(760, 390, 215, 30);
        aendereLagerbestandPanel.add(OhrensesselDrei);
        OhrensesselDrei.setBounds(760, 410, 215, 30);
        aendereLagerbestandPanel.add(OhrensesselVier);
        OhrensesselVier.setBounds(760, 430, 215, 30);

        aendereLagerbestandPanel.add(Buerotischlager);
        Buerotischlager.setBounds(1100, 50, 215, 30);
        aendereLagerbestandPanel.add(BuerotischlagerS);
        BuerotischlagerS.setBounds(1110, 70, 215, 30);
        aendereLagerbestandPanel.add(BuerotischlagerM);
        BuerotischlagerM.setBounds(1110, 90, 215, 30);
        aendereLagerbestandPanel.add(BuerotischlagerL);
        BuerotischlagerL.setBounds(1110, 110, 215, 30);

        aendereLagerbestandPanel.add(Couchtischlager);
        Couchtischlager.setBounds(1100, 200, 215, 30);
        aendereLagerbestandPanel.add(CouchtischlagerS);
        CouchtischlagerS.setBounds(1110, 220, 215, 30);
        aendereLagerbestandPanel.add(CouchtischlagerM);
        CouchtischlagerM.setBounds(1110, 240, 215, 30);
        aendereLagerbestandPanel.add(CouchtischlagerL);
        CouchtischlagerL.setBounds(1110, 260, 215, 30);

        aendereLagerbestandPanel.add(Esstischlager);
        Esstischlager.setBounds(1100, 350, 215, 30);
        aendereLagerbestandPanel.add(EsstischlagerS);
        EsstischlagerS.setBounds(1110, 370, 215, 30);
        aendereLagerbestandPanel.add(EsstischlagerM);
        EsstischlagerM.setBounds(1110, 390, 215, 30);
        aendereLagerbestandPanel.add(EsstischlagerL);
        EsstischlagerL.setBounds(1110, 410, 215, 30);

        aendereLagerbestandPanel.add(Kuechentischlager);
        Kuechentischlager.setBounds(1100, 500, 215, 30);
        aendereLagerbestandPanel.add(KuechentischlagerS);
        KuechentischlagerS.setBounds(1110, 520, 215, 30);
        aendereLagerbestandPanel.add(KuechentischlagerM);
        KuechentischlagerM.setBounds(1110, 540, 215, 30);
        aendereLagerbestandPanel.add(KuechentischlagerL);
        KuechentischlagerL.setBounds(1110, 560, 215, 30);


    }

    public static void updateLabels() {
        //Lagerung
        DecimalFormat formatter = (DecimalFormat) NumberFormat.getInstance(Locale.GERMAN);
        formatter.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.GERMAN));
        Beistelltischlager.setText("Beistelltischlager: " + formatter.format((lagersystem.getBeistelltischlager().getMoebel().size())));
        Beistelltischlager.setText("Beistelltischlager: " + formatter.format((lagersystem.getBeistelltischlager().getMoebel().size())));
        BeistelltischlagerS.setText("Beistelltischlager S: " + formatter.format(lagersystem.getBeistelltischlagerBestand(Kategorie.Lagerung.Flaeche.s)));
        BeistelltischlagerM.setText("Beistelltischlager M: " + formatter.format(lagersystem.getBeistelltischlagerBestand(Kategorie.Lagerung.Flaeche.m)));
        BeistelltischlagerL.setText("Beistelltischlager L: " + formatter.format(lagersystem.getBeistelltischlagerBestand(Kategorie.Lagerung.Flaeche.l)));
        BeistelltischlagerXL.setText("Beistelltischlager XL: " + formatter.format(lagersystem.getBeistelltischlagerBestand(Kategorie.Lagerung.Flaeche.xl)));

        Kleiderschranklager.setText("Kleiderschranklager: " + formatter.format(lagersystem.getKleiderschranklager().getMoebel().size()));
        KleiderschranklagerS.setText("Kleiderschranklager S: " + formatter.format(lagersystem.getKleiderschranklagerBestand(Lagerung.Flaeche.s)));
        KleiderschranklagerM.setText("Kleiderschranklager M: " + formatter.format(lagersystem.getKleiderschranklagerBestand(Lagerung.Flaeche.m)));
        KleiderschranklagerL.setText("Kleiderschranklager L: " + formatter.format(lagersystem.getKleiderschranklagerBestand(Lagerung.Flaeche.l)));
        KleiderschranklagerXL.setText("Kleiderschranklager XL: " + formatter.format(lagersystem.getKleiderschranklagerBestand(Lagerung.Flaeche.xl)));

        Kuechenregallager.setText("Kuechenregallagerlager: " + formatter.format(lagersystem.getKuechenregallager().getMoebel().size()));
        KuechenregallagerS.setText("Kuechenregallagerlager S: " + formatter.format(lagersystem.getKuechenregallagerBestand(Lagerung.Flaeche.s)));
        KuechenregallagerM.setText("Kuechenregallagerlager M: " + formatter.format(lagersystem.getKuechenregallagerBestand(Lagerung.Flaeche.m)));
        KuechenregallagerL.setText("Kuechenregallagerlager L: " + formatter.format(lagersystem.getKuechenregallagerBestand(Lagerung.Flaeche.l)));
        KuechenregallagerXL.setText("Kuechenregallagerlager XL: " + formatter.format(lagersystem.getKuechenregallagerBestand(Lagerung.Flaeche.xl)));

        Balkonliegelager.setText("Balkonliegelager: " + formatter.format(lagersystem.getBalkonliegelager().getMoebel().size()));
        BalkonliegelagerS.setText("Balkonliegelager S: " + formatter.format(lagersystem.getBalkonliegelagerBestand(Liegemoebel.Laenge.s)));
        BalkonliegelagerM.setText("Balkonliegelager M: " + formatter.format(lagersystem.getBalkonliegelagerBestand(Liegemoebel.Laenge.m)));
        BalkonliegelagerL.setText("Balkonliegelager L: " + formatter.format(lagersystem.getBalkonliegelagerBestand(Liegemoebel.Laenge.l)));

        Doppelbettlager.setText("Doppelbettlager: " + formatter.format(lagersystem.getDoppelbettlager().getMoebel().size()));
        DoppelbettlagerS.setText("Doppelbettlager S: " + formatter.format(lagersystem.getDoppelbettlagerBestand(Liegemoebel.Laenge.s)));
        DoppelbettlagerM.setText("Doppelbettlager M: " + formatter.format(lagersystem.getDoppelbettlagerBestand(Liegemoebel.Laenge.m)));
        DoppelbettlagerL.setText("Doppelbettlager L: " + formatter.format(lagersystem.getDoppelbettlagerBestand(Liegemoebel.Laenge.l)));

        Fernsehcouch.setText("Fernsehcouch: " + formatter.format(lagersystem.getFernsehcouchlager().getMoebel().size()));
        FernsehcouchEins.setText("Fernsehcouch Eins: " + formatter.format(lagersystem.getFernsehcouchlagerBestand(Sitzmoebel.Sitzplaetze.eins)));
        FernsehcouchZwei.setText("Fernsehcouch Zwei: " + formatter.format(lagersystem.getFernsehcouchlagerBestand(Sitzmoebel.Sitzplaetze.zwei)));
        FernsehcouchDrei.setText("Fernsehcouch Drei: " + formatter.format(lagersystem.getFernsehcouchlagerBestand(Sitzmoebel.Sitzplaetze.drei)));
        FernsehcouchVier.setText("Fernsehcouch Vier: " + formatter.format(lagersystem.getFernsehcouchlagerBestand(Sitzmoebel.Sitzplaetze.vier)));

        Kuechenstuhl.setText("Kuechenstuhl: " + formatter.format(lagersystem.getKuechenstuhllager().getMoebel().size()));
        KuechenstuhlEins.setText("Kuechenstuhl Eins: " + formatter.format(lagersystem.getKuechenstuhllagerBestand(Sitzmoebel.Sitzplaetze.eins)));
        KuechenstuhlZwei.setText("Kuechenstuhl Zwei: " + formatter.format(lagersystem.getKuechenstuhllagerBestand(Sitzmoebel.Sitzplaetze.zwei)));
        KuechenstuhlDrei.setText("Kuechenstuhl Drei: " + formatter.format(lagersystem.getKuechenstuhllagerBestand(Sitzmoebel.Sitzplaetze.drei)));
        KuechenstuhlVier.setText("Kuechenstuhl Vier: " + formatter.format(lagersystem.getKuechenstuhllagerBestand(Sitzmoebel.Sitzplaetze.vier)));

        Ohrensessel.setText("Ohrensessel: " + formatter.format(lagersystem.getOhrensessellager().getMoebel().size()));
        OhrensesselEins.setText("Ohrensessel Eins: " + formatter.format(lagersystem.getOhrensessellagerBestand(Sitzmoebel.Sitzplaetze.eins)));
        OhrensesselZwei.setText("Ohrensessel Zwei: " + formatter.format(lagersystem.getOhrensessellagerBestand(Sitzmoebel.Sitzplaetze.zwei)));
        OhrensesselDrei.setText("Ohrensessel Drei: " + formatter.format(lagersystem.getOhrensessellagerBestand(Sitzmoebel.Sitzplaetze.drei)));
        OhrensesselVier.setText("Ohrensessel Vier: " + formatter.format(lagersystem.getOhrensessellagerBestand(Sitzmoebel.Sitzplaetze.vier)));

        Buerotischlager.setText("Buerotischlager: " + formatter.format(lagersystem.getBuerotischlager().getMoebel().size()));
        BuerotischlagerS.setText("Buerotischlager S: " + formatter.format(lagersystem.getBuerotischlagerBestand(Tische.Hoehe.s)));
        BuerotischlagerM.setText("Buerotischlager M: " + formatter.format(lagersystem.getBuerotischlagerBestand(Tische.Hoehe.m)));
        BuerotischlagerL.setText("Buerotischlager L: " + formatter.format(lagersystem.getBuerotischlagerBestand(Tische.Hoehe.l)));

        Couchtischlager.setText("Couchtischlager: " + formatter.format(lagersystem.getCouchtischlager().getMoebel().size()));
        CouchtischlagerS.setText("Couchtischlager S: " + formatter.format(lagersystem.getCouchtischlagerBestand(Tische.Hoehe.s)));
        CouchtischlagerM.setText("Couchtischlager M: " + formatter.format(lagersystem.getCouchtischlagerBestand(Tische.Hoehe.m)));
        CouchtischlagerL.setText("Couchtischlager L: " + formatter.format(lagersystem.getCouchtischlagerBestand(Tische.Hoehe.l)));

        Esstischlager.setText("Esstischlager: " + formatter.format(lagersystem.getEsstischlager().getMoebel().size()));
        EsstischlagerS.setText("Esstischlager S: " + formatter.format(lagersystem.getEsstischlagerBestand(Tische.Hoehe.s)));
        EsstischlagerM.setText("Esstischlager M: " + formatter.format(lagersystem.getEsstischlagerBestand(Tische.Hoehe.m)));
        EsstischlagerL.setText("Esstischlager L: " + formatter.format(lagersystem.getEsstischlagerBestand(Tische.Hoehe.l)));

        Kuechentischlager.setText("Kuechentischlager: " + formatter.format(lagersystem.getKuechentischlager().getMoebel().size()));
        KuechentischlagerS.setText("Kuechentischlager S: " + formatter.format(lagersystem.getKuechentischlagerBestand(Tische.Hoehe.s)));
        KuechentischlagerM.setText("Kuechentischlager M: " + formatter.format(lagersystem.getKuechentischlagerBestand(Tische.Hoehe.m)));
        KuechentischlagerL.setText("Kuechentischlager L: " + formatter.format(lagersystem.getKuechentischlagerBestand(Tische.Hoehe.l)));


    }

    public static JPanel Panel() {
        addLabels();

        //Erstellen von Back Button
        JButton back = new JButton("Back");
        back.setBounds(50, 750, 150, 30);
        back.addActionListener(e -> {
            Frame.setAllPanelsInvisible();
            Frame.setAllHomeButtonsVisible();
        });
        aendereLagerbestandPanel.add(back);

        aendereLagerbestandPanel.setLayout(null);
        aendereLagerbestandPanel.setBackground(Color.WHITE);
        aendereLagerbestandPanel.setBounds(105, 0, 1600, 900);
        aendereLagerbestandPanel.setVisible(false);

        return aendereLagerbestandPanel;
    }

}
