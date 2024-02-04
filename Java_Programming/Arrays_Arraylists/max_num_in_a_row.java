public class max_num_in_a_row {
    public static void main(String[] args) {
        int[][] matrix = {{3, 7, 2}, {9, 4, 6}, {8, 1, 5}};
        int[] arr = findMaxOfEachRow(matrix);
        for (int n = 0; n < matrix.length; n++) {
            System.out.print(arr[n] + " ");
        }
        System.out.println("");

        int[] arr2 = findMaxOfEachCol(matrix);
        for (int i = 0; i < matrix[0].length; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println("");
    }
    public static int[] findMaxOfEachRow(int[][] matrix) {
        int[] arr = new int[matrix.length];
        for (int r = 0; r < matrix.length; r++) {
            arr[r] = matrix[r][0];
            for (int c = 0; c < matrix[0].length; c++) {
                if (matrix[r][c] > arr[r])
                    arr[r] = matrix[r][c];
            }
        }
        return arr;
}

public static int[] findMaxOfEachCol(int[][] matrix) {
    int[] arr = new int[matrix[0].length];
    for (int c = 0; c < matrix[0].length; c++) {
        arr[c] = matrix[0][c];
        for (int r = 0; r < matrix.length; r++) {
            if (matrix[r][c] > arr[c]) {
                arr[c] = matrix[r][c];
            }
        }
    }
    return arr;
}

}

