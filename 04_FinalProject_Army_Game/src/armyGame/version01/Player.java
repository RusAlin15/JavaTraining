package armyGame.version01;

import java.util.*;

public class Player {
	
	private String playerID;
	private String allianceID;
	private String playerName;
	
	private Map< String, Castle > castles = new HashMap<String, Castle>();
	private Set<Map.Entry< String, Castle > > stCastles;
	
	private int totalFights;
	private int totalWonFights;
	
	public Player() {
		
	}
	
	public void addCastle(Castle toAdd) { // as putea sa primesc doar keia?
		
	}
	
	public void removeCastle(Castle toRemove) {
		
	}

	public String getPlayerID() {
		return playerID;
	}

	public String getAllianceID() {
		return allianceID;
	}

	public int getTotalFights() {
		return totalFights;
	}

	public int getTotalWonFights() {
		return totalWonFights;
	}
}
