package com.kodilla.good.patterns.food2door;

public class ExtraFoodShop extends ProductSupplier {

    ExtraFoodShop (String companyName, String product, double price, int quantity) {
        super(companyName,product,price,quantity);
    }

    @Override
    public void process() {
        System.out.println("Your order is proceed in " + companyName + ".\n Product: " + product + "\n Quantity: " + quantity );

    }
}
