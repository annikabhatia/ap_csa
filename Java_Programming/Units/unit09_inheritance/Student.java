
public class Student extends Person {
    private String schoolName;
    private int grade;

    public Student(String name, int age, String schoolName, int grade) {
        super(name, age);
        this.schoolName = schoolName;
        this.grade = grade;
    }

    public void display() {
        super.display();
        System.out.println("School Name: " + schoolName);
        System.out.println("Grade: " + grade);
    }
}