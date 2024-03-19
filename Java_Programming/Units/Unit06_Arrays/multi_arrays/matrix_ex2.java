import java.util.Random;
import java.util.Scanner;

public class matrix_ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Get matrix dimensions from user
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();

        // Create two random matrices
        int[][] matrix1 = new int[rows][cols];
        int[][] matrix2 = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix1[i][j] = random.nextInt(100); // Random numbers between 0 and 99
                matrix2[i][j] = random.nextInt(100);
            }
        }

        // Print the matrices
        System.out.println("Matrix 1:");
        printMatrix(matrix1);
        System.out.println("Matrix 2:");
        printMatrix(matrix2);

        // Template for the addition function (to be implemented)
        int[][] sumMatrix = addMatrices(matrix1, matrix2);
        System.out.println("Sum of matrices:");
        printMatrix(sumMatrix); // Uncomment after implementing addMatrices

        scanner.close();


    }

    // Function to print a matrix
    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // Template for the matrix addition function (to be implemented)
    private static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        // Implement matrix addition logic here
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] sumMatrix = new int[rows][cols];

        if (rows == matrix2.length && cols == matrix2[0].length) {
            for (int r = 0; r < rows; r++) {
                for (int c = 0; c < cols; c++)
                    sumMatrix[r][c] = matrix1[r][c] + matrix2[r][c];
            }
            
        } else
            throw new IllegalArgumentException("# of Rows and columns for both matrices does not match.");

        return sumMatrix;

   

    }
}




























/*
 * 
 * 
 *         // Example:
        int[][] sumMatrix = new int[matrix1.length][matrix1[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return sumMatrix;

 */