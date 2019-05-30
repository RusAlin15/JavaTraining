package homework.session02;

public class Aircraft extends Weapon {
	private int missilesNumber;
	private int bombsNumber;
	
	public Aircraft(String name, int missilesNumber, int bombsNumber) {
		super(name, (missilesNumber * 1000 + bombsNumber * 2000));
		this.missilesNumber = missilesNumber;
		this.bombsNumber = bombsNumber;
	}
	

}
