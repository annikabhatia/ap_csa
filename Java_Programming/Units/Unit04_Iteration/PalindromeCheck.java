public class PalindromeCheck {
    // Check if a given string is a palindrome using iteration.
    public static void main(String[] args) {
        System.out.println(isPalindrome("madam"));
        System.out.println(isPalindrome("noon"));
        System.out.println(isPalindrome("annika"));
        System.out.println(isPalindrome("rotator"));
    }

    public static boolean isPalindrome(String input) {
        int n = input.length();
        for (int i = 0; i < n / 2; i++) {
            if (input.charAt(i) != input.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
        }
            
    }



