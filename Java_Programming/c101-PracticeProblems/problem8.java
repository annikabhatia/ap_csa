import java.util.Scanner;
public class problem8 {
    public static void main(String[] args) {
        String message;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a sentence on the line below.");
        // message = scan.next();
        // for the entry "Please go away." , scan.next() only captures the first word seperated by space (Please )
        message = scan.nextLine();
        
        System.out.println( message );
        scan.close();
    }
}
