package ru.keyght.java20201.ex26.ex1;

public class ArrayQueueModule {
    private static int head = 0;
    private static int tail = 0;
    private static Object[] elements = new Object[16];

    private static void ensureCapacity(int size) {
        if (size == elements.length || (size > 3 && size == elements.length / 4)) {
            Object[] newElements;
            if (size == elements.length) {
                newElements = new Object[elements.length * 2];
            } else {
                newElements = new Object[elements.length / 2];
            }
            if (head <= tail) {
                System.arraycopy(elements, head, newElements, 0, size());
            } else {
                System.arraycopy(elements, head, newElements, 0, elements.length - head);
                System.arraycopy(elements, 0, newElements, elements.length - head, tail);
            }
            tail = size();
            head = 0;
            elements = newElements;
        }
    }

    public static void enqueue(Object element) {
        ensureCapacity(size() + 1);
        elements[tail] = element;

        tail = (tail + 1) % elements.length;
    }

    public static Object element() {
        assert !isEmpty();

        return elements[head];
    }

    public static Object dequeue() {
        assert !isEmpty();
        ensureCapacity(size() - 1);

        Object r = elements[head];
        elements[head] = null;
        head = (head + 1) % elements.length;
        return r;
    }

    public static int size() {
        return tail - head + (head > tail ? elements.length : 0);
    }

    public static boolean isEmpty() {
        return head == tail;
    }

    public static void clear() {
        while (!isEmpty()) {
            dequeue();
        }
    }
}