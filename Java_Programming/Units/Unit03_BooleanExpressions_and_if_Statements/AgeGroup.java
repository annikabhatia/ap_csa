package Units.Unit03_BooleanExpressions_and_if_Statements;

public class AgeGroup {
    public static void main(String[] args) {
        System.out.println(whatAgeGroup(4));
    }

    public static String whatAgeGroup(int age) {
        if (age == 0) {
            return "Newborn";
        } else if (age <= 12) {
            return "Child";
        } else if (age >= 13 && age <= 19) {
            return "Teen";
        } else
            return "Adult";
    }
}
