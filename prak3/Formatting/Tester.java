package Formatting;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Tester {

    public static void generateReport(ArrayList<Employee> people){
        for (Employee person:people){
            System.out.print(person);
        }
    }


    public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите денежную сумму в рублях: ");
        double number = scan.nextDouble();
        Convertor convertor = new Convertor(number);
        System.out.println("Введите валюту, в которую хотите перевести (Dollar, Yuan, RUB): ");
        convertor.convertTo(scan.next());
        NumberFormat num = NumberFormat.getCurrencyInstance(convertor.getLocale());
        System.out.println("Теперь на вашем счету лежат " + convertor.getNumber());

//        Random rand = new Random();
//        Convertor price = new Convertor(rand.nextInt(1001));
//        //System.out.print(price.getNumber());
//        System.out.print("Товар выбран. В какой валюте хотите его оплатить (Dollar, Yuan, RUB)?: ");
//        String choice = scan.next();
//        price.convertTo(choice);
//        NumberFormat num = NumberFormat.getCurrencyInstance(price.getLocale());
//        System.out.println("Данный товар стоит " + num.format(price.getNumber()) + ". Внесите данную сумму: ");
//        double money = scan.nextDouble();
//        if (money < price.getNumber())
//            System.out.println("Вы не заплатили полную сумму.");
//        else if (money == price.getNumber())
//            System.out.println("Товар оплачен.");
//        else System.out.println("Спасибо, что внесли больше денег, чем стоит этот товар. Эти деньги мы отдатим в благотворительный фонд.");

        Report rep = new Report();
        generateReport(rep.getPeople());
    }
}
