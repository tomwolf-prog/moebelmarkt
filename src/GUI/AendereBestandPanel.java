package GUI;


import javax.swing.*;
import java.awt.*;

public class AendereBestandPanel {

    private static final JPanel aendereBestandPanel = new JPanel();

    public static JPanel Panel() {
        //Erstellen von AddItem Button
        JButton addLagerung = new JButton("Ändere Lagerung Bestand");
        addLagerung.setBounds(150, 50, 250, 30);
        addLagerung.addActionListener(e -> {
            Frame.aendereBestandPanel.setVisible(false);
            Frame.aendereLagerungBestandPanel.setVisible(true);
        });
        aendereBestandPanel.add(addLagerung);

        //Erstellen von AddItem Button
        JButton addLiegemoebel = new JButton("Ändere Liegemoebel Bestand");
        addLiegemoebel.setBounds(150, 100, 250, 30);
        addLiegemoebel.addActionListener(e -> {
            Frame.aendereBestandPanel.setVisible(false);
            Frame.aendereLiegemoebelBestandPanel.setVisible(true);
        });
        aendereBestandPanel.add(addLiegemoebel);

        //Erstellen von AddItem Button
        JButton addSitzmoebel = new JButton("Ändere Sitzmoebel Bestand");
        addSitzmoebel.setBounds(150, 150, 250, 30);
        addSitzmoebel.addActionListener(e -> {
            Frame.aendereBestandPanel.setVisible(false);
            Frame.aendereSitzmoebelBestandPanel.setVisible(true);
        });
        aendereBestandPanel.add(addSitzmoebel);

        //Erstellen von AddItem Button
        JButton addTische = new JButton("Ändere Tische Bestand");
        addTische.setBounds(150, 200, 250, 30);
        addTische.addActionListener(e -> {
            Frame.aendereBestandPanel.setVisible(false);
            Frame.aendereTischeBestandPanel.setVisible(true);
        });
        aendereBestandPanel.add(addTische);

        //Erstellen von Back Button
        JButton back = new JButton("Back");
        back.setBounds(150, 250, 250, 30);
        back.addActionListener(e -> {
            Frame.setAllPanelsInvisible();
            Frame.setAllHomeButtonsVisible();

        });
        aendereBestandPanel.add(back);
        aendereBestandPanel.setLayout(null);
        aendereBestandPanel.setBackground(Color.white);
        aendereBestandPanel.setBounds(105, 0, 1600, 900);
        aendereBestandPanel.setVisible(false);

        return aendereBestandPanel;

    }

}
