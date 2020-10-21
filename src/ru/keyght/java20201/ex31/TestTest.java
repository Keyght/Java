package ru.keyght.java20201.ex31;

import org.junit.Assert;

import static org.junit.jupiter.api.Assertions.*;

class TestTest {

    @org.junit.jupiter.api.Test
    void sum() {
        Test test = null;

        Assert.assertNotNull(test);
    }

    @org.junit.jupiter.api.Test
    void milt() {
        Test test = new Test(1,3,0);

        Assert.assertNotNull(test);
    }

    @org.junit.jupiter.api.Test
    void divide() {
        Test test = new Test();
        test.b = 0;
        Assert.assertNotEquals(0,test.b);
    }
}