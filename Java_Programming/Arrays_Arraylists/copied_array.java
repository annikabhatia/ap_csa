public class copied_array {
    public static void print_array(int[] A) {
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i]);
            System.out.print(", ");    
        }
        System.out.println("");
    }
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5, 6};
        int[] arr2 = new int[arr.length]; 

        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i];
        }

        print_array(arr);
        print_array(arr2);
    }
}


// need to check how to run this