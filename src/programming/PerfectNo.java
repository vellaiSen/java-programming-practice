package programming;

import java.util.Scanner;

public class PerfectNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
long number,sum = 0;
Scanner sc = new Scanner(System.in);
System.out.println("Enter number to be verified");
number = sc.nextLong();
int i = 1;
while(i<=number/2)
{
	if(number%i==0)//to calculate devisor
	{
		sum = sum + i;	
	}
	i++;
}//end of while loop
if(sum==number)
{
	System.out.println(number+"is perfact number");
}
else
{
	System.out.println(number +"is not a perfact number");
}
	}

}
