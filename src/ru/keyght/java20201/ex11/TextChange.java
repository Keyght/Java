package ru.keyght.java20201.ex11;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class TextChange extends JFrame {

    private JTextArea textArea;

    public TextChange() {
        super("TextChange");
        createGUI();
        JFrame.setDefaultLookAndFeelDecorated(true);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void createGUI() {

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        JTextField textField1 = new JTextField("Шрифт", 10);
        panel.add(textField1);

        JTextField textField2 = new JTextField("Цвет", 10);
        panel.add(textField2);

        JComboBox comboBox1 = new JComboBox();
        comboBox1.setEditable(true);
        comboBox1.addItem("Times New Roman");
        comboBox1.addItem("MS Sans Serif");
        comboBox1.addItem("Courier New");
        panel.add(comboBox1);

        JComboBox comboBox2 = new JComboBox();
        comboBox2.setEditable(true);
        comboBox2.addItem("Black");
        comboBox2.addItem("Blue");
        comboBox2.addItem("Red");
        panel.add(comboBox2);

        textArea = new JTextArea(2, 23);
        textArea.setForeground(Color.BLACK);
        textArea.setFont(new Font("Times New Roman", Font.BOLD, 15));
        panel.add(textArea);

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

        getContentPane().add(panel);
        setPreferredSize(new Dimension(300, 150));
    }

    public class TestActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {}
    }

    public static void main(String[] args) {
        new TextChange();
    }
}