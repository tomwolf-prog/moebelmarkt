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
        MyFrame.baseFrame();
    }

}
