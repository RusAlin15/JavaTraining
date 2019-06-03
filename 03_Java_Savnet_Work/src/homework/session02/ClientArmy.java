package homework.session02;

public class ClientArmy {

	public static void main(String[] args) {
		
		ArmySquad[] armySquadStark = createSquadsStark();
		ArmySquad[] armySquadLannister = createSquadLannister();
		ArmySquad[] armySquadFreeMen = createSquadsFreeMen();
		
		Army armyStark = new Army("Stark", armySquadStark);
		Army armyLannister = new Army("Lannister", armySquadLannister);
		Army armyFreeMen = new Army("FreeMen", armySquadFreeMen);
		Army armyAllie = Army.allyArmys(armyFreeMen, armyStark);
		
		System.out.println(armyStark.toString());
		System.out.println(armyLannister.toString());
		System.out.println(armyFreeMen.toString());
		System.out.println(armyAllie.toString());
		
		System.out.println(armyStark.getArmyName() + " : " + armyStark.getFirePower());
		System.out.println(armyLannister.getArmyName() + " : " + armyLannister.getFirePower());
		System.out.println(armyFreeMen.getArmyName() + " : " + armyFreeMen.getFirePower());
		System.out.println(armyAllie.getArmyName() + " : " + armyAllie.getFirePower());
		
		
		statisticAttak(armyLannister, armyStark,2000);
		statisticAttak(armyStark, armyLannister,2000);
		statisticAttak(armyLannister, armyFreeMen,2000);
		statisticAttak(armyFreeMen, armyLannister,2000);
		
		
		
	}

	
	private static void statisticAttak(Army firstArmy, Army secondArmy, int numberOfRepetision) {


		int i = 0;
		int victory = 0;
		while(i < numberOfRepetision) {
			if(firstArmy.attackArmy(secondArmy)) {
				victory++;
			}
			i++;
		}
		
		System.out.println(firstArmy.getArmyName() + " defeat " 
					+ secondArmy.getArmyName() + " " +victory + " times"
					+ " out of " + numberOfRepetision + " timese. " 
					+ " ( " + (double)(victory/(double)numberOfRepetision)*100 + " %) ");  		
	}

	private static ArmySquad[] createSquadLannister() {
		Soldier[] soldierLannister = {
				new Soldier("Ralf"),
				new Soldier("Fleishman"),
		};
		Soldier[] soldierLannister2 = {
				new Soldier("Alex"),
				new Soldier("Avram"),
				new Soldier("Rus"),
		};
		Tank[] tankLannister = {
				new Tank("Panzer IV",3,40 ),
				new Tank("Panther",4,90),
		};
		WarShip[] warShipLannister = {
				new WarShip("Falke",62,878),
				new WarShip("Condor",52,478),
		};
		Submarine[] submarineLannister = {
				new Submarine("Bold", 340),
				new Submarine("Karlz", 520),
		};
		Aircraft[] aircraftLannister = {
				new Aircraft("Fokker",655,5), //
				new Aircraft("Junkers - 3", 702, 21), //
		};
				
		ArmySquad[] armySquadsGermany = {
				new ArmySquad("Lannis", soldierLannister),
				new ArmySquad("Panzi 4", tankLannister),
				new ArmySquad("Loris", soldierLannister2),
				new ArmySquad("Navy 44", warShipLannister),
				new ArmySquad("Under u2", submarineLannister),
				new ArmySquad("Skyjets 4", aircraftLannister),
		};		
		return armySquadsGermany;
	}

	private static ArmySquad[] createSquadsStark() {
		Soldier[] soldierStark = {
				new Soldier("Ivan"),
				new Soldier("Volodia")
		};
		Tank[] tankStark = {
				new Tank("T-24",3,20 ),
				new Tank("T-35",40,40),
		};
		WarShip[] warShipStark = {
				new WarShip("SSB",60,878),
				new WarShip("SSGN",12,478),
		};
		Submarine[] submarineStark = {
				new Submarine("Beluga", 740),
				new Submarine("Juliet", 420),
		};
		Aircraft[] aircraftStark = {
				new Aircraft("Dolgushin", 650, 4),
				new Aircraft("Yak - 3", 70, 6),
		};
				
		ArmySquad[] armySquadsStark = {
				new ArmySquad("Yolvodia 31", soldierStark),
				new ArmySquad("Tahaj 12", tankStark),
				new ArmySquad("WET 77", warShipStark),
				new ArmySquad("WET-UR 32", submarineStark),
				new ArmySquad("OverSkyj", aircraftStark),
				
		};
		return armySquadsStark;
	}

	private static ArmySquad[] createSquadsFreeMen() {
		Soldier[] soldierFreeMen = {
				new Soldier("Ivan"),
				new Soldier("Volodia")
		};
		Tank[] tankFreeMen = {
				new Tank("T-24",3,20 ),
				new Tank("T-35",40,40),
		};
		WarShip[] warShipFreeMen = {
				new WarShip("SSB",60,878),
				new WarShip("SSGN",12,478),
		};
		Submarine[] submarineFreeMan = {
				new Submarine("Beluga", 740),
				new Submarine("Juliet", 420),
		};
		Aircraft[] aircraftFreeMen = {
				new Aircraft("Dolgushin", 650, 4),
				new Aircraft("Yak - 3", 70, 6),
		};
				
		ArmySquad[] armySquadsFreeMen = {
				new ArmySquad("Yolvodia 31", soldierFreeMen),
				new ArmySquad("Tahaj 12", tankFreeMen),
				new ArmySquad("WET 77", warShipFreeMen),
				new ArmySquad("WET-UR 32", submarineFreeMan),
				new ArmySquad("OverSkyj", aircraftFreeMen),
				
		};
		return armySquadsFreeMen;
	}
}
