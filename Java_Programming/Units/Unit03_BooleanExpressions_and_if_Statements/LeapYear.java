package Units.Unit03_BooleanExpressions_and_if_Statements;

public class LeapYear {
    public static void main(String[] args) {
        System.out.println(isLeapYear(2006));
    }

    public static void isLeapYear(int n) {
        String num = Integer.toString(n); // have to use toString method first to get # of digits
        if (num.length() != 4) {
            System.out.println("Please enter a number with 4 digits.");
        } if (n % 4 == 0) {
            System.out.println("The year enter is a leap year");
        } else {
            System.out.println("The year enter is NOT a leap year");
        }
            
    }
}
