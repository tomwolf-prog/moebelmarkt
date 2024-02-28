package GUI;

import Lager.Lagersystem;
import Moebelhaus.Moebelhaus;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Rabatt {
    private static final JPanel setRabattPanel = new JPanel();

    private static final Lagersystem lagersystem = Moebelhaus.getLagersystem();

    //Lagerung
    private static final JLabel Beistelltischlager = new JLabel();
    private static final JLabel Kleiderschranklager = new JLabel();
    private static final JLabel Kuechenregallager = new JLabel();
    //Liegemoebel
    private static final JLabel Balkonliegelager = new JLabel();
    private static final JLabel Doppelbettlager = new JLabel();
    //Sitzmoebel
    private static final JLabel Fernsehcouch = new JLabel();
    private static final JLabel Kuechenstuhl = new JLabel();
    private static final JLabel Ohrensessel = new JLabel();
    //Tische
    private static final JLabel Buerotischlager = new JLabel();
    private static final JLabel Couchtischlager = new JLabel();
    private static final JLabel Esstischlager = new JLabel();
    private static final JLabel Kuechentischlager = new JLabel();


    private static void addLabels() {
        //Lagerung

        setRabattPanel.add(Beistelltischlager);
        Beistelltischlager.setBounds(50, 150, 175, 30);


        setRabattPanel.add(Kleiderschranklager);
        Kleiderschranklager.setBounds(50, 250, 175, 30);


        setRabattPanel.add(Kuechenregallager);
        Kuechenregallager.setBounds(50, 350, 175, 30);


        setRabattPanel.add(Balkonliegelager);
        Balkonliegelager.setBounds(300, 150, 175, 30);


        setRabattPanel.add(Doppelbettlager);
        Doppelbettlager.setBounds(300, 250, 175, 30);


        setRabattPanel.add(Fernsehcouch);
        Fernsehcouch.setBounds(500, 150, 175, 30);


        setRabattPanel.add(Kuechenstuhl);
        Kuechenstuhl.setBounds(500, 250, 175, 30);


        setRabattPanel.add(Ohrensessel);
        Ohrensessel.setBounds(500, 350, 175, 30);


        setRabattPanel.add(Buerotischlager);
        Buerotischlager.setBounds(700, 150, 175, 30);


        setRabattPanel.add(Couchtischlager);
        Couchtischlager.setBounds(700, 250, 175, 30);


        setRabattPanel.add(Esstischlager);
        Esstischlager.setBounds(700, 350, 175, 30);


        setRabattPanel.add(Kuechentischlager);
        Kuechentischlager.setBounds(700, 450, 175, 30);


    }

    public static void updateLabels() {
        //Lagerung

        Beistelltischlager.setText("Beistelltischlager: " + String.valueOf((lagersystem.getBeistelltischlager().getRabatt10())));

        Kleiderschranklager.setText("Kleiderschranklager: " + String.valueOf(lagersystem.getKleiderschranklager().getRabatt10()));

        Kuechenregallager.setText("Kuechenregallagerlager: " + String.valueOf(lagersystem.getKuechenregallager().getRabatt10()));

        Balkonliegelager.setText("Balkonliegelager: " + String.valueOf(lagersystem.getBalkonliegelager().getRabatt10()));

        Doppelbettlager.setText("Doppelbettlager: " + String.valueOf(lagersystem.getDoppelbettlager().getRabatt10()));

        Fernsehcouch.setText("Fernsehcouch: " + String.valueOf(lagersystem.getFernsehcouchlager().getRabatt10()));

        Kuechenstuhl.setText("Kuechenstuhl: " + String.valueOf(lagersystem.getKuechenstuhllager().getRabatt10()));

        Ohrensessel.setText("Ohrensessel: " + String.valueOf(lagersystem.getOhrensessellager().getRabatt10()));

        Buerotischlager.setText("Buerotischlager: " + String.valueOf(lagersystem.getBuerotischlager().getRabatt10()));

        Couchtischlager.setText("Couchtischlager: " + String.valueOf(lagersystem.getCouchtischlager().getRabatt10()));

        Esstischlager.setText("Esstischlager: " + String.valueOf(lagersystem.getEsstischlager().getRabatt10()));

        Kuechentischlager.setText("Kuechentischlager: " + String.valueOf(lagersystem.getKuechentischlager().getRabatt10()));

    }

    public void setLabels() {

    }

    public static JPanel Panel() {
        addLabels();

        JButton setLagerungPreis = new JButton("Set Lagerung Preis");
        setLagerungPreis.setBounds(50, 100, 175, 30);
        setLagerungPreis.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                boolean lagerung = lagersystem.getBeistelltischlager().getRabatt10() && lagersystem.getKleiderschranklager().getRabatt10() && lagersystem.getKuechenregallager().getRabatt10();
                lagersystem.getBeistelltischlager().setRabatt10(!lagerung);
                lagersystem.getKleiderschranklager().setRabatt10(!lagerung);
                lagersystem.getKuechenregallager().setRabatt10(!lagerung);
                updateLabels();

            }
        });
        setRabattPanel.add(setLagerungPreis);

        JButton setBeistelltischPreis = new JButton("Set Beistelltisch Preis");
        setBeistelltischPreis.setBounds(50, 200, 175, 30);
        setBeistelltischPreis.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lagersystem.getBeistelltischlager().setRabatt10(!lagersystem.getBeistelltischlager().getRabatt10());
                updateLabels();

            }
        });
        setRabattPanel.add(setBeistelltischPreis);

        JButton setKleiderschranklagerFeld = new JButton("Set Kleiderschranklager Preis");
        setKleiderschranklagerFeld.setBounds(50, 300, 175, 30);
        setKleiderschranklagerFeld.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lagersystem.getKleiderschranklager().setRabatt10(!lagersystem.getKleiderschranklager().getRabatt10());
                updateLabels();

            }
        });
        setRabattPanel.add(setKleiderschranklagerFeld);

        JButton setKuechenregallagerFeld = new JButton("Set Kuechenregallager Preis");
        setKuechenregallagerFeld.setBounds(50, 400, 175, 30);
        setKuechenregallagerFeld.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lagersystem.getKuechenregallager().setRabatt10(!lagersystem.getKuechenregallager().getRabatt10());
                updateLabels();

            }
        });
        setRabattPanel.add(setKuechenregallagerFeld);

        JButton setLiegmoebellagerFeld = new JButton("Set Liegemoebellager Preis");
        setLiegmoebellagerFeld.setBounds(300, 100, 175, 30);
        setLiegmoebellagerFeld.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                boolean liegemoebellager = lagersystem.getBalkonliegelager().getRabatt10() && lagersystem.getDoppelbettlager().getRabatt10();
                lagersystem.getBalkonliegelager().setRabatt10(!liegemoebellager);
                lagersystem.getDoppelbettlager().setRabatt10(!liegemoebellager);
                updateLabels();
            }
        });
        setRabattPanel.add(setLiegmoebellagerFeld);

        JButton setBalkonliegelagerFeld = new JButton("Set Balkonliegelager Preis");
        setBalkonliegelagerFeld.setBounds(300, 200, 175, 30);
        setBalkonliegelagerFeld.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lagersystem.getBalkonliegelager().setRabatt10(!lagersystem.getBalkonliegelager().getRabatt10());
                updateLabels();
            }
        });
        setRabattPanel.add(setBalkonliegelagerFeld);

        JButton setDoppelbettlagerFeld = new JButton("Set Doppelbettlager Preis");
        setDoppelbettlagerFeld.setBounds(300, 300, 175, 30);
        setDoppelbettlagerFeld.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lagersystem.getDoppelbettlager().setRabatt10(!lagersystem.getDoppelbettlager().getRabatt10());
                updateLabels();
            }
        });
        setRabattPanel.add(setDoppelbettlagerFeld);

        JButton setSitzmoebelFeld = new JButton("Set Sitzmoebel Preis");
        setSitzmoebelFeld.setBounds(500, 100, 175, 30);
        setSitzmoebelFeld.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                boolean sitzmoebel = lagersystem.getFernsehcouchlager().getRabatt10() && lagersystem.getKuechenstuhllager().getRabatt10() && lagersystem.getOhrensessellager().getRabatt10();
                lagersystem.getFernsehcouchlager().setRabatt10(!sitzmoebel);
                lagersystem.getKuechenstuhllager().setRabatt10(!sitzmoebel);
                lagersystem.getOhrensessellager().setRabatt10(!sitzmoebel);

                updateLabels();
            }
        });
        setRabattPanel.add(setSitzmoebelFeld);

        JButton setFernsehcouchFeld = new JButton("Set Fernsehcouch Preis");
        setFernsehcouchFeld.setBounds(500, 200, 175, 30);
        setFernsehcouchFeld.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lagersystem.getFernsehcouchlager().setRabatt10(!lagersystem.getFernsehcouchlager().getRabatt10());
                updateLabels();
            }
        });
        setRabattPanel.add(setFernsehcouchFeld);

        JButton setKuechenstuhlFeld = new JButton("Set Kuechenstuhl Preis");
        setKuechenstuhlFeld.setBounds(500, 300, 175, 30);
        setKuechenstuhlFeld.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lagersystem.getKuechenstuhllager().setRabatt10(!lagersystem.getKuechenstuhllager().getRabatt10());
                updateLabels();
            }
        });
        setRabattPanel.add(setKuechenstuhlFeld);

        JButton setOhrensesselFeld = new JButton("Set Ohrensessel Preis");
        setOhrensesselFeld.setBounds(500, 400, 175, 30);
        setOhrensesselFeld.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lagersystem.getOhrensessellager().setRabatt10(!lagersystem.getOhrensessellager().getRabatt10());
                updateLabels();
            }
        });
        setRabattPanel.add(setOhrensesselFeld);

        JButton setTischeFeld = new JButton("Set Tische Preis");
        setTischeFeld.setBounds(700, 100, 175, 30);
        setTischeFeld.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                boolean tische = lagersystem.getBuerotischlager().getRabatt10() && lagersystem.getCouchtischlager().getRabatt10() && lagersystem.getEsstischlager().getRabatt10() && lagersystem.getKuechentischlager().getRabatt10();
                lagersystem.getBuerotischlager().setRabatt10(!tische);
                lagersystem.getCouchtischlager().setRabatt10(!tische);
                lagersystem.getEsstischlager().setRabatt10(!tische);
                lagersystem.getKuechentischlager().setRabatt10(!tische);
                updateLabels();
            }
        });
        setRabattPanel.add(setTischeFeld);

        JButton setBuerotischlagerFeld = new JButton("Set Buerotischlager Preis");
        setBuerotischlagerFeld.setBounds(700, 200, 175, 30);
        setBuerotischlagerFeld.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lagersystem.getBuerotischlager().setRabatt10(!lagersystem.getBuerotischlager().getRabatt10());
                updateLabels();
            }
        });
        setRabattPanel.add(setBuerotischlagerFeld);

        JButton setCouchtischlagerFeld = new JButton("Set Couchtischlager Preis");
        setCouchtischlagerFeld.setBounds(700, 300, 175, 30);
        setCouchtischlagerFeld.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lagersystem.getCouchtischlager().setRabatt10(!lagersystem.getCouchtischlager().getRabatt10());
                updateLabels();
            }
        });
        setRabattPanel.add(setCouchtischlagerFeld);

        JButton setEsstischlagerFeld = new JButton("Set Esstischlager Preis");
        setEsstischlagerFeld.setBounds(700, 400, 175, 30);
        setEsstischlagerFeld.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lagersystem.getEsstischlager().setRabatt10(!lagersystem.getEsstischlager().getRabatt10());
                updateLabels();
            }
        });
        setRabattPanel.add(setEsstischlagerFeld);

        JButton setKuechentischlagerFeld = new JButton("Set Kuechentischlager Preis");
        setKuechentischlagerFeld.setBounds(700, 500, 175, 30);
        setKuechentischlagerFeld.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lagersystem.getKuechentischlager().setRabatt10(!lagersystem.getKuechentischlager().getRabatt10());
                updateLabels();
            }
        });
        setRabattPanel.add(setKuechentischlagerFeld);

        //Erstellen von Back Button
        JButton back = new JButton("Back");
        back.setBounds(100, 700, 150, 30);
        back.addActionListener(e -> {
            MyFrame.rabattPanel.setVisible(false);

        });
        setRabattPanel.add(back);
        setRabattPanel.setLayout(null);
        setRabattPanel.setBackground(Color.WHITE);
        setRabattPanel.setBounds(105, 0, 1600, 900);
        setRabattPanel.setVisible(false);

        return setRabattPanel;
    }
}
