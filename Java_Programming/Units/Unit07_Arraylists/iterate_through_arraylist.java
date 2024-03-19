import java.util.ArrayList;

public class iterate_through_arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
            arr.add(54);
            arr.add(76);
            arr.add(34);
            arr.add(34);
            arr.add(73);
        for (int i: arr) {
            System.out.println(i);
        }
    }
}