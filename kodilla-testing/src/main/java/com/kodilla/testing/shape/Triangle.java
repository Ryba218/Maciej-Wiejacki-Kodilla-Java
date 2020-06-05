package com.kodilla.testing.shape;

public class Triangle implements Shape {


    String name ;
    double bottom;
    double height;

    public String getShapeName() {

        return name;
    }


    public double getField() {

        return bottom*height*0.5;
    }

    public Triangle(String name, double bottom, double height) {
        this.name = name;
        this.bottom = bottom;
        this.height = height;
    }

    public double getBottom() {
        return bottom;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Triangle triangle = (Triangle) o;

        if (Double.compare(triangle.bottom, bottom) != 0) return false;
        if (Double.compare(triangle.height, height) != 0) return false;
        return name.equals(triangle.name);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name.hashCode();
        temp = Double.doubleToLongBits(bottom);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(height);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
