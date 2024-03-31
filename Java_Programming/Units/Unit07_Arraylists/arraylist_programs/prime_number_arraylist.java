
import java.util.ArrayList;

public class prime_number_arraylist {
    public static void main(String[] args) {

    ArrayList<Integer> first20Primes = getFirstNPrimes(20); //get first 20 prime numbers
    int sumOfPrimes = sumPrimesInArrayList(first20Primes); // get sum of first 20 prime numbers
    
    // print out results
    System.out.println("First 20 prime numbers: " + first20Primes);
    System.out.println("Sum of the first 20 prime numbers: " + sumOfPrimes);
    }

    // check if the number is prime
    public static boolean isPrime(int number) {
        if (number <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0)
                return false;
        }
        return true;
        }
    
    // make list of n prime numbers -- set to 20 above in the main method
    public static ArrayList<Integer> getFirstNPrimes(int n) {
        ArrayList<Integer> primes = new ArrayList<>();
        int i = 2;
        while (primes.size() < n) {
            if (isPrime(i)) {
                primes.add(i);
            }
            i++;
        }
        return primes;
    }

    // find sum of first 20 prime numbers
    public static int sumPrimesInArrayList(ArrayList<Integer> list) { // this method is called above in the main method
        int sum = 0;
        for (int num : list) {
            sum+=num;
        }
        return sum;
    }
}

    

