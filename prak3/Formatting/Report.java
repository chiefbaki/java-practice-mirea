package Formatting;

import java.util.ArrayList;
import java.util.Scanner;

public class Report {
    ArrayList<Employee> people;

    Report(){
        people = new ArrayList<Employee>();
        people.add(new Employee("Vasya", 1232.852));
        people.add(new Employee("Baha", 2000.215313));
        people.add(new Employee("Islam", 100000.123));
        people.add(new Employee("Aiba", 4500.45));
    }

    public ArrayList<Employee> getPeople() {
        return people;
    }
}
