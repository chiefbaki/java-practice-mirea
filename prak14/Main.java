package _12lab._2ex;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        // Задание 1
//        String regex=".*([0-9]+[ ]*[+]).*";
//        System.out.println("(1+8)-9/4" + " " + "(1+8)-9/4".matches(regex));
//        System.out.println("6/5-2*9" + " " + "6/5-2*9".matches(regex));
//        System.out.println("---------------");
//        // Задание 2
//        String pattern = "[a-z]{22}[0-9]{5}"; // 22
//        System.out.println("abcdefghijklmnopqrstuv18340" + " " + "abcdefghijklmnopqrstuv18340".matches(pattern));
//        System.out.println("abcdefghijklmnoasdfasdpqrstuv18340" + " " +"abcdefghijklmnoasdfasdpqrstuv18340".matches(pattern));
//        System.out.println("---------------");
//        //task3
//        System.out.println("Print string");
//        Scanner sc3 = new Scanner(System.in);
//        String word3 = sc3.nextLine();
//        String regex3="((\\d{1,}\\.\\d{2})|\\d{1,}){1}\\s{1}(USD|RUB|EU){1}";
//        Pattern patern3=Pattern.compile(regex3);
//        Matcher matcher3=patern3.matcher(word3);
//        boolean is=false;
//        while (matcher3.find())
//        {
//            System.out.println(word3.substring(matcher3.start(), matcher3.end()));
//            is=true;
//        }
//        if(!is)
//        {
//            System.out.println("no matches found");
//        }
        // Задание 3
        Scanner sc6 = new Scanner(System.in);
        String word6 = sc6.nextLine();
        String regex6="^[\\S]{1,}\\@{1}([A-Za-z]{1,}\\.{1}[A-Za-z]{1,}|localhost)$";
        Pattern patern6=Pattern.compile(regex6);
        Matcher matcher6=patern6.matcher(word6);
        Boolean is=false;
        while (matcher6.find())
        {
            System.out.println(word6.substring(matcher6.start(), matcher6.end()));
            is=true;
        }
        if(!is)
        {
            System.out.println("no matches found");
        }
//        // Задание 4
//        String pattern2 = "/.*([a-z]+[A-Z]+[0-9]+|[a-z]+[0-9]+[A-Z]+|[A-Z]+[a-z]+[0-9]+|[A-Z]+[0-9]+[a-z]+|[0-9]+[a-z]+[A-Z]+|[0-9]+[A-Z]+[a-z]+).*/";
//        System.out.println("F032_Password" + " " + "F032_Password".matches(pattern2));
//        System.out.println("TrySpy1" + " " + "TrySpy1".matches(pattern2));
//        System.out.println("smart_pass" + " " + "smart_pass".matches(pattern2));
//        System.out.println("A007" + " " + "A007".matches(pattern2));
    }
}
