package ru.keyght.java20201.ex10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        first();
        second();
        third();
        fourth();
        fifth();
        sixth();
        seventh();
        eighth();
        ninth();
        tenth();
        eleventh();
        twelfth();
        thirteenth();
        fourteenth();
        fifteenth();
        sixteenth();
        seventeenth();
    }

    public static void first() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            int count = 0;
            while (count != i) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println();
    }

    public static void second() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void third() {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        if (a < b) for (int i = a; i <= b; i++) {
            System.out.print(i + " ");
        }
        else if (a >= b) for (int i = a; i >= b; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void fourth() {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        int s = in.nextInt();
        int ans = 0;
        for (int i = (int) Math.pow(10, k - 1); i < Math.pow(10, k); i++) {
            int sum = 0;
            int num = i;
            while (num != 0) {
                sum += num % 10;
                num /= 10;
            }
            if (sum == s) ans++;
        }
        System.out.println(ans);
    }

    public static void fifth() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(fifthRec(n));
    }
    public static int fifthRec(int n) {
        if (n < 10) return n;
        else return (n % 10) + fifthRec(n / 10);
    }

    public static void sixth() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        sixthRec(n, 2);
    }
    public static int sixthRec(int n, int i) {
        if (n < 2) {
            System.out.println("NO");
        } else if (n == 2) {
            System.out.println("YES");
        } else if (n % i == 0) {
            System.out.println("NO");
        } else if (i < Math.sqrt(n)) {
            return sixthRec(n, i + 1);
        } else {
            System.out.println("YES");
        }
        return 0;
    }

    public static void seventh() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        seventhRec(n, 2);
    }
    public static int seventhRec(int n1, int n) {
        int t;
        t = seventhRecRec(n, 2);
        if (t == 0) return 0;
        if (n1 % t == 0 || n1 == 1) {
            System.out.println(t);
            n1 = n1 / t;
            if (n1 == 1) return 0;
            seventhRec(n1, 2);
        } else seventhRec(n1, t + 1);
        return 0;
    }
    public static int seventhRecRec(int n, int k) {
        if ((n == 2) || (n % k != 0) && (k >= Math.sqrt(n))) return n;
        else if (k < Math.sqrt(n)) seventhRecRec(n, k + 1);
        else seventhRecRec(n + 1, 2);
        return n;
    }

    public static void eighth() {
        Scanner in = new Scanner(System.in);
        String myString = in.nextLine();
        StringBuffer buffer = new StringBuffer(myString);
        buffer.reverse();
        String data = buffer.toString();
        if (myString.equals(data)) System.out.println("YES");
        else System.out.println("NO");
    }

    public static void ninth() {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println(nineRec(a, b));
    }
    public static int nineRec(int a, int b) {
        if (a > b + 1) {
            return 0;
        }
        if (a == 0 || b == 0) {
            return 1;
        }
        // Шаг рекурсии / рекурсивное условие
        return nineRec(a, b - 1) + nineRec(a - 1, b - 1);
    }

    public static void tenth() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(tenRec(n, 0));
    }
    public static int tenRec(int n, int i) {
        // return (n==0) ? i : tenRec( n/10, i*10 + n%10 );
        if (n == 0) return i;
        else return tenRec(n / 10, i * 10 + n % 10);
    }

    public static void eleventh() {
        Scanner in = new Scanner(System.in);
        int k = 0;
        int count = 0;
        int n = in.nextInt();
        if (n == 0) count++;
        while (count != 2) {
            if (n != 0) count = 0;
            if (n == 1) k++;
            n = in.nextInt();
            if (n == 0) count++;
        }
        System.out.println(k);
    }

    public static int twelfth() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n == 0) return 0;
        else if (n % 2 != 0) System.out.println(n);
        return twelfth();
    }

    public static int thirteenth() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n == 0) return 0;
        System.out.println(n);
        n = in.nextInt();
        if (n == 0) return 0;
        return thirteenth();
    }

    public static void fourteenth() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        fourteenthRec(n);
    }
    public static int fourteenthRec(int n) {
        if (n >= 10) fourteenthRec(n / 10);
        System.out.print(n % 10 + " ");
        return 0;
    }

    public static void fifteenth() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        fifteenthRec(n);
    }
    public static int fifteenthRec(int n) {
        if (n == 0) return 0;
        System.out.print((n % 10) + " ");
        fifteenthRec(n / 10);
        return 0;
    }

    public static void sixteenth() {
        int a = 0;
        System.out.println(sixteenthRec(a));
    }
    public static int sixteenthRec(int a) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int max = n;
        int k = 1;
        while (n != 0) {
            if (n == max) k++;
            if (n > max) {
                max = n;
                k = 1;
            }
            n = in.nextInt();
        }
        a = k;
        return a;
    }

    public static void seventeenth() {
        int a = 0;
        System.out.println(seventeenthRec(a));
    }
    public static int seventeenthRec(int a) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int max = n;
        while (n != 0) {
            if (n > max) max = n;
            n = in.nextInt();
        }
        a = max;
        return a;
    }
}
