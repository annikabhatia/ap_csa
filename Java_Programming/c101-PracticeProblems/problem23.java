public class problem23 {
    public static void main(String[] args) {
        System.out.println(getGCD(40, 50));
        System.out.println(getGCD(256, 625));
    }

    public static int getGCD(int a, int b) {
        int gcd = 1;
        for (int i = gcd; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }
}
