package ru.keyght.java20201;

import java.util.Random;

public class Main
{
    public static void main(String[] args)
    {
        task3();
        task4(args);
        task5();
        task6();
    }
    public static void task3()
    {
        int[] a = {1, 2, 3, 4, 5};
        int b = 0;
        for (int i = 0; i < 5; i++) {
            b += a[i];
        }
        System.out.println(b);
        b = 0;
        int i = 0;
        while (i != 5)
        {
            b+= a[i];
            i++;
        }
        System.out.println(b);
        b = 0;
        i = 0;
        do
        {
            b+= a[i];
            i++;
        } while (i != 5);
        System.out.println(b);
    }
    public static void task4(String[] args)
    {
        System.out.print("Args: ");
        for (int j = 0; j < args.length; j++) System.out.print(args[j]+" ");
        System.out.println();
    }
    public static void task5()
    {
        System.out.print("Garmonic: ");
        for (int i = 1; i < 11; i++)
        {
            double d = 1.0 / i;
            String s = String.format("%.3f", d);
            System.out.print(s + " ");
        }
        System.out.println();
    }

    public static void task6()
    {
        double[] a = new double[5];
        System.out.print("MassMath: ");
        for (int i = 0; i < a.length; i++)
        {
            a[i] = Math.random()*100;
            System.out.print(a[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < a.length; i++)
        {
            int pos = i;
            double min = a[i];
            for (int j = i + 1; j < a.length; j++)
            {
                if (a[j] < min)
                {
                    pos = j;
                    min = a[j];
                }
            }
            a[pos] = a[i];
            a[i] = min;
        }
        System.out.print("sortMassMath: ");
        for (int i = 0; i < a.length; i++)
        {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
    public static void task7()
    {

    }
}

