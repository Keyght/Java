package ru.keyght.java20201.ex7;

public abstract class Chair extends Furniture{
    private int weight;
    private String type;

    public Chair(int weight, String type) {
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
        return "Chair{" +
                "weight=" + weight +
                ", type='" + type + '\'' +
                '}';
    }
}
