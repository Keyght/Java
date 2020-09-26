package ru.keyght.java20201.ex12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window extends JFrame {
    public Window() {
        super("Planet");
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

        JTextField textField1 = new JTextField("Выберите планету", 15);
        panel.add(textField1);

        JComboBox comboBox = new JComboBox();
        comboBox.setEditable(true);
        comboBox.addItem("Mercury");
        comboBox.addItem("Venus");
        comboBox.addItem("Earth");
        comboBox.addItem("Mars");
        comboBox.addItem("Jupiter");
        comboBox.addItem("Saturn");
        comboBox.addItem("Uranus");
        comboBox.addItem("Neptune");
        panel.add(comboBox);

        JTextArea textArea = new JTextArea(1, 15);
        textArea.setText("3,72 m/s^2");
        panel.add(textArea);

        comboBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (comboBox.getSelectedIndex()==0) {
                    textArea.setText("3,72 m/s^2");
                }
                else if (comboBox.getSelectedIndex()==1) {
                    textArea.setText("8,87 m/s^2");
                }
                else if (comboBox.getSelectedIndex()==2) {
                    textArea.setText("9,77 m/s^2");
                }
                else if (comboBox.getSelectedIndex()==3) {
                    textArea.setText("3,69 m/s^2");
                }
                else if (comboBox.getSelectedIndex()==4) {
                    textArea.setText("20,87 m/s^2");
                }
                else if (comboBox.getSelectedIndex()==5) {
                    textArea.setText("7,21 m/s^2");
                }
                else if (comboBox.getSelectedIndex()==6) {
                    textArea.setText("8,43 m/s^2");
                }
                else if (comboBox.getSelectedIndex()==7) {
                    textArea.setText("10,71 m/s^2");
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
        new Window();
    }
}
