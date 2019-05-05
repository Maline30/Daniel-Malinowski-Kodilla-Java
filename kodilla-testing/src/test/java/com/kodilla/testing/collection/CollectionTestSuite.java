package com.kodilla.testing.collection;

import java.util.*;
import java.lang.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;


public class CollectionTestSuite {

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        ArrayList<Integer> emptyList = new ArrayList<>();
        //When
        List<Integer> resultList = OddNumbersExterminator.exterminate(emptyList);
        System.out.println("Empty List Testing");
        //Then
        Assert.assertEquals(emptyList, resultList);

    }

    @After
    public void testOddNumbersExterminatorNormalList() {

        //Given
        ArrayList<Integer> normalList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        ArrayList<Integer> expectedResultList = new ArrayList<>(Arrays.asList(2, 4, 6, 8, 10));

        //When
        List<Integer> resultList = OddNumbersExterminator.exterminate(normalList);
        System.out.println("Normal List Testing");
        //Then
        Assert.assertEquals(expectedResultList, resultList);

    }
}