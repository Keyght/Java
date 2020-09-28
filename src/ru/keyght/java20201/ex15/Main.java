package ru.keyght.java20201.ex15;

import ru.keyght.java20201.ex13.Student;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> al1 = new ArrayList<Student>();
        al1.add(new Student(12, 4.6));
        al1.add(new Student(186, 4));
        al1.add(new Student(1, 3));
        al1.add(new Student(5, 5));
        al1.add(new Student(32, 3.5));
        al1.add(new Student(1,2));
        System.out.println(al1.size());
        for (Student s : al1) {
            System.out.print(s.getAverage() + " ");
        }

        LinkedList<String> al2 = new LinkedList<String>();
        al2.add("Ку");
        al2.add("Привет");
        al2.add("Здарова");
        al2.add("Брат");
        al2.add("Давай");
        System.out.println(al2.size());
        System.out.println(al1.size());
        for (String s : al2) {
            System.out.print(s + " ");
        }
        System.out.println();

        Collection<Student> al3 = new Collection<Student>();
        al3.add(new Student(12, 4.6));
        al3.add(new Student(186, 4));
        al3.add(new Student(1, 3));
        al3.add(new Student(5, 5));
        al3.add(new Student(32, 3.5));
        al3.add(new Student(1,2));
        System.out.println(al3.size());
        for (int i = 0; i < 6; i++) {
            System.out.print(al3.get(i)+" ");
        }
    }
}
