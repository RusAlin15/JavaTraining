package homework.session02;

import java.math.BigInteger;

public class Weapon {
	private static String type;
	private String name;
	private int firePower;
	
	
	public Weapon(String name, String type, int firePower) {
		this.name = name;
		Weapon.type = type;
		this.firePower = firePower;
	}


	public static String getType() {
		return type;
	}


	public static void setType(String type) {
		Weapon.type = type;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getFirePower() {
		return firePower;
	}


	public void setFirePower(int firePower) {
		this.firePower = firePower;
	}
	
}
