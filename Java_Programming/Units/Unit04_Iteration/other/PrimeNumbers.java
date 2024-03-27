package other;

public class PrimeNumbers {
    public static void main(String[] args) {
        for (int i = 1; i <= 50; i++) {
            for (int n = i; n > i; n++) {
                if (i % n == 0) {
                    System.out.print(i);
                }
            }
        }
    }
}
