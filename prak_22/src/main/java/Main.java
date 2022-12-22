public class Main {
    public static void main(String[] args) {

        System.out.println("-------------------");
        System.out.println(RPN_Calculator.ExpressionToRPN("2+2*10"));

        System.out.println(RPN_Calculator.RPNtoAnswer(RPN_Calculator.ExpressionToRPN("2+2*10")));
        System.out.println("-------------------");


    }
}
