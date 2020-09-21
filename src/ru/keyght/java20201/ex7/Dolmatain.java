package ru.keyght.java20201.ex7;

public abstract class Dolmatain extends Dog {
    private String gender;
    private int weight;

    public Dolmatain(String gender, int weight) {
        this.gender = gender;
        this.weight = weight;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Dolmatain{" +
                "gender='" + gender + '\'' +
                ", weight=" + weight +
                '}';
    }
}
