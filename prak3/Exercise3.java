import java.util.Random;

public class Exercise3 {

    public static void main(String []args){
        Random rand = new Random();
        int [] arr = new int[4];
        for (int i = 0; i < 4; ++i)
            arr[i] = rand.nextInt(90) + 10;
        System.out.println("Массив: ");
        for (int i = 0; i < 4; ++i)
            System.out.print(arr[i] + " ");
        System.out.println("\n");
        if (arr[0] < arr[1] && arr[1] < arr[2] && arr[2] < arr[3])
            System.out.println("Данная последовательность строго возрастает");
        else
            System.out.println("Данная последовательность не строго возрастает");
    }
}
