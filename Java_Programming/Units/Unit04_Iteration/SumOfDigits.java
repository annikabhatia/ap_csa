public class SumOfDigits {
    // using recursion
    public static void main(String[] args) {
        System.out.println(calcSum(567));
    }

    public static int calcSum(int num) {
        if (num == 0) {
            return 0;
        } else
            return (num % 10) + calcSum(num / 10);
        
}
}