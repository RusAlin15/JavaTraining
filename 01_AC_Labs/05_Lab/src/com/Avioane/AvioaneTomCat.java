package com.Avioane;

public class AvioaneTomCat extends AvioaneLupata{
protected int nr_of_refuel = 0;
	
	AvioaneTomCat(String planeID, int totalEngeinPowe) {
		super(planeID, totalEngeinPowe);
		this.groupname = "AvioaneTomCat";
	}
	
	public void refuel() {
		System.out.println("Initiating refueling procedure - Locating\r\n" + 
				"refueller - Catching up - Refueling - Refueling complete");
		nr_of_refuel++;
	}
	

	
	public int getNrOfRefuel(){
		return nr_of_refuel;
		}
	
	public String toString() {
		return  groupname + " : " + planeID + "\n\t" + flyState() + 
			    "\n\t Plane have " + totalEnegeinPower + " horsepower." + 
			    "\n\t Plane have launched " + getNrOfMissileLaunched() + " missiles." +
			    "\n\t Plane have been refueled " + getNrOfRefuel() + " times";
	}
}
