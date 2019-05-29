package com.Avioane;

public class AvioaneConcorde extends AvioaneCalatori {
	protected boolean superSonic = false;
	
	AvioaneConcorde(String planeID, int totalEngeinPowe, int maxPassangers) {
		super(planeID, totalEngeinPowe, maxPassangers);
		this.groupname = "AvioaneConcorde";
	}
	public void goSuperSonic() {
		System.out.println("Super sonic mode activated.");
		superSonic = true;
	}
	
	public void goSubSonic() {
		System.out.println("Super sonic mode deactivated.");
		superSonic = false;
	}
	
	public String superSonicState() {
		if(flying) {
			if(superSonic)
				return "Super sonic mode activated.";
			else 
				return "Super sonic mode deactivated.";
		}
		else {
			return "";
		}
		
	}
	
	public String toString() {
		return  groupname + " : " + planeID + "\n\t" + flyState() + 
			    "\n\t Plane have " + totalEnegeinPower + " horsepower." + 
				"\n\t Plane have maximum " + getMaxPassangers() + " passangers." + 
			    "\n\t " + superSonicState();
	}
}
