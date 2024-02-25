package GUI;

import javax.swing.*;
import java.awt.*;

public class MyFrame {

    static JFrame frame;

    static JPanel addItemPanel = AddItemPanel.Panel();

    static

    private void addPanels() {
        frame.add(addItemPanel);
        addItemPanel.setVisible(false);
    }

    public static JFrame baseFrame() {
        frame = new JFrame("Möbelhaus");
        addItemPanel.setBounds(100, 0, 1600, 900);

        addPanels();

        frame.setSize(1600, 900);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);

        //Erstellen von AddItem Button
        JButton addItem = new JButton("Add Item Panel");
        addItem.setBounds(5, 755, 95, 30);
        addItem.addActionListener(e -> {
            addItemPanel.setVisible(true);
        });
        frame.add(addItem);

        //Erstellen von Home Button
        JButton home = new JButton("Home");
        home.setBounds(5, 790, 95, 30);
        home.addActionListener(e -> {

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
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 105, 1500);
        panel.setBackground(Color.lightGray);
        frame.add(panel);

        return frame;

    }

}
