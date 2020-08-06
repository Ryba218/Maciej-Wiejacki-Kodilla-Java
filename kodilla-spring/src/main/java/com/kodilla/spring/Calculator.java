package com.kodilla.spring;

import com.kodilla.spring.calculator.Display;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Calculator {

    private final Display display;

    public Calculator(Display display) {
        this.display = display;
    }

    public double add(double a, double b) {
        double val = a + b;
        display.displayValue(val);
        return val;
    }

    public double sub(double a, double b) {
        double val = a - b;
        display.displayValue(val);
        return val;
    }

    public double mul(double a, double b) {
        double val = a * b;
        display.displayValue(val);
        return val;
    }
    public double div(double a, double b) {
        if (a != 0 & b != 0) {
            double val = a / b;
            display.displayValue(val);
            return val;
        } else {
            throw new ArithmeticException("Division by zero!");
        }
    }


}
