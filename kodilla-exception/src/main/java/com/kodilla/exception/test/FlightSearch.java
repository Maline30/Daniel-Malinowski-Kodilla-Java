package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSearch {

    public void findFilght(Flight flight) throws RouteNotFoundException {

        Map<String, Boolean> flightMap = new HashMap<>();
        flightMap.put("Berlin", false);
        flightMap.put("Moscow", true);
        flightMap.put("Rome", false);
        flightMap.put("Oslo", true);
        flightMap.put("Stockholm", false);
        flightMap.put("Copenhagen", true);
        flightMap.put("Paris", false);
        flightMap.put("Madrid", true);
        flightMap.put("Lisbon", true);

        if (flightMap.containsKey(flight.arrivalAirport)) {
            System.out.println("Airport available " + flight.arrivalAirport);
        } else {
            throw new RouteNotFoundException("No such airports");
        }
    }
}
