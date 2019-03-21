package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.Objects;

public class Triangle extends ArrayList<Shape> implements Shape {

    private static final String name = "triangle";
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Triangle)) return false;
        Triangle triangle = (Triangle) o;
        return Double.compare(triangle.getA(), getA()) == 0 &&
                Double.compare(triangle.getB(), getB()) == 0 &&
                Double.compare(triangle.getC(), getC()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getA(), getB(), getC());
    }

    @Override
    public String getShapeName() {
        return name;
    }

    @Override
    public double getField() {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    public String toString() {
        return "Triangle(" + "a=" + a + ", b=" + b + ", c=" + c + ')';
    }
}
