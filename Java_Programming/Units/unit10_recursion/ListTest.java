import java.util.List;
import java.util.ArrayList;

public class ListTest {
    public static int numFiveOccurrence(int[] arr, int index) {

        if (index >= arr.length) { 
            return 0;
        } 
        
        if (arr[index] == 5) {
            return 1 + numFiveOccurrence(arr, index + 1);
        } else {
            return numFiveOccurrence(arr, index + 1);
        }
        // Hint: Remember that you will have to handle two different possibilities in the recursive case based on arr[index]
        // If you get stuck, look at sumElements and removeStar

    }

    public static void main(String[] args) {

        int[] list= {1, 5, 7, 14, 5};

        System.out.println("Before: {1, 5, 7, 14, 5}");
        System.out.println("After: " + numFiveOccurrence(list, 0));
    }
}

