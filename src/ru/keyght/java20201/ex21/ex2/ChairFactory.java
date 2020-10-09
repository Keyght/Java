package ru.keyght.java20201.ex21.ex2;

public abstract class ChairFactory implements AbstractChairFactory{
    public abstract VictorianChair createVictorianChair();
    public abstract MagicChair createMagicianChair();
    public abstract FunctionalChair createFunctionalChair();
}