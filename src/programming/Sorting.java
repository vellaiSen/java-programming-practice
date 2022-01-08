package programming;

public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
int[] ar = {500,140,320,20};
for(int j=1;j<ar.length;j++)
{
	for(int i=0;i<ar.length-j;i++)
	{
		if(ar[i]>ar[i+1])
		{
	 int temp = ar[i];
		ar[i] = ar[i+1];
		ar[i+1] = temp;
	}
}
	}
	for(int i=0;i<ar.length;i++)
	{
		System.out.println(ar[i]);
	}

	}
}
