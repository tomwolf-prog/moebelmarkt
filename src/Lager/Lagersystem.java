package Lager;

import Kategorie.Lagerung;
import Kategorie.Liegemoebel;
import Kategorie.Sitzmoebel;
import Kategorie.Tische;
import Kategorie.Tische.Moebelart;
import Lager.Lagerungslager.Beistelltischlager;
import Lager.Lagerungslager.Kleiderschranklager;
import Lager.Lagerungslager.Kuechenregallager;
import Lager.Liegemoebellager.Balkonliegelager;
import Lager.Liegemoebellager.Doppelbettlager;
import Lager.Sitzmoebellager.Fernsehcouchlager;
import Lager.Sitzmoebellager.Kuechenstuhllager;
import Lager.Sitzmoebellager.Ohrensessellager;
import Lager.Tischlager.Buerotischlager;
import Lager.Tischlager.Couchtischlager;
import Lager.Tischlager.Esstischlager;
import Lager.Tischlager.Kuechentischlager;
import Moebelstueck.Moebelstueck;
import Moebelstueck.Moebelstueck.Bereich;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static Kategorie.Lagerung.Moebelart.Beistelltisch;

/**
 * Das Lagersystem verwaltet verschiedene Lager für Möbelstücke.
 * Für jede Möbelart gibt es ein eigenes Lager.
 * Das Lagersystem ermöglicht das Hinzufügen, Entfernen und Verwalten von Möbeln in den einzelnen Lagern.
 * Es bietet auch Funktionen zur Berechnung des Verkaufspreises aller Möbel im Lager,
 * des Verkaufspreises aller Möbel in einem bestimmten Bereich und des Verkaufspreises aller Möbel einer bestimmten Kategorie.
 * Darüber hinaus kann das Lagersystem den Bereich mit dem höchsten Gesamtwert ermitteln, eine Möbelauswahl zwischen 100 und 600 Euro zurückgeben
 * und Möbel mit ihrer Sondereigenschaft suchen.
 * Des weiteren wird das Speichern und Laden des Lagersystems in eine Datei ermöglicht.
 * 
 * @see Serializable
 * @author Sidney Schmidt, Tom Wolf
 */
public class Lagersystem implements Serializable {
    //Tische
    private Buerotischlager buerotischlager;
    private Couchtischlager couchtischlager;
    private Esstischlager esstischlager;
    private Kuechentischlager kuechentischlager;

    //Sitzmoebel
    private Kuechenstuhllager kuechenstuhllager;
    private Ohrensessellager ohrensessellager;
    private Fernsehcouchlager fernsehcouchlager;

    //Lagerung
    private Kuechenregallager kuechenregallager;
    private Beistelltischlager beistelltischlager;
    private Kleiderschranklager kleiderschranklager;

    //Liegemoebel
    private Doppelbettlager doppelbettlager;
    private Balkonliegelager balkonliegelager;

    /**
     * Konstruktor für die Klasse Lagersystem.
     * Initialisiert die Lager für die verschiedenen Möbelarten.
     */
    public Lagersystem() {
        buerotischlager = new Buerotischlager();
        couchtischlager = new Couchtischlager();
        esstischlager = new Esstischlager();
        kuechentischlager = new Kuechentischlager();

        kuechenstuhllager = new Kuechenstuhllager();
        ohrensessellager = new Ohrensessellager();
        fernsehcouchlager = new Fernsehcouchlager();

        kuechenregallager = new Kuechenregallager();
        beistelltischlager = new Beistelltischlager();
        kleiderschranklager = new Kleiderschranklager();

        doppelbettlager = new Doppelbettlager();
        balkonliegelager = new Balkonliegelager();
    }

    /**
     * Fügt ein Möbelstück zum Lager hinzu.
     * Prüft die Kategorie des Möbelstücks und fügt es dem entsprechenden Lager hinzu.
     * 
     * @param moebelstueck Das hinzuzufügende Möbelstück.
     */
    public void addMoebelstueck(Moebelstueck moebelstueck) {
        switch (moebelstueck.getKategorie()) {
            case Lagerung:
                addLagerung((Lagerung) moebelstueck);
                break;
            case Liegemoebel:
                addLiegemoebel((Liegemoebel) moebelstueck);
                break;
            case Tische:
                addTisch((Tische) moebelstueck);
                break;
            case Sitzmoebel:
                addSitzmoebel((Sitzmoebel) moebelstueck);
            default:
                break;
        }
    }

    //Tische
    /**
     * Fügt einen Tisch zum Lager hinzu.
     * Prüft die Möbelart des Tisches und fügt ihn dem entsprechenden Lager hinzu.
     *
     * @param tisch Der hinzuzufügende Tisch.
     */
    public void addTisch(Tische tisch) {
        switch (tisch.getMoebelart()) {
            case Buerotisch:
                buerotischlager.addTisch(tisch);
                break;
            case Couchtisch:
                couchtischlager.addTisch(tisch);
                break;
            case Esstisch:
                esstischlager.addTisch(tisch);
            default:
                break;
        }
    }

    /**
     * Entfernt einen Tisch aus dem Lager.
     * Prüft die Möbelart des Tisches und entfernt ihn aus dem entsprechenden Lager.
     *
     * @param tisch Der zu entfernende Tisch.
     */
    public void removeTisch(Tische tisch) {
        switch (tisch.getMoebelart()) {
            case Buerotisch:
                buerotischlager.removeTisch(tisch.getHoehe());
                break;
            case Couchtisch:
                couchtischlager.removeTisch(tisch.getHoehe());
                break;
            case Esstisch:
                esstischlager.removeTisch(tisch.getHoehe());
            default:
                break;
        }
    }

    /**
     * Gibt das Lager für Buerotische zurück.
     *
     * @return Das Lager für Buerotische.
     */
    public Buerotischlager getBuerotischlager() {
        return buerotischlager;
    }

    /**
     * Setzt das Lager für Buerotische.
     *
     * @param buerotischlager Das Lager für Buerotische.
     */
    public void setBuerotischlager(Buerotischlager buerotischlager) {
        this.buerotischlager = buerotischlager;
    }

    /**
     * Ändert den Preis für das Lager für Buerotische.
     *
     * @param neuerPreisInCent Der neue Preis für das Lager für Buerotische.
     */
    public void aendereBuerotischlagerPreis(int neuerPreisInCent) {
        this.buerotischlager.setPreis(neuerPreisInCent);
    }

    /**
     * Erhöht den Lagerbestand für Buerotische um den angegebenen Betrag.
     *
     * @param quantitativerBetrag Der Betrag, um den der Lagerbestand erhöht werden soll.
     * @param hoehe Die Höhe der Buerotische, die hinzugefügt werden sollen.
     */
    public void erhoeheBuerotischlagerLagerbestand(int quantitativerBetrag, Tische.Hoehe hoehe) {
        // Für die Anzahl der hinzuzufügenden Buerotische wird ein Stream erzeugt, der für jeden Wert im Stream ein Buerotisch zum Lager hinzufügt
        IntStream.range(0, quantitativerBetrag)
        .forEach(i -> buerotischlager.addTisch(new Tische(Moebelart.Buerotisch, hoehe, Moebelstueck.Kategorie.Tische, Bereich.Andere)));
    }

