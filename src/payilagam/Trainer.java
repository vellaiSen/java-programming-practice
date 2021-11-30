package payilagam;

public class Trainer {
String dept;
String institute;
private int salary = 10000;

public int getSalary()
{
	return salary;
}
public void training()
{
	System.out.println("training");
}

public Trainer(String dept, String institute)
{
	this.dept = dept;
	this.institute = institute;
	//System.out.println("parent class constructor");
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Trainer trainerKumar = new Trainer("CSE","payilagam");
		
	}

}
