package com.kodilla.good.patterns.challenges.food2door;

public class OrderRepository {

    public boolean creatOrder( String firmName, String productName, double quantity) {
        System.out.println("Manufacturer: " + firmName + "|" + " Order: " + productName + "|" + quantity );
        return true;
    }
}
