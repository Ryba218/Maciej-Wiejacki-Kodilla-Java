package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BigMac {
    private final String roll;
    private final int burgers;
    private final String sauce;
    private final List<String> ingredients;

    private BigMac(String roll, int burgers, String sauce, List<String> ingredients) {
        this.roll = roll;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = new ArrayList<>(ingredients);
    }

    public String getRoll() {

        return roll;
    }

    public int getBurgers() {

        return burgers;
    }

    public String getSauce() {

        return sauce;
    }

    public List<String> getIngredients() {

        return ingredients;
    }

    public static class BigMacBuilder {
        private String roll;
        private int burgers;
        private String sauce;
        private List<String> ingredients = new ArrayList<>();

        public BigMacBuilder roll(String roll){
            this.roll = roll;
            return this;

        }
        public BigMacBuilder burgers(int burgers) {
            this.burgers = burgers;
            return this;
        }

        public BigMacBuilder sauce(String sauce){
            this.sauce = sauce;
            return this;
        }

        public BigMacBuilder ingredient(String ingredient) {
            ingredients.add(ingredient);
            return this;
        }

        public BigMac build() {
            if (roll == null){
                throw new IllegalStateException("Roll isn't set");
            }
            if (burgers <= 0) {
                throw new IllegalStateException("Burgers aren't set");
            }
            if (sauce == null) {
                throw new IllegalStateException("Sauce isn't set");
            }
            if (ingredients.isEmpty()) {
                throw new IllegalStateException("Ingredients aren't set");
            }
            return new BigMac(roll,burgers,sauce,ingredients);
        }
    }

    @Override
    public String toString() {
        return "BigMac{" +
                "roll='" + roll + '\'' +
                ", burgers=" + burgers +
                ", sauce='" + sauce + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }
}
