public class problem22 {
    public static void main(String[] args) {
        System.out.println(enough(9));
        System.out.println(enough(-7));
    }

    public static int enough(int goal) {
        int sum = 1;
        for (int n = 1; n < goal; n++) {
            sum+=n;
        }
        return sum; 
    }
}
