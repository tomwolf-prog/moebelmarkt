import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import GUI.addItemScreen;
import GUI.startScreen;
import Kategorie.*;
import Kategorie.Lagerung.Flaeche;
import Kategorie.Lagerung.Moebelart;
import Lager.*;

public class Moebelhaus extends JFrame{


    
    public void addKuechenregalScreen(Lagersystem lagersystem){
        //Erstellen des Frame
        JFrame addKuechenregal = new JFrame("Button Example");

        //Erstellen von AddItem Button
        JButton addKleiderschrankS=new JButton("Add Kleiderschrank S");
        addKleiderschrankS.setBounds(150,50,150,30);
        addKleiderschrankS.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lagersystem.addLagerung(new Lagerung(Moebelart.Beistelltisch, Flaeche.s));
                startScreen.start(lagersystem);
                addKuechenregal.dispose();
            }
        });
        addKuechenregal.add(addKleiderschrankS);

        //Erstellen von AddItem Button
        JButton addKleiderschrankM=new JButton("Add Kuechenregallager M");
        addKleiderschrankM.setBounds(150,100,150,30);
        addKleiderschrankM.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lagersystem.addLagerung(new Lagerung(Moebelart.Beistelltisch, Flaeche.m));
                startScreen.start(lagersystem);
                addKuechenregal.dispose();
            }
        });
        addKuechenregal.add(addKleiderschrankM);

        //Erstellen von AddItem Button
        JButton addKleiderschrankL=new JButton("Add Kuechenregallager L");
        addKleiderschrankL.setBounds(150,150,150,30);
        addKleiderschrankL.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lagersystem.addLagerung(new Lagerung(Moebelart.Beistelltisch, Flaeche.l));
                startScreen.start(lagersystem);
                addKuechenregal.dispose();
            }
        });
        addKuechenregal.add(addKleiderschrankL);

        //Erstellen von AddItem Button
        JButton addKleiderschrankXL=new JButton("Add Kuechenregallager XL");
        addKleiderschrankXL.setBounds(150,200,150,30);
        addKleiderschrankXL.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lagersystem.addLagerung(new Lagerung(Moebelart.Beistelltisch, Flaeche.xl));
                startScreen.start(lagersystem);
                addKuechenregal.dispose();
            }
        });
        addKuechenregal.add(addKleiderschrankXL);

        //Erstellen von AddItem Button
        JButton cancel=new JButton("Cancel");
        cancel.setBounds(150,250,150,30);
        cancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                startScreen.start(lagersystem);
                addKuechenregal.dispose();
            }
        });
        addKuechenregal.add(cancel);



        //Erstellen von Exit Button
        JButton exit=new JButton("Exit");
        exit.setBounds(150,300,150,30);
        exit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                myMethod();
                addKuechenregal.dispose();
            }
        });
        addKuechenregal.add(exit);

        addKuechenregal.setSize(1600,900);
        addKuechenregal.setLayout(null);
        addKuechenregal.setVisible(true);
        addKuechenregal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }




    public static void main(String[] args) {
		Lagersystem lagersystem = new Lagersystem();
        startScreen.start(lagersystem);
        
    }

    public void myMethod() {
        JOptionPane.showMessageDialog(this, "Byes");
    }
    
}
