package GUI;

import Lager.Lagersystem;
import Moebelhaus.Moebelhaus;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;

public class SetVerkaufspreisPanel {
    private static final JPanel setPreisPanel = new JPanel();

    private static final Lagersystem lagersystem = Moebelhaus.getLagersystem();

    //Lagerung
    private static final JTextArea beistelltischlager = new JTextArea();
    private static final JTextField beistelltischlagerFeld = new JTextField("1");
    private static final JTextArea kleiderschranklager = new JTextArea();
    private static final JTextField kleiderschranklagerFeld = new JTextField("1");
    private static final JTextArea kuechenregallager = new JTextArea();
    private static final JTextField kuechenregallagerFeld = new JTextField("1");
    //Liegemoebel
    private static final JTextArea balkonliegelager = new JTextArea();
    private static final JTextField balkonliegelagerFeld = new JTextField("1");
    private static final JTextArea doppelbettlager = new JTextArea();
    private static final JTextField doppelbettlagerFeld = new JTextField("1");    //Sitzmoebel
    private static final JTextArea fernsehcouch = new JTextArea();
    private static final JTextField fernsehcouchFeld = new JTextField("1");
    private static final JTextArea Kuechenstuhl = new JTextArea();
    private static final JTextField KuechenstuhlFeld = new JTextField("1");
    private static final JTextArea ohrensessel = new JTextArea();
    private static final JTextField ohrensesselFeld = new JTextField("1");
    //Tische
    private static final JTextArea buerotischlager = new JTextArea();
    private static final JTextField buerotischlagerFeld = new JTextField("1");
    private static final JTextArea couchtischlager = new JTextArea();
    private static final JTextField couchtischlagerFeld = new JTextField("1");
    private static final JTextArea esstischlager = new JTextArea();
    private static final JTextField esstischlagerFeld = new JTextField("1");
    private static final JTextArea kuechentischlager = new JTextArea();
    private static final JTextField kuechentischlagerFeld = new JTextField("1");


    private static void addLabels() {
        //Lagerung

        setPreisPanel.add(beistelltischlager);
        beistelltischlager.setBounds(50, 50, 175, 60);
        beistelltischlagerFeld.setBounds(50, 100, 175, 30);
        beistelltischlager.setEditable(false);
        setPreisPanel.add(beistelltischlagerFeld);

        setPreisPanel.add(kleiderschranklager);
        kleiderschranklager.setBounds(50, 200, 175, 60);
        kleiderschranklagerFeld.setBounds(50, 250, 175, 30);
        kleiderschranklager.setEditable(false);
        setPreisPanel.add(kleiderschranklagerFeld);

        setPreisPanel.add(kuechenregallager);
        kuechenregallager.setBounds(50, 350, 175, 60);
        kuechenregallagerFeld.setBounds(50, 400, 175, 30);
        kuechenregallager.setEditable(false);
        setPreisPanel.add(kuechenregallagerFeld);


        setPreisPanel.add(balkonliegelager);
        balkonliegelager.setBounds(400, 50, 175, 60);
        balkonliegelagerFeld.setBounds(400, 100, 175, 30);
        balkonliegelager.setEditable(false);
        setPreisPanel.add(balkonliegelagerFeld);


        setPreisPanel.add(doppelbettlager);
        doppelbettlager.setBounds(400, 200, 175, 60);
        doppelbettlagerFeld.setBounds(400, 250, 175, 30);
        doppelbettlager.setEditable(false);
        setPreisPanel.add(doppelbettlagerFeld);


        setPreisPanel.add(fernsehcouch);
        fernsehcouch.setBounds(750, 50, 175, 60);
        fernsehcouchFeld.setBounds(750, 100, 175, 30);
        fernsehcouch.setEditable(false);
        setPreisPanel.add(fernsehcouchFeld);


        setPreisPanel.add(Kuechenstuhl);
        Kuechenstuhl.setBounds(750, 200, 175, 60);
        KuechenstuhlFeld.setBounds(750, 250, 175, 30);
        Kuechenstuhl.setEditable(false);
        setPreisPanel.add(KuechenstuhlFeld);


        setPreisPanel.add(ohrensessel);
        ohrensessel.setBounds(750, 350, 175, 60);
        ohrensesselFeld.setBounds(750, 400, 175, 30);
        ohrensessel.setEditable(false);
        setPreisPanel.add(ohrensesselFeld);


        setPreisPanel.add(buerotischlager);
        buerotischlager.setBounds(1100, 50, 175, 60);
        buerotischlagerFeld.setBounds(1100, 100, 175, 30);
        buerotischlager.setEditable(false);
        setPreisPanel.add(buerotischlagerFeld);


        setPreisPanel.add(couchtischlager);
        couchtischlager.setBounds(1100, 200, 175, 60);
        couchtischlagerFeld.setBounds(1100, 250, 175, 30);
        couchtischlager.setEditable(false);
        setPreisPanel.add(couchtischlagerFeld);


        setPreisPanel.add(esstischlager);
        esstischlager.setBounds(1100, 350, 175, 60);
        esstischlagerFeld.setBounds(1100, 400, 175, 30);
        esstischlager.setEditable(false);
        setPreisPanel.add(esstischlagerFeld);


        setPreisPanel.add(kuechentischlager);
        kuechentischlager.setBounds(1100, 500, 175, 60);
        kuechentischlagerFeld.setBounds(1100, 550, 175, 30);
        kuechentischlager.setEditable(false);
        setPreisPanel.add(kuechentischlagerFeld);


    }

