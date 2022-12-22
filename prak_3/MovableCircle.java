package com.company;

public class MovableCircle {
    private int radius;
    private MovablePoint center;

    MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    public String toString() {
        return "x= " +center.x+ ", y= " + center.y + ", ySpeed= " +center.ySpeed+", xSpeed= "+center.xSpeed+", radius= "+ radius;
    }

    public void moveUp() {
        center.y += center.ySpeed;
    }

    public void moveDown() {
        center.y -= center.ySpeed;
    }

    public void moveLeft() {
        center.x -= center.xSpeed;
    }

    public void moveRight() {
        center.x += center.xSpeed;
    }
}
