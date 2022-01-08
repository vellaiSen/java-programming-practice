package programming;

import java.util.Scanner;

public class MaxNoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] ar = {-80,40,-20,0,-100};

int max = 0;
int smax = 0;
for(int i=0;i<ar.length;i++)
{
	if(ar[i]>max)
	{
		max = ar[i];	
}
else if(ar[i]>smax)
{
	smax = ar[i];
}
	}
System.out.println(max);
System.out.println(smax);
	}

}
