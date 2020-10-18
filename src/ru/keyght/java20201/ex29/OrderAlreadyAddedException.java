package ru.keyght.java20201.ex29;

public class OrderAlreadyAddedException extends Exception {
    private InternetOrder<Item> front;
    private int size;
    public boolean isEmpty() {
        return size == 0;
    }
    public void addAfter(Item x, Item y) {

    }

    public OrderAlreadyAddedException(InternetOrder<Item> front, int size) {
        this.front = front;
        this.size = size;
    }

    public OrderAlreadyAddedException(String message, InternetOrder<Item> front, int size) {
        super(message);
        this.front = front;
        this.size = size;
    }

    public OrderAlreadyAddedException(String message, Throwable cause, InternetOrder<Item> front, int size) {
        super(message, cause);
        this.front = front;
        this.size = size;
    }

    public OrderAlreadyAddedException(Throwable cause, InternetOrder<Item> front, int size) {
        super(cause);
        this.front = front;
        this.size = size;
    }

    public OrderAlreadyAddedException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, InternetOrder<Item> front, int size) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.front = front;
        this.size = size;
    }
}