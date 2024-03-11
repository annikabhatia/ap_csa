public class problem27 {
    public static void main(String[] args) {
        float[] x = {5.8f, 0.9f};
        swapFloats(x, 0, 1);
        System.out.println("" + x[0] + "  " + x[1]);
    }

    public static void swapFloats(float[] y, int a, int b) {
        float temp = y[a];
        y[a] = y[b];
        y[b] = temp;
    }
}
