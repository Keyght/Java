package ru.keyght.java20201.ex11;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.*;

public class Game extends JFrame {

    private JTextField textField1;
    private JTextField textField2;
    private JTextArea textArea;
    public int num;
    public int count = 0;

    public Game() {
        super("Game");
        createGUI();
        JFrame.setDefaultLookAndFeelDecorated(true);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void createGUI() {
        Random rand = new Random();
        num = rand.nextInt(20);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        textArea = new JTextArea("Добро пожаловать в игру <Угадай число>. " +
                " Вам необходимо угадать число от 0 до 20", 2, 23);
        textArea.setLineWrap(true);
        panel.add(textArea);

        JButton button1 = new JButton("Ввод");
        JButton button2 = new JButton("Выход");
        panel.add(button1);

        textField1 = new JTextField(2);
        panel.add(textField1);

        textField2 = new JTextField(25);
        panel.add(textField2);

        panel.add(button2);

        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (count == 4) dispose();
                int a = Integer.parseInt(textField1.getText());
                if (a == num) {
                    textField2.setText("Вы угадали!");
                    count = 4;
                }
                else if (a < num) {
                    count++;
                    if (count == 3) {
                        textField2.setText("Вы проиграли! Ваши попытки закончились");
                        count++;
                    }
                    else textField2.setText("Вы ошиблись. Загаданное число больше");
                }
                else if (a > num) {
                    count++;
                    if (count == 3) {
                        textField2.setText("Вы проиграли! Ваши попытки закончились");
                        count++;
                    }
                    else textField2.setText("Вы ошиблись. Загаданное число меньше");
                }
            }
        });
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

        getContentPane().add(panel);
        setPreferredSize(new Dimension(320, 170));
    }

        public class TestActionListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {}
        }

    public static void main(String[] args) {
        new TextChange();
    }
}