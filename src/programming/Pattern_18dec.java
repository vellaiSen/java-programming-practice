package programming;

public class Pattern_18dec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int row=1;row<=4;row++)
		{
		
		for(int no=row;no<=4;no++)
		{
		int i=3;
			for( int l=1;l<=row;l++)
			{
			System.out.print(no+" ");
			no=no+i;
			i--;
			
			}
			System.out.println();
		}
	}
	}
}


