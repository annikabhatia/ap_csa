import java.util.Scanner;
public class calculateDistance {

    public static double calDistance(int v, int t, int a) {
        double d = v * t + 0.5 * a * Math.pow(t, 2);
        return d;
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the velocity of the car (m/s): ");
        int v = scan.nextInt();
        System.out.print("Enter the acceleration of the car (m/s^2): ");
        int a = scan.nextInt();
        System.out.print("Enter the time traveled: ");
        int t = scan.nextInt();

        double d = calDistance(v, t, a);
        System.out.print("The car traveled a total distance of " + d + ".");
        scan.close();
    }



}

