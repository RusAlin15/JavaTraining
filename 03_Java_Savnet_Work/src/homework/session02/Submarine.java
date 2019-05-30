package homework.session02;

public class Submarine extends Weapon {
	private int torpedosNumber;

	public Submarine(String name, int torpedosNumber) {
		super(name, torpedosNumber * 500);
		this.torpedosNumber = torpedosNumber;
	}
	

}
