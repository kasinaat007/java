package org.object.round;
import org.object.Shape;
public class Circle extends Shape {
    protected double radius;
    final private static double PI = 3.14;
    public Circle() {
        radius = 1.0;
    }
    public Circle(String name, String color, boolean filled, double radius) {
        this.name = name;
        this.color = color;
        this.filled = filled;
        this.radius = radius;
    }
    public double getRadius() {
        return this.radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getPI() {
        return this.PI;
    }
    public double area() {
        return this.PI * this.radius * this.radius;
    }
}