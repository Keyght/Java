package ru.keyght.java20201.ex25;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Skobi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        String a = input;
        Pattern pattern = Pattern.compile("\\([\\d+/*-]*\\)");
        Matcher matcher = pattern.matcher(input);
        do {
            input = matcher.replaceAll("");
            matcher = pattern.matcher(input);
        } while (matcher.find());
        if (input.matches("[\\d+/*-]*")) System.out.println(a);
    }
}