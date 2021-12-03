package payilagam;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
System.out.println("what is your name?");
String userName = sc.next();
System.out.println("your name is "+userName);

System.out.println("what is your age");
int userAge = sc.nextInt();
System.out.println("your age "+userAge);

System.out.println("what is house DoorNo");
int userDoorNo = sc.nextInt();
System.out.println("your house DoorNo "+userDoorNo);

System.out.println("Are you in India");
boolean b = sc.hasNext();
if (b == true) {
System.out.println("No");}
else {
	System.out.println("yes");
}
	
	}

}
