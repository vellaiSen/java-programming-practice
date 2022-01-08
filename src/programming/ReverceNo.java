package programming;

public class ReverceNo {

	public static void main(String[] args) {
		ReverceNo rev = new ReverceNo();
		rev.printReverce(1234);
	}

	private void printReverce(int no) {
		// TODO Auto-generated method stub
		int additionOfDigits = 0;
		//int count = 0;
		while(no>0)
		{
			//additionOfDigits = additionOfDigits + no%10;
			System.out.println(no%10);
			additionOfDigits = additionOfDigits + no%10;
			no = no/10;
			//count = count +1;
		}
		System.out.println(additionOfDigits);
		//System.out.println("countOfDigits:"+count );
	}

}
