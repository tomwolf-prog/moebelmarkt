package GUIOLD;

import GUIOLD.Lagerung.AddLagerungScreen;

import javax.swing.*;


public class AddItemScreen {
    public static void Screen() {
        //Erstellen des Frame
        JFrame frame = Frame.baseFrame();

        //Erstellen von AddItem Button
        JButton addLagerung = new JButton("Add Lagerung");
        addLagerung.setBounds(150, 50, 150, 30);
        addLagerung.addActionListener(e -> {
            AddLagerungScreen.addLagerung();
            frame.dispose();
        });
        frame.add(addLagerung);

        //Erstellen von AddItem Button
        JButton addLiegemoebel = new JButton("Add Liefemoebel");
        addLiegemoebel.setBounds(150, 100, 150, 30);
        addLiegemoebel.addActionListener(e -> frame.dispose());
        frame.add(addLiegemoebel);

        //Erstellen von AddItem Button
        JButton addSitzmoebel = new JButton("Add Sitzmoebel");
        addSitzmoebel.setBounds(150, 150, 150, 30);
        addSitzmoebel.addActionListener(e -> frame.dispose());
        frame.add(addSitzmoebel);

        //Erstellen von AddItem Button
        JButton addTische = new JButton("Add Tische");
        addTische.setBounds(150, 200, 150, 30);
        addTische.addActionListener(e -> frame.dispose());
        frame.add(addTische);

        //Erstellen von Back Button
        JButton back = new JButton("Back");
        back.setBounds(150, 250, 150, 30);
        back.addActionListener(e -> {
            StartScreen.start();
            frame.dispose();
        });
        frame.add(back);


    }
}