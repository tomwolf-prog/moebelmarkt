package GUI;

import javax.swing.*;
import java.awt.*;

public class Frame {

    public static JFrame baseFrame() {
        JFrame frame = new JFrame("Möbelhaus");

        frame.setSize(1600, 900);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Erstellen von AddItem Button
        JButton addItem = new JButton("Add Item");
        addItem.setBounds(5, 755, 95, 30);
        addItem.addActionListener(e -> {
            AddItemScreen.Screen();
            frame.dispose();
        });
        frame.add(addItem);

        //Erstellen von Home Button
        JButton home = new JButton("Home");
        home.setBounds(5, 790, 95, 30);
        home.addActionListener(e -> {
            StartScreen.start();
            frame.dispose();
        });
        frame.add(home);

        //Erstellen von Exit Button
        JButton exit = new JButton("Exit");
        exit.setBounds(5, 825, 95, 30);
        exit.addActionListener(e -> {
            int confirmed = JOptionPane.showConfirmDialog(frame,
                    "Are you sure you want to quit?", "Confirm quit",
                    JOptionPane.YES_NO_OPTION);
            if (confirmed == JOptionPane.YES_OPTION) {
                // clean up code
                System.exit(0);
            }
        });
        frame.add(exit);

        frame.setSize(1600, 900);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 105, 1500);
        panel.setBackground(Color.lightGray);
        frame.add(panel);

        return frame;

    }

    public static JFrame startFrame() {
        JFrame frame = new JFrame("Möbelhaus");

        frame.setSize(1600, 900);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Erstellen von Exit Button
        JButton exit = new JButton("Exit");
        exit.setBounds(5, 825, 95, 30);
        exit.addActionListener(e -> {
            int confirmed = JOptionPane.showConfirmDialog(frame,
                    "Are you sure you want to quit?", "Confirm quit",
                    JOptionPane.YES_NO_OPTION);
            if (confirmed == JOptionPane.YES_OPTION) {
                // clean up code
                System.exit(0);
            }
        });
        frame.add(exit);

        frame.setSize(1600, 900);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 105, 1500);
        panel.setBackground(Color.lightGray);
        frame.add(panel, Integer.valueOf(0));

        return frame;


    }
}
