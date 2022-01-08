package programming;

import java.util.Scanner;

public class Prime_Add_Digits {

	public static void main(String[] args) {
		Prime_Add_Digits p = new Prime_Add_Digits();
		int result = p.checkPrime(29);
		int addition = p.additioOfDigits(result);
		System.out.println("additionOfDigits is " + addition);
	}

	public int additioOfDigits(int result) {
		int additionOfDigits = 0;
		while (result > 0) {

			additionOfDigits = additionOfDigits + result % 10;
			System.out.println(result % 10);
			result = result / 10;
		}
		return additionOfDigits;

	}

	int checkPrime(int n) {

		int m = 0, flag = 0;

		m = n / 2;
		if (n == 0 || n == 1) {
			System.out.println(n + " is not prime number");
		} else {
			for (int i = 2; i <= m; i++) {
				if (n % i == 0) {
					System.out.println(n + " is not prime number");
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				System.out.println(n + " is prime number ");
			}
		}
		return n;
	}

}
