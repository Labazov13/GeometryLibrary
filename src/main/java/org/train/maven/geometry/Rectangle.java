package org.train.maven.geometry;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        System.out.println("Это прямогольник из версии 1.1.0");
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        return length * width;
    }

    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}
