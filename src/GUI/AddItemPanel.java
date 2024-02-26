package GUI;


import javax.swing.*;
import java.awt.*;

public class AddItemPanel {

    private static final JPanel addItemPanel = new JPanel();

    public static JPanel Panel() {
        //Erstellen von AddItem Button
        JButton addLagerung = new JButton("Add Lagerung");
        addLagerung.setBounds(150, 50, 150, 30);
        addLagerung.addActionListener(e -> {
            MyFrame.addItemPanel.setVisible(false);
            MyFrame.addLagerungPanel.setVisible(true);
        });
        addItemPanel.add(addLagerung);

        //Erstellen von AddItem Button
        JButton addLiegemoebel = new JButton("Add Liefemoebel");
        addLiegemoebel.setBounds(150, 100, 150, 30);
        addItemPanel.add(addLiegemoebel);

        //Erstellen von AddItem Button
        JButton addSitzmoebel = new JButton("Add Sitzmoebel");
        addSitzmoebel.setBounds(150, 150, 150, 30);
        addItemPanel.add(addSitzmoebel);

        //Erstellen von AddItem Button
        JButton addTische = new JButton("Add Tische");
        addTische.setBounds(150, 200, 150, 30);
        addItemPanel.add(addTische);

        //Erstellen von Back Button
        JButton back = new JButton("Back");
        back.setBounds(150, 250, 150, 30);
        back.addActionListener(e -> {
            MyFrame.addItemPanel.setVisible(false);

        });
        addItemPanel.add(back);
        addItemPanel.setLayout(null);
        addItemPanel.setBackground(Color.GRAY);
        addItemPanel.setBounds(100, 0, 1600, 900);
        addItemPanel.setVisible(false);

        return addItemPanel;

    }

}
