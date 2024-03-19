import java.util.Scanner;

public class projectileMotion {

    public static double calculateProjectileMotionX(double v, double d, double a, double t) {
        double radians = Math.toRadians(d);
        double cosValue = Math.cos(radians);
        double initialVX = v * cosValue; 
        double c = initialVX * ( t);
        return c;
    }

    public static double calculateProjectileMotionY(double v, double d, double a, double t) {
        double radians = Math.toRadians(d);
        double sinValue = Math.sin(radians); // sin expect argument to be in radians       
        double initialVY = v * sinValue; 
        double m = initialVY * t - (0.5 * a * Math.pow(t, 2));
        return m;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the initial velocity of the projectile (m/s): ");
        double v = scan.nextDouble();
        System.out.print("Enter the launch angle (degrees): ");
        double d = scan.nextDouble();
        System.out.print("Enter the gravitational acceleration (m/s^2): ");
        double a = scan.nextDouble();

        double t = 0.0;
        double x = 0.0; 
        double y = 0.0; 
        while (y >= 0.0) {
            System.out.println("Time: " + t + ", X Position: " + x + ", Y Position: " + y);
            t+=0.5;
            x = calculateProjectileMotionX(v, d, a, t);
            y = calculateProjectileMotionY(v, d, a, t);

        }
        scan.close();
    }
    
}
