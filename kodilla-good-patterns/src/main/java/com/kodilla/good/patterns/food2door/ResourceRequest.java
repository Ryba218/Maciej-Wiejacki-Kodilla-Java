package com.kodilla.good.patterns.food2door;

import java.util.HashSet;

public class ResourceRequest {
    private HashSet<ProductSupplier> cooperatorsList = new HashSet<>();

    public Store getCooperatorsOrderList() {
        cooperatorsList.add(new HealthyShop("Healthy Shop", "Healthy Milk 1L",30.99,700));
        cooperatorsList.add(new GlutenFreeShop("GlutenFreeShop","Gluten free milk 100ml",45.55,300));
        cooperatorsList.add(new ExtraFoodShop("Extra Food Shop", "Extra milk 50L barrel",99.99,2000));
        return new Store(cooperatorsList);
        
    }


}
