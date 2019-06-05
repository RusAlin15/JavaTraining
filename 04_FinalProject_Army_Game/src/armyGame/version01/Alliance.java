package armyGame.version01;

import java.util.*;

public class Alliance {
	private String allianceID;
	private String allianceName;
	
	private Map< String , Player  > moderators = new HashMap< String, Player >(); 
	private Set< Map.Entry< String,Player> > stModerators;	
	
	private Map< String , Player  > players = new HashMap< String, Player >(); 
	private Set< Map.Entry< String,Player> > stPlayers;	
	
	private Map< String , Alliance  > allies = new HashMap< String, Alliance >(); 
	private Set< Map.Entry< String,Alliance> > stAllies;	
	
	private int totalFights;
	private int totalWonFights;
	
	public Alliance(String allianceID, String name) {
		
	}
	
	public boolean addPlayer(Player toAdd) {  // in viitor nu toti playeri vor fii acceptati
		
		return true;
	}
	
	public boolean removePlayer(Player toRemove) { // moderatorii Alliantei nu pot parasii alianta
		
		return true;
	}
	
	public void addAllies(Alliance toAdd) {
		
	}
	
	public void removeAllies(Alliance toRemove) {
		
	}
	
	public boolean isAllie(Alliance toCheck) {
		
		return true;
	}
	
	public boolean isMemeber(Player toCheck) {
		
		return true;
	}

	public String getAllianceID() {
		return allianceID;
	}

	public String getAllianceName() {
		return allianceName;
	}

	public void setAllianceName(String allianceName) {
		this.allianceName = allianceName;
	}
	
}
