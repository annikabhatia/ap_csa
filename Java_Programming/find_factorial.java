import java.util.Scanner;

public class find_factorial {
    
    public static void main(String[] args) 
    {
        int answer = 1;
        int n;
    
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            answer = answer * i;

        }

        System.out.println("The value of the factorial of " + n + " is " + answer);



        scanner.close();

    }



}
