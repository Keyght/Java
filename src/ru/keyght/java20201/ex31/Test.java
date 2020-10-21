package ru.keyght.java20201.ex31;

public class Test {
    int a, b, result;

    public Test(int a, int b, int result) {
        this.a = a;
        this.b = b;
        this.result = result;
    }
    public Test() {}

    public int sum() {
        return result=a+b;
    }
    public int milt() {
        return result=a*b;
    }
    public int divide() {
        return result=a/b;
    }
}
