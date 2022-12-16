package Exercise2;

import java.util.Scanner;

public class Main {

    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.print("Введите длину массива окружностей: ");
        n = scan.nextInt();
        Tester check = new Tester(n);
        System.out.println("Все окружности: ");
        check.printArr();
        System.out.println("\nМинимальная окружность: \n" + check.getMinCircle());
        System.out.println("\nМаксимальная окружность: \n" + check.getMaxCircle());
        check.sort();
        System.out.println("\nОтсортированные окружности: ");
        check.printArr();
    }
}