    public static void updateLabels() {
        DecimalFormat formatter = (DecimalFormat) NumberFormat.getInstance(Locale.GERMAN);
        formatter.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.GERMAN));

        beistelltischlager.setText("Beistelltischlager: " + formatter.format(((double) lagersystem.getBeistelltischlager().getPreis() / 100)) + "\n"
                + "Rabatt: " + lagersystem.getBeistelltischlager().getRabatt10() + "\n" +
                "ohne Rabatt: " + formatter.format(((double) lagersystem.getBeistelltischlager().getPreisOhneRabatt() / 100)) + "€");

        kleiderschranklager.setText("Kleiderschranklager: " + formatter.format(((double) lagersystem.getKleiderschranklager().getPreis() / 100)) + "\n"
                + "Rabatt: " + lagersystem.getKleiderschranklager().getRabatt10() + "\n" +
                "ohne Rabatt: " + formatter.format(((double) lagersystem.getKleiderschranklager().getPreisOhneRabatt() / 100)) + "€");

        kuechenregallager.setText("Kuechenregallagerlager: " + formatter.format(((double) lagersystem.getKuechenregallager().getPreis() / 100)) + "\n"
                + "Rabatt: " + lagersystem.getKuechenregallager().getRabatt10() + "\n" +
                "ohne Rabatt: " + formatter.format(((double) lagersystem.getKuechenregallager().getPreisOhneRabatt() / 100)) + "€");

        balkonliegelager.setText("Balkonliegelager: " + formatter.format(((double) lagersystem.getBalkonliegelager().getPreis() / 100)) + "\n"
                + "Rabatt: " + lagersystem.getBalkonliegelager().getRabatt10() + "\n" +
                "ohne Rabatt: " + formatter.format(((double) lagersystem.getBalkonliegelager().getPreisOhneRabatt() / 100)) + "€");

        doppelbettlager.setText("Doppelbettlager: " + formatter.format(((double) lagersystem.getDoppelbettlager().getPreis() / 100)) + "\n"
                + "Rabatt: " + lagersystem.getDoppelbettlager().getRabatt10() + "\n" +
                "ohne Rabatt: " + formatter.format(((double) lagersystem.getDoppelbettlager().getPreisOhneRabatt() / 100)) + "€");

        fernsehcouch.setText("Fernsehcouch: " + formatter.format(((double) lagersystem.getFernsehcouchlager().getPreis() / 100)) + "\n"
                + "Rabatt: " + lagersystem.getFernsehcouchlager().getRabatt10() + "\n" +
                "ohne Rabatt: " + formatter.format(((double) lagersystem.getFernsehcouchlager().getPreisOhneRabatt() / 100)) + "€");

        Kuechenstuhl.setText("Kuechenstuhl: " + formatter.format(((double) lagersystem.getKuechenstuhllager().getPreis() / 100)) + "\n"
                + "Rabatt: " + lagersystem.getKuechenstuhllager().getRabatt10() + "\n" +
                "ohne Rabatt: " + formatter.format(((double) lagersystem.getKuechenstuhllager().getPreisOhneRabatt() / 100)) + "€");

        ohrensessel.setText("Ohrensessel: " + formatter.format(((double) lagersystem.getOhrensessellager().getPreis() / 100)) + "\n"
                + "Rabatt: " + lagersystem.getOhrensessellager().getRabatt10() + "\n" +
                "ohne Rabatt: " + formatter.format(((double) lagersystem.getOhrensessellager().getPreisOhneRabatt() / 100)) + "€");

        buerotischlager.setText("Buerotischlager: " + formatter.format(((double) lagersystem.getBuerotischlager().getPreis() / 100)) + "\n"
                + "Rabatt: " + lagersystem.getBuerotischlager().getRabatt10() + "\n" +
                "ohne Rabatt: " + formatter.format(((double) lagersystem.getBuerotischlager().getPreisOhneRabatt() / 100)) + "€");

        couchtischlager.setText("Couchtischlager: " + formatter.format(((double) lagersystem.getCouchtischlager().getPreis() / 100)) + "\n"
                + "Rabatt: " + lagersystem.getCouchtischlager().getRabatt10() + "\n" +
                "ohne Rabatt: " + formatter.format(((double) lagersystem.getCouchtischlager().getPreisOhneRabatt() / 100)) + "€");

        esstischlager.setText("Esstischlager: " + formatter.format(((double) lagersystem.getEsstischlager().getPreis() / 100)) + "\n"
                + "Rabatt: " + lagersystem.getEsstischlager().getRabatt10() + "\n" +
                "ohne Rabatt: " + formatter.format(((double) lagersystem.getEsstischlager().getPreisOhneRabatt() / 100)) + "€");

        kuechentischlager.setText("Kuechentischlager: " + formatter.format(((double) lagersystem.getKuechentischlager().getPreis() / 100)) + "\n"
                + "Rabatt: " + lagersystem.getKuechentischlager().getRabatt10() + "\n" +
                "ohne Rabatt: " + formatter.format(((double) lagersystem.getKuechentischlager().getPreisOhneRabatt() / 100)) + "€");

    }

    public void setLabels() {

    }

    public static JPanel Panel() {
        addLabels();
        DecimalFormat formatter = (DecimalFormat) NumberFormat.getInstance(Locale.US);
        DecimalFormatSymbols symbols = formatter.getDecimalFormatSymbols();

        formatter.setDecimalFormatSymbols(symbols);

        JButton setBeistelltischPreis = new JButton("Set Beistelltisch Preis");
        setBeistelltischPreis.setBounds(50, 150, 175, 30);
        setBeistelltischPreis.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = beistelltischlagerFeld.getText().replace(',', '.');
                ;
                int i1;
                try {
                    i1 = (int) ((Double.parseDouble(text)) * 100);
                    lagersystem.getBeistelltischlager().setPreis(i1);
                } catch (NumberFormatException ignored) {
                }
                updateLabels();
            }
        });
        setPreisPanel.add(setBeistelltischPreis);

        JButton setKleiderschranklagerFeld = new JButton("Set Kleiderschranklager Preis");
        setKleiderschranklagerFeld.setBounds(50, 300, 175, 30);
        setKleiderschranklagerFeld.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = kleiderschranklagerFeld.getText().replace(',', '.');
                int i1;
                try {
                    i1 = (int) ((Double.parseDouble(text)) * 100);
                    lagersystem.getKleiderschranklager().setPreis(i1);
                } catch (NumberFormatException ignored) {
                }

                updateLabels();
            }
        });
        setPreisPanel.add(setKleiderschranklagerFeld);

        JButton setKuechenregallagerFeld = new JButton("Set Kuechenregallager Preis");
        setKuechenregallagerFeld.setBounds(50, 450, 175, 30);
        setKuechenregallagerFeld.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = kuechenregallagerFeld.getText().replace(',', '.');
                int i1;
                try {
                    i1 = (int) ((Double.parseDouble(text)) * 100);
                    lagersystem.getKuechenregallager().setPreis(i1);
                } catch (NumberFormatException ignored) {
                }

                updateLabels();
            }
        });
        setPreisPanel.add(setKuechenregallagerFeld);

        JButton setBalkonliegelagerFeld = new JButton("Set Balkonliegelager Preis");
        setBalkonliegelagerFeld.setBounds(400, 150, 175, 30);
        setBalkonliegelagerFeld.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = balkonliegelagerFeld.getText().replace(',', '.');
                int i1;
                try {
                    i1 = (int) ((Double.parseDouble(text)) * 100);
                    lagersystem.getBalkonliegelager().setPreis(i1);
                } catch (NumberFormatException ignored) {
                }
                updateLabels();
            }
        });
        setPreisPanel.add(setBalkonliegelagerFeld);

        JButton setDoppelbettlagerFeld = new JButton("Set Doppelbettlager Preis");
        setDoppelbettlagerFeld.setBounds(400, 300, 175, 30);
        setDoppelbettlagerFeld.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = doppelbettlagerFeld.getText().replace(',', '.');
                int i1;
                try {
                    i1 = (int) ((Double.parseDouble(text)) * 100);
                    lagersystem.getDoppelbettlager().setPreis(i1);
                } catch (NumberFormatException ignored) {
                }
                updateLabels();
            }
        });
        setPreisPanel.add(setDoppelbettlagerFeld);

        JButton setFernsehcouchFeld = new JButton("Set Fernsehcouch Preis");
        setFernsehcouchFeld.setBounds(750, 150, 175, 30);
        setFernsehcouchFeld.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = fernsehcouchFeld.getText().replace(',', '.');
                int i1;
                try {
                    i1 = (int) ((Double.parseDouble(text)) * 100);
                    lagersystem.getFernsehcouchlager().setPreis(i1);
                } catch (NumberFormatException ignored) {
                }
                updateLabels();
            }
        });
        setPreisPanel.add(setFernsehcouchFeld);

        JButton setKuechenstuhlFeld = new JButton("Set Kuechenstuhl Preis");
        setKuechenstuhlFeld.setBounds(750, 300, 175, 30);
        setKuechenstuhlFeld.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = KuechenstuhlFeld.getText().replace(',', '.');
                int i1;
                try {
                    i1 = (int) ((Double.parseDouble(text)) * 100);
                    lagersystem.getKuechenstuhllager().setPreis(i1);
                } catch (NumberFormatException ignored) {
                }
                updateLabels();
            }
        });
        setPreisPanel.add(setKuechenstuhlFeld);

        JButton setOhrensesselFeld = new JButton("Set Ohrensessel Preis");
        setOhrensesselFeld.setBounds(750, 450, 175, 30);
        setOhrensesselFeld.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = ohrensesselFeld.getText().replace(',', '.');
                int i1;
                try {
                    i1 = (int) ((Double.parseDouble(text)) * 100);
                    lagersystem.getOhrensessellager().setPreis(i1);
                } catch (NumberFormatException ignored) {
                }
                updateLabels();
            }
        });
        setPreisPanel.add(setOhrensesselFeld);

        JButton setBuerotischlagerFeld = new JButton("Set Buerotischlager Preis");
        setBuerotischlagerFeld.setBounds(1100, 150, 175, 30);
        setBuerotischlagerFeld.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = buerotischlagerFeld.getText().replace(',', '.');
                int i1;
                try {
                    i1 = (int) ((Double.parseDouble(text)) * 100);
                    lagersystem.getBuerotischlager().setPreis(i1);
                } catch (NumberFormatException ignored) {
                }
                updateLabels();
            }
        });
        setPreisPanel.add(setBuerotischlagerFeld);

        JButton setCouchtischlagerFeld = new JButton("Set Couchtischlager Preis");
        setCouchtischlagerFeld.setBounds(1100, 300, 175, 30);
        setCouchtischlagerFeld.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = couchtischlagerFeld.getText().replace(',', '.');
                int i1;
                try {
                    i1 = (int) ((Double.parseDouble(text)) * 100);
                    lagersystem.getCouchtischlager().setPreis(i1);
                } catch (NumberFormatException ignored) {
                }
                updateLabels();
            }
        });
        setPreisPanel.add(setCouchtischlagerFeld);

        JButton setEsstischlagerFeld = new JButton("Set Esstischlager Preis");
        setEsstischlagerFeld.setBounds(1100, 450, 175, 30);
        setEsstischlagerFeld.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = esstischlagerFeld.getText().replace(',', '.');
                int i1;
                try {
                    i1 = (int) ((Double.parseDouble(text)) * 100);
                    lagersystem.getEsstischlager().setPreis(i1);
                } catch (NumberFormatException ignored) {
                }
                updateLabels();
            }
        });
        setPreisPanel.add(setEsstischlagerFeld);

        JButton setKuechentischlagerFeld = new JButton("Set Kuechentischlager Preis");
        setKuechentischlagerFeld.setBounds(1100, 600, 175, 30);
        setKuechentischlagerFeld.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = kuechentischlagerFeld.getText().replace(',', '.');
                int i1;
                try {
                    i1 = (int) ((Double.parseDouble(text)) * 100);
                    lagersystem.getKuechentischlager().setPreis(i1);
                } catch (NumberFormatException ignored) {
                }
                updateLabels();
            }
        });
        setPreisPanel.add(setKuechentischlagerFeld);

        //Erstellen von Back Button
        JButton back = new JButton("Back");
        back.setBounds(50, 700, 175, 30);
        back.addActionListener(e -> {
            Frame.setAllPanelsInvisible();
            Frame.setAllHomeButtonsVisible();
        });
        setPreisPanel.add(back);
        setPreisPanel.setLayout(null);
        setPreisPanel.setBackground(Color.WHITE);
        setPreisPanel.setBounds(105, 0, 1600, 900);
        setPreisPanel.setVisible(false);

        return setPreisPanel;
    }
}
