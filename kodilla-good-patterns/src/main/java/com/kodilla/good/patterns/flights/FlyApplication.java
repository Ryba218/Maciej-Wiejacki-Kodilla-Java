package com.kodilla.good.patterns.flights;

import java.util.List;

public class FlyApplication {
    public static void main(String[] args) {

        FlightsBook flightsBook = new FlightsBook();
        FlightSearcher flightSearcher = new FlightSearcher(flightsBook);
        Show show = new Show();

        List startFlights = flightSearcher.getDepartures("Poznan");
        List endFlights = flightSearcher.getArrivals("Warszawa");
        List throughFlightsOne = flightSearcher.getStopoverFlyOneParam("Katowice");
        List throughFlightsTwo = flightSearcher.getStopoverFlyTwoParams("Szczecin","Katowice");
        List throughFlightsThree = flightSearcher.getStopoverFlyThreeParams("Warszawa","Gdansk","Szczecin");

        show.display(startFlights);
        show.display(endFlights);
        show.display(throughFlightsOne);
        show.display(throughFlightsTwo);
        show.display(throughFlightsThree);

    }
}
