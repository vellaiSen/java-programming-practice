package payilagam;

public class Trainer {
String dept = "java";
String institute = "payilagam";
private int salary = 10000;

public int getSalary()
{
	return salary;
}
public void training()
{
	System.out.println("training given by trainer");
}

public Trainer(String dept, String institute)
{
	this.dept = dept;
	this.institute = institute;
	//System.out.println("parent class constructor");
}

	public static void main(String[] args) {
	
		Trainer trainerKumar = new Trainer("CSE","payilagam");
		
	}

}
