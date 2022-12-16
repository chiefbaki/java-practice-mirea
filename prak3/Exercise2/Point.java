package Exercise2;

public class Point {
    private int x, y;

    Point(int newX, int newY){
        x = newX;
        y = newY;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "        По х: " + getX() + "\n" + "        По y: " + getY() + "\n";
    }
}
