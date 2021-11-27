package tamilnadu.chennai;

public class CommonManinChennai implements TrafficRules {

public void gobyDieselVehicle()
{
	System.out.println("this is diesel vehicle driving");
}
public void gobyBycycle()
{
	System.out.println("this is bycycle driving");
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
CommonManinChennai m = new CommonManinChennai();
           m.gobyBycycle();
           m.gobyDieselVehicle();

	}

}
