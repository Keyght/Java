package ru.keyght.java20201.ex27.cal.V;

import javax.swing.*;
import java.awt.*;

public class CalculatorView extends JFrame {

    private Screen screen = new Screen();
    private Keyboard keyboard = new Keyboard();

    public CalculatorView(){
        JPanel container  = new JPanel();

        this.setTitle("Calculator");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(420, 465);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setLayout(new BorderLayout());

        container.add(screen, BorderLayout.NORTH);
        container.add(keyboard, BorderLayout.CENTER);
        container.setBackground(Color.LIGHT_GRAY);

        this.setContentPane(container);
        this.setVisible(true);
    }

    public Screen getScreen() { return screen; }

    public Keyboard getKeyboard() { return keyboard; }
}