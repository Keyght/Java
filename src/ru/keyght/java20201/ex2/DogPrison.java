package ru.keyght.java20201.ex2;

public class DogPrison {
    private Dog[] cell = new Dog[10];
    private int i = 0;

    public void add(Dog dog) {
        cell[i] = dog;
        i++;
    }

    public int getI() {
        return i;
    }

    public void addDogs(Dog[] dogs) {
        dogs[0] = new Dog("Бобик", 4);
        dogs[1] = new Dog("Жужик", 6);
        dogs[2] = new Dog("Шарик", 9);
        dogs[3] = new Dog("Тузик", 10);
        dogs[4] = new Dog("Рюрик", 11);
        dogs[5] = new Dog("Костик", 12);
        for (int j = 0; j < 6; j++) {
            add(dogs[j]);
        }
    }

    public void info()
    {
        System.out.print("Имена собак: ");
        for (int j = 0; j < i; j++) {
            System.out.print(cell[j].getName() + " ");
        }
    }
}
