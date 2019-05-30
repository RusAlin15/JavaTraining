package homework.session02;

public class Tank extends Weapon {
	private static String type = "Tank";
	private int missilesNumber;
	private int bulletsNumber;
	
	public Tank(String name, int missiles, int bullets) {
		super(name, type, (50*missiles) + bullets);
		this.missilesNumber = missiles;
		this.bulletsNumber = bullets;
	}
	

}
