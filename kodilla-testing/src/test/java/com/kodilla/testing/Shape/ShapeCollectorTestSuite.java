package com.kodilla.testing.Shape;

import com.kodilla.testing.shape.Circle;
import com.kodilla.testing.shape.Shape;
import com.kodilla.testing.shape.ShapeCollector;
import com.kodilla.testing.shape.Triangle;
import org.junit.*;

import static java.lang.System.out;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void addFigure() {
        //Give
        ShapeCollector figure = new ShapeCollector();
        Triangle triangle = new Triangle(6.3, 8.5, 10);
        //When
        figure.addFigure(triangle);
        //Then
        assertEquals(1, figure.getShapeQuantity());
    }


    @Test
    public void removeFigure() {
        //Given
        ShapeCollector figure = new ShapeCollector();
        Triangle triangle = new Triangle(5,6,8);
        figure.addFigure(triangle);
        //When
        boolean result = figure.removeFigure(triangle);
        //Then
        assertTrue(result);
        assertEquals(0,figure.getShapeQuantity());
    }

    @Test
    public void getFigure() {
        //GIVEN
        ShapeCollector figure = new ShapeCollector();
        Triangle triangle = new Triangle(5.6, 7.8, 9);
        figure.addFigure(triangle);
        //WHEN
        Shape retrievedShape = figure.getFigure(0);
        //THEN
        assertEquals(triangle, retrievedShape);
    }

    @Test
    public void showFigures() {
        //Given
        ShapeCollector figure = new ShapeCollector();
        Circle circle = new Circle(4);
        figure.addFigure(circle);
        //When
        figure.showFigures(out);
        //Then
        assertEquals(circle,figure);
    }
}