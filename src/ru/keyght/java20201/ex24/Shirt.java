package ru.keyght.java20201.ex24;

import java.util.Scanner;

public class Shirt {
    public String SN;
    public String name;
    public String color;
    public String size;

    public void print() {
        System.out.println(SN);
        System.out.println(name);
        System.out.println(color);
        System.out.println(size);
    }

    public static void main(String[] args) {
        String[] shirts = new String[11];
        shirts[0] = "S001,Black Polo Shirt,Black,XL";
        shirts[1] = "S002,Black Polo Shirt,Black,L";
        shirts[2] = "S003,Blue Polo Shirt,Blue,XL";
        shirts[3] = "S004,Blue Polo Shirt,Blue,M";
        shirts[4] = "S005,Tan Polo Shirt,Tan,XL";
        shirts[5] = "S006,Black T-Shirt,Black,XL";
        shirts[6] = "S007,White T-Shirt,White,XL";
        shirts[7] = "S008,White T-Shirt,White,L";
        shirts[8] = "S009,Green T-Shirt,Green,S";
        shirts[9] = "S010,Orange T-Shirt,Orange,S";
        shirts[10] = "S011,Maroon Polo Shirt,Maroon,S";
        Shirt[] shirts1 = new Shirt[11];
        for (int i = 0; i < 11; i++) {
            shirts1[i] = new Shirt();
        }
        for (int i = 0; i < 11; i++) {
            String[] arr = shirts[i].split(",");
            shirts1[i].SN = arr[0];
            shirts1[i].name = arr[1];
            shirts1[i].color = arr[2];
            shirts1[i].size = arr[3];
        }
    }
}
