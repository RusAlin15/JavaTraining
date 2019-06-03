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
	
	
	public ArmySquad(ArmySquad squad1, ArmySquad squad2) {
		this.armyName =(squad1.getArmyName() +  " & " + squad2.getArmyName());
		this.weaponsList = new ArrayList<Weapon>(squad1.getWeaponsList());
		this.weaponsList.addAll(squad2.getWeaponsList());
		setFierePower();
	}

	public void setWeaponsList(Weapon[] weapons) {
		for(Weapon weapon : weapons) {
			weaponsList.add(weapon);
		}
		
	}

	public void setFierePower () {
		for(Weapon weapon : weaponsList) {
			firePower += weapon.getFirePower();
		}
	}
	
	public List<Weapon> getWeaponsList() {

		return weaponsList;
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
	
	public static ArmySquad allySquads(ArmySquad squad1, ArmySquad squad2) {
		ArmySquad newSquad = new ArmySquad(squad1, squad2);
		return newSquad;
	}
	
	public String toString() {
		String str = "Squad name: " + this.armyName + ", Type: " + this.type +" {\n";
		for(Weapon weapon : weaponsList) {
			str += "		" + weapon.getType()  + " " + weapon.getName() + " : FirePower --> " //
					+  weapon.getFirePower() + " \n";
		}
		str += "		} Squad " + armyName + " FirePower : " + this.firePower + "\n"; 
		return str;
	}
}
