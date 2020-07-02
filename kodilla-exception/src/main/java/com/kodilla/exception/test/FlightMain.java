package com.kodilla.exception.test;

public class FlightMain {
    public static void main(String[] args) {

        FlightFinder find = new FlightFinder();

        try {
            find.findFlight(new Flight("Berlin", "Warsaw"));
            find.findFlight(new Flight("Palermo", "Warsaw"));
            find.findFlight(new Flight("Barcelona", "Warsaw"));
            find.findFlight(new Flight("Honolulu", "Warsaw"));
        } catch (RouteNotFoundException e) {
            System.out.println("Write down european airport");
        }

    }
}
