public class problem28 {
    public static void main(String[] args) {
        float[] a = {3.2f, 5.8f, 0.9f};
        sort3(a);
        System.out.println(""+ a[0] + "  " + a[1] + "  " + a[2]);
    }

    public static void sort3(float[] x) {
        if (x.length > 3) {
            System.out.println("Please only enter 3 numbers");
        }

        if(x[0] <= x[1] && x[1] <= x[2]) {
            System.out.println(""+ x[0] + "  " + x[1] + "  " + x[2]);
        }
        
        if (x[0] > x[2]) {
            float temp = x[0];
            x[0] = x[2];
            x[2] = temp;
        }

        if (x[0] > x[1]) {
            float temp = x[0];
            x[0] = x[1];
            x[1] = temp;
        }

        if (x[1] > x[2]) {
            float temp = x[1];
            x[1] = x[2];
            x[2] = temp;
        }
    }
}
