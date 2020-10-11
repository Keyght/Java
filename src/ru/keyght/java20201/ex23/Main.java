package ru.keyght.java20201.ex23;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {

    public Main () {
        createMap();
    }

    public void createMap() {
        Map <String, String> map = new HashMap<>();
        map.put("a","b");
        map.put("c","d");
        map.put("e","f");
        map.put("g","h");
        map.put("i","j");
        map.put("k","l");
        map.put("m","b");
        map.put("n","d");
        map.put("o","f");
        Map <String, String> map2 = new HashMap<>();
        map2.put("a","b");
        map2.put("c","d");
        map2.put("e","f");
        map2.put("g","h");
        map2.put("i","j");
        map2.put("k","l");
        map2.put("m","b");
        map2.put("n","d");
        map2.put("o","f");
        System.out.println("До");
        for(Map.Entry<String, String> pair : map.entrySet())
        {
            String key = pair.getKey();
            String value = pair.getValue();
            System.out.println(key+" "+value);
        }
        for(Map.Entry<String, String> pair : map.entrySet())
        {
            String value = pair.getValue();
            int k = 0;
            for(Map.Entry<String, String> pairs : map.entrySet())
            {
                String key = pairs.getKey();
                String value2 = pairs.getValue();
                if (value2 == value) k++;
                if ((k > 1) && (value == value)) map2.remove(key);

            }
        }
        System.out.println("После");
        for(Map.Entry<String, String> pair : map2.entrySet())
        {
            String key = pair.getKey();
            String value = pair.getValue();
            System.out.println(key+" "+value);
        }
    }

    public static void main(String[] args) {
        new Main();
    }
}
