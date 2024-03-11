/** Find if a number is a prime number or not */

public class problem24 {
    public static void main(String[] args) {     
        System.out.println(isPrime(19));
        System.out.println(isPrime(1));
        System.out.println(isPrime(51));
        System.out.println(isPrime(-13));
        System.out.println(isPrime(4));
        System.out.println(isPrime(5));
    }

    public static int isPrime(int n) {
        if (n <= 1) {
            return -1;
        }
        for (int i = 2; i < n - 1; i++) {
            if (n % i == 0) {
                return -1;
            }
        }
        return n; 
}

}
