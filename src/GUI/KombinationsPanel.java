package GUI;

import Lager.Lager;
import Lager.Lagersystem;
import Moebelhaus.Moebelhaus;
import Moebelstueck.Moebelstueck;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;

public class KombinationsPanel {

    private static JPanel kombiPanel = new JPanel();
    private static JTextArea ta;
    private static JScrollPane ausgabeScrollPane;
    private static final Lagersystem lagersystem = Moebelhaus.getLagersystem();
    private static final JTextArea Kombi = new JTextArea("Betrag:");
    private static final JTextField KombiFeld = new JTextField("100");

    private static void addLabels() {
        kombiPanel.add(Kombi);
        Kombi.setBounds(50, 50, 175, 30);
        Kombi.setEditable(false);

        kombiPanel.add(KombiFeld);
        KombiFeld.setBounds(50, 100, 175, 30);
    }

    private static void updateLabels(String txt, int preis) {
        DecimalFormat formatter = (DecimalFormat) NumberFormat.getInstance(Locale.GERMAN);
        formatter.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.GERMAN));
        String ausgabe = "Kombination: \n";
        ausgabe = ausgabe + txt;
        ausgabe = ausgabe + "=Gesamtpreis: " + formatter.format((double) preis / 100) + "€";

        ta.setText(ausgabe);
    }

    private static void formatAusgabe(int i1) {
        DecimalFormat formatter = (DecimalFormat) NumberFormat.getInstance(Locale.GERMAN);
        formatter.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.GERMAN));
        ArrayList<Lager<? extends Moebelstueck>> konstellation = lagersystem.moebelauswahlBisBetrag(i1);
        StringBuilder zwischenAusgabe = new StringBuilder();
        if (konstellation == null) {
            zwischenAusgabe.append("Keine Kombination gefunden\n");
            updateLabels(zwischenAusgabe.toString(), 0);
        } else {
            int gesamtpreis = konstellation.stream().mapToInt(Lager::getPreis).sum();
            for (Lager<? extends Moebelstueck> lager : konstellation) {
                zwischenAusgabe.append(lager.getMoebel().get(0).toString()).append(" | Preis: ").append(formatter.format((double) lager.getPreis() / 100)).append("€\n");
            }
            String ausgabe = "Kombination: \n";
            updateLabels(zwischenAusgabe.toString(), gesamtpreis);
        }
    }

    public static JPanel Panel() {
        addLabels();


        ta = new JTextArea("Bitte geben Sie einen Betrag ein und drücken auf 'Kombi'");


        ta.setLineWrap(true);
        ta.setWrapStyleWord(true);
        ta.setEditable(false);
        ausgabeScrollPane = new JScrollPane(ta);
        ausgabeScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        ausgabeScrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        ausgabeScrollPane.setBounds(50, 200, 1400, 500);
        kombiPanel.add(ausgabeScrollPane);

        JButton getKombiB = new JButton("Kombi");
        getKombiB.setBounds(50, 150, 175, 30);
        getKombiB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = KombiFeld.getText();
                int i1;
                try {
                    i1 = Integer.parseInt(String.valueOf(text)) * 100;
                } catch (NumberFormatException a) {
                    i1 = 0;
                }
                formatAusgabe(i1);

            }
        });
        kombiPanel.add(getKombiB);

        //Erstellen von Back Button
        JButton back = new JButton("Back");
        back.setBounds(50, 750, 175, 30);
        back.addActionListener(e -> {
            Frame.setAllPanelsInvisible();
            Frame.setAllHomeButtonsVisible();

        });
        kombiPanel.add(back);
        kombiPanel.setLayout(null);
        kombiPanel.setBackground(Color.WHITE);
        kombiPanel.setBounds(105, 0, 1600, 900);
        kombiPanel.setVisible(false);

        return kombiPanel;
    }
}
