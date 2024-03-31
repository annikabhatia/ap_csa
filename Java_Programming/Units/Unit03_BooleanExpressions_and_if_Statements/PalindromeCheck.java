package Units.Unit03_BooleanExpressions_and_if_Statements;

public class PalindromeCheck {
    public static void main(String[] args) {
        System.out.println(isPalindrome("abbs"));
    }

    public static boolean isPalindrome(String word) {
        String reverseWord = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reverseWord+=word.charAt(i);
        }
        if (word == reverseWord) {
            return true;
        } else
            return false;
    }
}
