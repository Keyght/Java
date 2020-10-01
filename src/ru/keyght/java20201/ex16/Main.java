package ru.keyght.java20201.ex16;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        ArrayList<Integer> b = new ArrayList<Integer>();
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 5; i++) a.add(in.nextInt());
        for (int i = 0; i < 5; i++) b.add(in.nextInt());
        int i = 0;
        while (true) {
            if (i == 106) System.out.println("botva");
             else if ((a.size() != 0) && (b.size() != 0)) {
                if ((a.get(0) == 9) && (b.get(0) == 0)) {
                    b.add(a.get(0));
                    b.add(b.get(0));
                    a.remove(0);
                    b.remove(0);
                }
                else if ((a.get(0) == 0) && (b.get(0) == 9)) {
                    a.add(a.get(0));
                    a.add(b.get(0));
                    a.remove(0);
                    b.remove(0);
                }
                else if (a.get(0) > b.get(0)) {
                    a.add(a.get(0));
                    a.add(b.get(0));
                    a.remove(0);
                    b.remove(0);
                }
                else if (a.get(0) < b.get(0)) {
                    b.add(a.get(0));
                    b.add(b.get(0));
                    a.remove(0);
                    b.remove(0);
                }
            }
            else if (a.size() == 0) {
                System.out.println("second "+i);
                break;
            }
            else if (b.size() == 0) {
                System.out.println("first "+i);
                break;
            }
            i++;
        }
    }
}
