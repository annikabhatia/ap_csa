
import java.util.ArrayList;
import java.util.Scanner;

public class max_and_min_arraylists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // allows user to enter digits
        ArrayList<Integer> integerList = new ArrayList<>(); // to store the integers

        System.out.println("Enter integers: ");
        while (scanner.hasNextInt()) {
            int input = scanner.nextInt();
            integerList.add(input);
        }

        System.out.println("Here is a list of the integers in your ArrayList" + integerList);
        int min = findingMin(integerList);
        int max = findingMax(integerList);
        System.out.println("This is the lowest value of your ArrayList: " + min);
        System.out.println("This is the highest value of your ArrayList: " + max);

        scanner.close(); // always close the scanner
    }
    public static int findingMin(ArrayList<Integer> minList) {
        int n = minList.get(0);
        for (int num: minList) {
            if (n > num) {
                n = num;
            }
      //  System.out.println("This is the lowest value of your ArrayList: " + n);
        }
        return n;
    }

    public static int findingMax(ArrayList<Integer> maxList) {
        int m = maxList.get(0);
        for (int num: maxList) {
            if (m < num) {
                m = num;
            }
       // System.out.println("This is the highest value of your ArrayList: " + m);
        }
        return m;
    }
    
}

