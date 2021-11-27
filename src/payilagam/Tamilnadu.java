package payilagam;

public class Tamilnadu extends SouthIndia {
	public Tamilnadu(String primeMinister) {
		super(primeMinister);
		// TODO Auto-generated constructor stub
	}

	static String capital = "chennai";

	public void cultivate() {
		System.out.println("Rice and sugarcane cultivation");
	}

	public void livingStyle() {
		System.out.println("above average development");
	}

	public static void main(String[] args) {

		SouthIndia si = new Tamilnadu("Narendra Modi");
		si.cultivate();
		si.dress();
		si.eat();
		si.speakLanguage();
		si.livingStyle();
		System.out.println(India.capital);
		System.out.println(Tamilnadu.capital);

	}

	@Override
	void speakLanguage() {
		System.out.println("tamil is speaking language");

	}

	@Override
	void eat() {
		System.out.println("people eating Rice");

	}

	@Override
	void dress() {
		System.out.println("dressing is common for all southindians");

	}

}
