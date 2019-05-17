package com.kodilla.good.patterns.challenges.airLine;

public class Flight {

    private String airPortFrom;
    private String airPortTo;

    public Flight(String airPortFrom, String airPortTo) {
        this.airPortFrom = airPortFrom;
        this.airPortTo = airPortTo;
    }

    public String getAirPortFrom() {
        return airPortFrom;
    }

    public String getAirPortTo() {
        return airPortTo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flight)) return false;

        Flight flight = (Flight) o;

        if (getAirPortFrom() != null ? !getAirPortFrom().equals(flight.getAirPortFrom()) : flight.getAirPortFrom() != null)
            return false;
        return getAirPortTo() != null ? getAirPortTo().equals(flight.getAirPortTo()) : flight.getAirPortTo() == null;

    }

    @Override
    public int hashCode() {
        int result = getAirPortFrom() != null ? getAirPortFrom().hashCode() : 0;
        result = 31 * result + (getAirPortTo() != null ? getAirPortTo().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "airPortFrom='" + airPortFrom + '\'' +
                ", airPortTo='" + airPortTo + '\'' +
                '}';
    }
}
