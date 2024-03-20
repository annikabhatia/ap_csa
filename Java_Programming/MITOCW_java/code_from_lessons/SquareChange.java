package code_from_lessons;
public class SquareChange {
    public static void printSquare(int x) {
        System.out.println("printSquare x = " + x); // method parameters are like defining a new variable in the method
        x = x*x;
        System.out.println("printSquare x = " + x); 
    }

    public static void main(String[] arguments) {
        int x = 5;
        System.out.println("main x = " + x);
        printSquare(x);
        System.out.println("main x = " + x); // will print x value within THIS scope (x = 5)
    }
}