    /**
     * Mindert den Lagerbestand für Buerotische um den angegebenen Betrag.
     *
     * @param quantitativerBetrag Der Betrag, um den der Lagerbestand gemindert werden soll.
     * @param hoehe Die Höhe der Buerotische, die entfernt werden sollen.
     */
    public void mindereBuerotischlagerLagerbestand(int quantitativerBetrag, Tische.Hoehe hoehe) {
        // Für die Anzahl der zu entfernenden Buerotische wird ein Stream erzeugt, der für jeden Wert im Stream einen Buerotisch aus dem Lager entfernt
        IntStream.range(0, quantitativerBetrag).forEach(i -> buerotischlager.removeTisch(hoehe));
    }

    /**
     * Gibt den Bestand an Buerotischen im Lager zurück.
     *
     * @param hoehe Die Höhe der Buerotische, deren Bestand zurückgegeben werden soll.
     * @return Der Bestand an Buerotischen im Lager.
     */
    public int getBuerotischlagerBestand(Tische.Hoehe hoehe) {
        return buerotischlager.getTischlagerBestand(hoehe);
    }

    /**
     * Gibt das Lager für Couchtische zurück.
     *
     * @return Das Lager für Couchtische.
     */
    public Couchtischlager getCouchtischlager() {
        return couchtischlager;
    }

    /**
     * Setzt das Lager für Couchtische.
     *
     * @param couchtischlager Das Lager für Couchtische.
     */
    public void setCouchtischlager(Couchtischlager couchtischlager) {
        this.couchtischlager = couchtischlager;
    }

    /**
     * Ändert den Preis für das Lager für Couchtische.
     *
     * @param neuerPreisInCent Der neue Preis für das Lager für Couchtische.
     */
    public void aendereCouchtischlagerPreis(int neuerPreisInCent) {
        this.couchtischlager.setPreis(neuerPreisInCent);
    }

    /**
     * Erhöht den Lagerbestand für Couchtische um den angegebenen Betrag.
     *
     * @param quantitativerBetrag Der Betrag, um den der Lagerbestand erhöht werden soll.
     * @param hoehe Die Höhe der Couchtische, die hinzugefügt werden sollen.
     */
    public void erhoeheCouchtischlagerLagerbestand(int quantitativerBetrag, Tische.Hoehe hoehe) {
        // Für die Anzahl der hinzuzufügenden Couchtische wird ein Stream erzeugt, der für jeden Wert im Stream einen Couchtisch zum Lager hinzufügt
        IntStream.range(0, quantitativerBetrag)
        .forEach(i -> couchtischlager.addTisch(new Tische(Moebelart.Couchtisch, hoehe, Moebelstueck.Kategorie.Tische, Bereich.Wohnen)));
    }

    /**
     * Mindert den Lagerbestand für Couchtische um den angegebenen Betrag.
     *
     * @param quantitativerBetrag Der Betrag, um den der Lagerbestand gemindert werden soll.
     * @param hoehe Die Höhe der Couchtische, die entfernt werden sollen.
     */
    public void mindereCouchtischlagerLagerbestand(int quantitativerBetrag, Tische.Hoehe hoehe) {
        // Für die Anzahl der zu entfernenden Couchtische wird ein Stream erzeugt, der für jeden Wert im Stream einen Couchtisch aus dem Lager entfernt
        IntStream.range(0, quantitativerBetrag).forEach(i -> couchtischlager.removeTisch(hoehe));
    }

    /**
     * Gibt den Bestand an Couchtischen im Lager zurück.
     *
     * @param hoehe Die Höhe der Couchtische, deren Bestand zurückgegeben werden soll.
     * @return Der Bestand an Couchtischen im Lager.
     */
    public int getCouchtischlagerBestand(Tische.Hoehe hoehe) {
        return couchtischlager.getTischlagerBestand(hoehe);
    }

    /**
     * Gibt das Lager für Esstische zurück.
     *
     * @return Das Lager für Esstische.
     */
    public Esstischlager getEsstischlager() {
        return esstischlager;
    }

    /**
     * Setzt das Lager für Esstische.
     *
     * @param esstischlager Das Lager für Esstische.
     */
    public void setEsstischlager(Esstischlager esstischlager) {
        this.esstischlager = esstischlager;
    }

    /**
     * Ändert den Preis für das Lager für Esstische.
     *
     * @param neuerPreisInCent Der neue Preis für das Lager für Esstische.
     */
    public void aendereEsstischlagerPreis(int neuerPreisInCent) {
        this.esstischlager.setPreis(neuerPreisInCent);
    }

    /**
     * Erhöht den Lagerbestand für Esstische um den angegebenen Betrag.
     *
     * @param quantitativerBetrag Der Betrag, um den der Lagerbestand erhöht werden soll.
     * @param hoehe Die Höhe der Esstische, die hinzugefügt werden sollen.
     */
    public void erhoeheEsstischlagerLagerbestand(int quantitativerBetrag, Tische.Hoehe hoehe) {
        // Für die Anzahl der hinzuzufügenden Esstische wird ein Stream erzeugt, der für jeden Wert im Stream einen Esstisch zum Lager hinzufügt
        IntStream.range(0, quantitativerBetrag)
        .forEach(i -> esstischlager.addTisch(new Tische(Moebelart.Esstisch, hoehe, Moebelstueck.Kategorie.Tische, Bereich.Andere)));
    }

    /**
     * Mindert den Lagerbestand für Esstische um den angegebenen Betrag.
     *
     * @param quantitativerBetrag Der Betrag, um den der Lagerbestand gemindert werden soll.
     * @param hoehe Die Höhe der Esstische, die entfernt werden sollen.
     */
    public void mindereEsstischlagerLagerbestand(int quantitativerBetrag, Tische.Hoehe hoehe) {
        // Für die Anzahl der zu entfernenden Esstische wird ein Stream erzeugt, der für jeden Wert im Stream einen Esstisch aus dem Lager entfernt
        IntStream.range(0, quantitativerBetrag).forEach(i -> esstischlager.removeTisch(hoehe));
    }

    /**
     * Gibt den Bestand an Esstischen im Lager zurück.
     *
     * @param hoehe Die Höhe der Esstische, deren Bestand zurückgegeben werden soll.
     * @return Der Bestand an Esstischen im Lager.
     */
    public int getEsstischlagerBestand(Tische.Hoehe hoehe) {
        return esstischlager.getTischlagerBestand(hoehe);
    }

    /**
     * Gibt das Lager für Kuechentische zurück.
     *
     * @return Das Lager für Kuechentische.
     */
    public Kuechentischlager getKuechentischlager() {
        return kuechentischlager;
    }

    /**
     * Setzt das Lager für Kuechentische.
     *
     * @param kuechentischlager Das Lager für Kuechentische.
     */
    public void setKuechentischlager(Kuechentischlager kuechentischlager) {
        this.kuechentischlager = kuechentischlager;
    }

    /**
     * Ändert den Preis für das Lager für Kuechentische.
     *
     * @param neuerPreisInCent Der neue Preis für das Lager für Kuechentische.
     */
    public void aendereKuechentischlagerPreis(int neuerPreisInCent) {
        this.kuechentischlager.setPreis(neuerPreisInCent);
    }

    /**
     * Erhöht den Lagerbestand für Kuechentische um den angegebenen Betrag.
     *
     * @param quantitativerBetrag Der Betrag, um den der Lagerbestand erhöht werden soll.
     * @param hoehe Die Höhe der Kuechentische, die hinzugefügt werden sollen.
     */
    public void erhoeheKuechentischlagerLagerbestand(int quantitativerBetrag, Tische.Hoehe hoehe) {
        // Für die Anzahl der hinzuzufügenden Kuechentische wird ein Stream erzeugt, der für jeden Wert im Stream einen Kuechentisch zum Lager hinzufügt
        IntStream.range(0, quantitativerBetrag)
        .forEach(i -> kuechentischlager.addTisch(new Tische(Moebelart.Kuechentisch, hoehe, Moebelstueck.Kategorie.Tische, Bereich.Kueche)));
    }

