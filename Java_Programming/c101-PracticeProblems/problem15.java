import java.util.Scanner;
public class problem15 {
    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("Enter a non-negative integer: ");
            n = scan.nextInt();
            if(n<0)
                System.out.println("The integer you have entered is negative.");
        } while (n < 0);
        scan.close();
    }
}
