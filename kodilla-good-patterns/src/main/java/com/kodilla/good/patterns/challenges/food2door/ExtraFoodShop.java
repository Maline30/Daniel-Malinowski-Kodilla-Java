package com.kodilla.good.patterns.challenges.food2door;

public class ExtraFoodShop implements Manufacturer {

    private String product;
    private double quantity;

    public ExtraFoodShop(String product, double quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    @Override
    public String getProduct() {
        return product;
    }

    @Override
    public double getQuantity() {
        return quantity;
    }

    @Override
    public boolean process() {
        System.out.println("Order processed: " + product + ", " + quantity);
        return true;
    }


}