    /**
     * Mindert den Lagerbestand für Kuechentische um den angegebenen Betrag.
     *
     * @param quantitativerBetrag Der Betrag, um den der Lagerbestand gemindert werden soll.
     * @param hoehe Die Höhe der Kuechentische, die entfernt werden sollen.
     */
    public void mindereKuechentischlagerLagerbestand(int quantitativerBetrag, Tische.Hoehe hoehe) {
        // Für die Anzahl der zu entfernenden Kuechentische wird ein Stream erzeugt, der für jeden Wert im Stream einen Kuechentisch aus dem Lager entfernt
        IntStream.range(0, quantitativerBetrag).forEach(i -> kuechentischlager.removeTisch(hoehe));
    }

    /**
     * Gibt den Bestand an Kuechentischen im Lager zurück.
     *
     * @param hoehe Die Höhe der Kuechentische, deren Bestand zurückgegeben werden soll.
     * @return Der Bestand an Kuechentischen im Lager.
     */
    public int getKuechentischlagerBestand(Tische.Hoehe hoehe) {
        return kuechentischlager.getTischlagerBestand(hoehe);
    }


    //Sitzmoebel
    /**
     * Fügt einen Sitzmoebel zum Lager hinzu.
     *
     * @param sitzmoebel Das hinzuzufügende Sitzmoebel.
     */
    public void addSitzmoebel(Sitzmoebel sitzmoebel) {
        switch (sitzmoebel.getMoebelart()) {
            case Kuechenstuhl:
                kuechenstuhllager.addSitzmoebel(sitzmoebel);
                break;
            case Ohrensessel:
                ohrensessellager.addSitzmoebel(sitzmoebel);
                break;
            case Fernsehcouch:
                fernsehcouchlager.addSitzmoebel(sitzmoebel);
            default:
                break;
        }
    }

    /**
     * Entfernt einen Sitzmoebel aus dem Lager.
     *
     * @param moebelart Die Art des Sitzmoebels, das entfernt werden soll.
     * @param sitzplaetze Die Sitzplätze des Sitzmoebels, das entfernt werden soll.
     */
    public void removeSitzmoebel(Sitzmoebel.Moebelart moebelart, Sitzmoebel.Sitzplaetze sitzplaetze) {
        switch (moebelart) {
            case Kuechenstuhl:
                kuechenstuhllager.removeSitzmoebel(sitzplaetze);
                break;
            case Ohrensessel:
                ohrensessellager.removeSitzmoebel(sitzplaetze);
                break;
            case Fernsehcouch:
                fernsehcouchlager.removeSitzmoebel(sitzplaetze);
            default:
                break;
        }
    }

    /**
     * Gibt das Lager für Kuechenstühle zurück.
     *
     * @return Das Lager für Kuechenstühle.
     */
    public Kuechenstuhllager getKuechenstuhllager() {
        return kuechenstuhllager;
    }

    /**
     * Setzt das Lager für Kuechenstühle.
     *
     * @param kuechenstuhllager Das Lager für Kuechenstühle.
     */
    public void setKuechenstuhllager(Kuechenstuhllager kuechenstuhllager) {
        this.kuechenstuhllager = kuechenstuhllager;
    }

    /**
     * Ändert den Preis für das Lager für Kuechenstühle.
     *
     * @param neuerPreisInCent Der neue Preis für das Lager für Kuechenstühle.
     */
    public void aendereKuechenstuhllagerPreis(int neuerPreisInCent) {
        this.kuechenstuhllager.setPreis(neuerPreisInCent);
    }

    /**
     * Erhöht den Lagerbestand für Kuechenstühle um den angegebenen Betrag.
     *
     * @param quantitativerBetrag Der Betrag, um den der Lagerbestand erhöht werden soll.
     * @param sitzplaetze Die Sitzplätze der Kuechenstühle, die hinzugefügt werden sollen.
     */
    public void erhoeheKuechenstuhllagerLagerbestand(int quantitativerBetrag, Sitzmoebel.Sitzplaetze sitzplaetze) {
        // Für die Anzahl der hinzuzufügenden Kuechenstühle wird ein Stream erzeugt, der für jeden Wert im Stream einen Kuechenstuhl zum Lager hinzufügt
        IntStream.range(0, quantitativerBetrag)
        .forEach(i -> kuechenstuhllager.addSitzmoebel(new Sitzmoebel(Sitzmoebel.Moebelart.Kuechenstuhl, sitzplaetze, Moebelstueck.Kategorie.Sitzmoebel, Bereich.Kueche)));
    }

    /**
     * Mindert den Lagerbestand für Kuechenstühle um den angegebenen Betrag.
     *
     * @param quantitativerBetrag Der Betrag, um den der Lagerbestand gemindert werden soll.
     * @param sitzplaetze Die Sitzplätze der Kuechenstühle, die entfernt werden sollen.
     */
    public void mindereKuechenstuhllagerLagerbestand(int quantitativerBetrag, Sitzmoebel.Sitzplaetze sitzplaetze) {
        // Für die Anzahl der zu entfernenden Kuechenstühle wird ein Stream erzeugt, der für jeden Wert im Stream einen Kuechenstuhl aus dem Lager entfernt
        IntStream.range(0, quantitativerBetrag).forEach(i -> kuechenstuhllager.removeSitzmoebel(sitzplaetze));
    }

    /**
     * Gibt den Bestand an Kuechenstühlen im Lager zurück.
     *
     * @param sitzplaetze Die Sitzplätze der Kuechenstühle, deren Bestand zurückgegeben werden soll.
     * @return Der Bestand an Kuechenstühlen im Lager.
     */
    public int getKuechenstuhllagerBestand(Sitzmoebel.Sitzplaetze sitzplaetze) {
        return kuechenstuhllager.getSitzmoebellagerBestand(sitzplaetze);
    }

    /**
     * Gibt das Lager für Ohrensessel zurück.
     *
     * @return Das Lager für Ohrensessel.
     */
    public Ohrensessellager getOhrensessellager() {
        return ohrensessellager;
    }

    /**
     * Setzt das Lager für Ohrensessel.
     *
     * @param ohrensessellager Das Lager für Ohrensessel.
     */
    public void setOhrensessellager(Ohrensessellager ohrensessellager) {
        this.ohrensessellager = ohrensessellager;
    }

    /**
     * Ändert den Preis für das Lager für Ohrensessel.
     *
     * @param neuerPreisInCent Der neue Preis für das Lager für Ohrensessel.
     */
    public void aendereOhrensessellagerPreis(int neuerPreisInCent) {
        this.ohrensessellager.setPreis(neuerPreisInCent);
    }

    /**
     * Erhöht den Lagerbestand für Ohrensessel um den angegebenen Betrag.
     *
     * @param quantitativerBetrag Der Betrag, um den der Lagerbestand erhöht werden soll.
     * @param sitzplaetze Die Sitzplätze der Ohrensessel, die hinzugefügt werden sollen.
     */
    public void erhoeheOhrensessellagerLagerbestand(int quantitativerBetrag, Sitzmoebel.Sitzplaetze sitzplaetze) {
        // Für die Anzahl der hinzuzufügenden Ohrensessel wird ein Stream erzeugt, der für jeden Wert im Stream einen Ohrensessel zum Lager hinzufügt
        IntStream.range(0, quantitativerBetrag)
        .forEach(i -> ohrensessellager.addSitzmoebel(new Sitzmoebel(Sitzmoebel.Moebelart.Ohrensessel, sitzplaetze, Moebelstueck.Kategorie.Sitzmoebel, Bereich.Wohnen)));
    }

