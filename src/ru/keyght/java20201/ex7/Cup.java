package ru.keyght.java20201.ex7;

public abstract class Cup extends Dish {

    private int volume;
    private String text;

    public Cup(int volume, String text) {
        this.volume = volume;
        this.text = text;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Cup{" +
                "volume=" + volume +
                ", text='" + text + '\'' +
                '}';
    }
}
