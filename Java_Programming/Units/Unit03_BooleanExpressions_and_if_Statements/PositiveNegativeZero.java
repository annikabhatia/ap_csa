package Units.Unit03_BooleanExpressions_and_if_Statements;

public class PositiveNegativeZero {
    public static void main(String[] args) {
        System.out.println(isPositive(-5));
    }

    public static String isPositive(int n) {
        if (n == 0) {
            return "This integer is zero.";
        }
        if (n > 0) {
            return "This integer is positive.";
        }
        else {
            return "This integer is negative.";
        }
    }
}
