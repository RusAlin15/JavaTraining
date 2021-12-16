package homework.session02;

public class Tank extends Weapon {
	private int missilesNumber;
	private int bulletsNumber;
	
	public Tank(String name, int missiles, int bullets) {
		super(name, "Tank", (50*missiles) + bullets);
		this.setMissilesNumber(missiles);
		this.setBulletsNumber(bullets);
	}

	public int getMissilesNumber() {
		return missilesNumber;
	}

	public void setMissilesNumber(int missilesNumber) {
		this.missilesNumber = missilesNumber;
	}

	public int getBulletsNumber() {
		return bulletsNumber;
	}

	public void setBulletsNumber(int bulletsNumber) {
		this.bulletsNumber = bulletsNumber;
	}
}
