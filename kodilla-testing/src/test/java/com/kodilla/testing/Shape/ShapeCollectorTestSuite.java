package com.kodilla.testing.Shape;

import com.kodilla.testing.shape.Shape;
import com.kodilla.testing.shape.Triangle;
import com.kodilla.testing.shape.Circle;
import com.kodilla.testing.shape.Square;
import org.junit.*;
import java.util.ArrayList;
import com.kodilla.testing.shape.ShapeCollector;
import static java.lang.System.out;
import static junit.framework.TestCase.assertEquals;

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
        ShapeCollector shapeCollector = new ShapeCollector(new Triangle(2,6,8));

        Shape shape = new Triangle(2,6,8);
        //When
        shapeCollector.addFigure(shape);
        //Then
        assertEquals(1, shapeCollector.getCollection().size());
    }

    @Test
    public void removeFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector(new Triangle(2,6,8));

        Shape shape = new Triangle(2,6,8);
        Shape shape2 = new Square(4);

        shapeCollector.addFigure(shape);
        shapeCollector.addFigure(shape2);
        //When
        shapeCollector.removeFigure(shape);
        //Then
        assertEquals(1, shapeCollector.getCollection().size());
    }

    @Test
    public void getFigure() {
        //GIVEN
        ShapeCollector figure = new ShapeCollector(new Triangle(2,6,8));

        Shape shape = new Triangle(2,6,8);
        figure.addFigure(shape);
        //WHEN
        Shape retrievedShape = figure.getFigure(0);
        //THEN
        assertEquals(shape, retrievedShape);
    }

    @Test
    public void showFigures() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector(new ArrayList<Shape>());

            Shape shape = new Circle(4);
            Shape shape1 = new Triangle(2, 6, 8);
            Shape shape2 = new Square(8);

        shapeCollector.addFigure(shape);
        shapeCollector.addFigure(shape1);
        shapeCollector.addFigure(shape2);

        ArrayList<Shape> shapeList = new ArrayList<>();

            shapeList.add(shape);
            shapeList.add(shape1);
            shapeList.add(shape2);

        //When
        String expected = shapeCollector.showFigures();
        String output = shapeList.toString();
        //Then
        assertEquals(expected,output);
    }
}