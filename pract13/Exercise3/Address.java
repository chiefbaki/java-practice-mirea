package Exercise3;

import java.util.StringTokenizer;

public class Address {

    final private String country, region, city, street, house, housing, flat;

    public Address(String address, boolean isMultiDivider){
        if(address == null) throw new NullPointerException();
        String[] s;
        if(isMultiDivider){
            StringTokenizer st = new StringTokenizer(address, ",.;");
            s = new String[st.countTokens()];
            int i = 0;
            while(st.hasMoreTokens())
                s[i++] = st.nextToken();
        }else
            s = address.split(",");
        if(s.length < 7)
            throw new IllegalArgumentException("Введен некорректный адрес!");
        country = s[0].trim();
        region = s[1].trim();
        city = s[2].trim();
        street = s[3].trim();
        house = s[4].trim();
        housing = s[5].trim();
        flat = s[6].trim();
    }

    @Override
    public String toString() {
        return "Address:\n" +
                "    country = " + country + '\n' +
                "    region = " + region + '\n' +
                "    city = " + city + '\n' +
                "    street = " + street + '\n' +
                "    house = " + house + '\n' +
                "    housing = " + housing + '\n' +
                "    flat = " + flat + '\n';
    }


    public static void main(String [] args){
        Address first = new Address("Россия, Московская область, Москва, улица Вернадского, 74, 1, 904", false);
        // Address third = new Address("Россия, Московская область. Москва; улица Вернадского; 74, 1. 904", true);
        System.out.println(first);
//        System.out.println(third);
    }
}
