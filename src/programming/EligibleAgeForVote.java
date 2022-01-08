package programming;

import java.util.Scanner;

public class EligibleAgeForVote {

	public static void main(String[] args) {
		
		EligibleAgeForVote age = new EligibleAgeForVote();
		age.checkage();
	
	}

	public void checkage() {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("what is your age");	
		int age = sc.nextInt();
		if(age>=18)
		{
			System.out.println("Time to vote");
		}
		else
		{
			System.out.println("no eligible for vote");
		}
	}

}
