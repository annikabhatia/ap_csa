public class problem25 {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            digitName(i);
        }
    }

    public static void digitName(int digitVal) {
        String[] arr = {"one", "two", "three","four", "five", "six", "seven", "eight", "nine"};
        if (digitVal > 0 && digitVal < 10) {
            System.out.print(" " + arr[digitVal-1] + " ");
        }
        else
            System.out.print("error");
        return;
    }
}
