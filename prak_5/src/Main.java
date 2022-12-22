import java.util.Scanner;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException{
        System.out.println("15 вариант");
        System.out.println(fifteenth(10));
    }

    private static int seventeenth(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if(n != 0){
            int i = seventeenth();
            if(n > i){
                return n;
            }
            else{
                return i;
            }
        }
        else{
            return 0;
        }

    }

    private static int sixteenth(int m, int k){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if(n == 0){
            return k;
        }
        else{
            if(n == m){
                return sixteenth(m, k+1);
            }
            else{
                if(n > m){
                    return sixteenth(n, 1);
                }
                else{
                    sixteenth(m, k);
                }
            }
        }
        return 0;
    }

    private static int fifteenth(int n){
        // Базовый случай
        if(n < 10){
            return n;
        }
        else{
            System.out.println(n % 10 + " ");
            return  fifteenth(n / 10);
        }
    }

}
