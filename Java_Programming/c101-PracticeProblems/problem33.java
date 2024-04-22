public class problem33 {
    public static void main(String[] args) {
        System.out.println(rotateRight(5.8, 2.6, 9.1, 3.4, 7.0));
    }

    public static double rotateRight(float[] arr) {
        arr[0] = arr[arr.length - 1];
        for (int i = 1; i < arr.length; i++) {
            arr[i+1] = arr[i];
        }
        System.out.println(arr);
    }
}
