package Units.Unit05_WritingClasses;

public class Circle {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void calcArea() {
        double area = Math.pow(radius, 2) * 2 * 3.14;
        System.out.println("The area of the circle is " + area);
    }

    public void calcCircumference() {
        double circumference = 2 * 3.14 * radius;
        System.out.println("The circumference of the circle is " + circumference);
    }
}
