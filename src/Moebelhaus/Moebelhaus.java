package Moebelhaus;

import GUI.Frame;
import Lager.Lagersystem;

import javax.swing.*;

/**
 * Diese Klasse Möbelhaus startet die GUI und lädt das Lagersystem aus einer Datei.
 * 
 * @see Lagersystem
 * @author Sidney Schmidt, Tom Wolf
 */
public class Moebelhaus extends JFrame {
    static Lagersystem lagersystem = new Lagersystem();

    public static Lagersystem getLagersystem() {
        return lagersystem;
    }

    public static void main(String[] args) {

        try {
            lagersystem = lagersystem.leseAusDatei("Moebelhaus.txt");
        } catch (Exception e) {
            System.out.println("Datei wurde nicht geladen.");
        }

        Frame.baseFrame();
    }

}