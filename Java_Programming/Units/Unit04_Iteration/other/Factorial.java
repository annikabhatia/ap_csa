package other;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(calculateFactorial(4));
    }

    public static int calculateFactorial(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        return factorial;
    }
}
