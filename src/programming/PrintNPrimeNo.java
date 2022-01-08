package programming;

public class PrintNPrimeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 20;
		for (int i = 1; i <= n; i++) {
			if (isPrime(i)) {
				System.out.println(i + " ");
			}
		}
	}

	static boolean isPrime(int n) {
		if (n == 1 || n == 0)
			return false;

		for (int i = 2; i < n; i++) {
			if (n % i == 0)

				return false;
		}
		return true;
	}
}
