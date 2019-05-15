package com.kodilla.good.patterns.challenges.food2door;

public class LeadOrder {

    public Manufacturer load(String product, double quantity) {

        if (quantity < 20) {
            return new ExtraFoodShop(product, quantity);

        } else if (quantity >= 20 && quantity < 30) {
            return new HealthyShop(product, quantity);

        } else {
            return new GlutenFreeShop(product, quantity);
        }
    }
}
