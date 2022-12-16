package Formatting;

public class Employee {
    private String fullname;
    private double salary;

    Employee(String name, double money){
        fullname = name;
        salary = money;
    }

    public String getFullname() {
        return fullname;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("Работник: %s\nЗаработная плата: %15.2f\n\n", fullname, salary);
    }
}
