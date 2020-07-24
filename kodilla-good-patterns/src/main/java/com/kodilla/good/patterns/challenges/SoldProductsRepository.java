package com.kodilla.good.patterns.challenges;

public class SoldProductsRepository implements OrderRepository {


    @Override
    public boolean createSoldItem(User user, Order order) {
        System.out.println("Creating sold item:\n Buyer: " + user.getNickName() + "\n" +  " Product: " + order.getProductName() + "\n" +  " Quantity: " + order.getQuantity() );
        return false;
    }
}
