package ru.keyght.java20201.ex2;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape("Green", 45);
        Shape shape2 = new Shape("Black", 65);

        Ball ball1 = new Ball("Wolley", 10);
        Ball ball2 = new Ball("Foot", 20);

        Book book1 = new Book("Преступление и наказание", 400);
        Book book2 = new Book("Идиот", 200);

        Dog[] dogs = new Dog[6];
        DogPrison tak = new DogPrison();
        tak.addDogs(dogs);
        tak.info();
    }
}
