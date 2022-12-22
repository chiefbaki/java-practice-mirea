package com.company;

public class MovableRectangle {
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }
    public boolean isSame(){
        return topLeft.xSpeed==bottomRight.xSpeed && topLeft.ySpeed==bottomRight.ySpeed;
    }
    public String toString() {
        return "top left x = " + topLeft.x + " top left y =" + topLeft.y + " bottom right x = " + bottomRight.x + " bottom right y = " + bottomRight.y;
    }
    public void moveUp() {
        topLeft.y += topLeft.ySpeed;
        bottomRight.y += bottomRight.ySpeed;
    }

    public void moveDown() {
        topLeft.y -= topLeft.ySpeed;
        bottomRight.y -= bottomRight.ySpeed;
    }

    public void moveLeft() {
        topLeft.x -= topLeft.ySpeed;
        bottomRight.x -= bottomRight.ySpeed;
    }

    public void moveRight() {
        topLeft.x += topLeft.ySpeed;
        bottomRight.x += bottomRight.ySpeed;
    }
}
