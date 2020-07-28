package com.kodilla.good.patterns.food2door;

public class HealthyShop extends ProductSupplier {

    HealthyShop (String companyName, String product, double price, int quantity) {
        super(companyName,product,price,quantity);
    }

    @Override
    public void process() {
        System.out.println(companyName + " thanks you for your order. " + quantity + " times product: " + product + " purchase is processed.");

    }
}
