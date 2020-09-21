package ru.keyght.java20201.ex7;

public abstract class Labrador extends Dog {
    private String gender;
    private int weight;

    public Labrador(String gender, int weight) {
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
        return "Labrador{" +
                "gender='" + gender + '\'' +
                ", weight=" + weight +
                '}';
    }
}
