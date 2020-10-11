package ru.keyght.java20201.ex23;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class City {
    private String city;
    private String country;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public City(String city, String country) {
        this.city = city;
        this.country = country;
    }

    public class Maps {
        public Maps() {
            City a = new City("Москва", "Россия");
            City b = new City("Питер", "Россия");
            City c = new City("Ухань", "Китай");
            City d = new City("Пекин", "Китай");
            ArrayList<String> l1 = new ArrayList<>();
            l1.add(a.getCity());
            l1.add(b.getCity());
            ArrayList<String> l2 = new ArrayList<>();
            l2.add(c.getCity());
            l2.add(d.getCity());
            Map<String, ArrayList<String>> map = new HashMap<>();
            map.put(a.getCountry(),l1);
            map.put(c.getCountry(),l2);
        }
    }
}
