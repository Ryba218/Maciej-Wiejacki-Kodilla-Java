package com.kodilla.testing.shape;

public class Square implements Shape {


    String name ;
    double bottom;

    public String getShapeName() {

        return name;
    }
    public double getField(){
        return bottom*bottom;
    }

    public Square(String name, double bottom) {
        this.name = name;
        this.bottom = bottom;
    }



    public double getBottom() {
        return bottom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Square square = (Square) o;

        if (Double.compare(square.bottom, bottom) != 0) return false;
        return name.equals(square.name);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name.hashCode();
        temp = Double.doubleToLongBits(bottom);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
