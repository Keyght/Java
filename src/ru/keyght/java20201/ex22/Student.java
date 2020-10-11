package ru.keyght.java20201.ex22;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Student {
    private int ID;
    private double average;
    private String birthDate;

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

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public Student(int ID, double average, String birthDate) {
        this.ID = ID;
        this.average = average;
        this.birthDate = birthDate;
    }

    public void dataToStr(String format) throws ParseException {
        String br = this.getBirthDate();
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        Date date = sdf.parse(br);
        System.out.println(date);
    }

    @Override
    public String toString() {
        return "Student{" +
                "birthDate='" + birthDate + '\'' +
                '}';
    }

    public static void main(String[] args) throws ParseException {
        Scanner in = new Scanner(System.in);
        Student student = new Student(4,4,"31.12.2012");
        System.out.println("Data format");
        String format = in.nextLine();
        student.dataToStr(format);

        String data = in.nextLine();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm");
        Date date = sdf.parse(data);
        System.out.println(date);

        Calendar calendar = new GregorianCalendar();
        calendar.setTime(date);
        System.out.println(sdf.format(calendar.getTime()));

        System.out.println("Введите фамилию разработчика");
        String name = in.nextLine();
        Date date1 = sdf.parse("2020.10.10 16:00");
        Date date2 = new Date();
        System.out.println("Разработал: " + name);
        System.out.println("Время получения: " + date1);
        System.out.println("Время сдачи: " + date2);
    }
}