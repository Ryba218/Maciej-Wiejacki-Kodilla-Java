package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String DRIVING = "DRIVING";
    public static final String PAINTING = "PAINTING";
    public static final String SHOPPING = "SHOPPING";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case DRIVING:
                return new DrivingTask("Driving","Far far away", "By bus");
            case PAINTING:
                return new PaintingTask("Painting","Blue","Everything");
            case SHOPPING:
                return new ShoppingTask("Shopping","Pen",2500);
            default:
                return null;
        }
    }
}
