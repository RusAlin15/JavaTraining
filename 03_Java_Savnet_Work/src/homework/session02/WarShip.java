package homework.session02;

public class WarShip extends Weapon{
	private int cannonsNumber;
	private int missilesNumber;
	
	public WarShip(String name, int cannonsNumber, int missilesNumber) {
		super(name, (cannonsNumber * 100 + missilesNumber *1000));
		this.cannonsNumber = cannonsNumber;
		this.missilesNumber = missilesNumber;
	}
	
	

}
