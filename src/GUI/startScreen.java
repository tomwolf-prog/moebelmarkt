package GUI;

import Lager.Lagersystem;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class startScreen {
    public static void start(Lagersystem lagersystem) {
        //Erstellen des Frame
        JFrame f = new JFrame("Button Example");

        //Erstellen von AddItem Button
        JButton addItem=new JButton("Add Item");
        addItem.setBounds(150,200,95,30);
        addItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addItemScreen.Screen(lagersystem);
                f.dispose();
            }
        });
        f.add(addItem);

        //Erstellen von Exit Button
        JButton exit=new JButton("Exit");
        exit.setBounds(150,300,95,30);
        exit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                f.dispose();
            }
        });
        f.add(exit);

        f.setSize(1600,900);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
