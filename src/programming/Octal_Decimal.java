package programming;

import java.util.Scanner;

public class Octal_Decimal {

	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the octal number");
	        int octal = sc.nextInt();
	        Octal_Decimal od = new Octal_Decimal();
	        int decimal = od.convertDecimal(octal);
	        System.out.println("decimal no: "+decimal);
	        
	        
}

	private int convertDecimal(int octal) {
		// TODO Auto-generated method stub
		int decimal = 0;
		int power = 0;
		while(true)
		{
			if(octal==0)
			{
				break;
		}
		else
		{
			int temp = octal%10;
			decimal = (int) (decimal+temp*Math.pow(8, power));
			octal = octal/10;
			power++;
		}
		}
		return decimal;
	}
		

	}
