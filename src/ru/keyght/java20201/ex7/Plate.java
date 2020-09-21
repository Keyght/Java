package ru.keyght.java20201.ex7;

public abstract class Plate extends Dish {
    private int quantity;
    private String type;

    public Plate(int quantity, String type) {
        this.quantity = quantity;
        this.type = type;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Plate{" +
                "quantity=" + quantity +
                ", type='" + type + '\'' +
                '}';
    }
}
