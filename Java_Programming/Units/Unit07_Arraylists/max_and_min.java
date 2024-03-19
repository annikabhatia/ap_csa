
public class max_and_min {

    public static void main(String[] args) {
        int[] arr = { 5, 4, -2, 49, 34 };
        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (max > arr[i])
                max = arr[i];
            if (min < arr[i])
                min = arr[i];
        }

        System.out.println("The maxiumum value is: " + max);
        System.out.println("The minimum value is: " + min);
    }
}
