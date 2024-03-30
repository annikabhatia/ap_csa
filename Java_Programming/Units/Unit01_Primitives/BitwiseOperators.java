public class BitwiseOperators {
    public static void main(String[] args) {
        int a = 1;
        int b = 5;
            
        int intAnd = a & b; // only uses 1 & compares to boolean bitwise operators
        System.out.println("Logical AND: " + intAnd); 
            
     
        int intOr = a | b;
        System.out.println("Logical OR: " + intOr);   
        
        int intNot = ~a;
        System.out.println("Logical NOT of a: " + intNot);
    }
}
