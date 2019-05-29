package com.Avioane;

public class AvioaneMig extends AvioaneLupata {
	
	protected boolean variabil_geometry = false;
	
	AvioaneMig(String planeID, int totalEngeinPowe) {
		super(planeID, totalEngeinPowe);
		this.groupname = "AvioaneMig";
	}
	
	public void highSpeedGeometry() {
		System.out.println("High speed geometry selected.");
		variabil_geometry = true;
	}
	
	public void normalSpeedGeometry() {
		System.out.println("Normal speed geometry selected.");
		variabil_geometry = false;
	}
	
	public String speedGeometryCheck() {
		if(flying) {
			if(variabil_geometry)
				return "High speed geometry selected.";
			else 
				return "Normal speed geometry selected.";
		}
		else {
			return "";
		}
		
	}
	
	public String toString() {
		return  groupname + " : " + planeID + "\n\t" + flyState() + 
			    "\n\t Plane have " + totalEnegeinPower + " horsepower." + 
			    "\n\t Plane have launched " + getNrOfMissileLaunched() + " missiles." +
			    "\n\t " + speedGeometryCheck();
	}

}
