public class BitwiseOperators {
    public static String convertIntegerToBinary(int n) {
        if (n == 0) {
            return "0";
        }
        StringBuilder binaryNumber = new StringBuilder();
        while (n > 0) {
            int remainder = n % 2;
            binaryNumber.append(remainder);
            n /= 2;
        }
        binaryNumber = binaryNumber.reverse();
        return binaryNumber.toString();
    }

    public static void main(String[] args) {
        int a = 1;
        int b = 2;
            
        for (int i=0; i< 17; i++) {
            System.out.println(Integer.toBinaryString(i));
        }
        int intAnd = a & b; // only uses 1 & compares to boolean bitwise operators
        System.out.println("Logical AND: " + intAnd); 
            
     
        int intOr = a | b;
        System.out.println("Logical OR: " + intOr);   
        
        int intNot = ~a;
        System.out.println("Logical NOT of a: " + intNot);
        System.out.println("Logical NOT of a in binary: " + Integer.toBinaryString(intNot));
    }
}
