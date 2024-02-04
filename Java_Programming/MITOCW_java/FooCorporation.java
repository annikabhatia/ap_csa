
/*
 Foo Corporation needs a program to calculate how much to pay their hourly employees. The US Department of Labor
requires that employees get paid time and a half for any hours over 40 that they work in a single week. For example, if an
employee works 45 hours, they get 5 hours of overtime, at 1.5 times their base pay. The State of Massachusetts requires
that hourly employees be paid at least $8.00 an hour. Foo Corp requires that an employee not work more than 60 hours in
a week.

An employee gets paid (hours worked) × (base pay), for each hour up to 40 hours.
For every hour over 40, they get overtime = (base pay) × 1.5.
The base pay must not be less than the minimum wage ($8.00 an hour). If it is, print an error.
If the number of hours is greater than 60, print an error message.

Create a new class called FooCorporation.
Write a method that takes the base pay and hours worked as parameters, and prints the total pay or an error. Write a main
method that calls this method for each of these employees:

Base Pay Hours Worked
Employee 1 $7.50 35
Employee 2 $8.20 47
Employee 3 $10.00 73
 */
public class FooCorporation {
    
    public static void totalPay(double basePay, int totalHours) {
         
        if (basePay < 8.00) {
            System.out.println("Error. The base pay is below the minimum wage");
        } else if (totalHours > 60) {
            System.out.println("Error. The total hours is greater than 60.");
        } else if (totalHours > 40) {
            double salary = 40 * basePay;
            int overtimeHours = totalHours - 40;
            double overtimePay = overtimeHours * (basePay * 1.5);
            System.out.println("The total overtime pay is: " + (overtimePay + salary));
        } else {
            double salary = 0;
            salary = basePay * totalHours;
            System.out.println("The total salary is: " + salary);
        }
    }
    public static void main(String[] arguments) {
        totalPay(7.5, 35);
        totalPay(8.20, 47);
        totalPay(10.00, 73);
        totalPay(10.00, 10);
    
    }
}

