package ru.keyght.java20201.ex13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortingStudentsByGPA {

    public static class AverageComparator implements Comparator<Student> {
        @Override
        public int compare(Student o1, Student o2) {
            return o1.getAverage() > o2.getAverage() ? 1 : (o1.getAverage() < o2.getAverage() ? -1 : 0);
        }
    }

        public static void main(String[] args) {

            ArrayList<Student> al1 = new ArrayList<Student>();
            al1.add(new Student(12, 4.6));
            al1.add(new Student(186, 4));
            al1.add(new Student(1, 3));
            al1.add(new Student(5, 5));
            al1.add(new Student(32, 3.5));

            ArrayList<Student> al2 = new ArrayList<Student>();
            al2.add(new Student(122, 4.2));
            al2.add(new Student(18, 4.1));
            al2.add(new Student(7, 3.9));
            al2.add(new Student(53, 2.7));
            al2.add(new Student(45, 3.7));

            al1.addAll(al2);
            Collections.sort(al1, new AverageComparator());

            for (Student s : al1) {
                System.out.print(s.getAverage() + " ");
            }

        }
}
