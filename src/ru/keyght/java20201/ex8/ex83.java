package ru.keyght.java20201.ex8;

import java.awt.*;
import java.awt.image.*;
import javax.swing.*;
import java.util.Timer;
import java.util.TimerTask;

public class ex83 extends JFrame  {

    ImageIcon icon1 = new ImageIcon("C:\\Users\\keyght\\Pictures\\Screenshots\\Снимок экрана (15).png");
    ImageIcon icon2 = new ImageIcon("C:\\Users\\keyght\\Pictures\\Screenshots\\Снимок экрана (16).png");
    Image im1 = icon1.getImage();
    Image im2 = icon2.getImage();

    BufferedImage dest;

    float sourcePercentage = 1, destinationPercentage = 0;
    private static int STEPS = 100;
    private static float STEP_CHANGE = 1.0f / STEPS;
    private static int SLEEP_DELAY = 50;

    public ex83() {
        super("Image Blending");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        dest = new BufferedImage(1920, 1080, BufferedImage.TYPE_INT_ARGB);
        setSize(1920, 1080);
        TimerTask task = new TimerTask() {
            public void run() {
                repaint();
                sourcePercentage -= STEP_CHANGE;
                destinationPercentage += STEP_CHANGE;
            }
        };
        Timer timer = new Timer();
        timer.schedule(task, 0, SLEEP_DELAY);
    }

    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        Graphics2D destG = dest.createGraphics();
        destG.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC,sourcePercentage));
        destG.drawImage(im1, 0, 0, this);
        destG.setComposite(AlphaComposite.getInstance(AlphaComposite.XOR,destinationPercentage));
        destG.drawImage(im2, 0, 0, this);
        g2d.drawImage(dest, 0, 0, this);
    }

    public static void main  (String args[]) {
        new ex83().show();
    }
}