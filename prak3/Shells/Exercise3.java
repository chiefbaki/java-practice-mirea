package Shells;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        String number = scanner.next();
        Double ans = Double.parseDouble(number);
        int first = ans.intValue();
        byte second = ans.byteValue();
        float third = ans.floatValue();
        long forth = ans.longValue();
        short fifth = ans.shortValue();
        double six = ans.doubleValue();
    }
}
