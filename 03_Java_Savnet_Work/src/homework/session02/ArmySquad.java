package homework.session02;

import java.math.BigInteger;

public class ArmySquad{
	
	private String armyNname;
	private static String squadType;
	private Weapon[] weapons;
	private int firePower;
	
	public ArmySquad(String armyName, Weapon[] weapons) {
		this.armyNname = armyName;
		this.weapons = weapons;		
		setFierePower();
	}
	
	private void setFierePower () {
		for(Weapon weapon : weapons) {
			firePower += weapon.getFirePower();
		}
	}
	
	public int getFirePower() {
		return firePower;
	}
	

}
