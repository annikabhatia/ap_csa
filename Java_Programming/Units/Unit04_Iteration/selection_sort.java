import java.util.ArrayList;
import java.util.Scanner;

public class selection_sort {
    public static void selectionSort(int[] elements) {
        for (int j = 0; j < elements.length - 1; j++) {
            int minIndex = j;
            for (int k = j + 1; k < elements.length; k++) {
                if (elements[k] < elements[minIndex]) {
                    minIndex = k;
                }
            }
        
            if (j != minIndex)
            {
                int temp = elements[j];
                elements[j] = elements[minIndex];
                elements[minIndex] = temp;
            }
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Create an array of the specified size
        int[] array = new int[size];

        // Prompt the user to enter integers
        System.out.println("Enter " + size + " integers:");

        // Loop to scan integers and store them in the array
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Print the array
        System.out.println("The array you entered is:");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        selectionSort(array);
        System.out.println("The array after selection sort:");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        // Close the scanner
        scanner.close();
    }
}
