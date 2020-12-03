package com.kodilla.decorator.pizza;

import java.math.BigDecimal;

public class PizzaBasic implements Pizza {

    @Override
    public BigDecimal getPrice() {
        return new BigDecimal(15);
    }

    @Override
    public String showDescription() {
        return "Pizza with cheese and tomato sauce";
    }
}
