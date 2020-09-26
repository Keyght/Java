package ru.keyght.java20201.ex11;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Map extends JFrame{
    public Map() {
        createGUI();
        pack();
    }

    public void createGUI() {
        JFrame frame = new JFrame("Map");

        JPanel panel = new JPanel();
        panel.setLayout(null);

        JButton button1 = new JButton("NORTH");
        button1.setBounds(200, 50,100,50);
        panel.add(button1);

        JButton button2 = new JButton("CENTER");
        button2.setBounds(200, 200,100,50);
        panel.add(button2);

        JButton button3 = new JButton("SOUTH");
        button3.setBounds(200, 350,100,50);
        panel.add(button3);

        JButton button4 = new JButton("WEST");
        button4.setBounds(25, 200,100,50);
        panel.add(button4);

        JButton button5 = new JButton("EAST");
        button5.setBounds(360, 200,100,50);
        panel.add(button5);

        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showConfirmDialog(panel, "Добро пожаловать в САО", "Внимание!",JOptionPane.DEFAULT_OPTION);
            }
        });

        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showConfirmDialog(panel, "Добро пожаловать в ЦАО", "Внимание!",JOptionPane.DEFAULT_OPTION);
            }
        });

        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showConfirmDialog(panel, "Добро пожаловать в ЮЗАО", "Внимание!",JOptionPane.DEFAULT_OPTION);
            }
        });

        button4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showConfirmDialog(panel, "Добро пожаловать в ЗАО", "Внимание!",JOptionPane.DEFAULT_OPTION);
            }
        });

        button5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showConfirmDialog(panel, "Добро пожаловать в СВАО", "Внимание!",JOptionPane.DEFAULT_OPTION);
            }
        });

        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public class TestActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {}
    }

    public static void main(String[] args) {
        new Map();
    }
}
