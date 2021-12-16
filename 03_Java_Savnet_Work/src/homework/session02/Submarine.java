package homework.session02;

public class Submarine extends Weapon {
	@SuppressWarnings("unused")
	private int torpedosNumber;

	public Submarine(String name, int torpedosNumber) {
		super(name, "Submarine", torpedosNumber * 500);
		this.torpedosNumber = torpedosNumber;
	}

}
