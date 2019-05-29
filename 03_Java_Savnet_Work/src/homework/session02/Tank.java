package homework.session02;

public class Tank extends Weapon {
	int missilesNumber;
	int bulletsNumber;
	
	public Tank(String name, int missiles, int bullets) {
		super(name, (50*missiles) + bullets);
		this.missilesNumber = missiles;
		this.bulletsNumber = bullets;
	}
	

}
