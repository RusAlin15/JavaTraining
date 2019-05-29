package com.Avioane;

abstract public class AvioaneCalatori extends Avioane {
	
	protected int maxPassangers;
	
	public AvioaneCalatori(String planeID, int totalEngeinPowe, int maxPassangers) {
		super(planeID,totalEngeinPowe);
		this.groupname = "AvioaneCalatori";
		this.maxPassangers = maxPassangers;
	}
	
	public int getMaxPassangers() {
		return maxPassangers;
	}
	
	public String toString() {
		return  groupname + " : " + planeID + "\n\t" + flyState() + 
			    "\n\t Plane have " + totalEnegeinPower + " horsepower." + 
				 "\n\t Plane have maximum " + getMaxPassangers() + " passangers.";
	}

}
