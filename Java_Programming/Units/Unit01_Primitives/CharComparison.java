public class CharComparison {
    public static void main(String[] args) {
        System.out.println(charCompare('t', 't'));
        System.out.println(charCompare('a', 'b'));
    }

    public static boolean charCompare(char a, char b) {
        if (a == b) {
            return true;
        } else
            return false;
    }
}
