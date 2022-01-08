package programming;

import java.util.Scanner;

public class MultiplicationOfNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter any positive integer: ");
        int num = sc.nextInt();
                
       // System.out.println("Multiplication Table of " + num);
        int i = 1;
        while (i<=10)
        {
        	i++;
            num +=num*i;
            System.out.println("Multiplication Table of " + num);
}
	}

}
