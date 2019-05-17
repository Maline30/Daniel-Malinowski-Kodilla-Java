package com.kodilla.good.patterns.challenges.airLine;

import java.util.HashSet;
import java.util.Set;

public class ListOfFlight {

    private Set<Flight> theList = new HashSet<>();

    public ListOfFlight() {
        theList.add(new Flight("Gdansk", "Warszawa"));
        theList.add(new Flight("Krakow", "Poznan"));
        theList.add(new Flight("Gdansk", "Wroclaw"));
        theList.add(new Flight("Poznan", "Warszawa"));
        theList.add(new Flight("Wroclaw", "Poznan"));
        theList.add(new Flight("Gdansk", "Warszawa"));
        theList.add(new Flight("Wroclaw", "Gdansk"));
    }

    public Set<Flight> getTheList() {
        return new HashSet<>(theList);
    }
}
