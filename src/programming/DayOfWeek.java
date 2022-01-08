package programming;

import java.util.Scanner;

public class DayOfWeek {

	public static void main(String[] args) {
		DayOfWeek day = new DayOfWeek();
		day.checkDay();

	}

	private void checkDay() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter day ");
		int no = sc.nextInt();
		if(no==1 || no==7)
		{
			System.out.println("holiday");
		}
		else
		{
			System.out.println("go to work");
		}
	}

}
