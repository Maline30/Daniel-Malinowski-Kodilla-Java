package com.kodilla.good.patterns.challenges.airLine;

import java.util.Set;
import java.util.stream.Collectors;

public class Search {

    public void searchFrom(Set<Flight> theList, String aitPortName) {

        theList.stream()
                .filter(l -> l.getAirPortFrom().equals(aitPortName))
                .forEach(System.out::println);
    }

    public void searchTo(Set<Flight> theList, String aitPortName) {

        theList.stream()
                .filter(l -> l.getAirPortTo().equals(aitPortName))
                .forEach(System.out::println);
    }

    public void searchThrough(Set<Flight> theList, String airPort1, String airPort2) {

        Set<Flight> list1 = theList.stream()
                .filter(l -> l.getAirPortFrom().equals(airPort1))
                .collect(Collectors.toSet());

        Set<Flight> list2 = theList.stream()
                .filter(l -> l.getAirPortTo().equals(airPort2))
                .collect(Collectors.toSet());

        for (Flight flight1 : list1) {
            for (Flight flight2 : list2) {
                if (flight1.getAirPortTo().equals(flight2.getAirPortFrom())) {
                    System.out.println(flight1);
                    System.out.println(flight2);
                }
            }
        }
    }
}