    /**
     * Mindert den Lagerbestand für Ohrensessel um den angegebenen Betrag.
     *
     * @param quantitativerBetrag Der Betrag, um den der Lagerbestand gemindert werden soll.
     * @param sitzplaetze Die Sitzplätze der Ohrensessel, die entfernt werden sollen.
     */
    public void mindereOhrensessellagerLagerbestand(int quantitativerBetrag, Sitzmoebel.Sitzplaetze sitzplaetze) {
        // Für die Anzahl der zu entfernenden Ohrensessel wird ein Stream erzeugt, der für jeden Wert im Stream einen Ohrensessel aus dem Lager entfernt
        IntStream.range(0, quantitativerBetrag).forEach(i -> ohrensessellager.removeSitzmoebel(sitzplaetze));
    }

    /**
     * Gibt den Bestand an Ohrensessel im Lager zurück.
     *
     * @param sitzplaetze Die Sitzplätze der Ohrensessel, deren Bestand zurückgegeben werden soll.
     * @return Der Bestand an Ohrensessel im Lager.
     */
    public int getOhrensessellagerBestand(Sitzmoebel.Sitzplaetze sitzplaetze) {
        return ohrensessellager.getSitzmoebellagerBestand(sitzplaetze);
    }

    /**
     * Gibt das Lager für Fernsehcouches zurück.
     *
     * @return Das Lager für Fernsehcouches.
     */
    public Fernsehcouchlager getFernsehcouchlager() {
        return fernsehcouchlager;
    }

    /**
     * Setzt das Lager für Fernsehcouches.
     *
     * @param fernsehcouchlager Das Lager für Fernsehcouches.
     */
    public void setFernsehcouchlager(Fernsehcouchlager fernsehcouchlager) {
        this.fernsehcouchlager = fernsehcouchlager;
    }

    /**
     * Ändert den Preis für das Lager für Fernsehcouches.
     *
     * @param neuerPreisInCent Der neue Preis für das Lager für Fernsehcouches.
     */
    public void aendereFernsehcouchlagerPreis(int neuerPreisInCent) {
        this.fernsehcouchlager.setPreis(neuerPreisInCent);
    }

    /**
     * Erhöht den Lagerbestand für Fernsehcouches um den angegebenen Betrag.
     *
     * @param quantitativerBetrag Der Betrag, um den der Lagerbestand erhöht werden soll.
     * @param sitzplaetze Die Sitzplätze der Fernsehcouches, die hinzugefügt werden sollen.
     */
    public void erhoeheFernsehcouchlagerLagerbestand(int quantitativerBetrag, Sitzmoebel.Sitzplaetze sitzplaetze) {
        // Für die Anzahl der hinzuzufügenden Fernsehcouches wird ein Stream erzeugt, der für jeden Wert im Stream einen Fernsehcouch zum Lager hinzufügt
        IntStream.range(0, quantitativerBetrag)
        .forEach(i -> fernsehcouchlager.addSitzmoebel(new Sitzmoebel(Sitzmoebel.Moebelart.Fernsehcouch, sitzplaetze, Moebelstueck.Kategorie.Sitzmoebel, Bereich.Wohnen)));
    }

    /**
     * Mindert den Lagerbestand für Fernsehcouches um den angegebenen Betrag.
     *
     * @param quantitativerBetrag Der Betrag, um den der Lagerbestand gemindert werden soll.
     * @param sitzplaetze Die Sitzplätze der Fernsehcouches, die entfernt werden sollen.
     */
    public void mindereFernsehcouchlagerLagerbestand(int quantitativerBetrag, Sitzmoebel.Sitzplaetze sitzplaetze) {
        // Für die Anzahl der zu entfernenden Fernsehcouches wird ein Stream erzeugt, der für jeden Wert im Stream einen Fernsehcouch aus dem Lager entfernt
        IntStream.range(0, quantitativerBetrag).forEach(i -> fernsehcouchlager.removeSitzmoebel(sitzplaetze));
    }

    /**
     * Gibt den Bestand an Fernsehcouches im Lager zurück.
     *
     * @param sitzplaetze Die Sitzplätze der Fernsehcouches, deren Bestand zurückgegeben werden soll.
     * @return Der Bestand an Fernsehcouches im Lager.
     */
    public int getFernsehcouchlagerBestand(Sitzmoebel.Sitzplaetze sitzplaetze) {
        return fernsehcouchlager.getSitzmoebellagerBestand(sitzplaetze);
    }

    //Lagerung
    /**
     * Fügt eine Lagerung zum Lager hinzu.
     * Prüft die Möbelart der Lagerung und fügt sie dem entsprechenden Lager hinzu.
     * 
     * @param lagerung Die hinzuzufügende Lagerung.
     */
    public void addLagerung(Lagerung lagerung) {
        switch (lagerung.getMoebelart()) {
            case Kuechenregal:
                kuechenregallager.addLagerung(lagerung);
                break;
            case Kleiderschrank:
                kleiderschranklager.addLagerung(lagerung);
                break;
            case Beistelltisch:
                beistelltischlager.addLagerung(lagerung);
            default:
                break;
        }
    }

    /**
     * Entfernt eine Lagerung aus dem Lager.
     * Prüft die Möbelart der Lagerung und entfernt sie aus dem entsprechenden Lager.
     * 
     * @param moebelart Die Art der Lagerung, die entfernt werden soll.
     * @param flaeche Die Fläche der Lagerung, die entfernt werden soll.
     */
    public void removeLagerung(Lagerung.Moebelart moebelart, Lagerung.Flaeche flaeche) {
        switch (moebelart) {
            case Kuechenregal:
                kuechenregallager.removeLagerung(flaeche);
                break;
            case Kleiderschrank:
                kleiderschranklager.removeLagerung(flaeche);
                break;
            default:
                break;
        }
    }

    /**
     * Gibt das Lager für Kuechenregale zurück.
     *
     * @return Das Lager für Kuechenregale.
     */
    public Kuechenregallager getKuechenregallager() {
        return kuechenregallager;
    }

    /**
     * Setzt das Lager für Kuechenregale.
     *
     * @param kuechenregallager Das Lager für Kuechenregale.
     */
    public void setKuechenregallager(Kuechenregallager kuechenregallager) {
        this.kuechenregallager = kuechenregallager;
    }

    /**
     * Ändert den Preis für das Lager für Kuechenregale.
     *
     * @param neuerPreisInCent Der neue Preis für das Lager für Kuechenregale.
     */
    public void aendereKuechenregallagerPreis(int neuerPreisInCent) {
        this.kuechenregallager.setPreis(neuerPreisInCent);
    }

    /**
     * Erhöht den Lagerbestand für Kuechenregale um den angegebenen Betrag.
     *
     * @param quantitativerBetrag Der Betrag, um den der Lagerbestand erhöht werden soll.
     * @param flaeche Die Fläche der Kuechenregale, die hinzugefügt werden sollen.
     */
    public void erhoeheKuechenregallagerLagerbestand(int quantitativerBetrag, Lagerung.Flaeche flaeche) {
        // Für die Anzahl der hinzuzufügenden Kuechenregale wird ein Stream erzeugt, der für jeden Wert im Stream ein Kuechenregal zum Lager hinzufügt
        IntStream.range(0, quantitativerBetrag)
        .forEach(i -> kuechenregallager.addLagerung(new Lagerung(Lagerung.Moebelart.Kuechenregal, flaeche, Moebelstueck.Kategorie.Lagerung, Bereich.Kueche)));
    }

