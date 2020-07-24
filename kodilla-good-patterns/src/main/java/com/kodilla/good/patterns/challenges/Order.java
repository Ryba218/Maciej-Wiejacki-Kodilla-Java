package com.kodilla.good.patterns.challenges;

public class Order {

     private String productName;
     private int quantity;
     private boolean isPaid;

    public Order(String productName, int quantity, boolean isPaid) {
        this.productName = productName;
        this.quantity = quantity;
        this.isPaid = isPaid;
    }

    public String getProductName() {
        return productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public boolean isPaid() {
        return isPaid;
    }
}
