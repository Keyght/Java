package ru.keyght.java20201.ex21.ex1;

public abstract class ConcreteFactory implements ComplexAbstractFactory {
    public abstract Complex createComplex();
    public abstract Complex CreateComplex(int real, int image);
}
