package Formatting;
import java.text.NumberFormat;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

public class Convertor {

    private double number;
    private Locale locale;
    Convertor(double newNumber) {
        number = newNumber;
    }

    public void convertTo(String valuta){
        if (Objects.equals(valuta, "Dollar")){
            locale = Locale.US;
            number /= 63.1;
        }
        else if (Objects.equals(valuta, "Yuan")){
            locale = Locale.CHINESE;
            number /= 8.15;
        }
    }

    public Locale getLocale() {
        return locale;
    }

    public double getNumber() {
        return number;
    }
}
