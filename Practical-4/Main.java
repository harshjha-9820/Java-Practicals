/*
Practical 4: Abstraction and Interfaces
Design an abstract class Employee with abstract and concrete methods, then implement subclasses with
different salary calculations. Define an interface such as Payable or Printable and demonstrate multiple
interface implementation.
*/


abstract class Employee {

    String name;
    int id;

    // Constructor
    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Abstract method
    abstract double calculateSalary();

    // Concrete method
    void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
    }
}

// First interface
interface Payable {
    void paySalary();
}

// Second interface
interface Printable {
    void printDetails();
}

// Full-time employee
class FullTimeEmployee extends Employee
        implements Payable, Printable {

    double monthlySalary;

    FullTimeEmployee(String name, int id, double monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }

    @Override
    double calculateSalary() {
        return monthlySalary;
    }

    @Override
    public void paySalary() {
        System.out.println("Full-time Salary: " + calculateSalary());
    }

    @Override
    public void printDetails() {
        displayDetails();
    }
}

// Part-time employee
class PartTimeEmployee extends Employee
        implements Payable, Printable {

    int hoursWorked;
    double hourlyRate;

    PartTimeEmployee(String name, int id,
                     int hoursWorked, double hourlyRate) {
        super(name, id);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    double calculateSalary() {
        return hoursWorked * hourlyRate;
    }

    @Override
    public void paySalary() {
        System.out.println("Part-time Salary: " + calculateSalary());
    }

    @Override
    public void printDetails() {
        displayDetails();
    }
}

public class Main {
    public static void main(String[] args) {

        FullTimeEmployee e1 =
                new FullTimeEmployee("Rahul", 101, 30000);

        PartTimeEmployee e2 =
                new PartTimeEmployee("Amit", 102, 80, 200);

        System.out.println("Full-Time Employee");
        e1.printDetails();
        e1.paySalary();

        System.out.println();

        System.out.println("Part-Time Employee");
        e2.printDetails();
        e2.paySalary();
    }
}
