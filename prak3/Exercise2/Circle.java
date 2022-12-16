package Exercise2;

import java.util.Comparator;

public class Circle implements Comparable<Circle> {
    private Point _center;
    private int _radius;

    Circle(int x, int y, int radius){
        _center = new Point(x, y);
        _radius = radius;
    }
    public int get_radius(){
        return _radius;
    }

    @Override
    public int compareTo(Circle other){
        return this.get_radius() - other.get_radius();
    }

    @Override
    public String toString() {
        return "    Координаты:\n" + _center + "    Радиус: " + get_radius();
    }
}