    /**
     * Mindert den Lagerbestand für Kuechenregale um den angegebenen Betrag.
     *
     * @param quantitativerBetrag Der Betrag, um den der Lagerbestand gemindert werden soll.
     * @param flaeche Die Fläche der Kuechenregale, die entfernt werden sollen.
     */
    public void mindereKuechenregallagerLagerbestand(int quantitativerBetrag, Lagerung.Flaeche flaeche) {
        // Für die Anzahl der zu entfernenden Kuechenregale wird ein Stream erzeugt, der für jeden Wert im Stream ein Kuechenregal aus dem Lager entfernt
        IntStream.range(0, quantitativerBetrag).forEach(i -> kuechenregallager.removeLagerung(flaeche));
    }

    /**
     * Gibt den Bestand an Kuechenregalen im Lager zurück.
     *
     * @param flaeche Die Fläche der Kuechenregale, deren Bestand zurückgegeben werden soll.
     * @return Der Bestand an Kuechenregalen im Lager.
     */
    public int getKuechenregallagerBestand(Lagerung.Flaeche flaeche) {
        return kuechenregallager.getLagerunglagerBestand(flaeche);
    }

    /**
     * Gibt das Lager für Beistelltische zurück.
     *
     * @return Das Lager für Beistelltische.
     */
    public Beistelltischlager getBeistelltischlager() {
        return beistelltischlager;
    }

    /**
     * Setzt das Lager für Beistelltische.
     *
     * @param beistelltischlager Das Lager für Beistelltische.
     */
    public void setBeistelltischlager(Beistelltischlager beistelltischlager) {
        this.beistelltischlager = beistelltischlager;
    }

    /**
     * Ändert den Preis für das Lager für Beistelltische.
     *
     * @param neuerPreisInCent Der neue Preis für das Lager für Beistelltische.
     */
    public void aendereBeistelltischlagerPreis(int neuerPreisInCent) {
        this.beistelltischlager.setPreis(neuerPreisInCent);
    }

    /**
     * Erhöht den Lagerbestand für Beistelltische um den angegebenen Betrag.
     *
     * @param quantitativerBetrag Der Betrag, um den der Lagerbestand erhöht werden soll.
     * @param flaeche Die Fläche der Beistelltische, die hinzugefügt werden sollen.
     */
    public void erhoeheBeistelltischlagerLagerbestand(int quantitativerBetrag, Lagerung.Flaeche flaeche) {
        // Für die Anzahl der hinzuzufügenden Beistelltische wird ein Stream erzeugt, der für jeden Wert im Stream ein Beistelltisch zum Lager hinzufügt
        IntStream.range(0, quantitativerBetrag)
        .forEach(i -> beistelltischlager.addLagerung(new Lagerung(Beistelltisch, flaeche, Moebelstueck.Kategorie.Lagerung, Bereich.Schlafen)));
    }

    /**
     * Mindert den Lagerbestand für Beistelltische um den angegebenen Betrag.
     *
     * @param quantitativerBetrag Der Betrag, um den der Lagerbestand gemindert werden soll.
     * @param flaeche Die Fläche der Beistelltische, die entfernt werden sollen.
     */
    public void mindereBeistelltischlagerLagerbestand(int quantitativerBetrag, Lagerung.Flaeche flaeche) {
        // Für die Anzahl der zu entfernenden Beistelltische wird ein Stream erzeugt, der für jeden Wert im Stream ein Beistelltisch aus dem Lager entfernt
        IntStream.range(0, quantitativerBetrag).forEach(i -> beistelltischlager.removeLagerung(flaeche));
    }

    /**
     * Gibt den Bestand an Beistelltischen im Lager zurück.
     *
     * @param flaeche Die Fläche der Beistelltische, deren Bestand zurückgegeben werden soll.
     * @return Der Bestand an Beistelltischen im Lager.
     */
    public int getBeistelltischlagerBestand(Lagerung.Flaeche flaeche) {
        return beistelltischlager.getLagerunglagerBestand(flaeche);
    }

    /**
     * Fügt eine Lagerung zum Lager hinzu.
     *
     * @param lagerung Die hinzuzufügende Lagerung.
     */
    public Kleiderschranklager getKleiderschranklager() {
        return kleiderschranklager;
    }

    /**
     * Setzt das Lager für Kleiderschraenke.
     * 
     * @param kleiderschranklager Das Lager für Kleiderschraenke.
     */
    public void setKleiderschranklager(Kleiderschranklager kleiderschranklager) {
        this.kleiderschranklager = kleiderschranklager;
    }

    /**
     * Ändert den Preis für das Lager für Kleiderschraenke.
     * 
     * @param neuerPreisInCent Der neue Preis für das Lager für Kleiderschraenke.
     */
    public void aendereKleiderschranklagerPreis(int neuerPreisInCent) {
        this.kleiderschranklager.setPreis(neuerPreisInCent);
    }

    /**
     * Erhöht den Lagerbestand für Kleiderschraenke um den angegebenen Betrag.
     * 
     * @param quantitativerBetrag Der Betrag, um den der Lagerbestand erhöht werden soll.
     * @param flaeche Die Fläche der Kleiderschraenke, die hinzugefügt werden sollen.
     */
    public void erhoeheKleiderschranklagerLagerbestand(int quantitativerBetrag, Lagerung.Flaeche flaeche) {
        // Für die Anzahl der hinzuzufügenden Kleiderschraenke wird ein Stream erzeugt, der für jeden Wert im Stream einen Kleiderschrank zum Lager hinzufügt
        IntStream.range(0, quantitativerBetrag)
        .forEach(i -> kleiderschranklager.addLagerung(new Lagerung(Lagerung.Moebelart.Kleiderschrank, flaeche, Moebelstueck.Kategorie.Lagerung, Bereich.Schlafen)));
    }

    /**
     * Mindert den Lagerbestand für Kleiderschraenke um den angegebenen Betrag.
     * 
     * @param quantitativerBetrag Der Betrag, um den der Lagerbestand gemindert werden soll.
     * @param flaeche Die Fläche der Kleiderschraenke, die entfernt werden sollen.
     */
    public void mindereKleiderschranklagerLagerbestand(int quantitativerBetrag, Lagerung.Flaeche flaeche) {
        // Für die Anzahl der zu entfernenden Kleiderschraenke wird ein Stream erzeugt, der für jeden Wert im Stream einen Kleiderschrank aus dem Lager entfernt
        IntStream.range(0, quantitativerBetrag).forEach(i -> kleiderschranklager.removeLagerung(flaeche));
    }

    /**
     * Gibt den Bestand an Kleiderschraenken im Lager zurück.
     * 
     * @param flaeche Die Fläche der Kleiderschraenke, deren Bestand zurückgegeben werden soll.
     * @return Der Bestand an Kleiderschraenken im Lager.
     */
    public int getKleiderschranklagerBestand(Lagerung.Flaeche flaeche) {
        return kleiderschranklager.getLagerunglagerBestand(flaeche);
    }

