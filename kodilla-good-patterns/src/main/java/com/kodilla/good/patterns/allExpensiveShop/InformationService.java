package com.kodilla.good.patterns.allExpensiveShop;

public class InformationService {

    public boolean inform(BuyNow buyNow) {
        System.out.println("Ordered for: " + buyNow.getUser().getUserNick() + buyNow.getUser().getUserName() + " " + buyNow.getUser().getUserLastName()
                +  " thing: " +buyNow.getThing() + " price: " + buyNow.getPrice());
        return true;
    }
}
