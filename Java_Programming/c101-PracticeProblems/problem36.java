package c101-PracticeProblems;

public class problem36 {
    public static void main(String[] args) {
        
    }

    public static String cocatenate(String[] arr1, String[] arr2) {
        String[] arr3 = new String[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        for (int j = arr1.length - 1; j < arr2.length; j++) {
            arr3[j] = arr1[j];
        }
    }
}
