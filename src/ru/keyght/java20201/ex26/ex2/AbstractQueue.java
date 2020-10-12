package ru.keyght.java20201.ex26.ex2;

import java.util.function.Function;
import java.util.function.Predicate;

public abstract class AbstractQueue implements Queue {
    public void clear() {
        while (!isEmpty()) {
            dequeue();
        }
    }

    public boolean isEmpty() {
        return size() == 0;
    }
}