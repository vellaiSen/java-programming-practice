package india.newDelhi;

import tamilnadu.chennai.TrafficRules;

public class CommonManinDelhi implements TrafficRulesDelhi,TrafficRules {


	public static void main(String[] args) {
		
		CommonManinDelhi m1 = new CommonManinDelhi();
		m1.dontgobyDieselVehicle();
		m1.gobyBycycle();
		m1.gobyDieselVehicle();
		
	}
	public void dontgobyDieselVehicle() {
		System.out.println("dont use diesel vehicle");
		
	}

	public void gobyBycycle() {
		System.out.println("use bycycle for short travells");
		
	}
	public void gobyDieselVehicle()
	{
		System.out.println("go by diesel engine in chennai");
	}
	

	
		
	}


