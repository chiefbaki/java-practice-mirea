package number1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//create class with generic type
public class ConvertArrayToList<T> {

    //create list with type from class
    private List<T> list = new ArrayList<>();

    //add stuff from arr to list
    public ConvertArrayToList(T[] arr){
        list.addAll(Arrays.asList(arr));
    }

    //print list
    public void printList(){
        System.out.println(list);
    }
}
