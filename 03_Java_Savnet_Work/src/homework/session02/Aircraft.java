package homework.session02;

public class Aircraft extends Weapon {
	private int missilesNumber;
	private int bombsNumber;
	
	public Aircraft(String name, int missilesNumber, int bombsNumber) {
		super(name, "Aircraf", (missilesNumber * 1000 + bombsNumber * 2000));
		this.setMissilesNumber(missilesNumber);
		this.setBombsNumber(bombsNumber);
	}

	public int getMissilesNumber() {
		return missilesNumber;
	}

	public void setMissilesNumber(int missilesNumber) {
		this.missilesNumber = missilesNumber;
	}

	public int getBombsNumber() {
		return bombsNumber;
	}

	public void setBombsNumber(int bombsNumber) {
		this.bombsNumber = bombsNumber;
	}

}
