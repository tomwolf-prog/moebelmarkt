package GUI;

import Lager.Lagersystem;
import Moebelhaus.Moebelhaus;

import javax.swing.*;
import java.awt.*;

public class LagerbestandPanel {
    private static final JPanel addLagerbestandPanel = new JPanel();

    private static final Lagersystem lagersystem = Moebelhaus.getLagersystem();
    private static final JLabel Lagerung = new JLabel();
    private static final JLabel Kleiderschrank = new JLabel();


    public static JPanel Panel() {

        Kleiderschrank.setBounds(350, 50, 175, 30);

        addLagerbestandPanel.add(Kleiderschrank);

        //Erstellen von Back Button
        JButton back = new JButton("Back");
        back.setBounds(150, 250, 150, 30);
        back.addActionListener(e -> {
            MyFrame.lagerbestandPanel.setVisible(false);

        });
        addLagerbestandPanel.add(back);
        addLagerbestandPanel.setLayout(null);
        addLagerbestandPanel.setBackground(Color.GRAY);
        addLagerbestandPanel.setBounds(100, 0, 1600, 900);
        addLagerbestandPanel.setVisible(false);

        return addLagerbestandPanel;
    }

    public static void updateLabels() {
        Lagerung.setText("Lagerung: " + String.valueOf((lagersystem.getBeistelltischlager().getMoebel().size()) + lagersystem.getKleiderschranklager().getMoebel().size() + lagersystem.getKuechenregallager().getMoebel().size()));
        Kleiderschrank.setText("Lagerung: " + String.valueOf((lagersystem.getBeistelltischlager().getMoebel().size()) + lagersystem.getKleiderschranklager().getMoebel().size() + lagersystem.getKuechenregallager().getMoebel().size()));
    }
}
