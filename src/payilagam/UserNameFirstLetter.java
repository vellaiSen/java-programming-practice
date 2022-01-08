package payilagam;

import java.util.Scanner;

public class UserNameFirstLetter {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("what is your name ");
		String userName = sc.next();
		System.out.println("Welcome " + userName);

		char ch1 = userName.charAt(0);

System.out.println("The first letter in your name: " + ch1);

	}
}
