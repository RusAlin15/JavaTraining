package homework.session02;

import java.math.BigInteger;

public class Weapon {
	String name;
	int firePower;
	
	
	public Weapon(String name, int firePower) {
		this.name = name;
		this.firePower = firePower;
	}
	
	public int getFirePower() {
		return firePower;
	}
}