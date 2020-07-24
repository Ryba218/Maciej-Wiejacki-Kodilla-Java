package com.kodilla.good.patterns.challenges;

public class OrderRequestRetriver {

    public OrderRequest retrieve() {
        User user = new User("Lolo","lolo@gmail.com","Paczkomat KAT23");
        Order order = new Order("Szklany sufit",3,true);

        System.out.println("Retrived request on: " + order.getQuantity() + " products: " + order.getProductName() + " for " + user.getNickName());


        return new OrderRequest(user, order);
    }
}
