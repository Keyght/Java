package ru.keyght.java20201.ex32;

import ru.keyght.java20201.ex30.*;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите стоимость, название и описание напитка");
        int cost = in.nextInt();
        String name = in.nextLine();
        String description = in.nextLine();
        MenuItem menuItem = new MenuItem(cost, name, description);
        try (FileWriter writer = new FileWriter("notes4.txt", false)) {
            writer.write(menuItem.toString());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("Ваш заказ сформирован");
        System.out.println("Ваш заказ: ");
        try (FileReader reader = new FileReader("notes4.txt")) {
            int c;
            while ((c = reader.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
