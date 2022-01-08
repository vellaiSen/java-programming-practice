package programming;

import java.util.Scanner;

public class BinarySearch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar = {100,80,70,60,50,40,30,20,10}; 
		        //   0  1  2  3  4  5   6   7   8  9
	    Scanner sc = new Scanner(System.in); 
	    System.out.println("Enter no. to search");
	    int key = sc.nextInt(); 
	    int min = 0, max = ar.length-1; 
	     
	    while(min>=max)
	    {
	    int mid = (min+max)/2;

	    if(ar[mid] == key)  
	    {
	    System.out.println("Found at "+ mid);
	  
	    break; 
	    }
	    else if(key>ar[mid])  {  
	      min = mid-1;  
	    }
	    else
	    {
	    max = mid + 1; 
	    }
	    }
	    if(min<max)
	    {
	      System.out.println("Sorry No. not found");
	    }
	}

}
