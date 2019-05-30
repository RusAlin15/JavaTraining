package homework.session02;
import java.util.*; 

public class Army {
	private String armyNname;
	private ArmySquad[] armySquads;
	Map< String , ArmySquad > hm = new HashMap< String, ArmySquad >(); 
	private int firePower;
	
	public Army(String armyNname, ArmySquad[] armySquads) {
		this.armyNname = armyNname;
		this.armySquads = armySquads;
		setFierePower();
	}
	
	private void setFierePower () {
		for(ArmySquad squad : armySquads) {
			firePower += squad.getFirePower();
		}
	}		
	
	
	public void attak(Army enemy) {
		
	}
	
	public String toString() {
		return armyNname + " have " + firePower + " fiere power.";
	}
	

	
	
}
