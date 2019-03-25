package com.kodilla.stream.word;

import java.util.ArrayList;
import java.util.List;

public final class Continent {
    private final List<Country> CountriesOnContinentList = new ArrayList<>();
    private final String continentName;

    public Continent(String continentName) {
        this.continentName = continentName;
    }

    public String getContinentName() {
        return continentName;
    }

    public List<Country> getListOfCountriesOnContinent() {
        return new ArrayList<>(CountriesOnContinentList);
    }

    public boolean addCountry (Country country){
        return CountriesOnContinentList.add(country);
    }
}
