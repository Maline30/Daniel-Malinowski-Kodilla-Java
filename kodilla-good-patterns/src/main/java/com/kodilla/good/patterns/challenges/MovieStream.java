package com.kodilla.good.patterns.challenges;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.Arrays.stream;

public class MovieStream {

    public static void main(String[] arg) {

        MovieStore movieStore = new MovieStore();

        Map<String, List<String>> movieMap = movieStore.getMovies();

        movieMap.entrySet()
                .stream()
                .forEach(entry -> System.out.println(entry.getKey() + "  " + entry.getValue()
                        .stream().collect(Collectors.joining(" ! "))));

        final String movies = movieMap.entrySet()
                .stream()
                .flatMap(entry -> entry.getValue().stream())
                .collect(Collectors.joining(" ! "));

        System.out.println(movies);

    }
}
