package GUI.Tische;

import GUI.MyFrame;
import Kategorie.Tische;
import Lager.Lagersystem;
import Moebelhaus.Moebelhaus;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddEsstischPanel {

    private static final JPanel addEsstischPanel = new JPanel();
    private static final Lagersystem lagersystem = Moebelhaus.getLagersystem();
    //Erstellen des Frame

    public static JPanel Panel() {

        JTextField t1 = new JTextField("1");
        t1.setBounds(400, 50, 30, 30);
        addEsstischPanel.add(t1);
        //Erstellen von AddItem Button
        JButton addEsstischS = new JButton("Add Esstisch S");
        addEsstischS.setBounds(150, 50, 175, 30);
        addEsstischS.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = t1.getText();
                int i1;
                try {
                    i1 = Integer.parseInt(String.valueOf(text));
                } catch (NumberFormatException a) {
                    i1 = 0;
                }
                lagersystem.erhoeheEsstischlagerLagerbestand(i1, Tische.Hoehe.l);

            }
        });
        addEsstischPanel.add(addEsstischS);

        JTextField t2 = new JTextField("1");
        t2.setBounds(400, 100, 30, 30);
        addEsstischPanel.add(t2);
        //Erstellen von AddItem Button
        JButton addEsstischM = new JButton("Add Esstisch M");
        addEsstischM.setBounds(150, 100, 175, 30);
        addEsstischM.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = t2.getText();
                int i1;
                try {
                    i1 = Integer.parseInt(String.valueOf(text));
                } catch (NumberFormatException a) {
                    i1 = 0;
                }
                lagersystem.erhoeheEsstischlagerLagerbestand(i1, Tische.Hoehe.l);

            }
        });
        addEsstischPanel.add(addEsstischM);

        JTextField t3 = new JTextField("1");
        t3.setBounds(400, 150, 30, 30);
        addEsstischPanel.add(t3);
        //Erstellen von AddItem Button
        JButton addEsstischL = new JButton("Add Esstisch L");
        addEsstischL.setBounds(150, 150, 175, 30);
        addEsstischL.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = t3.getText();
                int i1;
                try {
                    i1 = Integer.parseInt(String.valueOf(text));
                } catch (NumberFormatException a) {
                    i1 = 0;
                }
                lagersystem.erhoeheEsstischlagerLagerbestand(i1, Tische.Hoehe.l);

            }
        });
        addEsstischPanel.add(addEsstischL);


        //Erstellen von Back Button
        JButton back = new JButton("Back");
        back.setBounds(150, 200, 175, 30);
        back.addActionListener(e -> {
            MyFrame.addEsstischPanel.setVisible(false);
            MyFrame.addTischePanel.setVisible(true);
        });
        addEsstischPanel.add(back);

        addEsstischPanel.add(back);
        addEsstischPanel.setLayout(null);
        addEsstischPanel.setBackground(Color.GRAY);
        addEsstischPanel.setBounds(100, 0, 1600, 900);
        addEsstischPanel.setVisible(false);


        return addEsstischPanel;

    }
}
