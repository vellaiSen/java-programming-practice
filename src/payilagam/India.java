package payilagam;

public abstract class India {

	static String capital = "new delhi";

	public India(String primeMinister) {
		System.out.println("our primeMinister is " + primeMinister);
	}

	abstract void speakLanguage();

	abstract void eat();

	abstract void dress();

}