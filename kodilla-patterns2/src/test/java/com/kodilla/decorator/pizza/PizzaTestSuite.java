package com.kodilla.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class PizzaTestSuite {

    @Test
    public void testBasicPizzaGetPrice() {
        //Given
        Pizza thePizza = new PizzaBasic();
        //When
        BigDecimal thePrice = thePizza.getPrice();
        //Then
        assertEquals(new BigDecimal(15),thePrice);
    }

    @Test
    public void testBasicPizzaShowDescription() {
        //Given
        Pizza thePizza = new PizzaBasic();
        //When
        String description = thePizza.showDescription();
        //Then
        assertEquals("Pizza with cheese and tomato sauce", description);
    }

    @Test
    public void testAllIngredientsPizzaGetPrice() {
        //Given
        Pizza thePizza = new PizzaBasic();
        thePizza = new MushroomsDecorator(thePizza);
        thePizza = new ArcticSpinachDecorator(thePizza);
        thePizza = new SwissCheeseDecorator(thePizza);
        thePizza = new VegetablesDecorator(thePizza);
        //When
        BigDecimal thePrice = thePizza.getPrice();
        //Then
        assertEquals(new BigDecimal(32),thePrice);
    }

    @Test
    public void testAllIngredientsPizzaShowDescription() {
        //Given
        Pizza thePizza = new PizzaBasic();
        thePizza = new MushroomsDecorator(thePizza);
        thePizza = new ArcticSpinachDecorator(thePizza);
        thePizza = new SwissCheeseDecorator(thePizza);
        thePizza = new VegetablesDecorator(thePizza);
        //When
        String description = thePizza.showDescription();
        //Then
        assertEquals("Pizza with cheese and tomato sauce + mushrooms + arctic spinach + swiss cheese + vegetables", description);
    }
}
