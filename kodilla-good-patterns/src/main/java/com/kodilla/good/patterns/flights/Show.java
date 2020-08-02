package com.kodilla.good.patterns.flights;

import java.util.List;

public class Show {
    public void display(List city) {
        System.out.println(" Your Journey: ");

        if (city.isEmpty()) {
            System.out.println("No results found.");
        }

        for (Object directions : city) {
            System.out.print(directions);
        }
        System.out.println(" \n");
    }

}
