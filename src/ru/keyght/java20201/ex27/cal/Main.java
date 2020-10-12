package ru.keyght.java20201.ex27.cal;

import ru.keyght.java20201.ex27.cal.C.CalculatorController;
import ru.keyght.java20201.ex27.cal.M.Calculator;
import ru.keyght.java20201.ex27.cal.V.CalculatorView;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        CalculatorView view = new CalculatorView();
        Calculator calculator = new Calculator();
        CalculatorController control = new CalculatorController(calculator, view);

        for (JButton b : view.getKeyboard().getButtons())
            b.addActionListener(control);
    }
}