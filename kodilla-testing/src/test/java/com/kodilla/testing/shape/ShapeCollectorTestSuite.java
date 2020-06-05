package com.kodilla.testing.shape;


import org.junit.*;

public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the begining of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All test are finished");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preeparing to execute test#" + testCounter);
    }

    @Test
    public void testAddFigure() {
        //Given
        Shape theSquare = new Square("Square",2.5);
        ShapeCollector shapeCollector = new ShapeCollector();
        //When
        shapeCollector.addFigure(theSquare);
        //Then
        Assert.assertEquals(1,shapeCollector.getFiguresQuantity());

    }

    @Test
    public void testRemoveFigureNotExisting() {
        //Given
        Shape theSquare = new Square("Square",2.5);
        ShapeCollector shapeCollector = new ShapeCollector();
        //When
        boolean result = shapeCollector.removeFigure(theSquare);
        //Then
        Assert.assertFalse(result);
    }

    @Test
    public void testRemoveFigure() {


        //Given
        Shape theCircle = new Circle("Circle",1.8);
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(theCircle);
        //When
        boolean result = shapeCollector.removeFigure(theCircle);
        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(0, shapeCollector.getFiguresQuantity());

    }

    @Test
    public void testGetFigure() {
        //Given
        Shape theTriangle = new Triangle("Triangle",0.9,2);
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(theTriangle);
        //When
        Shape retrievedShape;
        retrievedShape = shapeCollector.getFigure(0);
        //Then
        Assert.assertEquals(theTriangle,retrievedShape);

    }
    @Test
    public void testShowFiguresNotExisting () {
        //When
       Shape theCircle = new Circle("Ciecle", 1.5);
       ShapeCollector shapeCollector = new ShapeCollector();
       //Given
        boolean result = shapeCollector.showFigures();
        //Then
        Assert.assertFalse(result);


    }
    @Test
    public void testShowFigures(){
        //When
        Shape theCircle = new Circle("Ciecle", 1.5);
        Shape theTriangle = new Triangle("Triangle",0.9,2);
        Shape theSquare = new Square("Square",2.5);
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(theCircle);
        shapeCollector.addFigure(theTriangle);
        shapeCollector.addFigure(theSquare);
        //Given
        boolean result = shapeCollector.showFigures();
        //Then
        Assert.assertTrue(result);
    }
}