package Moebelhaus;

import GUI.MyFrame;
import Lager.Lagersystem;

import javax.swing.*;

public class Moebelhaus extends JFrame {
    static Lagersystem lagersystem = new Lagersystem();

    public static Lagersystem getLagersystem() {
        return lagersystem;
    }

    public static void main(String[] args) {

        try {
            lagersystem = lagersystem.readFromFile("Moebelhaus.txt");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        MyFrame.baseFrame();
    }

}
