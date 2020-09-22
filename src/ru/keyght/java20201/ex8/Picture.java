package ru.keyght.java20201.ex8;

import java.awt.Desktop;
import java.io.File;

public class Picture {
    public static void main(String[] args) throws Exception {
        File f = new File(args[0]);
        Desktop dt = Desktop.getDesktop();
        dt.open(f);
    }
}