package org.object.round;
import org.object.round.Circle;

public class Cylinder extends Circle {
    protected double height;
    public Cylinder() {
        height = 1.0;
    }
    public Cylinder(String name, String color, boolean filled, double radius, double height) {
        this.name = name;
        this.color = color;
        this.filled = filled;
        this.radius = radius;
        this.height = height;
    }
    public double getHeight() {
        return this.height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double area() {
        return super.area() * this.height;
    }
}