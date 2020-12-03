package com.kodilla.decorator.pizza;

import java.math.BigDecimal;

public class VegetablesDecorator extends AbstractPizzaDecorator {
    public VegetablesDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public BigDecimal getPrice() {
        return super.getPrice().add(new BigDecimal(3));
    }

    @Override
    public String showDescription() {
        return super.showDescription() + " + vegetables";
    }
}
