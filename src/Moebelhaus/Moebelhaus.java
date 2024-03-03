package Moebelhaus;

import GUI.Frame;
import Lager.Lagersystem;

import javax.swing.*;

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