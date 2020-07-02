package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {

    public void findFlight (Flight flight) throws RouteNotFoundException {

        Map<String, Boolean> flights = new HashMap<>();
        flights.put("Berlin", true);
        flights.put("Athens", false);
        flights.put("Barcelona", true);
        flights.put("Palermo", false);
        flights.put("Budapest", true);

        if (!flights.containsKey(flight.getDepartureAirport())) {
            System.out.println("Flight to " + flight.departureAirport + " isn't in our offer");
            throw new RouteNotFoundException("Flight doesn't exist!");
        } else if (flights.get(flight.getDepartureAirport())) {
            System.out.println("Flight to " + flight.departureAirport + " is available");
        }else {
            System.out.println("Flight to " + flight.departureAirport + " is not available, all tickets sold.");
        }

    }
}