    //Liegemoebel
    /**
     * Fügt einen Liegemoebel zum Lager hinzu.
     * Prüft die Möbelart des Liegemoebels und fügt ihn dem entsprechenden Lager hinzu.
     *
     * @param liegemoebel Der hinzuzufügende Liegemoebel.
     */
    public void addLiegemoebel(Liegemoebel liegemoebel) {
        switch (liegemoebel.getMoebelart()) {
            case Doppelbett:
                doppelbettlager.addLiegemoebel(liegemoebel);
                break;
            case Balkonliege:
                balkonliegelager.addLiegemoebel(liegemoebel);
                break;
            default:
                break;
        }
    }

    /**
     * Entfernt einen Liegemoebel aus dem Lager.
     * Prüft die Möbelart des Liegemoebels und entfernt ihn aus dem entsprechenden Lager.
     *
     * @param moebelart Die Art des Liegemoebels, der entfernt werden soll.
     * @param laenge Die Länge des Liegemoebels, der entfernt werden soll.
     */
    public void removeLiegemoebel(Liegemoebel.Moebelart moebelart, Liegemoebel.Laenge laenge) {
        switch (moebelart) {
            case Doppelbett:
                doppelbettlager.removeLiegemoebel(laenge);
                break;
            case Balkonliege:
                balkonliegelager.removeLiegemoebel(laenge);
                break;
            default:
                break;
        }
    }
    
    /**
     * Gibt das Lager für Doppelbetten zurück.
     *
     * @return Das Lager für Doppelbetten.
     */
    public Doppelbettlager getDoppelbettlager() {
        return doppelbettlager;
    }

    /**
     * Setzt das Lager für Doppelbetten.
     *
     * @param doppelbettlager Das Lager für Doppelbetten.
     */
    public void setDoppelbettlager(Doppelbettlager doppelbettlager) {
        this.doppelbettlager = doppelbettlager;
    }

    /**
     * Ändert den Preis für das Lager für Doppelbetten.
     *
     * @param neuerPreisInCent Der neue Preis für das Lager für Doppelbetten.
     */
    public void aendereDoppelbettlagerPreis(int neuerPreisInCent) {
        this.doppelbettlager.setPreis(neuerPreisInCent);
    }

    /**
     * Erhöht den Lagerbestand für Doppelbetten um den angegebenen Betrag.
     *
     * @param quantitativerBetrag Der Betrag, um den der Lagerbestand erhöht werden soll.
     * @param laenge Die Länge der Doppelbetten, die hinzugefügt werden sollen.
     */
    public void erhoeheDoppelbettlagerLagerbestand(int quantitativerBetrag, Liegemoebel.Laenge laenge) {
        // Für die Anzahl der hinzuzufügenden Doppelbetten wird ein Stream erzeugt, der für jeden Wert im Stream ein Doppelbett zum Lager hinzufügt
        IntStream.range(0, quantitativerBetrag)
        .forEach(i -> doppelbettlager.addLiegemoebel(new Liegemoebel(Liegemoebel.Moebelart.Doppelbett, laenge, Moebelstueck.Kategorie.Liegemoebel, Bereich.Schlafen)));
    }

    /**
     * Mindert den Lagerbestand für Doppelbetten um den angegebenen Betrag.
     *
     * @param quantitativerBetrag Der Betrag, um den der Lagerbestand gemindert werden soll.
     * @param laenge Die Länge der Doppelbetten, die entfernt werden sollen.
     */
    public void mindereDoppelbettlagerLagerbestand(int quantitativerBetrag, Liegemoebel.Laenge laenge) {
        // Für die Anzahl der zu entfernenden Doppelbetten wird ein Stream erzeugt, der für jeden Wert im Stream ein Doppelbett aus dem Lager entfernt
        IntStream.range(0, quantitativerBetrag).forEach(i -> doppelbettlager.removeLiegemoebel(laenge));
    }

    /**
     * Gibt den Bestand an Doppelbetten im Lager zurück.
     *
     * @param laenge Die Länge der Doppelbetten, deren Bestand zurückgegeben werden soll.
     * @return Der Bestand an Doppelbetten im Lager.
     */
    public int getDoppelbettlagerBestand(Liegemoebel.Laenge laenge) {
        return doppelbettlager.getLiegemoebellagerBestand(laenge);
    }

    /**
     * Gibt das Lager für Balkonliegen zurück.
     *
     * @return Das Lager für Balkonliegen.
     */
    public Balkonliegelager getBalkonliegelager() {
        return balkonliegelager;
    }

    /**
     * Setzt das Lager für Balkonliegen.
     *
     * @param balkonliegelager Das Lager für Balkonliegen.
     */
    public void setBalkonliegelager(Balkonliegelager balkonliegelager) {
        this.balkonliegelager = balkonliegelager;
    }

    /**
     * Ändert den Preis für das Lager für Balkonliegen.
     *
     * @param neuerPreisInCent Der neue Preis für das Lager für Balkonliegen.
     */
    public void aendereBalkonliegelagerPreis(int neuerPreisInCent) {
        this.balkonliegelager.setPreis(neuerPreisInCent);
    }

    /**
     * Erhöht den Lagerbestand für Balkonliegen um den angegebenen Betrag.
     *
     * @param quantitativerBetrag Der Betrag, um den der Lagerbestand erhöht werden soll.
     * @param laenge Die Länge der Balkonliegen, die hinzugefügt werden sollen.
     */
    public void erhoeheBalkonliegelagerLagerbestand(int quantitativerBetrag, Liegemoebel.Laenge laenge) {
        // Für die Anzahl der hinzuzufügenden Balkonliegen wird ein Stream erzeugt, der für jeden Wert im Stream eine Balkonliege zum Lager hinzufügt
        IntStream.range(0, quantitativerBetrag)
        .forEach(i -> balkonliegelager.addLiegemoebel(new Liegemoebel(Liegemoebel.Moebelart.Balkonliege, laenge, Moebelstueck.Kategorie.Liegemoebel, Bereich.Andere)));
    }

    /**
     * Mindert den Lagerbestand für Balkonliegen um den angegebenen Betrag.
     *
     * @param quantitativerBetrag Der Betrag, um den der Lagerbestand gemindert werden soll.
     * @param laenge Die Länge der Balkonliegen, die entfernt werden sollen.
     */
    public void mindereBalkonliegelagerLagerbestand(int quantitativerBetrag, Liegemoebel.Laenge laenge) {
        // Für die Anzahl der zu entfernenden Balkonliegen wird ein Stream erzeugt, der für jeden Wert im Stream eine Balkonliege aus dem Lager entfernt
        IntStream.range(0, quantitativerBetrag).forEach(i -> balkonliegelager.removeLiegemoebel(laenge));
    }

    /**
     * Gibt den Bestand an Balkonliegen im Lager zurück.
     *
     * @param laenge Die Länge der Balkonliegen, deren Bestand zurückgegeben werden soll.
     * @return Der Bestand an Balkonliegen im Lager.
     */
    public int getBalkonliegelagerBestand(Liegemoebel.Laenge laenge) {
        return balkonliegelager.getLiegemoebellagerBestand(laenge);
    }

    /**
     * Gibt eine ArrayList mit den Lagern aller Möbelarten zurück.
     *
     * @return Eine ArrayList mit den Lagern aller Möbelarten.
     */
    public ArrayList<Lager<? extends Moebelstueck>> getLager() {
        ArrayList<Lager<? extends Moebelstueck>> lager = new ArrayList<>();
        lager.add(buerotischlager);
        lager.add(couchtischlager);
        lager.add(esstischlager);
        lager.add(kuechentischlager);
        lager.add(kuechenstuhllager);
        lager.add(ohrensessellager);
        lager.add(fernsehcouchlager);
        lager.add(kuechenregallager);
        lager.add(beistelltischlager);
        lager.add(kleiderschranklager);
        lager.add(doppelbettlager);
        lager.add(balkonliegelager);
        return lager;
    }

