package ru.keyght.java20201.ex30;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите стоимость, название и описание напитка");
        int cost = in.nextInt();
        String name = in.nextLine();
        String description = in.nextLine();
        MenuItem menuItem = new MenuItem(cost, name, description);
        System.out.println("Ваш заказ сформирован");
    }
}
