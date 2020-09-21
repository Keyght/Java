package ru.keyght.java20201.ex7;

public abstract class Table extends Furniture {
    private int weight;
    private String type;

    public Table(int weight, String type) {
        this.weight = weight;
        this.type = type;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Table{" +
                "weight=" + weight +
                ", type='" + type + '\'' +
                '}';
    }
}
