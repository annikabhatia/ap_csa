package Units.Unit05_WritingClasses;

public class Person {
    public static void main(String[] args) {
        personChar("Allie", 15, "female");
    }

    public static void personChar(String name, int age, String gender) {
        System.out.println("Student's name: " + name);
        System.out.println("Student's age: " + age);
        System.out.println("Student's gender: " + gender);
    }
}
