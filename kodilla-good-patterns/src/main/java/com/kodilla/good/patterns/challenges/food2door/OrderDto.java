package com.kodilla.good.patterns.challenges.food2door;

public class OrderDto {

    private String product;
    private double quantity;
    private boolean isOrder;

    public OrderDto(final String product, double quantity, final boolean isOrder) {
        this.product = product;
        this.isOrder = isOrder;
        this.quantity = quantity;
    }

    public String getProduct() {
        return product;
    }

    public double getQuantity() {
        return quantity;
    }

    public boolean isOrder() {
        return isOrder;
    }
}
