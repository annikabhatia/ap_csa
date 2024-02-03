//
import java.util.Scanner;

public class Sumof3 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter 3 numbers");
        float i = input.nextFloat();
        float j = input.nextFloat();
        float k = input.nextFloat();
        float max_value_ij = Math.max(i,j);
        System.out.println("The max of 3 numbers is: " + max_value_ij);
        float max_val_ijk = Math.max(max_value_ij, k);

        float max = Math.max(k, Math.max(i,j));
        System.out.println("The max of 3 numbers is: " + max_val_ijk);

        System.out.println("The max of 3 numbers is: " + max);
    }

}
