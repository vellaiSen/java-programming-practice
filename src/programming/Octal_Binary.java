package programming;

import java.util.Scanner;

public class Octal_Binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner sc = new Scanner(System.in);
System.out.println("Enter octal number to be converted");
int n = sc.nextInt();
Octal_Binary ob = new Octal_Binary();
String binary = ob.convertBinary(n);

System.out.println("Binary no: "+binary);
	}

	private String convertBinary(int n) {
		// TODO Auto-generated method stub
		String binary = " ";
		while(n>0)
		{
			int rem = n%2;
			binary = rem + binary;
			n = n/2;
		}
		return binary;
	}

	
	}


