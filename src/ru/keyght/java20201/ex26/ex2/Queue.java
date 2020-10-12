package ru.keyght.java20201.ex26.ex2;

public interface Queue {
    void enqueue(Object element);
    Object element();
    Object dequeue();
    int size();
    boolean isEmpty();
    void clear();
}