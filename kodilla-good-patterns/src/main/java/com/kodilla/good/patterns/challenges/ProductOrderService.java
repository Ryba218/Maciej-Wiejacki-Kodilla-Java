package com.kodilla.good.patterns.challenges;

public class ProductOrderService {
    public static void main(String[] args) {
        OrderRequestRetriver orderRequestRetriver = new OrderRequestRetriver();
        OrderRequest orderRequest = orderRequestRetriver.retrieve();

        OrderProcessor orderProcessor = new OrderProcessor(new MailService(),new PackBoxDelivery(),new SoldProductsRepository());
        orderProcessor.process(orderRequest);

    }
}
