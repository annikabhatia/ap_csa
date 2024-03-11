public class problem26 {

    public static int getGCD(int a, int b) {
        int gcd = 1;
        for (int i = gcd; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }
    public static void main(String[] args) {
        int[] fraction = {75, 9};
        if (reduce(fraction))
            System.out.println("" + fraction[0] + '/' + fraction[1]);
        else
            System.out.println("fraction error");
    }

    public static boolean reduce(int[] fractionArray) {
        if (fractionArray.length > 2 || fractionArray[0] <= 0 || fractionArray[1] <= 0) {
            return false;
        }
        
        int n = getGCD(fractionArray[0], fractionArray[1]);
        fractionArray[0] = fractionArray[0] / n;
        fractionArray[1] = fractionArray[1] / n;
        return true;
        
    }
    
}
