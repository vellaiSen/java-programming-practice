package programming;

public class SumOfDigits {

	public static void main(String[] args) {

		SumOfDigits sm = new SumOfDigits();

		int result = sm.addandsumOfDigits(345678);
		System.out.println(result);
		int prime = sm.checkPrime(result);
	}

	int checkPrime(int result) {

		int m = 0, flag = 0;

		m = result / 2;
		if (result == 0 || result == 1) {
			System.out.println(result + " is not prime number");
		} else {
			for (int i = 2; i <= m; i++) {
				if (result % i == 0) {
					System.out.println(result + " is not prime number");
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				System.out.println(result + " is prime number ");
			}
		}
		return result;
	}

	public int addandsumOfDigits(int no) {

		int additionOfDigits = 0;

		while (no > 0) {
			additionOfDigits = additionOfDigits + no % 10;
			System.out.println(no % 10);
			no = no / 10;

		}
		System.out.println("additionOfDigits of given number is " +additionOfDigits);
		return additionOfDigits;
	}

}
