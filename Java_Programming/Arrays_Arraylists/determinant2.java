public class determinant2 {
    public static int det2(int[][] arr) {
    if (arr.length != 3 || arr[0].length != 3) {
        throw new IllegalArgumentException("We need a 3x3 array.");
    }
        int j = arr[0][0] * ((arr[1][1] * arr[2][2]) - (arr[1][2] * arr[2][1]));
        int i = arr[0][1] * ((arr[1][0] * arr[2][2]) - (arr[1][2] * arr[2][0]));
        int k = arr[0][2] * ((arr[1][0] * arr[2][1]) - (arr[1][1] * arr[2][0]));
    return j - i + k;
}
    public static void main(String[] args) {
        int[][] exampleArray = { {6, 1, 1}, {4, -2, 5}, {2, 8, 7} };
        System.out.println(det2(exampleArray));
    }
}
