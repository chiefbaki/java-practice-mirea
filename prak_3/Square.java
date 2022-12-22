package com.company;

public class Square extends Rectangle {
    public Square() {
        this.filled = false;
        this.color = "nocolor";
        this.width = 1;
        this.length = 1;
    }
    public Square(double side) {
        this.filled = false;
        this.color = "nocolor";
        this.width = side;
        this.length = side;
    }
    public Square(double side, String color, boolean filled) {
        this.filled = filled;
        this.color = color;
        this.width = side;
        this.length = side;
    }
    public double getSide() {
        return length;
    }
    public void setSide(double side) {
        this.length = side;
        this.width = side;
    }
    public void setWidth(double side) {
        this.width = side;
    }
    public void setLength(double side) {
        this.length = side;
    }
    public String toString() {
        return "Shape: square, side " + this.length + ", color " + this.color;
    }
}
