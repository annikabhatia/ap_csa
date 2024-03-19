public class sort_array {

    public static void printArray(int[] elements) {
        for (int i = 0; i < elements.length; i++) {
            System.out.print(elements[i] + " ");
        }
        System.out.println("");
    }
    public static void main(String[] args) {
    int[] arr = {11, 7, 14, 4, 27, 1};

    printArray(arr);
    for (int i = 0; i < arr.length - 1; i++) {
       // int minIndex = i;
        for (int j = i + 1; j < arr.length; j++) {
            if (arr[j] < arr[i]) {
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            } 
            //System.out.print("i("+i+"),j("+j+"): ");
            //printArray(arr);
        }
    }
    printArray(arr);
}

}
