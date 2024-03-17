public class problem31 {
    public static int locationOfLargest(int[] x) {
        int maxIndex = 0;
        for (int i = 0; i < x.length; i++) {
            if (x[i] > x[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public static void main(String[] args) {
        int[] x = {58, 26, 90, 34, 71};
        System.out.println(locationOfLargest(x));

    }
}
