package com.kodilla.testing.shape;

public class Circle implements Shape {


    String name ;
    double diameter;

    public String getShapeName() {
        return name;
    }


    public double getField() {
        return (3.14*(diameter*diameter))*0.25;
    }

    public Circle(String name, double diameter) {
        this.name = name;
        this.diameter = diameter;
    }



    public double getDiameter() {
        return diameter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Circle circle = (Circle) o;

        if (Double.compare(circle.diameter, diameter) != 0) return false;
        return name.equals(circle.name);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name.hashCode();
        temp = Double.doubleToLongBits(diameter);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
