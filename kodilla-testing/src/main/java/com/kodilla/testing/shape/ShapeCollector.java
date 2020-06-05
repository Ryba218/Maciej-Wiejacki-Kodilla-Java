package com.kodilla.testing.shape;


import java.util.ArrayList;

public class ShapeCollector {

    private ArrayList<Shape> shapes = new ArrayList<>();

    public int getFiguresQuantity(){
        return shapes.size();
    }

    public void addFigure(Shape shape) {

        shapes.add(shape);
    }

    public boolean removeFigure(Shape shape) {
        boolean result = false;
        if (shapes.contains(shape)){
            shapes.remove(shape);
            result = true;
        }
        return result;
    }

    public Shape getFigure(int n){
        Shape theShape = null;
        if(n >= 0 && n < shapes.size()){
            theShape = shapes.get(n);
        }
        return theShape;
    }

    public boolean showFigures (){
        if(shapes.size()!= 0) {
            for (Shape figures : shapes) {
                System.out.println(figures);
            }
            return true;

        } else {
            return false;
        }
    }


}

