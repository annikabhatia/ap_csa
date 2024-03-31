package Units.Unit03_BooleanExpressions_and_if_Statements;

public class DiscountCheck {
    // Price eligible for discount is 50 dollars and above
    public static void main(String[] args) {
        System.out.println(eligibleDiscount(47));
    }

    public static String eligibleDiscount(int dollar) {
        if (dollar >= 50) {
            return "You are eligible for discount";
        } else
            return "You are not eligible for discount";
    }
}
