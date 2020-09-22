package ru.keyght.java20201.ex8;

import javax.swing.*;
import java.awt.*;

public abstract class Shape extends JFrame {
    public Shape() {
        super("Shapes");
        JFrame.setDefaultLookAndFeelDecorated(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setSize(1000, 1000);
        setVisible(false);
    }

    public abstract void a();
}