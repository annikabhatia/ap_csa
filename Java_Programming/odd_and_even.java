public class odd_and_even {
    public static void main(String[] args) {
        int[] arr = { 45, 76, 87, 34, 6, 9, 8 };

        int even = 0;
        int odd = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0)
                even++;
            if (arr[i] % 2 == 1)
                odd++;
        }

        System.out.println("There are " + even + " even numbers in the array.");
        System.out.println("There are " + odd + " odd numbers in the array.");

    }
}