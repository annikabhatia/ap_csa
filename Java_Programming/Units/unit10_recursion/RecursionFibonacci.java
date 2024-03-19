public class RecursionFibonacci {

    public static void main(String[] args) {
        int result = fibonacci(6);
        for (int i = 0; i < 6; i++) {
            System.out.println("fibonacci of " + i + ": " + fibonacci(i));
        }
        System.out.println(result);
    }

    public static int fibonacci(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        else {
            return fibonacci(n-1) + fibonacci(n-2);
        }       
    }
    
}





        // Base case: when n is 0 or 1, the fibonacci is 1
        
        // f(0) = 1 and f(1) = 1
        // f(n) = f(n-1) + f(n-2);

   /*  public static int fibonacci_loop(int n) {
        // Base case: when n is 0 or 1, the fibonacci is 1
        int f_n_minus_1 = 1;
        int f_n_minus_2 = 1;
        int f_n = 1;
        
        // f(n) = f(n-1) + f(n-2);
        // f(0) = 1 and f(1) = 1
        for (int i = 2; i <= n; i++) {
            f_n = f_n_minus_1 + f_n_minus_2;
            f_n_minus_2 = f_n_minus_1;
            f_n_minus_1 = f_n;
        }        

        return f_n;
    }
    */