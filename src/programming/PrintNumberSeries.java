package programming;

public class PrintNumberSeries {

	public static void main(String[] args) {
		int i = 5;
		while(i>=1)
		{
			int result = (i+(i*i));
			if(result%2==0);
			{
			System.out.println(result);
			}
			i--;
		}
		
	}

}
