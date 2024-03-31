package Units.Unit03_BooleanExpressions_and_if_Statements;

public class PassOrFail {
    public static void main(String[] args) {
        System.out.println(studentScore(64));
        System.out.println(studentScore(97));

    }

    public static boolean studentScore(int n) {
        if (n >= 65) {
            return true;
        }
        else {
            return false;
        }
    }
}
