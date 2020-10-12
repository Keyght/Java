package ru.keyght.java20201.ex27.cal.V;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class Screen extends JLabel {

    public Screen(){
        super("0");
        this.setPreferredSize(new Dimension(400, 70));
        this.setOpaque(true);
        this.setHorizontalAlignment(RIGHT);
        this.setBorder(new EmptyBorder(10, 10, 10, 10));
        this.setFont(new Font("Sans-Sarif", Font.PLAIN, 24));
    }
}