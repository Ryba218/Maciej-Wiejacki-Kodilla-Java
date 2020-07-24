package com.kodilla.good.patterns.challenges;

public class PackBoxDelivery implements DeliveryService {
    @Override
    public boolean orderDelivery(User user) {
        System.out.println("Sending " + user.getNickName() + " package to PackBox nr: " + user.getAdresse());
        return true;
    }
}
