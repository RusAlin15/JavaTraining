package armyGame.version01;

import java.util.*;

public class Castle {
	
	private String castleID;
	private String userID;
	private String castleName;
	
	private Map< String, Army > armies = new HashMap<String, Army>();
	private Set<Map.Entry< String, Army > > stArmies;
	
	private int maximumNoOfCitizens;
	private double wallHP;
	private int damage;
	private int totalFights;
	private int totalWonFights;
	
	
	
	// need to be descused maybe a Squad needed
}
