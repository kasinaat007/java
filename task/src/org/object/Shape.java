package org.object;
public class Shape {
    protected String name;
    protected String color;
    protected boolean filled;

    public Shape() {
        name = "Shape";
        color = "yellow";
        filled = false;
    }

    public Shape(String name, String color, boolean filled) {
        this.color = color;
        this.name = name;
        this.filled = filled;
    }
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return this.filled;
    }
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
}