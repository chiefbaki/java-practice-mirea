import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Exercise4 {
    public static boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch(NumberFormatException e){
            return false;
        }
    }
    public static int entryData(String n){
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.print("Введите размер массива: ");
            n = scan.next();
            if (isNumeric(n))
                break;
            else
                System.out.print("Введенное число не является числом\n");
        }
        return Integer.parseInt(n);
    }

    public static void main(String []args){
        String n = "";
        int size = entryData(n);
        int [] arr = new int[size];
        ArrayList<Integer> evenNum = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < size; ++i) {
            arr[i] = rand.nextInt(size + 1);
            if (arr[i] % 2 == 0)
                evenNum.add(arr[i]);
        }
        System.out.print("Получившийся массив: [");
        for (int i = 0; i < size; ++i)
            if (i != size - 1)
                System.out.print(arr[i] + ", ");
            else
                System.out.print(arr[i] + "]\n");
        System.out.print("Массив из четных элементов:");
        System.out.print(evenNum);
    }
}
