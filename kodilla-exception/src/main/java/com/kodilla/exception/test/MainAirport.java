package com.kodilla.exception.test;

public class MainAirport {

    public static void main(String[] args){

        Flight flight = new Flight("Berlin","Okęcie");
        FlightSearch flightSearch = new FlightSearch();

        try{
            flightSearch.findFilght(flight);
        }catch (RouteNotFoundException e) {
            System.out.println(e);
        }
    }
}
