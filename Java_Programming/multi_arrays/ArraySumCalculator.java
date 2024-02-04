public class ArraySumCalculator {
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
        // Example usage
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int sum = calculateArraySum(arr);
        System.out.println("Sum of all elements in the array: " + sum);
    }
}        

