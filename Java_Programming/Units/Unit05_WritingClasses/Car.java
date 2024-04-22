package Units.Unit05_WritingClasses;

public class Car {
    String make;
    String model;
    int year;
    int speed;

    public Car(String make, String model, int year, int speed) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.speed = speed;
    }

    public void accelerate(int speedAdded) {
        speed+=speedAdded;
        System.out.println("The car is accelerating. The new speed is " + speed + " mph.");
    }

    public void brake() {
        speed = 0;
        System.out.println("The car has come to a stop. The speed is now " + speed + " mph.");
    }
}
