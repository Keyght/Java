package ru.keyght.java20201.ex24;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Person {
    private String name;
    private String surname;
    private String lastname;
    public Address address = new Address();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public  Person() {}

    public String getFio() {
        String fio;
        if ((name != null) && (surname != null) && (lastname != null)) {
            fio = surname + " " + name + " " + lastname;
            return fio;
        } else return "Не хватает данных ФИО";
    }

    public class Address {
        public String country;
        public String region;
        public String city;
        public String street;
        public String house;
        public String structure;
        public String flat;
    }

    public static void main(String[] args) {
        Person anime = new Person();
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        String[] arr = a.split(",");
        anime.address.country = arr[0];
        anime.address.region = arr[1];
        anime.address.city = arr[2];
        anime.address.street = arr[3];
        anime.address.house = arr[4];
        anime.address.structure = arr[5];
        anime.address.flat = arr[6];

        Person shtuka = new Person();
        a = in.nextLine();
        arr = a.split(",");
        shtuka.address.country = arr[0];
        shtuka.address.region = arr[1];
        shtuka.address.city = arr[2];
        shtuka.address.street = arr[3];
        shtuka.address.house = arr[4];
        shtuka.address.structure = arr[5];
        shtuka.address.flat = arr[6];

        Person dlya = new Person();
        a = in.nextLine();
        StringTokenizer st = new StringTokenizer(a, ",.;");
        int i=0;
        while (st.hasMoreTokens()) {
            if (i == 0) dlya.address.country = st.nextToken();
            if (i == 1) dlya.address.region = st.nextToken();
            if (i == 2) dlya.address.city = st.nextToken();
            if (i == 3) dlya.address.street = st.nextToken();
            if (i == 4) dlya.address.house = st.nextToken();
            if (i == 5) dlya.address.structure = st.nextToken();
            if (i == 6) dlya.address.flat = st.nextToken();
            i++;
        }

        Person umnih = new Person();
        a = in.nextLine();
        st = new StringTokenizer(a, ",.;");
        i=0;
        while (st.hasMoreTokens()) {
            if (i == 0) umnih.address.country = st.nextToken();
            if (i == 1) umnih.address.region = st.nextToken();
            if (i == 2) umnih.address.city = st.nextToken();
            if (i == 3) umnih.address.street = st.nextToken();
            if (i == 4) umnih.address.house = st.nextToken();
            if (i == 5) umnih.address.structure = st.nextToken();
            if (i == 6) umnih.address.flat = st.nextToken();
            i++;
        }
    }
}