package com.kodilla.testing.collection;

import java.util.*;

public class OddNumbersExterminator {

    public static ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {

        ArrayList<Integer> even = new ArrayList<>();

        for (Integer group : numbers) {
            if (group % 2 == 0) {
                even.add(group);
            }
        }
        return even;
    }
}
