package GUI.Lagerung;

import GUI.startScreen;
import Lager.Lagersystem;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class addLagerungScreen {
    public static void addLagerung(Lagersystem lagersystem){
        //Erstellen des Frame
        JFrame addItemScreen = new JFrame("Button Example");

        //Erstellen von AddItem Button
        JButton addKleiderschrank=new JButton("Add Kleiderschrank");
        addKleiderschrank.setBounds(150,50,150,30);
        addKleiderschrank.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //addKleiderschrankScreen(lagersystem);
                addItemScreen.dispose();
            }
        });
        addItemScreen.add(addKleiderschrank);

        //Erstellen von AddItem Button
        JButton addBeistelltisch=new JButton("Add Beistelltisch");
        addBeistelltisch.setBounds(150,100,150,30);
        addBeistelltisch.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addBeistelltischeScreen.addBeistelltisch(lagersystem);
                addItemScreen.dispose();
            }
        });
        addItemScreen.add(addBeistelltisch);


        //Erstellen von AddItem Button
        JButton addKuechenregallager=new JButton("Add Kuechenregallager");
        addKuechenregallager.setBounds(150,100,150,30);
        addKuechenregallager.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addItemScreen.dispose();
            }
        });
        addItemScreen.add(addKuechenregallager);

        //Erstellen von AddItem Button
        JButton cancel=new JButton("Cancel");
        cancel.setBounds(150,250,150,30);
        cancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                startScreen.start(lagersystem);
                addItemScreen.dispose();
            }
        });
        addItemScreen.add(cancel);



        //Erstellen von Exit Button
        JButton exit=new JButton("Exit");
        exit.setBounds(150,300,150,30);
        exit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addItemScreen.dispose();
            }
        });
        addItemScreen.add(exit);

        addItemScreen.setSize(1600,900);
        addItemScreen.setLayout(null);
        addItemScreen.setVisible(true);
        addItemScreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
