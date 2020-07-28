package com.kodilla.good.patterns.food2door;

import java.util.HashSet;

public class Store {
    private HashSet<ProductSupplier> suppliersList;

    public Store(HashSet<ProductSupplier> suppliersList) {
        this.suppliersList = suppliersList;
    }

    public HashSet<ProductSupplier> getSuppliersList() {
        return new HashSet<>(suppliersList);
    }
}
