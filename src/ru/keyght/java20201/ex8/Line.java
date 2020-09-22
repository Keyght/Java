package ru.keyght.java20201.ex8;

import java.awt.*;
import java.util.Random;

public abstract class Line extends Rectangle {
    public void paint(Graphics g)
    {
        super.paint(g);
        Random rand = new Random();
        for (int i = 0; i < 6; i++) {
            int k = rand.nextInt(4);
            if (k == 1) g.setColor(Color.red);
            else if (k == 2) g.setColor(Color.blue);
            else if (k == 3) g.setColor(Color.black);
            else if (k == 4) g. setColor(Color.green);
            int q, w, e, r;
            q = rand.nextInt(600);
            w = rand.nextInt(600);
            e = rand.nextInt(600);
            r = rand.nextInt(600);
            g.drawLine(q, w, e, r);
        }
    }
    public Line() {
        super();
        setVisible(false);
    }
}