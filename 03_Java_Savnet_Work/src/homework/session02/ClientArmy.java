package homework.session02;

public class ClientArmy {

	public static void main(String[] args) {
		Weapon[] weaponsURSS = { new Soldier("Ivan"), //
				new Soldier("Volodia"), //
				new Tank("T-24",2,20 ), //
				new Tank("T-35",4,40),//
				new WarShip("SSB",6,878), //
				new WarShip("SSGN",12,478), //
				new Submarine("Beluga", 240), //
				new Submarine("Juliet", 420), //
				new Aircraft("Dolgushin", 55, 4), //
				new Aircraft("Yak - 3", 70, 6), //
								};

		Weapon[] weaponsGermany = { new Soldier("Ralf"), //
				new Soldier("Fleishman"), //
				new Tank("Panzer IV",3,40 ), //
				new Tank("Panther",4,90),//
				new WarShip("Falke",62,878), //
				new WarShip("Condor",52,478), //
				new Submarine("Bold", 340), //
				new Submarine("Karlz", 520), //
				new Aircraft("Fokker",655,5), //
				new Aircraft("Junkers - 3", 702, 21), //
				};
					
		Army armyURSS = new Army("URSS", weaponsURSS);
		System.out.println(armyURSS);
		
		Army armyGer = new Army("Germany", weaponsURSS);
		System.out.println(armyGer);
	}

}
