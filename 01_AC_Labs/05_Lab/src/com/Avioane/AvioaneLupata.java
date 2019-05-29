package com.Avioane;

abstract public class AvioaneLupata extends Avioane{

	protected int nr_of_missile_launched=0;
	
		AvioaneLupata(String planeID, int totalEngeinPower){
		super(planeID,totalEngeinPower);
		this.groupname = "AvioaneLupta";
	}
	
		public void launchMissile() {
			System.out.println("\t Initiating\r\n" + 
					"missile launch procedure - Acquiring target - Launching missile - Breaking away" +
					"Missile launch complete");
			nr_of_missile_launched++;
		}
		
		public int getNrOfMissileLaunched() {
			return nr_of_missile_launched;
		}
		public String toString() {
			return  groupname + " : " + planeID + "\n\t" + flyState() + 
				    "\n\t Plane have " + totalEnegeinPower + " horsepower." + 
					 "\n\t Plane have launched " + getNrOfMissileLaunched() + " missiles.";
		}
}
