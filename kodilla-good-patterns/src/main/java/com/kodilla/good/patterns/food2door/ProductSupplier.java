package com.kodilla.good.patterns.food2door;

import java.util.Objects;

public abstract class ProductSupplier {
    String companyName;
    String product;
    double price;
    int quantity;

    public ProductSupplier(String companyName, String product, double price, int quantity) {
        this.companyName = companyName;
        this.product = product;
        this.price = price;
        this.quantity = quantity;
    }

    public abstract void process();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProductSupplier that = (ProductSupplier) o;

        if (Double.compare(that.price, price) != 0) return false;
        if (quantity != that.quantity) return false;
        if (!Objects.equals(companyName, that.companyName)) return false;
        return Objects.equals(product, that.product);
    }

    @Override
    public int hashCode() {
        return Objects.hash(companyName,product,price,quantity);
    }
}
