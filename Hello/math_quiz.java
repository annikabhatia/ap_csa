import java.util.Scanner;

public class math_quiz {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    
    int numOfQuestions = 10;
    //char operations[] = {'+', '-', '*' , '/'};
    int answer;
    int score = 0;
    for (int i = 0; i < numOfQuestions; i++) {
        int operation = ((int)(Math.random() * 10)) % 4;
        int num1 = (int) (Math.random() * 10);
        int num2 = (int) (Math.random() * 10);
        switch (operation)
        {
            case 0:
                System.out.println("Q" + (i+1) + " What is the sum of " + num1 + " and " + num2 + "?"); 
                answer = scanner.nextInt();
                if (answer==num1+num2) {
                    System.out.println("Correct");
                    score++;
                } else
                    System.out.println("Incorrect");
            break;
        
            case 1: 
                System.out.println("Q" + (i+1) + " What is the difference of " + num1 + " and " + num2 + "?");  
                answer = scanner.nextInt();
                if (answer==num1-num2) {
                    System.out.println("Correct");
                    score++;
                } else
                    System.out.println("Incorrect");
            break;
        
            case 2:  
                System.out.println("Q" + (i+1) + " What is " + num1 + " times " + num2 + "?");  
                answer = scanner.nextInt();
                if (answer==num1*num2) {
                    System.out.println("Correct");
                    score++;
                } else
                    System.out.println("Incorrect");
                    
            break;
        
            case 3:
                while(num2 == 0){
                    num2 = (int) (Math.random() * 10);
                }
                System.out.println("Q" + (i+1) + " What is " + num1 + " divided by " + num2 + "?");  
                answer = scanner.nextInt();
                if (answer==num1/num2) {
                    System.out.println("Correct");
                    score++;
                } else
                    System.out.println("Incorrect");

            break;

        }
        System.out.println("Current score : " + score + "/10");
    }
    System.out.println("Your final score is: " + score + "/10");
    scanner.close();
}

}
