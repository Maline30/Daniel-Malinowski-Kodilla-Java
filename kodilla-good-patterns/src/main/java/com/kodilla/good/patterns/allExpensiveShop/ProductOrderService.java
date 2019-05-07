package com.kodilla.good.patterns.allExpensiveShop;

public class ProductOrderService {

    public boolean sell(BuyNow buyNow) {
        System.out.println("Ordered for: " + buyNow.getUser().getUserNick() + buyNow.getUser().getUserName() + " " + buyNow.getUser().getUserLastName()
                +  " thing: " +buyNow.getThing() + " price: " + buyNow.getPrice());
        return true;
    }
}
