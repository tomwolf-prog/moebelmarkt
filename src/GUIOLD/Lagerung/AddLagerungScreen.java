package GUIOLD.Lagerung;

import GUIOLD.AddItemScreen;
import GUIOLD.Frame;
import Lager.Lagersystem;
import Moebelhaus.Moebelhaus;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddLagerungScreen {
    public static void addLagerung() {
        Lagersystem lagersystem = Moebelhaus.getLagersystem();
        //Erstellen des Frame
        JFrame frame = Frame.baseFrame();
        JLabel Kleiderschrnak = new JLabel(String.valueOf((lagersystem.getBeistelltischlager().getMoebel().size()) + lagersystem.getKleiderschranklager().getMoebel().size() + lagersystem.getKuechenregallager().getMoebel().size()));


        //Erstellen von AddItem Button
        JButton addKleiderschrank = new JButton("Add Kleiderschrank");
        addKleiderschrank.setBounds(150, 50, 175, 30);
        addKleiderschrank.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                AddKleiderschrankScreen.addKleiderschrank();
                frame.dispose();
            }
        });
        frame.add(addKleiderschrank);

        Kleiderschrnak.setBounds(350, 50, 175, 30);

        frame.add(Kleiderschrnak);

        //Erstellen von AddItem Button
        JButton addBeistelltisch = new JButton("Add Beistelltisch");
        addBeistelltisch.setBounds(150, 100, 175, 30);
        addBeistelltisch.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                AddBeistelltischeScreen.addBeistelltisch();
                frame.dispose();
            }
        });
        frame.add(addBeistelltisch);


        //Erstellen von AddItem Button
        JButton addKuechenregallager = new JButton("Add Kuechenregal");
        addKuechenregallager.setBounds(150, 150, 175, 30);
        addKuechenregallager.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                AddKuechenregalScreen.addKuechenregal();
                frame.dispose();
            }
        });
        frame.add(addKuechenregallager);

        //Erstellen von Back Button
        JButton back = new JButton("Back");
        back.setBounds(150, 200, 175, 30);
        back.addActionListener(e -> {
            AddItemScreen.Screen();
            frame.dispose();
        });
        frame.add(back);


    }
}
