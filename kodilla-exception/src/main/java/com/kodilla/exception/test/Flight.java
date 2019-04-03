package com.kodilla.exception.test;

public class Flight {

    String departureAirpost;
    String arrivalAirport;

    public Flight(String departureAirpost, String arrivalAirport) {
        this.departureAirpost = departureAirpost;
        this.arrivalAirport = arrivalAirport;
    }

    public String getDepartureAirpost() {
        return departureAirpost;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }
}
