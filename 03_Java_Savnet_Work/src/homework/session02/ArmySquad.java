package homework.session02;

import java.util.*;

public class ArmySquad{
	
	private String armyNname;
	private String type;
	private List<Weapon> weaponsList = new ArrayList<Weapon> (); 
		
	private int firePower;
	
	public ArmySquad(String armyName, Weapon[] weapons) {
		this.setArmyNname(armyName);
		this.type = weapons[0].getType();
		setWeaponsList(weapons);
		setFierePower();
	}
	
	private void setWeaponsList(Weapon[] weapons) {
		for(Weapon weapon : weapons) {
			weaponsList.add(weapon);
		}
		
	}

	private void setFierePower () {
		for(Weapon weapon : weaponsList) {
			firePower += weapon.getFirePower();
		}
	}
	
	public int getFirePower() {
		return firePower;
	}
	
	public String getType() {
		return type;
	}

	public String getArmyNname() {
		return armyNname;
	}

	public void setArmyNname(String armyNname) {
		this.armyNname = armyNname;
	}
}
