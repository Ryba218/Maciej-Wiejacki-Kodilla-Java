package com.kodilla.good.patterns.food2door;

public class GlutenFreeShop extends ProductSupplier {

    GlutenFreeShop(String companyName, String product, double price, int quantity) {
        super(companyName,product,price,quantity);
    }

    @Override
    public void process() {
        System.out.println(companyName + " recieved your order on " + product +" in quantity of " + quantity );

    }
}
