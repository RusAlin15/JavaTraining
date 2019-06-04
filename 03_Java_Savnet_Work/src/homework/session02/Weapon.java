package homework.session02;

public abstract class Weapon {
	private String type;
	private String name;
	private int firePower;
	
	
	public Weapon(String name, String type, int firePower) {
		this.name = name;
		this.type = type;
		this.firePower = firePower;
	}
	
	public String getType() {
		return type;
	}

	public String getName() {
		return name;
	}

	public int getFirePower() {
		return firePower;
	}


	public void setFirePower(int firePower) {
		this.firePower = firePower;
	}
	
}
