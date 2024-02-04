import java.util.Random;

public class ArraySumCalculator2 {
    // Function to calculate the sum of all elements in a 2D array
    public static int calculateArraySum(int[][] arr) {
    
    int sum = 0;
        for (int r = 0; r < arr.length; r++) {
            for (int c = 0; c < arr[0].length; c++) {
                sum+=arr[r][c];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        // Initialize random number generator
        Random rand = new Random();

        // Generate a 2D array with random integers
        int[][] arr = new int[3][3]; // Change the dimensions as needed
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = rand.nextInt(100); // Generate random integers between 0 and 99
            }
        }

        // Display the generated array
        System.out.println("Generated 2D array:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }       
        
        int sum = calculateArraySum(arr);
        System.out.println("Sum of all elements in the array: " + sum);
    }
}        

