public class RecursionExample {
    public static void main(String[] args) {
        int result = factorial(5);
        System.out.println("Factorial of 5: " + result);
    }

    public static int factorial(int n) {
        // Base case: when n is 0 or 1, the factorial is 1
        if (n == 0 || n == 1) {
            return 1;
        } else {
            // Recursive case: calling factorial method with a smaller argument
            return n * factorial(n - 1);
        }
    }
}
