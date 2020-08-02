package com.kodilla.good.patterns.flights;

import java.util.ArrayList;
import java.util.List;

public class FlightsBook {
    private List<Flight> flights = new ArrayList<>();

    FlightsBook() {
        flights.add(new Flight("Katowice","Gdansk"));
        flights.add(new Flight("Katowice","Warszawa"));
        flights.add(new Flight("Katowice","Poznan"));
        flights.add(new Flight("Katowice","Szczecin"));
        flights.add(new Flight("Warszawa","Katowice"));
        flights.add(new Flight("Warszawa","Gdansk"));
        flights.add(new Flight("Warszawa","Poznan"));
        flights.add(new Flight("Warszawa","Szczecin"));
        flights.add(new Flight("Poznan","Warszawa"));
        flights.add(new Flight("Poznan","Gdansk"));
        flights.add(new Flight("Poznan","Katowice"));
        flights.add(new Flight("Szczecin","Warszawa"));
        flights.add(new Flight("Szczecin","Katowice"));
        flights.add(new Flight("Szczecin","Gdansk"));
    }

    public List<Flight> getFlightBook () {
        return new ArrayList<>(flights);
    }

}
