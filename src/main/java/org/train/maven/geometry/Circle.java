package org.train.maven.geometry;

public class Circle {
    private double radius;

    public Circle(double radius) {
        System.out.println("Это круг из версии 1.1.0");
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}
