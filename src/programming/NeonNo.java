package programming;

import java.util.Scanner;

public class NeonNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int number;
int sum = 0;
Scanner sc = new Scanner(System.in);  
System.out.print("Enter the number to check: ");  
  
number = sc.nextInt();
//calculate square of the given number  
int square = number * number;   
while(square != 0) 
{
	int rem = square%10;
	sum = sum + rem;
	square = square/10;
}
if(number==sum)
{
	System.out.println(number + " is Neon Number");
}
else
{
	System.out.println(number + " is not a Neon Number");
}
	}

}
