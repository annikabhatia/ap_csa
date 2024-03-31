package Units.Unit03_BooleanExpressions_and_if_Statements;

public class EvenOrOdd {
    public static void main(String[] args) {
        System.out.println(isEven(6578));
    }

    public static String isEven(int n) {
        if (n % 2 == 0)
            return "This is even";
        else
            return "This is odd";
    }
}
