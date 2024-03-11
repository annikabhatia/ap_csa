public class problem29 {
    public static void main(String[] args) {
        float[] x = {5.8f, 2.6f, 9.0f, 3.4f, 7.1f, 8.4f};
        reverse(x);
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + " ");
        }  
        System.out.println();
}
    public static void reverse(float[] a) {
        for (int i = 0 , j = a.length - 1; i<j; i++, j--) {
            float temp = a[j];
            a[j] = a[i];
            a[i] = temp;
        }
    }
}

