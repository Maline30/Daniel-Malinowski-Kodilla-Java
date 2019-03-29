package com.kodilla.stream.word;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class World {

    private final List<Continent> continentsList = new ArrayList<>();

    public boolean addContinent(Continent continent) {
        return continentsList.add(continent);
    }

    public BigDecimal getPeopleQuantity() {
        BigDecimal peopleQtyOnTheWorld = continentsList.stream()
                .flatMap(continent -> continent.getListOfCountriesOnContinent().stream())
                .distinct()
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, country) -> sum.add(country));

        return peopleQtyOnTheWorld;
    }
}