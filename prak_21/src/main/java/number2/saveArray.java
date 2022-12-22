package number2;

//number 2 and 3 in one folder

public class saveArray<T> {

    private T [] arr;

    //get element of array by index
    public T getArrIndex(int i){
        return arr[i];
    }

    //setter
    public void setArr(T[] arr) {
        this.arr = arr;
    }

    //size of array
    public int size(){
        return arr.length;
    }
}
