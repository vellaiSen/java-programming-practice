package programming;

import java.util.Scanner;

public class SortingArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int[][] marks = new int[3][]; 
	    marks[0] = new int[5];
	    marks[1] = new int[7];
	    marks[2] = new int[3];
	    // Jagged Array
	    System.out.println(marks.length);
	    System.out.println(marks[0].length);
	    for(int j=0;j<marks.length;j++)
	    {
	      System.out.println("For Month: "+ (j+1));
	      int total = 0; 
	    for(int i =0; i<marks[j].length;i++)
	      {
	      System.out.println("Enter value");
	      marks[j][i] = sc.nextInt(); 
	      total = total + marks[j][i] ;
	      }
	    System.out.println("Total "+ total);
	    }
	    for(int j=0;j<marks.length;j++)
	    {
	    for(int i =0; i<marks[j].length;i++)
	    {
	      System.out.print(marks[j][i]+ " ");
	    }
	    System.out.println();
	    }
	}
}
