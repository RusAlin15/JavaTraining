package homework.session02;

public class Army {
	private String armyNname;
	private ArmySquad[] armySquads;
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
	
	public String toString() {
		return armyNname + " have " + firePower + " fiere power.";
	}
	

	
	
}
