package com.kodilla.good.patterns.challenges;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Application {
    public static void main(String[] args) {

        MovieStore movieStore = new MovieStore();

        Map<String, List<String>> titles = movieStore.getMovies();

        titles.entrySet().stream()
                .flatMap(e -> e.getValue().stream())
                .forEach(e -> System.out.println(e + "!"));


        String allTitles = titles.entrySet().stream()
                .flatMap(e -> e.getValue().stream())
                .collect(Collectors.joining("!"));

        System.out.println(allTitles);
    }

}
