package programming;

public class DiamondPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n,col,row,space = 1;
n=5;
space=n-1;
for(row=1;row<=n;row++)
{
	for(col=1;col<=space;col++)
	{
		System.out.print(" ");
	}
	space--;
	for(col=1;col<=2*row-1;col++) {
		System.out.print("*");
	}
	System.out.println();
}
space=1;
for(row=1;row<=n-1;row++)
{
	for(col=1;col<=space;col++)
{
		System.out.print(" ");
}
	space++;
for(col=1;col<=2*(n-row)-1;col++)
{
	System.out.print("*");
}

System.out.println("");
	}
}
}
