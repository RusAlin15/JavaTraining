package homework.session02;

import java.util.*;

public class ArmySquad{
	
	private String armyName;
	private String type;
	private List<Weapon> weaponsList = new ArrayList<Weapon> (); 
	private int firePower;
	
	public ArmySquad(String armyName, Weapon[] weapons) {
		this.setArmyName(armyName);
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
	
	private List<Weapon> getWeaponsList() {

		return weaponsList;
	}
	
	public ArmySquad addition(ArmySquad squad2) {
		this.armyName += " & " + squad2.getArmyName();
		for(Weapon weapon : squad2.getWeaponsList()) {
			weaponsList.add(weapon);
			firePower += weapon.getFirePower();
		}
		return this;
	}
	

	public int getFirePower() {
		return firePower;
	}
	
	public String getType() {
		return type;
	}

	public String getArmyName() {
		return armyName;
	}

	public void setArmyName(String armyName) {
		this.armyName = armyName;
	}
	
	public String toString() {
		String str = "";
		for(Weapon weapon : weaponsList) {
			str += armyName + " : " + weapon.getName() + " \n";
		}
		return str;
	}
}
