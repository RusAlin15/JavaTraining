package homework.session02;

public class WarShip extends Weapon{
	private int cannonsNumber;
	private int missilesNumber;
	
	public WarShip(String name, int cannonsNumber, int missilesNumber) {
		super(name, "WarShip", (cannonsNumber * 100 + missilesNumber *1000));
		this.setCannonsNumber(cannonsNumber);
		this.setMissilesNumber(missilesNumber);
	}

	public int getCannonsNumber() {
		return cannonsNumber;
	}

	public void setCannonsNumber(int cannonsNumber) {
		this.cannonsNumber = cannonsNumber;
	}

	public int getMissilesNumber() {
		return missilesNumber;
	}

	public void setMissilesNumber(int missilesNumber) {
		this.missilesNumber = missilesNumber;
	}
	
	

}
