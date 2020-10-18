package ru.keyght.java20201.ex28;

import java.util.Scanner;

public class ShoppingCartTest {

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Scanner in = new Scanner(System.in);

       while (true) {
           System.out.println("Выберите товар по коду: ");
           System.out.println("1. 1234");
           System.out.println("2. 5678");
           System.out.println("3. Выход");
           int a = in.nextInt();
           if (a == 1) {
               Item item1 = new Item("1234",10);
               cart.addItem(item1);
               System.out.println("Выберите способ оплаты:");
               System.out.println("1. Paypal");
               System.out.println("2. CreditCard");
               a = in.nextInt();
               if (a == 1)  cart.pay(new PaypalStrategy("myemail@example.com", "mypwd"));
               else if (a == 2) cart.pay(new CreditCardStrategy("Pankaj Kumar", "1234567890123456", "786", "12/15"));
           }
           else if (a == 2) {
               Item item2 = new Item("5678",40);
               cart.addItem(item2);
               System.out.println("Выберите способ оплаты:");
               System.out.println("1. Paypal");
               System.out.println("2. CreditCard");
               a = in.nextInt();
               if (a == 1)  cart.pay(new PaypalStrategy("myemail@example.com", "mypwd"));
               else if (a == 2) cart.pay(new CreditCardStrategy("Pankaj Kumar", "1234567890123456", "786", "12/15"));
           }
           else if (a == 3) break;
       }
    }
}