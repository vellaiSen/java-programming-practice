package payilagam;

public class ActorSivakumar implements Actor {
	static String address = "coimbatore";

	int age = 65;
	String car = "audi car";

	ActorSivakumar(int age, String car) {
		this.age = age;
		this.car = car;
	}

	public ActorSivakumar() {

	}

	public void speaking() {
		System.out.println("implement class method");
	}

	public void act() {
		System.out.println("acting");
	}

	public void sing() {
		System.out.println("singing");
	}

	public void dance() {
		System.out.println("dancing");
	}

	public static void main(String[] args) {
		ActorSivakumar as = new ActorSivakumar(65, "audi car");
		as.act();
		as.speaking();
		as.sing();
		as.dance();
		System.out.println(as.address);

		Actor ac = new ActorSivakumar();
		ac.act();
		ac.dance();
		ac.sing();
		System.out.println(ac.address);

	}

}
