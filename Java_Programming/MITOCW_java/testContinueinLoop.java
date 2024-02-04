public class testContinueinLoop {
    public static void main(String[] args) {
        int i = 0;
        for (i = 0; i < 10; i++) {
            if (i == 5)
            {
                System.out.println("The value that is skipped is " + i);
                continue; // skips the i value
            }
            System.out.println("Rule # " + i);
        }
        
    }
}
