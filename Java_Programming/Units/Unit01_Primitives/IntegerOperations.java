public class IntegerOperations {
    public static void main(String[] args) {
        System.out.println(doMultiply(7, 5));
        System.out.println(doDivide(45, 5));
        System.out.println(doAdd(9, 4));
        System.out.println(doSubtract(79, 29));
    }

    public static double doMultiply(int a, int b) {
        return a * b;
    }

    public static double doDivide(int a, int b) {
        return a / b;
    }

    public static double doAdd(int a, int b) {
        return a + b;
    }

    public static double doSubtract(int a, int b) {
        return a - b;
    }
}
