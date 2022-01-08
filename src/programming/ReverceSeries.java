package programming;

public class ReverceSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 5;
		int sum = 0;
		while (i >= 1)
		{
			int result = i+(i*i);
			
			System.out.println(result);
		
			sum = sum + result;
			i--;
		}
		System.out.println(sum);
	}
}
