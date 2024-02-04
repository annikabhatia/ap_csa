
public class doSomething {
    public static void doSome(int x, int[] ys, Baby b, String c) {
        x = 99;
        ys[0] = 99;
        b.name = "Annika";
        c = "99";
        }
    public static void main(String[] args) {
        int i = 0; 

        int[] j = {0};

        Baby k = new Baby("50", true);

        String l = "hello";

        System.out.println("Before i: " + i + " j: " + j[0] + " k: " + k.name + " l: " + l);

        doSome(i, j, k, l);

        System.out.println("After i: " + i + " j: " + j[0] + " k: " + k.name + " l: " + l);
    }
        
}
