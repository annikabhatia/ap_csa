public class PowerOf {
    public static void main(String[] args) {
        System.out.println(calcPow(3, 3));
    }
    public static double calcPow(int num, int exp) {
        double result = 1.0;
        // implement using a loop
        while (exp-- > 0) {
            result*=num;
        }
        return result;
        //return Math.pow(num, exp);
    }

}
