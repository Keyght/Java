package ru.keyght.java20201.ex8;

import javax.swing.*;
import java.awt.*;

class ShowImage extends JPanel
{
    private Image img;

    ShowImage(String[] args)
    {
        img = getToolkit().getImage(args[0]);
        setPreferredSize(new Dimension(500, 600));
    }

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.drawImage(img, 10, 10, this);
    }
}



class Frame extends JFrame
{
    Frame(String[] args)
    {
        setContentPane(new ShowImage(args));
    }
    public static void main(String[] args)
    {
        Frame myFrame = new Frame(args);
        myFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        Graphics gr = myFrame.getGraphics();
        myFrame.paintComponents(gr);
        myFrame.pack();
        myFrame.setVisible(true);
    }
}