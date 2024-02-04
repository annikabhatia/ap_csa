public class determinant {

    public static int det(int[][] arr) {
        if (arr.length != 2 || arr[0].length != 2) {
            throw new IllegalArgumentException("We need a 2x2 array.");
        } 
        int j = arr[0][0] * arr[1][1]; 
        int k = arr[0][1] * arr[1][0];
        return j - k;
    }
    public static void main(String[] args) {
        int[][] exampleArray = { {4, 5, 6}, {9, 7, 8} };
        System.out.println(det(exampleArray));
        
    }
}
