package programming;

import java.util.Scanner;

public class StrongNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num, number, rem, sumOfFact = 0;  
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to be verified");
		 number = sc.nextInt();
		 num = number;
		
		while(number>0)
		{
			rem = number%10;
			int fact = 1;
			for(int i=1; i<=rem; i++)  
			{  
		      
			fact=fact*i;  
			}  
			
			sumOfFact = sumOfFact + fact;
		number = number/10;
		}
		
		if(sumOfFact==num)
		{
		System.out.println("Entered number is strong number ");
		}
		else
		{
		System.out.println("Entered number is not strong number");	
		}

}
	}

