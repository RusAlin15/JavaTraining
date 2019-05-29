package homework.session02;

public class Army {
	String armyName;
	Weapon[] weapons;
	int firePower;
	
	public Army(String armyName, Weapon[] weapons) {
		this.armyName = armyName;
		this.weapons = weapons;		
		setFierePower();
	}
	
	private void setFierePower () {
		for(Weapon weapon : weapons) {
			firePower += weapon.getFirePower();
		}
	}
	
	public String toString() {
		return armyName + " have " + firePower + " fiere power.";
	}
}
