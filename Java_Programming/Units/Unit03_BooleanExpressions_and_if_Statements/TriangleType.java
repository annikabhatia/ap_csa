package Units.Unit03_BooleanExpressions_and_if_Statements;

public class TriangleType {
    public static void main(String[] args) {
        System.out.println(whatTriangle(5, 5, 7));
    }
    
    public static String whatTriangle(int n, int i, int j) {
        if (n == i && n == j && j == i) {
            return "Equilateral";
        }
        if (n == i || n == j || j == i) {
            return "Isoceles";
        }
        else
            return "Obtuse";
    }
}
