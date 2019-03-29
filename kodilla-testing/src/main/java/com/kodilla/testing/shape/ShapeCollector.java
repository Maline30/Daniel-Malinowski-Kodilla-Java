package com.kodilla.testing.shape;

import java.util.*;

public class ShapeCollector {

    private ArrayList<Shape> shapeCollection;

    public ShapeCollector(ArrayList<Shape> collection) {
        this.shapeCollection = collection;
    }

    public ArrayList<Shape> getCollection() {
        return shapeCollection;
    }

    public void addFigure(Shape shape) {
        shapeCollection.add(shape);
    }

    public void removeFigure(Shape shape) {
        shapeCollection.remove(shape);
    }

    public Shape getFigure(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("negative index");
        }
        if (n >= shapeCollection.size()) {
            return null;
        }
        return shapeCollection.get(n);
    }

    public String showFigures() {

        for (Shape shape : shapeCollection) {
            System.out.print(shape.getShapeName());
        }
        return shapeCollection.toString();
    }
}
