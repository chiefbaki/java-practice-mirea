package Exercise5;

public class Phone {
    final private String codeCountry, city, triplet, quadruple;

    public Phone(String number){
        if(number.startsWith("8"))
            codeCountry = "+7";
        else
            codeCountry = number.substring(0, number.length()-10);
        city = number.substring(number.length()-10, number.length()-7);
        triplet = number.substring(number.length()-7, number.length()-4);
        quadruple = number.substring(number.length()-4);
    }

    @Override
    public String toString() {
        return codeCountry + " (" + city + ") " + triplet + "-" + quadruple;
    }

    public static void main(String [] args){
        System.out.println(new Phone("+79859051414"));
        System.out.println(new Phone("+104289652211"));
        System.out.println(new Phone("84959631453"));
    }
}
