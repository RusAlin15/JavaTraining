package homework.session02;

public class ClientArmy {

	public static void main(String[] args) {
		
		ArmySquad[] armySquadURSS = createWeaponsURSS();
		ArmySquad[] armySquadGermany = createWeaponsGermany();
		
		
		Army armyURSS = new Army("URSS Army", armySquadURSS);
		Army armyGermany = new Army("Germany Army", armySquadGermany);
		

		System.out.println(armyGermany.toString());
		System.out.println(armyURSS.toString());	
	}

	private static ArmySquad[] createWeaponsGermany() {
		Soldier[] soldiersGermany1 = {
				new Soldier("Ralf"),
				new Soldier("Fleishman"),
		};
		Soldier[] soldiersGermany2 = {
				new Soldier("Alex"),
				new Soldier("Avram"),
				new Soldier("Avram"),
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
				new ArmySquad("Soldier Germany1", soldiersGermany1),
				new ArmySquad("Tanks Germany", tanksGermany),
				new ArmySquad("Soldier Germany2", soldiersGermany2),
				new ArmySquad("WarShips Germany", warShipsGermany),
				new ArmySquad("Submarines Germany", submarinesGermany),
				new ArmySquad("Soldier Germany", soldiersGermany1),
				new ArmySquad("Aircrafts Germany", aircraftsGermany),
		};
		
		ArmySquad gr1 = new ArmySquad("Soldier Germany", soldiersGermany1);
		ArmySquad gr2 = new ArmySquad("Soldier Germany1",submarinesGermany);
		ArmySquad gr3 = gr1.addition(gr2);
		System.out.println(gr3);
		System.out.println(gr3.getFirePower());
		
		return armySquadsGermany;
	}

	private static ArmySquad[] createWeaponsURSS() {
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
		return armySquadURSS;
	}

}
