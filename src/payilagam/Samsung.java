package payilagam;

public class Samsung extends FactoryDemo {

	static int price = 5000;

	public void verifyFingerPrint() {

	}

	public void providePattern() {

	}

	public static void main(String[] args) {
		Samsung sam = new Samsung();
		sam.browse();
		System.out.println(sam.price);

	}

	@Override
	public int call(int seconds) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void sendMessage() {
		// TODO Auto-generated method stub

	}

	@Override
	public void receiveCall() {
		// TODO Auto-generated method stub

	}

}
