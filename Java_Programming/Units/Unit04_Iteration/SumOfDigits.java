import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int num = scanner.nextInt();
        int sum = 0;
        while(num > 0)  
        {
            sum += (num % 10);
            num = num / 10;
        }
        /*
        Example for loop 
        for (  ;num > 0; num/=10) {
            sum += (num % 10);
        }
        */
        System.out.println("sum of digits of number is " + sum);

        scanner.close();
    }
}