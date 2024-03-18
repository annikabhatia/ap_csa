/**
 * 
 * Create the spaceDash method. It should take in a String str and return a new String that has all of the spaces in str replaced by dashes.
 * 
 */

public class Test1 {
    public static String spaceDash(String str) {

        if (str.length() == 0) {
            return str;
        } else {
           if (str.charAt(0) == ' ') {
               return '-' + spaceDash(str.substring(1, str.length()));
           } else {
               return str.charAt(0) + spaceDash(str.substring(1, str.length()));
        }  
     }
  /*
  
  
  */      
        
        
        
        
     /* 
       This is Annika
       'T' + "his is Annika"
       if sting length is zero return
       Divide sting FirstCharacter + Sunbstring(1, string.lenght())
       Look at the character 0 of the string.
       if first character is ' ' replace with '-'
       else return FirstCharacter + spaceDash(Sunbstring(1, string.lenght()))
       
     */
    }                    
    public static void main(String[] args) {
        String s = "It is working";
        System.out.println(spaceDash(s));
    }
}

