package ru.keyght.java20201.ex19;

import java.util.Comparator;


class SortingStudentByFio implements Comparator<Student>  {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getFio().compareTo(o2.getFio());
    }

}