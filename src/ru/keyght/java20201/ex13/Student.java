package ru.keyght.java20201.ex13;

public class Student {
    private int ID;
    private double average;

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
}