package armyGame.version01;

public class Colonel extends Infantry{
	
	private String colonelName;
	int skill;  // intre 0 si 20 % avantaj pentru armata pe tipul sau 
	
	public Colonel (String type, String colonelName, int citizensNeeded, int damage) {
		super(type, 0);
		this.colonelName = colonelName;	
		
		Catapult c;
		Knight k;
		Ballista b;
	}

	public int getSkill() {
		return skill;
	}

	public void setSkill(int skill) {
		this.skill = skill;
	}
}
