package programming;

import java.util.Scanner;

public class Binary_Decimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Binary Number");
		int binary = sc.nextInt();
		Binary_Decimal bd = new Binary_Decimal();
		int decimal = bd.convertBinaryToDecimal(binary);
		 System.out.println("Answer "+decimal);   

}

	private int convertBinaryToDecimal(int binary) {
		// TODO Auto-generated method stub
		int power = 0;
		int decimal = 0;
		while(binary>0)
		{
			int rem = binary%10;
			decimal = decimal + rem*(findPower(power));
			binary = binary/10;
			power++;
			
		}
		return decimal;
	}

	private int findPower(int power) {
		// TODO Auto-generated method stub
		int result = 1;
		if(power==0)
		
			return 1;
		
		else
		
			while(power>0)
			{
				result = 2*result;
			power--;
		}
		return result;
			
		
	}
}

		
	   
	  
	
