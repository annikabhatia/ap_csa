package Units.Unit05_WritingClasses;
// Implement a class for a dog with properties like breed, age, and methods to bark and play.
public class Dog {
    String breed;
    int age;

    public Dog(String breed, int age) {
        this.breed = breed;
        this.age = age;
    }

    public void bark() {
        System.out.println("woof! woof!");
    }

    public void play() {
        System.out.println("The dog is running and playing around");
    }
}
