import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Exercise1 {

    public static void random1(double [] arr){
        Random rand = new Random();
        System.out.println("Способ 1:");
        for (int i = 0; i < arr.length; ++i)
            arr[i] = rand.nextDouble();
    }

    public static void random2(double [] arr){
        System.out.println("Способ 2:");
        for (int i = 0; i < arr.length; ++i)
            arr[i] = Math.random();
    }

    public static void printAll(double [] arr){
        System.out.println("Неотсортированный массив: ");
        printArr(arr);
        Arrays.sort(arr);
        System.out.println("Отсортированный массив: ");
        printArr(arr);
    }

    public static void printArr(double []arr){
        for (int i = 0; i < arr.length; ++i)
            System.out.println("    " + arr[i] + " ");
        System.out.println();
    }

    public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.print("Введите размер массива: ");
        n = scan.nextInt();
        double [] arr = new double[n];
        random1(arr);
        printAll(arr);
        random2(arr);
        printAll(arr);
        printArr(arr);
    }
}
