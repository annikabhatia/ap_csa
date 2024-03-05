public class Test1 {
    public static void main(String[] args) {
        int[][] array = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };

        // Take values from the first row and put them into the first column
        for (int i = 0; i < array.length; i++) {
            array[i][0] = array[0][i];
        }

        // Print the modified array
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println(); // Move to the next line after printing each row
        }
    }
}
