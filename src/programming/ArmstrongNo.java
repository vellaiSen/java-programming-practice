package programming;

import java.util.Scanner;

public class ArmstrongNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArmstrongNo num = new ArmstrongNo();
		num.checkNo();
	
	}
	private void checkNo() {
		// TODO Auto-generated method stub
		
	      int check, rem, sum = 0;
	      System.out.println("Enter the number to be verified:");
	      Scanner sc = new Scanner(System.in);
	     int number = sc.nextInt();
	      check = number;
	      while(check != 0) {
	         rem = number % 10;
	         sum = sum + (rem * rem * rem);
	         check = check / 10;
	      }
	      if(sum == number)
	         System.out.println("Given number is an armstrong number.");
	      else
	         System.out.println("Given number is not an armstrong number.");
	   }
}	


