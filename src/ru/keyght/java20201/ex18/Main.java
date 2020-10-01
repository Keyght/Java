package ru.keyght.java20201.ex18;

import java.util.Scanner;

public class Main {

    public void exceptionDemo() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an integer ");
        String intString = in.next();
        int i = Integer.parseInt(intString);
        System.out.println(2 / i);
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.exceptionDemo();
    }
}
