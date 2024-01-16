public class sum_of_array {
    //import java.lang.Math

    public static void main(String[] args) 
    {
        String str1 = "sum_of_array";
        String str2 = new String("sum_of_array");
        if(str1 == str2) {
            System.out.println("sum_of_array str1 == str2");
        } else {
            System.out.println("sum_of_array str1 != str2");
        }

        if(str1.equals(str2)) {
            System.out.println("str1 equals str2");
        } else {
            System.out.println("str1 does not equals str2");
        }

        /*System.out.println("sum_of_array World");
        for(int i = 0 ; i<= 10; i++) {
            System.out.println("2^(" + i + ") = " + Math.pow(2,i));
        }
        */
    }
}