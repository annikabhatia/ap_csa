
public class Employee extends Person {
    private int ID;
    private String companyName;

    public Employee(String name, int age, int ID, String companyName) {
        super(name, age);
        this.ID = ID;
        this.companyName = companyName;
    }

    public void display() {
        super.display();
        System.out.println("Employee ID: " + ID);
        System.out.println("Company Name: " + companyName);
    }
}
   