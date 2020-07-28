package com.kodilla.good.patterns.food2door;

import java.util.HashSet;

public class OrderProcessor {

    private Store store;
    private HashSet<ProductSupplier> storeList = new HashSet<>();

    OrderProcessor(Store store) {
        this.store = store;
    }

    public void getStoreList() {
        this.storeList = store.getSuppliersList();
    }

    public void showOrders() {
        storeList.forEach(ProductSupplier::process);
    }
}
