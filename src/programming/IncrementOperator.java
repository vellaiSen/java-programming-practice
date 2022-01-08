package programming;

public class IncrementOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a = 2, b = 3;
System.out.println(++a + ++b);
System.out.println(++a + --b);
System.out.println(--a + ++b);
System.out.println(--a + --b);
System.out.println(++a - ++b);
System.out.println(++a - --b);
System.out.println(--a - ++b);
System.out.println(--a - --b);
System.out.println(++a +a++ + ++b + b++ );
System.out.println(++a + a++ + ++b -b++);
System.out.println(++a + a++ -++b -b++);
System.out.println(++a - a++ -++b - b++);
System.out.println(--a + a-- + --b + b--);

	}

}
