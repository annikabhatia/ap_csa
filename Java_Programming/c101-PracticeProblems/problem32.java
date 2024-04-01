public class problem32 {

    public static int locationOfTarget(int[] x, int target) {
        int maxIndex = 0;
        for (int i = 0; i < x.length; i++) {
            if (x[i] == target) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }   

    public static void main(String[] args) {
        int[] x = {58, 26, 91, 34, 70, 34, 88};
        System.out.println(locationOfTarget(x, 34));
        
    }
    }


