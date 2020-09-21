package ru.keyght.java20201.ex7;

public class Main {
    public static void main(String[] args) {
        Cup cup = new Cup(200, "Hello") {
            @Override
            public void wash() {
            }
        };
        Plate plate = new Plate(200, "Глубокое") {
            @Override
            public void wash() {
            }
        };
        System.out.println(cup.toString());
        System.out.println(plate.toString());

        System.out.println();

        Labrador labrador = new Labrador("Male", 10) {
            @Override
            public void walk() {
            }
        };
        Dolmatain dolmatain = new Dolmatain("Female", 6) {
            @Override
            public void walk() {
            }
        };
        System.out.println(labrador.toString());
        System.out.println(dolmatain.toString());

        System.out.println();

        Chair chair = new Chair(1, "4 ножки") {
            @Override
            public void move() {
            }
        };
        Table table = new Table(4, "Дерево") {
            @Override
            public void move() {
            }
        };
        System.out.println(chair.toString());
        System.out.println(table.toString());

        System.out.println();

        Chair[] chairs = new Chair[2];
        Table[] tables = new Table[2];
        FurnitureShop furnitureShop = new FurnitureShop(chairs, tables) {
            @Override
            public void move() {
            }
        };
        System.out.println(furnitureShop.toString());
    }
}
