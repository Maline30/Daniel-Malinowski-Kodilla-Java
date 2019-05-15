package com.kodilla.good.patterns.challenges.food2door;

public class Application {

    public static void main(String[] arg) {

        LeadOrder leadOrder = new LeadOrder();
        Manufacturer manufacturer = leadOrder.load("Snikers", 10);
        OrderProcess orderProcess = new OrderProcess(new OrderRepository());
        orderProcess.run(manufacturer);

    }
}
