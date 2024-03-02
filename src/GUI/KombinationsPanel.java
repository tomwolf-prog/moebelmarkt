package GUI;

import Lager.Lager;
import Lager.Lagersystem;
import Moebelhaus.Moebelhaus;
import Moebelstueck.Moebelstueck;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

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

        kombiPanel.add(KombiFeld);
        KombiFeld.setBounds(50, 100, 175, 30);
    }

    private static void updateLabels(String txt, int preis) {
        String ausgabe = "Kombination: \n";
        ausgabe = ausgabe + txt;
        ausgabe = ausgabe + "=Gesamtpreis: "+(float) preis / 100+"€";

        ta.setText(ausgabe);
    }

    public static JPanel Panel() {
        addLabels();


        ta = new JTextArea("Bitte geben Sie einen Betrag ein und drücken auf 'Kombi'");


        ta.setLineWrap(true);
        ta.setWrapStyleWord(true);
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

                ArrayList<Lager<? extends Moebelstueck>> konstellation = lagersystem.moebelauswahlBisBetrag(i1);
                int gesamtpreis = konstellation.stream().mapToInt(Lager::getPreis).sum();
                String zwischenAusgabe = "";
                for (Lager<? extends Moebelstueck> lager : konstellation) {
                    zwischenAusgabe = zwischenAusgabe + lager.getMoebel().get(0).toString() + " | Preis: "+ (float) lager.getPreis() / 100+"€\n";
                }
                updateLabels(zwischenAusgabe, gesamtpreis);

            }
        });
        kombiPanel.add(getKombiB);

        //Erstellen von Back Button
        JButton back = new JButton("Back");
        back.setBounds(100, 700, 150, 30);
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
