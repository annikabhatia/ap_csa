public class Scope {
    public static void main(String[] arguments) {
        int x = 5; 
        if (x == 5) {
            int x = 6;                  // this new variable overshadows the outer 'x' variable
            int y = 72;
            System.out.println("x = " + x + "y = " + y);
        }
        System.out.println("x = " + x + "y = " + y); // there is no y declared outside the "if" block scope
         }   
        
    }
    
