package com.kodilla.good.patterns.flights;



import java.util.*;
import java.util.stream.Collectors;

public class FlightSearcher {

    private FlightsBook flightsBook;

    public FlightSearcher(FlightsBook flightsBook) {

        this.flightsBook = flightsBook;
    }

    public List<Flight> getDepartures (String airport) {
        return flightsBook.getFlightBook().stream()
                .filter(n -> n.getStartPoint().equals(airport))
                .collect(Collectors.toList());
    }

    public List<Flight> getArrivals (String airport) {
        return flightsBook.getFlightBook().stream()
                .filter(n -> n.getFinishPoint().equals(airport))
                .collect(Collectors.toList());
    }

    public List<Flight> getStopoverFlyOneParam (String airport) {
        return flightsBook.getFlightBook().stream()
                .filter(n -> n.getStartPoint().equals(airport) || n.getFinishPoint().equals(airport))
                .collect(Collectors.toList());
    }

    public List<Flight> getStopoverFlyTwoParams (String startAirport, String finishAirport) {

        List<Flight> stopoverFlights = new ArrayList<>();

        flightsBook.getFlightBook().stream()
                .filter(n -> n.getStartPoint().equals(startAirport))
                .forEach(n -> {
                    if (n.getFinishPoint().equals(finishAirport)){
                        stopoverFlights.add(n);
                    } else {
                        flightsBook.getFlightBook().stream()
                                .filter(s -> s != n)
                                .filter(s -> s.getStartPoint().equals(n.getFinishPoint()))
                                .filter(s -> s.getFinishPoint().equals(finishAirport))
                                .forEach(s ->{
                                    stopoverFlights.add(s);
                                    stopoverFlights.add(n);
                                });
                    }
                });
        Collections.reverse(stopoverFlights);
        return stopoverFlights;
    }

    public List<Flight> getStopoverFlyThreeParams(String startAirport, String throughAirport, String finishAirport) {
        List<Flight> stopoverFly = flightsBook.getFlightBook().stream()
                .filter(n -> n.getStartPoint().equals(startAirport) && n.getFinishPoint().equals(throughAirport)
                        || n.getStartPoint().equals(throughAirport) && n.getFinishPoint().equals(finishAirport))
                .collect(Collectors.toList());
        if (stopoverFly.size() < 2) {
            stopoverFly.clear();
        }
        return stopoverFly;
    }
}
