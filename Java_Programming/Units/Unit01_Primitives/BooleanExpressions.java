public class BooleanExpressions {
    public static void main(String[] args) {
        System.out.println(isEqual(5, 4));
        System.out.println(isEqual(7, 7));
    }

    public static boolean isEqual(int a, int b) {
        if (a == b) {
            return true;
        }
        else
            return false;
    }
}
