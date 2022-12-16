package Exercise2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Tester {

    private Circle[] values;
    private int _n;

    Tester(int n){
        Random rand = new Random();
        _n = n;
        values = new Circle[_n];
        for (int i = 0; i < _n; ++i){
            Circle tmp = new Circle(rand.nextInt(100) + 1, rand.nextInt(100) + 1, rand.nextInt(100) + 1);
            values[i] = tmp;
        }
    }

    public Circle getMaxCircle(){
        Circle max = values[0];
        for (int i = 1; i < _n; ++i){
            if (values[i].get_radius() > max.get_radius())
                max = values[i];
        }
        return max;
    }

    public Circle getMinCircle(){
        Circle min = values[0];
        for (int i = 1; i < _n; ++i){
            if (values[i].get_radius() < min.get_radius())
                min = values[i];
        }
        return min;
    }

    public void sort(){
        Arrays.sort(values);
    }

    public void printArr(){
        for (int i = 0; i < _n; ++i)
            System.out.println( i + 1 + " окружность: \n" + values[i]);
    }
}
