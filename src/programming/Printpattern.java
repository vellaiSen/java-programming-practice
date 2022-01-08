package programming;

//import java.util.Scanner;

public class Printpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printpattern pp = new Printpattern();
		pp.pattern();
	}

	private void pattern() {
		// TODO Auto-generated method stub
		//int f = 1;
		int value = 1;
		for(int i=1;i<=4;i++)
		{
		for(int no=1;no<=i;no++)
		{
			System.out.print(value);
			value++;
		}
		System.out.println();
		//f++;
	}

}
}
