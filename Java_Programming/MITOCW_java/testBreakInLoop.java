public class testBreakInLoop {
    public static void main(String[] args) {
        int i = 0;
        for (i = 0; i < 10; i++) {
            if (i == 5)
                break;   // will exit the for loop when i = 20
            System.out.println("Rule # " + i);
        }
        System.out.println("Out of for loop. The value of i is " + i); 
    }
}
