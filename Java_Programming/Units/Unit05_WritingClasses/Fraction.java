package Units.Unit05_WritingClasses;
// Define a class to represent a fraction with attributes like numerator and denominator, and methods to perform arithmetic operations.
public class Fraction {
    int numerator;
    int denominator;
    int product;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public double multiply(int m) {
        product = (numerator / denominator) * m;
        return product;
    }

    public double divide(int d) {
        product = (numerator / denominator) / d;
        return product;
    }
}
