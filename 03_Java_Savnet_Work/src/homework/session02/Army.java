package homework.session02;
import java.util.*; 

public class Army {
	private String armyNname;
	private int firePower;
	
	Map< String , ArmySquad > hm = new HashMap< String, ArmySquad >(); 
	Set< Map.Entry< String,ArmySquad> > st;	
	
	public Army(String armyNname, ArmySquad[] armySquads) {
		this.setArmyName(armyNname);
		setArmySquads(armySquads);
		setFierePower();
	}
	
	private void setArmySquads(ArmySquad[] armySquads) {
		for(ArmySquad armySquad : armySquads) {
			hm.put(armySquad.getType(), armySquad);
		}
		st = hm.entrySet(); 
	}
	
	private void setFierePower () {
		for (Map.Entry< String,ArmySquad> me :  st) {
			firePower += me.getValue().getFirePower();
		}
	}
	
	public String getArmyName() {
		return armyNname;
	}

	public void setArmyName(String armyNname) {
		this.armyNname = armyNname;
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
		String str = "";
		for (Map.Entry< String,ArmySquad> me :  st) { 
	           str += (me.getKey() + ":" + (me.getValue().getFirePower()) + " " 
	        		   + me.getValue().getArmyName()) + " \\ "; 
	       }
		return str;
	}


		
}
