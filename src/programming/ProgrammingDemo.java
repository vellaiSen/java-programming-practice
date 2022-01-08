package programming;

import java.util.Scanner;

public class ProgrammingDemo {

	public static void main(String[] args) {

		ProgrammingDemo pd = new ProgrammingDemo();
		// pd.checkOddOrEven();
		pd.checkTwoDigit();
	}

	public void checkOddOrEven() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number ");
		int num = sc.nextInt();
		if (num % 2 == 0) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}

	}

	public void checkTwoDigit() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int num1 = sc.nextInt();
		if (num1 > 9 && num1 < 100) {
			System.out.println("Two Digit number");
		}
		if (num1 <= 9) {
			System.out.println("Single Digit number");
		}
		if (num1 >= 100) {
			System.out.println("Three Digit number");
		}

	}
}
