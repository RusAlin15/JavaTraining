package homework.session02;

public class WarShip extends Weapon{
	private static String type = "WarShip";
	private int cannonsNumber;
	private int missilesNumber;
	
	public WarShip(String name, int cannonsNumber, int missilesNumber) {
		super(name, type, (cannonsNumber * 100 + missilesNumber *1000));
		this.cannonsNumber = cannonsNumber;
		this.missilesNumber = missilesNumber;
	}
	
	

}
