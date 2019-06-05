package armyGame.version01;

public abstract class Unit {
	
	private String type;
	private int damage;
	private int citizensNeeded;
	
	public Unit(String type, int damage, int citizensNeeded) {
		this.type = type;
		this.damage = damage;
		this.citizensNeeded = citizensNeeded;
	}
}
