package GUI;

import Lager.Lagersystem;
import Moebelhaus.Moebelhaus;

import javax.swing.*;
import java.awt.*;

public class VerkaufspreisPanel {
    private static final JPanel verkaufspreisPanel = new JPanel();

    private static final Lagersystem lagersystem = Moebelhaus.getLagersystem();

    //Lagerung
    private static final JLabel Kueche = new JLabel();


    private static void addLabels() {

        verkaufspreisPanel.add(Kueche);
        Kueche.setBounds(50, 50, 175, 30);

    }

    public static void updateLabels() {

        Kueche.setText("Küche: " + (lagersystem.getKuechenregallager().getMoebel().size() * lagersystem.getKuechenregallager().getPreis()
        ));


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
        verkaufspreisPanel.setBounds(100, 0, 1600, 900);
        verkaufspreisPanel.setVisible(false);

        return verkaufspreisPanel;
    }
}
