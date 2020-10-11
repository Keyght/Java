package ru.keyght.java20201.ex24;

import java.util.Scanner;

public class Number {
    public String last4 = new String();
    public String last3 = new String();
    public String first3 = new String();
    public String kode = new String();
    public Boolean plus = true;

    public void job(String q) {
        int j = 1;
        for (int i = q.length()-3-1; i < q.length(); i++) last4 += q.charAt(i);
        for (int i = q.length()-3-3-1; i < q.length()-3-1; i++) last3 += q.charAt(i);
        for (int i = q.length()-3-3-3-1; i < q.length()-3-3-1; i++) first3 += q.charAt(i);
        if (q.charAt(0) == '+') for (int i = 0; i < q.length()-3-3-3-1; i++) kode += q.charAt(i);
        else {
            plus = false;
            for (int i = 0; i < q.length()-3-3-3-1; i++) kode += q.charAt(i);
        }
        if ((plus==false)&&(q.charAt(0) == '8')) System.out.println("+7"+first3+"-"+last3+"-"+last4);
        if (plus) System.out.println(kode+first3+"-"+last3+"-"+last4);
    }

    public static void main(String[] args) {
        Number a = new Number();
        Scanner in = new Scanner(System.in);
        String q = in.nextLine();
        a.job(q);
    }
}
