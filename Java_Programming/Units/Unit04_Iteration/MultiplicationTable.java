public class MultiplicationTable {
    public static void main(String[] args) {
       int arr[][] = new int[10][10];
       for (int row = 0; row < arr.length; row++) {
        for (int col = 0; col < arr[row].length; col++) {
            arr[row][col] = row * col;
            System.out.println(arr[row][col]);
        }
       }
       System.out.println();
    }
}
