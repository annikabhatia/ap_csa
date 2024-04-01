import java.util.ArrayList;
/*
 * Create an ArrayList of integers. 
 * Add some elements to the ArrayList.
 * Print the contents of the ArrayList.
 */

public class q1_ArrayListBasics {
    
    // Empty method to be implemented
    public static void arrayListBasics() {
        // Implement adding elements to an ArrayList and printing its contents
    
    }


    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // Add elements to the ArrayList
        list.add(10);
        list.add(20);
        list.add(30);

        // Print the contents of the ArrayList
        System.out.println("Contents of ArrayList:");
        for (int num : list) {
            System.out.println(num);
        }
    }

}
