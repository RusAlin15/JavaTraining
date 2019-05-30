package homework.session02;

public class ClientArmy {

	public static void main(String[] args) {
		Soldier[] soldiersURSS = {
				new Soldier("Ivan"),
				new Soldier("Volodia")
		};
		Tank[] tanksURSS = {
				new Tank("T-24",3,20 ),
				new Tank("T-35",4,40),
		};
		WarShip[] warShipsURSS = {
				new WarShip("SSB",6,878),
				new WarShip("SSGN",12,478),
		};
		Submarine[] submarinesURSS = {
				new Submarine("Beluga", 240),
				new Submarine("Juliet", 420),
		};
		Aircraft[] aircraftURSS = {
				new Aircraft("Dolgushin", 65, 4),
				new Aircraft("Yak - 3", 70, 6),
		};
				
		ArmySquad[] armySquadURSS = {
				new ArmySquad("Soldier URSS", soldiersURSS),
				new ArmySquad("Tanks URSS", tanksURSS),
				new ArmySquad("WarShips URSS", warShipsURSS),
				new ArmySquad("Submarines URSS", submarinesURSS),
				new ArmySquad("Aircrafts URSS", aircraftURSS),
		};
		
						
		Soldier[] soldiersGermany = {
				new Soldier("Ralf"),
				new Soldier("Fleishman"),
		};
		Tank[] tanksGermany = {
				new Tank("Panzer IV",3,40 ),
				new Tank("Panther",4,90),
		};
		WarShip[] warShipsGermany = {
				new WarShip("Falke",62,878),
				new WarShip("Condor",52,478),
		};
		Submarine[] submarinesGermany = {
				new Submarine("Bold", 340),
				new Submarine("Karlz", 520),
		};
		Aircraft[] aircraftsGermany = {
				new Aircraft("Fokker",655,5), //
				new Aircraft("Junkers - 3", 702, 21), //
		};
				
		ArmySquad[] armySquadsGermany = {
				new ArmySquad("Soldier URSS", soldiersGermany),
				new ArmySquad("Tanks URSS", tanksGermany),
				new ArmySquad("WarShips URSS", warShipsGermany),
				new ArmySquad("Submarines URSS", submarinesGermany),
				new ArmySquad("Aircrafts URSS", aircraftsGermany),
		};
		
		Army armyURSS = new Army("URSS Army", armySquadURSS);
		Army armyGermany = new Army("Germany Army", armySquadsGermany);
		
		System.out.println(armyGermany);
		System.out.println(armyURSS);
		
	}

}
