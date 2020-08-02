package com.kodilla.good.patterns.flights;

import java.util.Objects;

public class Flight implements Journey {

    private String startPoint;
    private String finishPoint;

    public Flight(String startPoint, String finishPoint) {
        this.startPoint = startPoint;
        this.finishPoint = finishPoint;
    }

    @Override
    public String getStartPoint() {

        return startPoint;
    }

    @Override
    public String getFinishPoint() {

        return finishPoint;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flight flights = (Flight) o;

        if (!Objects.equals(startPoint, flights.startPoint)) return false;
        return Objects.equals(finishPoint, flights.finishPoint);
    }

    @Override
    public int hashCode() {
        int result = startPoint != null ? startPoint.hashCode() : 0;
        result = 31 * result + (finishPoint != null ? finishPoint.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {

        return " " + startPoint + " - " + finishPoint + " ";
    }
}
