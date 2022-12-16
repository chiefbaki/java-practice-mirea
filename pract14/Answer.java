import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Answer {

    public static boolean isStrangeStr(String s){
        return s.equals("abcdefghijklmnopqrstuv18340");
    }

    public static ArrayList<String> findRubEurUsd(String s){
        Pattern p  = Pattern.compile("\\d+(\\.\\d+)?\\s((USD)|(EUR)|(RUB))");
        Matcher m = p.matcher(s);
        ArrayList<String> ans = new ArrayList<>();
        while (m.find()){
            ans.add(m.group());
        }
        return ans;
    }

    public static boolean isPlus(String s){
        return Pattern.compile("\\d+\\s*\\+").matcher(s).find();
    }

    public static boolean isDate(String s){
        Matcher m = Pattern.compile(
                "((29/02/((19([2468][048])|([13579][26])|(0[48]))|([2-9]\\d([2468][048])|([13579][26]))|([2468][048]00)|([3579][26]00)))|((2[0-8]/02/((19\\d\\d)|([2-9]\\d{3}))))|(((0?\\d)|([12]\\d)|(3[01]))/((0?[013456789])|(1[12]))/((19\\d\\d)|([2-9]\\d{3}))))"
        ).matcher(s);
        return m.find() && m.group().equals(s);
    }

    public static boolean checkEmail(String s){
        Matcher m = Pattern.compile(
                "[a-zA-Z0-9]+[a-zA-Z0-9!#$%&'*+\\-/=?^_`{|}~.]*@[a-zA-Z0-9\\-_.]+\\.[a-zA-Z]+"
        ).matcher(s);
        return m.find() && m.group().equals(s);
    }

    public static boolean checkPass(String s){
        return Pattern.compile("(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])[0-9a-zA-Z_]{8,}").matcher(s).find();
    }

    public static void main(String [] args){
        /*System.out.println("Введите строку:");
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        System.out.println("Введите паттерн:");
        String p = scan.nextLine();
        System.out.println(Arrays.toString(str.split(p)));
        System.out.println();
        System.out.print("Введите строку: ");
        String value = scan.next();
        if (isStrangeStr(value))
            System.out.print("Строка действительно является данной");
        else
            System.out.print("Строка не является данной");
        System.out.println();
        System.out.print("Введите строку: ");*/
        System.out.println(isPlus("1 / 3 -5"));
        System.out.println(isPlus("1 + 3 -5"));
        System.out.println();
        System.out.println(isDate("12/12/2001"));
        System.out.println(isDate("29/02/2001"));
        System.out.println(isDate("1/1/1923"));
        System.out.println();
        System.out.println(checkEmail("ik509331@gmail.com"));
        System.out.println(checkEmail("ik 509331@gmail.com"));
        System.out.println(checkEmail("ik.@.gmail.com"));
        System.out.println(checkEmail("ik@gmail"));
        System.out.println(checkEmail("ik@g@mail.ru"));
        System.out.println();
        System.out.println(checkPass("ThisIsBadPassword"));
        System.out.println(checkPass("_NowIsGoodpassowrd1"));

        Scanner scan = new Scanner(System.in);
        String value = scan.nextLine();
        ArrayList<String> ans = findRubEurUsd(value);
        System.out.println(ans);
    }
}
