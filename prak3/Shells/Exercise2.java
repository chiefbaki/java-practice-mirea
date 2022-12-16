package Shells;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        String number = scanner.next();
        Double ans = Double.parseDouble(number);
        System.out.println(ans);
    }
}
