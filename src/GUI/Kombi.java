package GUI;

import Lager.Lagersystem;
import Moebelhaus.Moebelhaus;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Kombi {

    private static JPanel kombiPanel = new JPanel();

    private static final Lagersystem lagersystem = Moebelhaus.getLagersystem();
    private static final JTextArea Kombi = new JTextArea("Betrag;");
    private static final JTextField KombiFeld = new JTextField("100");
    private static final JTextArea Ausgabe = new JTextArea("Bitte geben Sie einen Betrage ein und drücken 'Kombi'");

    private static void addLabels() {
        kombiPanel.add(Kombi);
        Kombi.setBounds(50, 50, 175, 30);


        kombiPanel.add(KombiFeld);
        KombiFeld.setBounds(50, 100, 175, 30);

        kombiPanel.add(Ausgabe);
        Ausgabe.setBounds(400, 50, 500, 300);
    }

    private static void updateLabels(String txt) {
        Ausgabe.setText(txt);
    }

    public static JPanel Panel() {
        addLabels();

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

                updateLabels(String.valueOf(lagersystem.moebelauswahlBisBetrag(i1)));

            }
        });
        kombiPanel.add(getKombiB);

        //Erstellen von Back Button
        JButton back = new JButton("Back");
        back.setBounds(100, 700, 150, 30);
        back.addActionListener(e -> {
            MyFrame.kombiPanel.setVisible(false);

        });
        kombiPanel.add(back);
        kombiPanel.setLayout(null);
        kombiPanel.setBackground(Color.WHITE);
        kombiPanel.setBounds(105, 0, 1600, 900);
        kombiPanel.setVisible(false);

        return kombiPanel;
    }
}
