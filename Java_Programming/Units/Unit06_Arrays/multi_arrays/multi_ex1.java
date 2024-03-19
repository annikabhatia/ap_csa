import java.util.Arrays;
import java.util.Random;

public class multi_ex1 {

    public static  int[][] unflatten( int A[], int rows, int cols)
    {
        if(A.length != rows*cols) {
            throw new IllegalArgumentException("Array length does not match the dimensions provided.");
        }

        int [][] M = new int[rows][cols];

        int index = 0;
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                M[r][c] = A[index++];
            }
        }
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                System.out.print(M[r][c] + ", ") ;  
            }
            System.out.println();
        }
        return M;
    }
    public static void main(String[] args) {
        // 1. Set the desired array size
        int arraySize = 24;

        // 2. Create an array to hold the random integers
        int[] randomArray = new int[arraySize];

        // 3. Create a Random object for generating random numbers
        Random random = new Random();

        // 4. Fill the array with random integers
        for (int i = 0; i < arraySize; i++) {
            // Generate a random integer between 0 (inclusive) and 100 (exclusive)
            randomArray[i] = random.nextInt(100);
        }

        // 5. Print the generated array
        System.out.println("Random integer array: " + Arrays.toString(randomArray));
        unflatten(randomArray, 6, 4);
    }
}
