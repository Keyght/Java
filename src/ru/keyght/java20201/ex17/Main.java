package ru.keyght.java20201.ex17;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //ввод в файл
        try (FileWriter writer = new FileWriter("notes3.txt", false)) {
            String text = in.nextLine();
            writer.write(text);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        //чтение
        try (FileReader reader = new FileReader("notes3.txt")) {
            int c;
            while ((c = reader.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println();
        //перезапись
        try (FileWriter writer = new FileWriter("notes3.txt", false)) {
            String text = in.nextLine();
            writer.write(text);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        //добавление
        try (FileWriter writer = new FileWriter("notes3.txt", true)) {
            String text = in.nextLine();
            writer.write(text);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
