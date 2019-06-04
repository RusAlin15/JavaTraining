package homework.session02;
import java.util.*; 

public class Army {
	private String armyName;
	private int firePower;
	
	private Map< String , ArmySquad > hm = new HashMap< String, ArmySquad >(); 
	private Set< Map.Entry< String,ArmySquad> > st;	
	
	public Army(String armyNname, ArmySquad[] armySquads) {
		this.armyName = armyNname;
		setArmySquads(armySquads);
		setFierePower();
	}
	
	public Army(Army partner1, Army partner2) {
		this.armyName = "Alliance ( " +  partner1.getArmyName() + " & " + partner2.getArmyName() + " )";
		
				for (Map.Entry< String,ArmySquad> part1 :  partner1.st) {
					hm.put(part1.getKey(), part1.getValue());
				}
							
				for(Map.Entry< String,ArmySquad> part2 :  partner2.st) {
					if(hm.get(part2.getValue().getType()) == null) {
						hm.put(part2.getKey(), part2.getValue());
					} else {
						hm.put(part2.getKey(), ArmySquad.allySquads(hm.get(part2.getValue().getType()), part2.getValue()));
					}
				}
				st = hm.entrySet(); 
				setFierePower();
	}

	public void setArmySquads(ArmySquad[] armySquads) {
		for(ArmySquad armySquad : armySquads) {
			if(hm.get(armySquad.getType()) == null) {
				hm.put(armySquad.getType(), armySquad);
			} else {
				hm.put(armySquad.getType(), ArmySquad.allySquads(hm.get(armySquad.getType()), armySquad));
			}
		}
		st = hm.entrySet(); 
	}
	
	public void setFierePower () {
		for (Map.Entry< String,ArmySquad> me :  st) {
			firePower += me.getValue().getFirePower();
		}
	}
	
	public String getArmyName() {
		return armyName;
	}

	public void setArmyName(String armyNname) {
		this.armyName = armyNname;
	}

	public int getFirePower() {
		return firePower;
	}
	
	public boolean attackArmy(Army enemy) {
		   int myFP = this.getFirePower();
		   int enemyFP =  enemy.getFirePower();
		   int enemyTemporarFP;  
		   
		   while ( myFP > 0 && enemyFP > 0 ){
			   enemyTemporarFP = enemyFP;
			   enemyFP  = (int) (enemyFP - myFP * Math.random());
			   myFP  = (int) (myFP - enemyTemporarFP * Math.random());				   
		   }
		   
		   if(enemyFP > 0 ) {
			   return false;
		   } else {
			   return true;
		   }
	}
	
	public static Army allyArmys(Army partner1, Army partner2) {
		Army newArmy = new Army(partner1,partner2);
		return newArmy;
	}
	
	public String toString() {
		String str = " Army "+ armyName + "{\n";
		for (Map.Entry< String,ArmySquad> me :  st) { 
	           str += "	" + (me.getValue().toString()) + "\n";
	       }
		str += "	} Total Army FirePower : " + firePower + "\n";
		return str;
	}
		
}
