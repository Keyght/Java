package ru.keyght.java20201.ex25;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IP {
    public static void main(String[] args) {
        String regexp = "(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)";
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        if (a.matches(regexp)) System.out.println("Это IP");
        else System.out.println("Это не IP");
    }
}
