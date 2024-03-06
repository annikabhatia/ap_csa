import java.util.ArrayList;
import java.util.Scanner;
public class sort_arraylist {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    ArrayList<Integer> arr = new ArrayList<Integer>();
    System.out.println("Chose the number of numbers you would like to enter: ");
    int num = scan.nextInt();
    System.out.println("Enter " + num + " numbers: ");
    for (int i = 0; i < num; i++) {
        int ans = scan.nextInt();
        arr.add(ans);
    }    

    // need to fully understand a little more
    for (int l = 0; l < arr.size(); l++) {
        for (int k = 0; k < arr.size() - 1; k++) {
            if (arr.get(l) < arr.get(k)) {
                int temp = arr.get(l);
                arr.set(l, arr.get(k));
                arr.set(k, temp);
            } 
        }
    }    

    for(int j = 0; j < arr.size(); j++) {   
        System.out.print(arr.get(j) + ", ");
    } 
    
    scan.close();

}
}