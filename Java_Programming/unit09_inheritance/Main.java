public class Main {
    public static void main(String[] args) {
		Employee emp1 = new Employee("Amit", 27, 1234, "Colgate");
        System.out.println("Employee Information:");
        emp1.display();
        System.out.println();

		Employee emp2 = new Employee("Sonia", 24, 4321, "Citigroup");
        System.out.println("Employee Information:");
        emp2.display();
        System.out.println();

        Student student1 = new Student("Annika", 17, "Marlboro High School", 12);
        System.out.println("Student Information:");
        student1.display();
		System.out.println();

		Student student2 = new Student("Shylah", 13, "Marlboro Memorial Middle School", 8);
        System.out.println("Student Information:");
        student2.display();
		System.out.println();
    }
}