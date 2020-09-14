package ru.keyght.java20201.ex3;

public class Human {
    public static void main(String[] args) {
        Head head = new Head(4);
        Hand hand = new Hand(45);
        Leg leg = new Leg(60);

        System.out.println(head.toString());
        System.out.println(hand.toString());
        System.out.println(leg.toString());
    }
}
