package com.kodilla.decorator.pizza;

import java.math.BigDecimal;

public class SwissCheeseDecorator extends AbstractPizzaDecorator{
    public SwissCheeseDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public BigDecimal getPrice() {
        return super.getPrice().add(new BigDecimal(7));
    }

    @Override
    public String showDescription() {
        return super.showDescription() + " + swiss cheese";
    }
}
