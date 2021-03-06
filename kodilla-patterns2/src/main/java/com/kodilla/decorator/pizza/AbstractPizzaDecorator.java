package com.kodilla.decorator.pizza;

import java.math.BigDecimal;

public abstract class AbstractPizzaDecorator implements Pizza {
    private final Pizza pizza;

    public AbstractPizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public BigDecimal getPrice() {
        return pizza.getPrice();
    }

    @Override
    public String showDescription() {
        return pizza.showDescription();
    }
}
