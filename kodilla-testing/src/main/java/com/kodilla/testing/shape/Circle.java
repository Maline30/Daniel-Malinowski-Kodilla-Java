package com.kodilla.testing.shape;

import java.util.Objects;

public class Circle implements Shape {

    private static final String name = "circle";
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Circle)) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.getField(), getField()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getField());
    }

    @Override
    public String getShapeName() {
        return name;
    }

    @Override
    public double getField() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Circle(radius=" + radius + ')';
    }
}
