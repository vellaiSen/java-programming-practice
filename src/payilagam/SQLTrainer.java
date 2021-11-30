package payilagam;

public class SQLTrainer extends Trainer {


 public SQLTrainer()
 {
	 super("CSE", "payilagam");
//	 System.out.println("no-arg sub class constructor");
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      SQLTrainer ram = new SQLTrainer();
      ram.training();
      System.out.println(ram.getSalary());
      System.out.println(ram.dept);
      System.out.println(ram.institute);
      
	}

}
