package JFA;

public class SquareTest {
    public static void main(String[] args) {
        Square val = new Square(5);
        Square defaultVal = new Square();
        defaultVal.side = 15;
        System.out.println("The perimeter of 5 x 5 square is: " + val.perimeter());
        System.out.println("The area of 5 x 5 square is: " + val.area());
        System.out.println("The perimeter of default square is: " + defaultVal.perimeter());
        System.out.println("The area of default square is: " + defaultVal.area());
    }
}