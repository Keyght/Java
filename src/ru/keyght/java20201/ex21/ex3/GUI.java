package ru.keyght.java20201.ex21.ex3;

import javax.swing.*;

public class GUI extends JFrame implements IDocument {
    public GUI() {
        createGUI();
        pack();
    }
    public static void main(String[] args) {
        new GUI();
    }
}
