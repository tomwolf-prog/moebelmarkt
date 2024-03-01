package GUI;

import Lager.Lagersystem;
import Moebelhaus.Moebelhaus;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RabattPanel {
    private static final JPanel setRabattPanel = new JPanel();

    private static final Lagersystem lagersystem = Moebelhaus.getLagersystem();

    //Lagerung
    private static final JLabel beistelltischlager = new JLabel();
    private static final JLabel kleiderschranklager = new JLabel();
    private static final JLabel kuechenregallager = new JLabel();
    //Liegemoebel
    private static final JLabel balkonliegelager = new JLabel();
    private static final JLabel doppelbettlager = new JLabel();
    //Sitzmoebel
    private static final JLabel fernsehcouch = new JLabel();
    private static final JLabel kuechenstuhl = new JLabel();
    private static final JLabel ohrensessel = new JLabel();
    //Tische
    private static final JLabel buerotischlager = new JLabel();
    private static final JLabel couchtischlager = new JLabel();
    private static final JLabel esstischlager = new JLabel();
    private static final JLabel kuechentischlager = new JLabel();


    private static void addLabels() {
        //Lagerung

        setRabattPanel.add(beistelltischlager);
        beistelltischlager.setBounds(50, 150, 215, 30);


        setRabattPanel.add(kleiderschranklager);
        kleiderschranklager.setBounds(50, 250, 215, 30);


        setRabattPanel.add(kuechenregallager);
        kuechenregallager.setBounds(50, 350, 215, 30);


        setRabattPanel.add(balkonliegelager);
        balkonliegelager.setBounds(400, 150, 215, 30);


        setRabattPanel.add(doppelbettlager);
        doppelbettlager.setBounds(400, 250, 215, 30);


        setRabattPanel.add(fernsehcouch);
        fernsehcouch.setBounds(750, 150, 215, 30);


        setRabattPanel.add(kuechenstuhl);
        kuechenstuhl.setBounds(750, 250, 215, 30);


        setRabattPanel.add(ohrensessel);
        ohrensessel.setBounds(750, 350, 215, 30);


        setRabattPanel.add(buerotischlager);
        buerotischlager.setBounds(1100, 150, 215, 30);


        setRabattPanel.add(couchtischlager);
        couchtischlager.setBounds(1100, 250, 215, 30);


        setRabattPanel.add(esstischlager);
        esstischlager.setBounds(1100, 350, 215, 30);


        setRabattPanel.add(kuechentischlager);
        kuechentischlager.setBounds(1100, 450, 215, 30);


    }

    public static void updateLabels() {
        //Lagerung

        beistelltischlager.setText("Beistelltischlager: " + String.valueOf((lagersystem.getBeistelltischlager().getRabatt10())));

        kleiderschranklager.setText("Kleiderschranklager: " + String.valueOf(lagersystem.getKleiderschranklager().getRabatt10()));

        kuechenregallager.setText("Kuechenregallagerlager: " + String.valueOf(lagersystem.getKuechenregallager().getRabatt10()));

        balkonliegelager.setText("Balkonliegelager: " + String.valueOf(lagersystem.getBalkonliegelager().getRabatt10()));

        doppelbettlager.setText("Doppelbettlager: " + String.valueOf(lagersystem.getDoppelbettlager().getRabatt10()));

        fernsehcouch.setText("Fernsehcouch: " + String.valueOf(lagersystem.getFernsehcouchlager().getRabatt10()));

        kuechenstuhl.setText("Kuechenstuhl: " + String.valueOf(lagersystem.getKuechenstuhllager().getRabatt10()));

        ohrensessel.setText("Ohrensessel: " + String.valueOf(lagersystem.getOhrensessellager().getRabatt10()));

        buerotischlager.setText("Buerotischlager: " + String.valueOf(lagersystem.getBuerotischlager().getRabatt10()));

        couchtischlager.setText("Couchtischlager: " + String.valueOf(lagersystem.getCouchtischlager().getRabatt10()));

        esstischlager.setText("Esstischlager: " + String.valueOf(lagersystem.getEsstischlager().getRabatt10()));

        kuechentischlager.setText("Kuechentischlager: " + String.valueOf(lagersystem.getKuechentischlager().getRabatt10()));

    }

    public void setLabels() {

    }

    public static JPanel Panel() {
        addLabels();

        JButton setLagerungPreis = new JButton("Set Lagerung Rabatt");
        setLagerungPreis.setBounds(50, 100, 215, 30);
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

        JButton setBeistelltischPreis = new JButton("Set Beistelltisch Rabatt");
        setBeistelltischPreis.setBounds(50, 200, 215, 30);
        setBeistelltischPreis.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lagersystem.getBeistelltischlager().setRabatt10(!lagersystem.getBeistelltischlager().getRabatt10());
                updateLabels();

            }
        });
        setRabattPanel.add(setBeistelltischPreis);

        JButton setKleiderschranklagerFeld = new JButton("Set Kleiderschranklager Rabatt");
        setKleiderschranklagerFeld.setBounds(50, 300, 215, 30);
        setKleiderschranklagerFeld.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lagersystem.getKleiderschranklager().setRabatt10(!lagersystem.getKleiderschranklager().getRabatt10());
                updateLabels();

            }
        });
        setRabattPanel.add(setKleiderschranklagerFeld);

        JButton setKuechenregallagerFeld = new JButton("Set Kuechenregallager Rabatt");
        setKuechenregallagerFeld.setBounds(50, 400, 215, 30);
        setKuechenregallagerFeld.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lagersystem.getKuechenregallager().setRabatt10(!lagersystem.getKuechenregallager().getRabatt10());
                updateLabels();

            }
        });
        setRabattPanel.add(setKuechenregallagerFeld);

        JButton setLiegmoebellagerFeld = new JButton("Set Liegemoebellager Rabatt");
        setLiegmoebellagerFeld.setBounds(400, 100, 215, 30);
        setLiegmoebellagerFeld.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                boolean liegemoebellager = lagersystem.getBalkonliegelager().getRabatt10() && lagersystem.getDoppelbettlager().getRabatt10();
                lagersystem.getBalkonliegelager().setRabatt10(!liegemoebellager);
                lagersystem.getDoppelbettlager().setRabatt10(!liegemoebellager);
                updateLabels();
            }
        });
        setRabattPanel.add(setLiegmoebellagerFeld);

        JButton setBalkonliegelagerFeld = new JButton("Set Balkonliegelager Rabatt");
        setBalkonliegelagerFeld.setBounds(400, 200, 215, 30);
        setBalkonliegelagerFeld.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lagersystem.getBalkonliegelager().setRabatt10(!lagersystem.getBalkonliegelager().getRabatt10());
                updateLabels();
            }
        });
        setRabattPanel.add(setBalkonliegelagerFeld);

        JButton setDoppelbettlagerFeld = new JButton("Set Doppelbettlager Rabatt");
        setDoppelbettlagerFeld.setBounds(400, 300, 215, 30);
        setDoppelbettlagerFeld.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lagersystem.getDoppelbettlager().setRabatt10(!lagersystem.getDoppelbettlager().getRabatt10());
                updateLabels();
            }
        });
        setRabattPanel.add(setDoppelbettlagerFeld);

        JButton setSitzmoebelFeld = new JButton("Set Sitzmoebel Rabatt");
        setSitzmoebelFeld.setBounds(750, 100, 215, 30);
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

        JButton setFernsehcouchFeld = new JButton("Set Fernsehcouch Rabatt");
        setFernsehcouchFeld.setBounds(750, 200, 215, 30);
        setFernsehcouchFeld.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lagersystem.getFernsehcouchlager().setRabatt10(!lagersystem.getFernsehcouchlager().getRabatt10());
                updateLabels();
            }
        });
        setRabattPanel.add(setFernsehcouchFeld);

        JButton setKuechenstuhlFeld = new JButton("Set Kuechenstuhl Rabatt");
        setKuechenstuhlFeld.setBounds(750, 300, 215, 30);
        setKuechenstuhlFeld.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lagersystem.getKuechenstuhllager().setRabatt10(!lagersystem.getKuechenstuhllager().getRabatt10());
                updateLabels();
            }
        });
        setRabattPanel.add(setKuechenstuhlFeld);

        JButton setOhrensesselFeld = new JButton("Set Ohrensessel Rabatt");
        setOhrensesselFeld.setBounds(750, 400, 215, 30);
        setOhrensesselFeld.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lagersystem.getOhrensessellager().setRabatt10(!lagersystem.getOhrensessellager().getRabatt10());
                updateLabels();
            }
        });
        setRabattPanel.add(setOhrensesselFeld);

        JButton setTischeFeld = new JButton("Set Tische Rabatt");
        setTischeFeld.setBounds(1100, 100, 215, 30);
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

        JButton setBuerotischlagerFeld = new JButton("Set Buerotischlager Rabatt");
        setBuerotischlagerFeld.setBounds(1100, 200, 215, 30);
        setBuerotischlagerFeld.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lagersystem.getBuerotischlager().setRabatt10(!lagersystem.getBuerotischlager().getRabatt10());
                updateLabels();
            }
        });
        setRabattPanel.add(setBuerotischlagerFeld);

        JButton setCouchtischlagerFeld = new JButton("Set Couchtischlager Rabatt");
        setCouchtischlagerFeld.setBounds(1100, 300, 215, 30);
        setCouchtischlagerFeld.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lagersystem.getCouchtischlager().setRabatt10(!lagersystem.getCouchtischlager().getRabatt10());
                updateLabels();
            }
        });
        setRabattPanel.add(setCouchtischlagerFeld);

        JButton setEsstischlagerFeld = new JButton("Set Esstischlager Rabatt");
        setEsstischlagerFeld.setBounds(1100, 400, 215, 30);
        setEsstischlagerFeld.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lagersystem.getEsstischlager().setRabatt10(!lagersystem.getEsstischlager().getRabatt10());
                updateLabels();
            }
        });
        setRabattPanel.add(setEsstischlagerFeld);

        JButton setKuechentischlagerFeld = new JButton("Set Kuechentischlager Rabatt");
        setKuechentischlagerFeld.setBounds(1100, 500, 215, 30);
        setKuechentischlagerFeld.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lagersystem.getKuechentischlager().setRabatt10(!lagersystem.getKuechentischlager().getRabatt10());
                updateLabels();
            }
        });
        setRabattPanel.add(setKuechentischlagerFeld);

        //Erstellen von Back Button
        JButton back = new JButton("Back");
        back.setBounds(100, 701, 150, 30);
        back.addActionListener(e -> {
            Frame.setAllPanelsInvisible();
            Frame.setAllHomeButtonsVisible();

        });
        setRabattPanel.add(back);
        setRabattPanel.setLayout(null);
        setRabattPanel.setBackground(Color.WHITE);
        setRabattPanel.setBounds(105, 0, 1600, 900);
        setRabattPanel.setVisible(false);

        return setRabattPanel;
    }
}
