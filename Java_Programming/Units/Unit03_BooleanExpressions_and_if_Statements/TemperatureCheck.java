package Units.Unit03_BooleanExpressions_and_if_Statements;

public class TemperatureCheck {
    public static void main(String[] args) {
        double temp = 32.0;
        if (temp > 32) {
            System.out.println("The temperature is above freezing.");
        } else if (temp == 32) {
            System.out.println("The temperature is freezing.");
        } else {            
            System.out.println("The temperature is below freezing.");
        }
    }
}
