package com.kodilla.good.patterns.allExpensiveShop;

public class BuyNowRetriever {

    public BuyNow retrieve() {
        User user = new User("Koval","Jan", "Kowalski");
        String thing = "bicycle";
        int price = 500;

        return new BuyNow(user, thing, price);
    }
}
