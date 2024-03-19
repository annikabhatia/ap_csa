
public class sum_of_array {
    //import java.lang.Math

    public static void main(String[] args) 
    {
       int sum = 0;
       int[] arr = {5, 8, 45, 32, 67};
       
       for (int i = 0; i < arr.length; i++) {
        sum+=arr[i];
       }

       System.out.println(sum);

    return;
    }
}