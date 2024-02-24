package GUI.Lagerung;

import GUI.Frame;
import Kategorie.Lagerung;
import Lager.Lagersystem;
import Moebelhaus.Moebelhaus;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddKuechenregalScreen {


    public static void addKuechenregal() {
        Lagersystem lagersystem = Moebelhaus.getLagersystem();

        //Erstellen des Frame
        JFrame frame = Frame.baseFrame();

        //Erstellen von AddItem Button
        JButton addKuechenregalS = new JButton("Add Kuechenregal S");
        addKuechenregalS.setBounds(150, 50, 175, 30);
        addKuechenregalS.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lagersystem.addLagerung(new Lagerung(Lagerung.Moebelart.Kuechenregal, Lagerung.Flaeche.s));
            }
        });
        frame.add(addKuechenregalS);

        //Erstellen von AddItem Button
        JButton addKuechenregalM = new JButton("Add Kuechenregal M");
        addKuechenregalM.setBounds(150, 100, 175, 30);
        addKuechenregalM.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lagersystem.addLagerung(new Lagerung(Lagerung.Moebelart.Kuechenregal, Lagerung.Flaeche.m));
            }
        });
        frame.add(addKuechenregalM);

        //Erstellen von AddItem Button
        JButton addKuechenregalL = new JButton("Add Kuechenregal L");
        addKuechenregalL.setBounds(150, 150, 175, 30);
        addKuechenregalL.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lagersystem.addLagerung(new Lagerung(Lagerung.Moebelart.Kuechenregal, Lagerung.Flaeche.l));
            }
        });
        frame.add(addKuechenregalL);

        //Erstellen von AddItem Button
        JButton addKuechenregalXL = new JButton("Add Kuechenregal XL");
        addKuechenregalXL.setBounds(150, 200, 175, 30);
        addKuechenregalXL.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lagersystem.addLagerung(new Lagerung(Lagerung.Moebelart.Kuechenregal, Lagerung.Flaeche.xl));

            }
        });
        frame.add(addKuechenregalXL);

        //Erstellen von Back Button
        JButton back = new JButton("Back");
        back.setBounds(150, 250, 175, 30);
        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                AddLagerungScreen.addLagerung();
                frame.dispose();
            }
        });
        frame.add(back);


    }
}
