package Units.Unit05_WritingClasses;
    // Create a class to represent an employee with attributes such as name, position, salary, and methods to calculate bonuses.

public class Employee {
    String name;
    String position;
    double salary;

    public Employee(String name, String position, double salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public double getSalary() {
        return salary;
    }

    public void addBonus(double bonus) {
        salary+=bonus;
        System.out.println("The new salary is " + salary);
    }
}
