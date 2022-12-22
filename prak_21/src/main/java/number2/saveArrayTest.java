package number2;

public class saveArrayTest {

    public static void main(String[] args) {
        String[] stringArr = {"1", "2", "3", "4", "5"};
        Integer[] intArr = {1, 2, 3, 4, 5};

        saveArray<String> newStringArr = new saveArray<>();
        newStringArr.setArr(stringArr);

        saveArray<Integer> newIntArr = new saveArray();
        newIntArr.setArr(intArr);


        //display an element of an array by index
        System.out.println("String array: " + newStringArr.getArrIndex(0));
        System.out.println("String array size: " + newStringArr.size());

        System.out.println("Integer array: " + newIntArr.getArrIndex(3));
        System.out.println("Integer array size: " + newIntArr.size());
    }
}
