package programming;

public class PatternStarTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int num = 29;
		    boolean flag = false;
		    for (int i = 2; i <= num / 2; ++i) {
		      // condition for nonprime number
		      if (num % i == 0) {
		        flag = true;
		        break;
		      }
		    }

		    if (!flag)
		    	checkPrime();
		      System.out.println(num + " is a prime number.");
		    
		    else
		      System.out.println(num + " is not a prime number.");
	}

	private static void checkPrime() {
		// TODO Auto-generated method stub
		
	}
}