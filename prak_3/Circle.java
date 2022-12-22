package com.company;
import java.math.*;
public class Circle extends Shape {
    protected double radius;
    public Circle() {
        this.filled = false;
        this.color = "nocolor";
        radius = 1;
    }
    public Circle(double radius) {
        this.radius = radius;
        this.filled = false;
        this.color = "nocolor";
    }
    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return Math.PI * radius * radius;
    }
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
    public String toString() {
        return "Shape: circle, radius: " + this.radius + ", color: " + this.color;
    }
}
