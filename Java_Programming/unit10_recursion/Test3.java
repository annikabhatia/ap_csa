/*
Write the displayEvenDigits method. It should take in an integer num and return a String version of num with the odd digits replaced by '_'. For example, displayEvenDigits(42356) should return "42__6". To achieve this recursively, you should use modulo and division to get the least-significant digit and then pass a version of num without that digit (hint: use integer division).
*/ 
public class Test3
{
    public static String displayEvenDigits(int num) {

        if (num == 0) {
            return "";
        } 
        if ((num % 10) % 2 == 0) {
            return  displayEvenDigits(num/10) + (num % 10);
        }
        else {
            return  displayEvenDigits(num / 10) + "_";
        }
    }

    public static void main(String[] args)
    {
        int num1 = 12345678;
        System.out.println("displayEvenDigits(" + num1 + ") --> " + displayEvenDigits(num1));

        int num2 = 2468;
        System.out.println("displayEvenDigits(" + num2 + ") --> " + displayEvenDigits(num2));

        int num3 = 1357;
        System.out.println("displayEvenDigits(" + num3 + ") --> " + displayEvenDigits(num3));
    }
}
