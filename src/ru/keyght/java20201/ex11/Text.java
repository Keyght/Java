package ru.keyght.java20201.ex11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Text extends JFrame {

    private JTextArea textArea1;

    public Text() {
        createGUI();
        pack();
    }

    public void createGUI() {
        JFrame frame = new JFrame("Text");

        JLabel label1 = new JLabel("Шрифт");
        frame.add(label1);

        JLabel label2 = new JLabel("Цвет");
        frame.add(label2);

        JComboBox comboBox1 = new JComboBox();
        comboBox1.setEditable(true);
        comboBox1.addItem("Times New Roman");
        comboBox1.addItem("MS Sans Serif");
        comboBox1.addItem("Courier New");
        frame.add(comboBox1);

        JComboBox comboBox2 = new JComboBox();
        comboBox2.setEditable(true);
        comboBox2.addItem("Black");
        comboBox2.addItem("Blue");
        comboBox2.addItem("Red");
        frame.add(comboBox2);

        JTextArea textArea = new JTextArea(2, 23);
        textArea.setForeground(Color.BLACK);
        textArea.setFont(new Font("Times New Roman", Font.BOLD, 15));
        frame.add(textArea);

        comboBox1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (comboBox1.getSelectedIndex()==0) {
                    textArea.setFont(new Font("Times New Roman", Font.BOLD, 15));
                }
                else if (comboBox1.getSelectedIndex()==1) {
                    textArea.setFont(new Font("MS Sans Serif", Font.BOLD, 15));
                }
                else if (comboBox1.getSelectedIndex()==2) {
                    textArea.setFont(new Font("Courier New", Font.BOLD, 15));
                }
            }
        });

        comboBox2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (comboBox2.getSelectedIndex()==0) {
                    textArea.setForeground(Color.BLACK);
                }
                else if (comboBox2.getSelectedIndex()==1) {
                    textArea.setForeground(Color.BLUE);
                }
                else if (comboBox2.getSelectedIndex()==2) {
                    textArea.setForeground(Color.RED);
                }

            }
        });

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public class TestActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {}
    }

    public static void main(String[] args) {
        new Text();
    }
}