    /**
     * Berechnet den Gesamtverkaufspreis aller Möbelstücke im Lager.
     * 
     * @return Der Gesamtverkaufspreis aller Möbelstücke im Lager.
     */
    public int berechenVerkaufspreisAllerMoebelImLager() {
        ArrayList<Lager<? extends Moebelstueck>> lager = getLager();
        int summe = 0;
        for (Lager<? extends Moebelstueck> l : lager) {
            summe += l.getPreis() * l.getMoebel().size();
        }
        return summe;
    }

    /**
     * Berechnet den Gesamtverkaufspreis aller Möbelstücke in einem bestimmten Bereich.
     *
     * @param bereich Der Bereich, für den der Verkaufspreis berechnet werden soll.
     * @return Der Gesamtverkaufspreis aller Möbelstücke in dem angegebenen Bereich.
     */
    public int berechenVerkaufspreisAllerMoebelEinesBereichs(Bereich bereich) {
        ArrayList<Lager<? extends Moebelstueck>> lager = getLager();
        int summe = 0;

        for (Lager<? extends Moebelstueck> l : lager) {
            try {
                if (l.getMoebel().get(0).getBereich() == bereich) {
                    summe += l.getPreis() * l.getMoebel().size();
                }
            } catch (IndexOutOfBoundsException e) {
                continue;
            }
        }
        return summe;
    }

    /**
     * Berechnet den Gesamtverkaufspreis aller Möbelstücke einer bestimmten Kategorie im Lagersystem.
     *
     * @param kategorie Die Kategorie der Möbelstücke, für die der Verkaufspreis berechnet werden soll.
     * @return Der Gesamtverkaufspreis aller Möbelstücke der angegebenen Kategorie.
     */
    public int berechenVerkaufspreisAllerMoebelEinerKategorie(Moebelstueck.Kategorie kategorie) {
        ArrayList<Lager<? extends Moebelstueck>> lager = getLager();
        int summe = 0;

        for (Lager<? extends Moebelstueck> l : lager) {
            try {
                if (l.getMoebel().get(0).getKategorie() == kategorie) {
                    summe += l.getPreis() * l.getMoebel().size();
                }
            } catch (IndexOutOfBoundsException e) {
                continue;
            }
        }
        return summe;
    }

    /**
     * Gibt den Bereich mit dem größten Gesamtwert zurück.
     *
     * @return Der Bereich mit dem größten Gesamtwert.
     */
    public Bereich getBereichMitGroesstemGesamtwert() {
        int kueche = berechenVerkaufspreisAllerMoebelEinesBereichs(Bereich.Kueche);
        int wohnen = berechenVerkaufspreisAllerMoebelEinesBereichs(Bereich.Wohnen);
        int schlafen = berechenVerkaufspreisAllerMoebelEinesBereichs(Bereich.Schlafen);
        int andere = berechenVerkaufspreisAllerMoebelEinesBereichs(Bereich.Andere);
        int max = Math.max(kueche, Math.max(wohnen, Math.max(schlafen, andere)));

        if (max == kueche) {
            return Bereich.Kueche;
        } else if (max == wohnen) {
            return Bereich.Wohnen;
        } else if (max == schlafen) {
            return Bereich.Schlafen;
        } else {
            return Bereich.Andere;
        }
    }

    /**
     * Gibt eine Liste von Möbellagerbereichen zurück, deren Gesamtpreis kleiner oder gleich dem angegebenen Betrag ist.
     *
     * @param betragInCent Der maximale Gesamtpreis in Cent.
     * @return Eine Liste von Möbellagerbereichen, deren Gesamtpreis kleiner oder gleich dem angegebenen Betrag ist.
     * Gibt null zurück, wenn keine gültigen Kombinationen gefunden werden.
     */
    public ArrayList<Lager<? extends Moebelstueck>> moebelauswahlBisBetrag(int betragInCent) {
        // Überprüfen, ob der Betrag im gültigen Bereich liegt
        if (betragInCent < 100_00 || betragInCent > 600_00) {
            return null;
        }
        ArrayList<Lager<? extends Moebelstueck>> lager = getLager();

        // Kopie des Lagers erstellen, um Elemente während der Iteration zu entfernen
        ArrayList<Lager<? extends Moebelstueck>> copyLager = lager.stream()
                .collect(Collectors.toCollection(ArrayList::new));

        // Lager mit einem Preis größer als der angegebene Betrag und Lager mit keinem Bestand entfernen
        for (Lager<? extends Moebelstueck> l : lager) {
            if (l.getPreis() > betragInCent) {
                copyLager.remove(l);
            } else if(l.getMoebel().size()==0){
                copyLager.remove(l);
            }
        }

        ArrayList<Integer> konstellationIndex = new ArrayList<>();
        return besteKonstellation(konstellationenBisBetrag(copyLager, betragInCent, 0, 0, konstellationIndex));

    }

    /**
     * Berechnet alle möglichen Kombinationen von Möbellager-Konfigurationen,
     * deren Gesamtpreis kleiner oder gleich dem angegebenen Betrag ist.
     * Es werden nur Möbellager-Konfigurationen mit unterschiedlichen Möbeln erstellt.
     *
     * @param moebelstueckeLagerArrayList Die Liste der Möbellagerbereiche.
     * @param maximalBetragInCent         Der maximale Gesamtpreis in Cent.
     * @param rekursionsIndex             Der Startindex für die Berechnung der Kombinationen.
     * @param aktuelleSumme               Der aktuelle Gesamtpreis.
     * @param konstellationIndex          Die Liste der Indizes, die die aktuelle Kombination repräsentieren.
     * @return Eine Liste von Listen, wobei jede innere Liste eine gültige Kombination von Möbellagerbereichen darstellt.
     * Gibt null zurück, wenn keine gültigen Kombinationen gefunden werden.
     */
    public ArrayList<ArrayList<Lager<? extends Moebelstueck>>> konstellationenBisBetrag(ArrayList<Lager<? extends Moebelstueck>> moebelstueckeLagerArrayList,
                                                                                        int maximalBetragInCent, int rekursionsIndex, int aktuelleSumme,
                                                                                        ArrayList<Integer> konstellationIndex) {
        // Alle möglichen Kombinationen von Möbellager-Konfigurationen, deren Gesamtpreis kleiner oder gleich dem angegebenen Betrag ist.
        ArrayList<ArrayList<Lager<? extends Moebelstueck>>> konstellationen = new ArrayList<ArrayList<Lager<? extends Moebelstueck>>>();

        for (int i = 0; i < moebelstueckeLagerArrayList.size(); i++) {

            // Kopie des aktuellen Konstellationsindexes erstellen
            ArrayList<Integer> copyKonstellationIndex = new ArrayList<>();
            for (Integer j : konstellationIndex) {
                copyKonstellationIndex.add(j);
            }

            // Aktuelle Summe aktualisieren
            int tmpaktuelleSumme = aktuelleSumme + moebelstueckeLagerArrayList.get(rekursionsIndex).getPreis();

            // Überprüfen, ob die aktuelle Summe den maximalen Betrag nicht überschreitet
            if (tmpaktuelleSumme <= maximalBetragInCent) {
                // Konstellationsindex aktualisieren
                copyKonstellationIndex.add(rekursionsIndex);

                // Konstellation erstellen
                ArrayList<Lager<? extends Moebelstueck>> konstellation = new ArrayList<>();
                for (Integer k : copyKonstellationIndex) {
                    konstellation.add(moebelstueckeLagerArrayList.get(k));
                }
                konstellationen.add(konstellation);

                // Weitere Konstellationen, die aktuelle Konstellation beinhalten, rekursiv berechnen
                if (!(rekursionsIndex + 1 == moebelstueckeLagerArrayList.size())) {
                    for (int k = rekursionsIndex + 1; k < moebelstueckeLagerArrayList.size(); k++) {
                        ArrayList<ArrayList<Lager<? extends Moebelstueck>>> weitereKonstellationen = konstellationenBisBetrag(moebelstueckeLagerArrayList, maximalBetragInCent, k, tmpaktuelleSumme, copyKonstellationIndex);
                        // Wenn weitere Konstellationen gefunden werden, werden sie zur Liste der Konstellationen hinzugefügt
                        if (weitereKonstellationen != null) {
                            konstellationen.addAll(weitereKonstellationen);
                        }
                    }
                }
            } else {
                // Wenn die aktuelle Summe den maximalen Betrag überschreitet, wird null zurückgegeben
                return null;
            }

            // Überprüfen, ob der Rekursionsindex nicht mit dem aktuellen Index übereinstimmt
            if (!(rekursionsIndex == i)) {
                return konstellationen;
            } else {
                // Rekursionsindex erhöhen, da alle Kombinationen mit Möbelarten an Rekursionsindex i bereits berechnet wurden
                rekursionsIndex++;
                konstellationIndex.clear();
            }
        }
        return konstellationen;
    }

