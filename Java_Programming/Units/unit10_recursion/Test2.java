public class Test2
{
    public static int evenDigits(int n) {

        if (n == 0) {
            return 0;
        } 
        
        if (((n % 10) % 2) == 0) {
            return 1 + evenDigits(n / 10);
        } else {
            return evenDigits(n/10);
        }                
    }

    public static void main(String[] args)
    {
        int num1 = 12345678;
        System.out.println("evenDigits(" + num1 + ") --> " + evenDigits(num1));

        int num2 = 9876543;
        System.out.println("evenDigits(" + num2 + ") --> " + evenDigits(num2));
    }
}
