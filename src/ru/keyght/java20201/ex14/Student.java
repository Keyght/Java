package ru.keyght.java20201.ex14;

import java.util.Collection;
import java.util.Collections;
import java.util.Objects;

public class Student implements Test {
    private int ID;
    private double average;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return ID == student.ID &&
                Double.compare(student.average, average) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID, average);
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    public Student(int ID, double average) {
        this.ID = ID;
        this.average = average;
    }

    public static void binFind(Test[] test, int first, int last, double item) {
        long start = System.currentTimeMillis();
        int position;

        position = (first + last) / 2;

        while ((test[position].getAverage() != item) && (first <= last)) {
            if (test[position].getAverage() > item) {  // если число заданного для поиска
                last = position - 1; // уменьшаем позицию на 1.
            } else {
                first = position + 1;    // иначе увеличиваем на 1
            }
            position = (first + last) / 2;
        }
        if (first <= last) {
            System.out.println("Бинарный поиск: "+item + " является " + ++position + " элементом в массиве");
            long finish = System.currentTimeMillis();
            long timeConsumedMillis = finish - start;
            System.out.println("Время поиска: "+ timeConsumedMillis);
        } else {
            System.out.println("Элемент не найден в массиве. Метод бинарного поиска закончил работу");
            long finish = System.currentTimeMillis();
            long timeConsumedMillis = finish - start;
            System.out.println("Время поиска: "+ timeConsumedMillis);
        }
    }
    public static void linSort(Test[] test, double item) {
        long start = System.currentTimeMillis();
        int i = 0;

        while (true) {
            if (test[i].getAverage() == item) {
                System.out.println("Линейный поиск: "+item + " является " + ++i + " элементом в массиве");
                long finish = System.currentTimeMillis();
                long timeConsumedMillis = finish - start;
                System.out.println("Время поиска: "+ timeConsumedMillis);
                break;
            } else if (i == test.length) {
                System.out.println("Элемент не найден в массиве. Метод линейного поиска закончил работу");
                long finish = System.currentTimeMillis();
                long timeConsumedMillis = finish - start;
                System.out.println("Время поиска: "+ timeConsumedMillis);
                break;
            }
            i++;
        }
    }

    public static void main(String[] args) {
        Test[] test = new Student[5];
        test[0] = new Student(12,4);
        test[1] = new Student(186, 4.1);
        test[2] = new Student(1, 4.3);
        test[3] = new Student(5, 5);
        test[4] = new Student(32, 5);

        linSort(test, 5);
        binFind(test,0,4, 5);
    }
}