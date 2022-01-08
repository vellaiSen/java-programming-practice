package programming;

public class ReversedPyramidPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10, a=-1,b=1;
		
		for(int i=1;i<=n;i++)
		{
			
			System.out.print(a+b+" ");

		
			b=a+b;
			a=b-a;
		}
		
	}
}