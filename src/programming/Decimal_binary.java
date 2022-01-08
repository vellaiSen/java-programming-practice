package programming;

public class Decimal_binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int decimalNo = 18;
		String binary = "";
	while(decimalNo>0)
	{
		binary = decimalNo%2+binary;
		//System.out.print(decimalNo%2);
		decimalNo = decimalNo/2;
	}
	System.out.print(binary);	
	}
}


