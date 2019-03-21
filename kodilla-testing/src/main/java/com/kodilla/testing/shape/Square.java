package com.kodilla.testing.shape;

import java.util.Objects;

public class Square implements Shape {

    private static final String name = "square";
    private double a;

    public Square(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Square)) return false;
        Square square = (Square) o;
        return Double.compare(square.getA(), getA()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getA());
    }

    @Override
    public String getShapeName() {
        return name;
    }

    @Override
    public double getField() {
        return a * a;
    }

}
