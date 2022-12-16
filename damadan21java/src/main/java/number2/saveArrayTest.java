package number2;

public class saveArrayTest {

    public static void main(String[] args) {
        String[] stringArr = {"1", "2", "3"};

        saveArray<String> newStringArr = new saveArray<>();

        newStringArr.setArr(stringArr);


        System.out.println(newStringArr.getArr());

        //display an element of an array by index
        System.out.println(newStringArr.getArrIndex(0));
    }
}
