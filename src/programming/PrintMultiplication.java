package programming;

import java.util.Scanner;

public class PrintMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintMultiplication positivenum = new PrintMultiplication();
		positivenum.Multiplication();
	}

	public void Multiplication() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any positve integer: ");
		int no = sc.nextInt();
	 no = 2;
	 int sum = 1;
	while(no<=10) 
	{
	System.out.println("Multiplication of given positive num is:"+no+ "x" +sum "=" no*sum);	
	}

}