    /**
     * Ermittelt die beste Konstellation von Lagern basierend auf dem Gesamtpreis.
     *
     * @param konstellationen Eine Liste von Listen von Lagern, die verschiedene Konstellationen darstellen.
     * @return Die beste Konstellation von Lagern basierend auf dem Gesamtpreis.
     */
    private ArrayList<Lager<? extends Moebelstueck>> besteKonstellation(ArrayList<ArrayList<Lager<? extends Moebelstueck>>> konstellationen) {
        if (konstellationen.size() == 0) {
            return null;
        }
        // Sortieren der Konstellationen basierend auf dem Gesamtpreis in absteigender Reihenfolge
        Collections.sort(konstellationen, (a, b) -> {
            // Gesamtpreis der Konstellationen berechnen
            int sumA = a.stream().mapToInt(Lager::getPreis).sum();
            int sumB = b.stream().mapToInt(Lager::getPreis).sum();
            // Sortieren in absteigender Reihenfolge
            return sumB - sumA;
        });
        // Die beste Konstellation ist die erste in der sortierten Liste
        return konstellationen.get(0);
    }


    /**
     * Zeigt alle Möbelstücke mit ihren Eigenschaften an.
     * Konsolenausgabe.
     */
    public void displayMoebelMitEigenschaft() {
        ArrayList<Lager<? extends Moebelstueck>> lager = getLager();
        for (Lager<? extends Moebelstueck> l : lager) {
            for (Moebelstueck m : l.getMoebel()) {
                System.out.println(m.toString());
            }

        }
    }

    /**
     * Sucht nach Lagerungen mit einer bestimmten Fläche.
     *
     * @param flaeche Die Fläche, nach der gesucht werden soll.
     * @return Eine Liste von Lagerungen, die die angegebene Fläche haben.
     */
    public List<Lagerung> searchLagerungMitEigenschaft(Lagerung.Flaeche flaeche) {
        List lagerungList = new ArrayList<>();
        lagerungList.add(beistelltischlager.listMitEigenschaft(flaeche));
        lagerungList.add(kleiderschranklager.listMitEigenschaft(flaeche));
        lagerungList.add(kuechenregallager.listMitEigenschaft(flaeche));
        return lagerungList;
    }

    /**
     * Sucht nach Liegemöbeln mit einer bestimmten Länge im Lagersystem.
     *
     * @param laenge Die Länge der gesuchten Liegemöbel.
     * @return Eine Liste von Liegemöbeln mit der angegebenen Länge.
     */
    public List<Liegemoebel> searchLiegemoebelMitEigenschaft(Liegemoebel.Laenge laenge) {
        List liegemoebelList = new ArrayList<>();
        liegemoebelList.add(doppelbettlager.listMitEigenschaft(laenge));
        liegemoebelList.add(balkonliegelager.listMitEigenschaft(laenge));
        return liegemoebelList;
    }

    /**
     * Sucht nach Tischen mit einer bestimmten Höhe im Lagersystem.
     *
     * @param hoehe Die Höhe der gesuchten Tische.
     * @return Eine Liste von Tischen, die die angegebene Höhe haben.
     */
    public List<Tische> searchTischMitEigenschaft(Tische.Hoehe hoehe) {
        List tischeList = new ArrayList<>();
        tischeList.add(buerotischlager.listTischeMitEigenschaft(hoehe));
        tischeList.add(couchtischlager.listTischeMitEigenschaft(hoehe));
        tischeList.add(esstischlager.listTischeMitEigenschaft(hoehe));
        tischeList.add(kuechentischlager.listTischeMitEigenschaft(hoehe));
        return tischeList;
    }

    /**
     * Sucht nach Sitzmöbeln mit einer bestimmten Eigenschaft.
     *
     * @param sitzplaetze Die Anzahl an Sitzplätzen, nach der gesucht werden soll.
     * @return Eine Liste von Sitzmöbeln, die die angegebene Eigenschaft haben.
     */
    public List<Sitzmoebel> searchSitzmoebelMitEigenschaft(Sitzmoebel.Sitzplaetze sitzplaetze) {
        List sitzmoebelList = new ArrayList<>();
        sitzmoebelList.add(kuechenstuhllager.listMitEigenschaft(sitzplaetze));
        sitzmoebelList.add(ohrensessellager.listMitEigenschaft(sitzplaetze));
        sitzmoebelList.add(fernsehcouchlager.listMitEigenschaft(sitzplaetze));
        return sitzmoebelList;
    }

    
    /**
     * Schreibt das Lagersystem-Objekt in eine Datei.
     * 
     * @param lagersystem Das Lagersystem-Objekt, das geschrieben werden soll.
     * @param file Der Dateipfad, in den das Lagersystem-Objekt geschrieben werden soll.
     * @throws IOException Wenn ein Fehler beim Schreiben in die Datei auftritt.
     */
    public void schreibeInDatei(Lagersystem lagersystem, String file) throws IOException {
        FileOutputStream f = new FileOutputStream(new File(file));
        ObjectOutputStream o = new ObjectOutputStream(f);

        o.writeObject(lagersystem);
        o.close();
        f.close();
    }

    /**
     * Liest das Lagersystem-Objekt aus einer Datei.
     * 
     * @param file Der Dateipfad, aus dem das Objekt gelesen werden soll.
     * @throws IOException Wenn ein Fehler beim Schreiben der Datei auftritt.
     * @throws ClassNotFoundException Wenn die Klasse nicht gefunden wird
     */
    public Lagersystem leseAusDatei(String file) throws IOException, ClassNotFoundException {
        FileInputStream fi = new FileInputStream(new File(file));
        ObjectInputStream oi = new ObjectInputStream(fi);

        // Lese Objekte
        return (Lagersystem) oi.readObject();

    }

}
