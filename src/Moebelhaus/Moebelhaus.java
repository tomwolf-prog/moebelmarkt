package Moebelhaus;

import GUI.StartScreen;
import Lager.Lagersystem;

import javax.swing.*;

public class Moebelhaus extends JFrame {
    static Lagersystem lagersystem = new Lagersystem();

    public static void main(String[] args) {


        StartScreen.start();
    }

    public static Lagersystem getLagersystem() {
        return lagersystem;
    }

}
