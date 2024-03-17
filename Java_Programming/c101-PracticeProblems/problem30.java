public class problem30 {
    public static void main(String[] args) {
        float[] x = {5.8f, 2.6f, 9.0f, 3.4f, 7.1f};
        System.out.println(sumFloats(x));
    }

    public static double sumFloats(float[] x) {
        double sum = 0;
        for (int i = 0; i < x.length; i++) {
            sum+=x[i];
        }
        return sum;
    }

}
