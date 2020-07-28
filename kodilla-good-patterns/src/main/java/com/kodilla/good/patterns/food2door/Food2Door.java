package com.kodilla.good.patterns.food2door;

public class Food2Door {
    public static void main(String[] args) {

        ResourceRequest resourceRequest = new ResourceRequest();
        Store store = resourceRequest.getCooperatorsOrderList();
        OrderProcessor orderProcessor = new OrderProcessor(store);
        orderProcessor.getStoreList();
        orderProcessor.showOrders();
    }
}
