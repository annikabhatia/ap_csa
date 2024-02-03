public class number_array {

public static void main(String[] args) {
    int[] arr = {55, 6, 71, 10, 4, 89, 4, 6, 7, 4};
    int count = 0;
    int num = 4;

for (int i = 0; i < arr.length; i++) {
    if (num == arr[i]) 
        count++;
}

System.out.println("The number " + num + " appeared " + count + " times.");
    }
}