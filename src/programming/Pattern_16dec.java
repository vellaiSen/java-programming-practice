package programming;

public class Pattern_16dec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
for(int row=1;row<=5;row++)
{
	for(int col=1;col<row;col++) {
	System.out.print("");	
	}
	for(int col=1;col<=6-row;col++)
	{
		System.out.print(col+" ");
	}
	System.out.println();
}
	}

}
