package com.company;

public class Rectangle extends Shape {
    protected double width;
    protected double length;
    public Rectangle() {
        this.filled = false;
        this.color = "nocolor";
        this.width = 0;
        this.length = 0;
    }
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
        this.filled = false;
        this.color = "nocolor";
    }
    Rectangle(double width, double length, String color, boolean filled) {
        this.width = width;
        this.length = length;
        this.color = color;
        this.filled = filled;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public double getArea() {
        return width * length;
    }
    public double getPerimeter() {
        return 2 * (width + length);
    }
    public String toString() {
        return "Shape: rectangle, width: " + this.width + ", length: " + this.length + ", color: " + this.color;
    }
}
