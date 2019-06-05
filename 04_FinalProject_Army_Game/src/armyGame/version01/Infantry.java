package armyGame.version01;

public abstract class Infantry extends Unit {
	private static  int citizensNeeded = 1;
	public Infantry(String type, int damage) {
		super(type, damage, citizensNeeded);
	}
	

}
