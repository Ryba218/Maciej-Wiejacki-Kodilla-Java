package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BicMacTestSuite {
    @Test
    public void testBigMacBuilder() {
        //Given
        BigMac bigMac = new BigMac.BigMacBuilder()
                .roll(Roll.SESAME)
                .burgers(2)
                .sauce(Sauce.THOUSAND_ISLANDS)
                .ingredient(Ingredient.CHEESE)
                .ingredient(Ingredient.ONION)
                .ingredient(Ingredient.BACON)
                .build();
        System.out.println(bigMac);
        //When
        String roll = bigMac.getRoll();
        String sauce = bigMac.getSauce();
        int burgersQuantity = bigMac.getBurgers();
        int ingredientsQuantity = bigMac.getIngredients().size();
        //Then
        Assert.assertEquals(Roll.SESAME,roll);
        Assert.assertEquals(Sauce.THOUSAND_ISLANDS,sauce);
        Assert.assertEquals(2,burgersQuantity);
        Assert.assertEquals(3,ingredientsQuantity);


    }
}
