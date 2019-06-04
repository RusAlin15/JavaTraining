package homework.session02;

public class Tank extends Weapon {
	private int missilesNumber;
	private int bulletsNumber;
	
	public Tank(String name, int missiles, int bullets) {
		super(name, "Tank", (50*missiles) + bullets);
		this.missilesNumber = missiles;
		this.bulletsNumber = bullets;
	}
	

}
