package ru.keyght.java20201.ex9;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public abstract class Window extends Oval {
    public Window() {

        super();
        JFrame myWindow = new JFrame("Shapes");
        myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton button = new JButton("<html><h2><font color=\"yellow\">Нарисовать 20 фигур");
        button.addActionListener(new ListenerAction());
        myWindow.add(button);
        myWindow.pack();
        myWindow.setVisible(true);
        myWindow.setSize(500,200);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    }

    class ListenerAction implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            setVisible(true);
        }
    }
}