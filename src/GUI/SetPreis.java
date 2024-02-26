package GUI;

import Lager.Lagersystem;
import Moebelhaus.Moebelhaus;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SetPreis {
    private static final JPanel setPreisPanel = new JPanel();

    private static final Lagersystem lagersystem = Moebelhaus.getLagersystem();

    //Lagerung
    private static final JLabel Beistelltischlager = new JLabel();
    private static final JTextField BeistelltischlagerFeld = new JTextField("1");
    private static final JLabel Kleiderschranklager = new JLabel();
    private static final JTextField KleiderschranklagerFeld = new JTextField("1");
    private static final JLabel Kuechenregallager = new JLabel();
    private static final JTextField KuechenregallagerFeld = new JTextField("1");
    //Liegemoebel
    private static final JLabel Balkonliegelager = new JLabel();
    private static final JTextField BalkonliegelagerFeld = new JTextField("1");
    private static final JLabel Doppelbettlager = new JLabel();
    private static final JTextField DoppelbettlagerFeld = new JTextField("1");    //Sitzmoebel
    private static final JLabel Fernsehcouch = new JLabel();
    private static final JTextField FernsehcouchFeld = new JTextField("1");
    private static final JLabel Kuechenstuhl = new JLabel();
    private static final JTextField KuechenstuhlFeld = new JTextField("1");
    private static final JLabel Ohrensessel = new JLabel();
    private static final JTextField OhrensesselFeld = new JTextField("1");
    //Tische
    private static final JLabel Buerotischlager = new JLabel();
    private static final JTextField BuerotischlagerFeld = new JTextField("1");
    private static final JLabel Couchtischlager = new JLabel();
    private static final JTextField CouchtischlagerFeld = new JTextField("1");
    private static final JLabel Esstischlager = new JLabel();
    private static final JTextField EsstischlagerFeld = new JTextField("1");
    private static final JLabel Kuechentischlager = new JLabel();
    private static final JTextField KuechentischlagerFeld = new JTextField("1");


    private static void addLabels() {
        //Lagerung

        setPreisPanel.add(Beistelltischlager);
        Beistelltischlager.setBounds(50, 50, 175, 30);
        BeistelltischlagerFeld.setBounds(50, 100, 175, 30);
        setPreisPanel.add(BeistelltischlagerFeld);

        setPreisPanel.add(Kleiderschranklager);
        Kleiderschranklager.setBounds(50, 200, 175, 30);
        KleiderschranklagerFeld.setBounds(50, 250, 175, 30);
        setPreisPanel.add(KleiderschranklagerFeld);

        setPreisPanel.add(Kuechenregallager);
        Kuechenregallager.setBounds(50, 350, 175, 30);
        KuechenregallagerFeld.setBounds(50, 400, 175, 30);
        setPreisPanel.add(KuechenregallagerFeld);


        setPreisPanel.add(Balkonliegelager);
        Balkonliegelager.setBounds(300, 50, 175, 30);
        BalkonliegelagerFeld.setBounds(300, 100, 175, 30);
        setPreisPanel.add(BalkonliegelagerFeld);


        setPreisPanel.add(Doppelbettlager);
        Doppelbettlager.setBounds(300, 200, 175, 30);
        DoppelbettlagerFeld.setBounds(300, 250, 175, 30);
        setPreisPanel.add(DoppelbettlagerFeld);


        setPreisPanel.add(Fernsehcouch);
        Fernsehcouch.setBounds(500, 50, 175, 30);
        FernsehcouchFeld.setBounds(500, 100, 175, 30);
        setPreisPanel.add(FernsehcouchFeld);


        setPreisPanel.add(Kuechenstuhl);
        Kuechenstuhl.setBounds(500, 200, 175, 30);
        KuechenstuhlFeld.setBounds(500, 250, 175, 30);
        setPreisPanel.add(KuechenstuhlFeld);


        setPreisPanel.add(Ohrensessel);
        Ohrensessel.setBounds(500, 350, 175, 30);
        OhrensesselFeld.setBounds(500, 400, 175, 30);
        setPreisPanel.add(OhrensesselFeld);


        setPreisPanel.add(Buerotischlager);
        Buerotischlager.setBounds(700, 50, 175, 30);
        BuerotischlagerFeld.setBounds(700, 100, 175, 30);
        setPreisPanel.add(BuerotischlagerFeld);


        setPreisPanel.add(Couchtischlager);
        Couchtischlager.setBounds(700, 200, 175, 30);
        CouchtischlagerFeld.setBounds(700, 250, 175, 30);
        setPreisPanel.add(CouchtischlagerFeld);


        setPreisPanel.add(Esstischlager);
        Esstischlager.setBounds(700, 350, 175, 30);
        EsstischlagerFeld.setBounds(700, 400, 175, 30);
        setPreisPanel.add(EsstischlagerFeld);


        setPreisPanel.add(Kuechentischlager);
        Kuechentischlager.setBounds(700, 500, 175, 30);
        KuechentischlagerFeld.setBounds(700, 550, 175, 30);
        setPreisPanel.add(KuechentischlagerFeld);


    }

    public static void updateLabels() {
        //Lagerung

        Beistelltischlager.setText("Beistelltischlager: " + String.valueOf((lagersystem.getBeistelltischlager().getPreis())));

        Kleiderschranklager.setText("Kleiderschranklager: " + String.valueOf(lagersystem.getKleiderschranklager().getPreis()));

        Kuechenregallager.setText("Kuechenregallagerlager: " + String.valueOf(lagersystem.getKuechenregallager().getPreis()));

        Balkonliegelager.setText("Balkonliegelager: " + String.valueOf(lagersystem.getBalkonliegelager().getPreis()));

        Doppelbettlager.setText("Doppelbettlager: " + String.valueOf(lagersystem.getDoppelbettlager().getPreis()));

        Fernsehcouch.setText("Fernsehcouch: " + String.valueOf(lagersystem.getFernsehcouchlager().getPreis()));

        Kuechenstuhl.setText("Kuechenstuhl: " + String.valueOf(lagersystem.getKuechenstuhllager().getPreis()));

        Ohrensessel.setText("Ohrensessel: " + String.valueOf(lagersystem.getOhrensessellager().getPreis()));

        Buerotischlager.setText("Buerotischlager: " + String.valueOf(lagersystem.getBuerotischlager().getPreis()));

        Couchtischlager.setText("Couchtischlager: " + String.valueOf(lagersystem.getCouchtischlager().getPreis()));

        Esstischlager.setText("Esstischlager: " + String.valueOf(lagersystem.getEsstischlager().getPreis()));

        Kuechentischlager.setText("Kuechentischlager: " + String.valueOf(lagersystem.getKuechentischlager().getPreis()));

    }

    public void setLabels() {

    }

    public static JPanel Panel() {
        addLabels();

        JButton setBeistelltischPreis = new JButton("Set Beistelltisch Preis");
        setBeistelltischPreis.setBounds(50, 150, 175, 30);
        setBeistelltischPreis.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = BeistelltischlagerFeld.getText();
                int i1;
                try {
                    i1 = Integer.parseInt(String.valueOf(text));
                } catch (NumberFormatException a) {
                    i1 = 0;
                }
                lagersystem.getBeistelltischlager().setPreis(i1);
                updateLabels();
            }
        });
        setPreisPanel.add(setBeistelltischPreis);

        JButton setKleiderschranklagerFeld = new JButton("Set Kleiderschranklager Preis");
        setKleiderschranklagerFeld.setBounds(50, 300, 175, 30);
        setKleiderschranklagerFeld.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = KleiderschranklagerFeld.getText();
                int i1;
                try {
                    i1 = Integer.parseInt(String.valueOf(text));
                } catch (NumberFormatException a) {
                    i1 = 0;
                }
                lagersystem.getKleiderschranklager().setPreis(i1);
                updateLabels();
            }
        });
        setPreisPanel.add(setKleiderschranklagerFeld);

        JButton setKuechenregallagerFeld = new JButton("Set Kuechenregallager Preis");
        setKuechenregallagerFeld.setBounds(50, 450, 175, 30);
        setKuechenregallagerFeld.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = KuechenregallagerFeld.getText();
                int i1;
                try {
                    i1 = Integer.parseInt(String.valueOf(text));
                } catch (NumberFormatException a) {
                    i1 = 0;
                }
                lagersystem.getKuechenregallager().setPreis(i1);
                updateLabels();
            }
        });
        setPreisPanel.add(setKuechenregallagerFeld);

        JButton setBalkonliegelagerFeld = new JButton("Set Balkonliegelager Preis");
        setBalkonliegelagerFeld.setBounds(300, 150, 175, 30);
        setBalkonliegelagerFeld.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = BalkonliegelagerFeld.getText();
                int i1;
                try {
                    i1 = Integer.parseInt(String.valueOf(text));
                } catch (NumberFormatException a) {
                    i1 = 0;
                }
                lagersystem.getBalkonliegelager().setPreis(i1);
                updateLabels();
            }
        });
        setPreisPanel.add(setBalkonliegelagerFeld);

        JButton setDoppelbettlagerFeld = new JButton("Set Doppelbettlager Preis");
        setDoppelbettlagerFeld.setBounds(300, 300, 175, 30);
        setDoppelbettlagerFeld.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = DoppelbettlagerFeld.getText();
                int i1;
                try {
                    i1 = Integer.parseInt(String.valueOf(text));
                } catch (NumberFormatException a) {
                    i1 = 0;
                }
                lagersystem.getDoppelbettlager().setPreis(i1);
                updateLabels();
            }
        });
        setPreisPanel.add(setDoppelbettlagerFeld);

        JButton setFernsehcouchFeld = new JButton("Set Fernsehcouch Preis");
        setFernsehcouchFeld.setBounds(500, 150, 175, 30);
        setFernsehcouchFeld.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = FernsehcouchFeld.getText();
                int i1;
                try {
                    i1 = Integer.parseInt(String.valueOf(text));
                } catch (NumberFormatException a) {
                    i1 = 0;
                }
                lagersystem.getFernsehcouchlager().setPreis(i1);
                updateLabels();
            }
        });
        setPreisPanel.add(setFernsehcouchFeld);

        JButton setKuechenstuhlFeld = new JButton("Set Kuechenstuhl Preis");
        setKuechenstuhlFeld.setBounds(500, 300, 175, 30);
        setKuechenstuhlFeld.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = KuechenstuhlFeld.getText();
                int i1;
                try {
                    i1 = Integer.parseInt(String.valueOf(text));
                } catch (NumberFormatException a) {
                    i1 = 0;
                }
                lagersystem.getKuechenstuhllager().setPreis(i1);
                updateLabels();
            }
        });
        setPreisPanel.add(setKuechenstuhlFeld);

        JButton setOhrensesselFeld = new JButton("Set Ohrensessel Preis");
        setOhrensesselFeld.setBounds(500, 450, 175, 30);
        setOhrensesselFeld.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = OhrensesselFeld.getText();
                int i1;
                try {
                    i1 = Integer.parseInt(String.valueOf(text));
                } catch (NumberFormatException a) {
                    i1 = 0;
                }
                lagersystem.getOhrensessellager().setPreis(i1);
                updateLabels();
            }
        });
        setPreisPanel.add(setOhrensesselFeld);

        JButton setBuerotischlagerFeld = new JButton("Set Buerotischlager Preis");
        setBuerotischlagerFeld.setBounds(700, 150, 175, 30);
        setBuerotischlagerFeld.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = BuerotischlagerFeld.getText();
                int i1;
                try {
                    i1 = Integer.parseInt(String.valueOf(text));
                } catch (NumberFormatException a) {
                    i1 = 0;
                }
                lagersystem.getBuerotischlager().setPreis(i1);
                updateLabels();
            }
        });
        setPreisPanel.add(setBuerotischlagerFeld);

        JButton setCouchtischlagerFeld = new JButton("Set Couchtischlager Preis");
        setCouchtischlagerFeld.setBounds(700, 300, 175, 30);
        setCouchtischlagerFeld.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = CouchtischlagerFeld.getText();
                int i1;
                try {
                    i1 = Integer.parseInt(String.valueOf(text));
                } catch (NumberFormatException a) {
                    i1 = 0;
                }
                lagersystem.getCouchtischlager().setPreis(i1);
                updateLabels();
            }
        });
        setPreisPanel.add(setCouchtischlagerFeld);

        JButton setEsstischlagerFeld = new JButton("Set Esstischlager Preis");
        setEsstischlagerFeld.setBounds(700, 450, 175, 30);
        setEsstischlagerFeld.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = EsstischlagerFeld.getText();
                int i1;
                try {
                    i1 = Integer.parseInt(String.valueOf(text));
                } catch (NumberFormatException a) {
                    i1 = 0;
                }
                lagersystem.getEsstischlager().setPreis(i1);
                updateLabels();
            }
        });
        setPreisPanel.add(setEsstischlagerFeld);

        JButton setKuechentischlagerFeld = new JButton("Set Kuechentischlager Preis");
        setKuechentischlagerFeld.setBounds(700, 600, 175, 30);
        setKuechentischlagerFeld.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = KuechentischlagerFeld.getText();
                int i1;
                try {
                    i1 = Integer.parseInt(String.valueOf(text));
                } catch (NumberFormatException a) {
                    i1 = 0;
                }
                lagersystem.getKuechentischlager().setPreis(i1);
                updateLabels();
            }
        });
        setPreisPanel.add(setKuechentischlagerFeld);

        //Erstellen von Back Button
        JButton back = new JButton("Back");
        back.setBounds(100, 700, 150, 30);
        back.addActionListener(e -> {
            MyFrame.lagerbestandPanel.setVisible(false);

        });
        setPreisPanel.add(back);
        setPreisPanel.setLayout(null);
        setPreisPanel.setBackground(Color.WHITE);
        setPreisPanel.setBounds(100, 0, 1600, 900);
        setPreisPanel.setVisible(false);

        return setPreisPanel;
    }
}
