package com.kodilla.good.patterns.challenges.airLine;

import java.util.Set;

public class Applications {

    public static void main(String[] args) {
        ListOfFlight listOfFight = new ListOfFlight();
        Set<Flight> list = listOfFight.getTheList();

        Search search1 = new Search();
        search1.searchFrom(list, "Poznan");
        System.out.println();
        Search search2 = new Search();
        search2.searchTo(list, "Gdansk");
        System.out.println();
        Search search3 = new Search();
        search3.searchThrough(list, "Wroclaw", "Warszawa");
        System.out.println();
    }
}
