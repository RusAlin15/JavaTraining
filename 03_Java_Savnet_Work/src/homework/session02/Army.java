package homework.session02;
import java.util.*; 

public class Army {
	private String armyName;
	private int firePower;
	
	Map< String , ArmySquad > hm = new HashMap< String, ArmySquad >(); 
	Set< Map.Entry< String,ArmySquad> > st;	
	
	public Army(String armyNname, ArmySquad[] armySquads) {
		this.setArmyName(armyNname);
		setArmySquads(armySquads);
		setFierePower();
	}
	
	public void setArmySquads(ArmySquad[] armySquads) {
		for(ArmySquad armySquad : armySquads) {
			hm.put(armySquad.getType(), armySquad);
		}
		st = hm.entrySet(); 
	}
	
	public void setFierePower () {
		for (Map.Entry< String,ArmySquad> me :  st) {
			firePower += me.getValue().getFirePower();
		}
	}
	
	public String getArmyName() {
		return armyName;
	}

	public void setArmyName(String armyNname) {
		this.armyName = armyNname;
	}

	public int getFirePower() {
		return firePower;
	}

	public void setFirePower(int firePower) {
		this.firePower = firePower;
	}
	
	public void attak(Army enemy) {
		
	}
	
	public String toString() {
		String str = " Army "+ armyName + "{\n";
		for (Map.Entry< String,ArmySquad> me :  st) { 
	           str += "	" + (me.getValue().toString()) + "\n";
	       }
		str += "	} Total Army FirePower : " + firePower + "\n";
		return str;
	}


		
}
