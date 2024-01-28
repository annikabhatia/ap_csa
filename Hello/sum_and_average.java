import java.util.ArrayList;
import java.util.Scanner;

public class sum_and_average {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // allows user to enter digits
        ArrayList<Integer> integerList = new ArrayList<>(); // to store the integers

        System.out.println("Enter integers: ");
        while (scanner.hasNextInt()) {
            int input = scanner.nextInt();
            integerList.add(input);
        }

        System.out.println("Here is a list of the integers in your ArrayList" + integerList);
        int sum = calculateSum(integerList);
        double average = calculateAverage(integerList);
        System.out.println("This is the sum: " + sum);
        System.out.println("This is the average: " + average);
        scanner.close(); // always close the scanner

    }

    public static int calculateSum(ArrayList<Integer> sumList) {
        int sum = 0;
        for (int s : sumList) {
            sum += s;
        }
      //  System.out.println("This is the sum: " + sum);
        return sum;

    }

    public static double calculateAverage(ArrayList<Integer> averageList) {
        int sum = 0;
        for (int s : averageList) {
            sum += s;
        }

      //  System.out.println("This is the average: " + (double) sum / averageList.size());
        return (double) sum / averageList.size();

    }
}