package programming;

import java.util.Scanner;

public class ValidMark {

	public static void main(String[] args) {
		
		ValidMark mark = new ValidMark();
		mark.checkmark();
	}

	private void checkmark() {
		Scanner sc = new Scanner(System.in);
		System.out.println("what mark you gained in exam");
		int mark = sc.nextInt();
		if(mark>=35)
		{
			System.out.println("passed");
		}
		else
		{
			System.out.println("re-appear for exam");
		}
	}

}
