package programming;

public class Min_Value_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr = {10,20,30,-40,0,40};

int small = Integer.MAX_VALUE;

int i = 0;
while(i<arr.length)
{
	if(arr[i]<small)
	{
		small = arr[i];
	}
	i++;
}
System.out.println(small);
	}

}
