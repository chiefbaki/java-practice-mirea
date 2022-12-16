package number1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertArrayToListTest {
    public static void main(String[] args) {

        //creating arrays for test
        Integer[] intArr = {1, 2, 3};
        String[] stringArr = {"1", "2", "4"};

        Object[] arr = {"1", "2", "3"};




        //Create objects to work with class
        ConvertArrayToList<Integer> intList = new ConvertArrayToList<>(intArr);
        ConvertArrayToList<String> stringList = new ConvertArrayToList<>(stringArr);

        //Output of lists
        intList.printList();
        stringList.printList();

    }
}
