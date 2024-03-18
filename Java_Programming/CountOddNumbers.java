public class CountOddNumbers
{
  public static int countOdds(int n) { // 67345
  	int count = 0;
  	if (n == 0) {
  		return 0;
  	}
  	
  	for (int i = n; i > 0; i /= 10) {
  		if ((i % 10) % 2 == 1) {
  			count++;
  		} 
      }
      return count;
  }

  public static void main(String[] args) {
  	System.out.println(countOdds(1234567890));
  	System.out.println(countOdds(13579));
  	System.out.println(countOdds(2480));
  	System.out.println(countOdds(1));
  }
}
