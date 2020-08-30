package com.kodilla.patterns.builder.bigmac;

import java.util.List;

public class Ingredient {
    public static final String LETTUCE  = "LETTUCE";
    public static final String ONION = "ONION";
    public static final String BACON = "BACON";
    public static final String CUCUMBER = "CUCUMBER";
    public static final String CHILI_PEPPER = "CHILI_PEPPER";
    public static final String MUSHROOMS = "MUSHROOMS";
    public static final String SHRIMPS = "SHRIMPS";
    public static final String CHEESE = "CHEESE";
    private final List ingredientType;

    public Ingredient(List ingredientType) {
        if (ingredientType.equals(LETTUCE) || ingredientType.equals(ONION) || ingredientType.equals(BACON) ||
                ingredientType.equals(CUCUMBER) || ingredientType.equals(CHILI_PEPPER) || ingredientType.equals(MUSHROOMS) ||
                ingredientType.equals(SHRIMPS) || ingredientType.equals(CHEESE)) {
            this.ingredientType = ingredientType;
        } else {
            throw new IllegalStateException("Incorrect ingredient");
        }
    }

    public List getIngredientType() {
        return ingredientType;
    }
}


