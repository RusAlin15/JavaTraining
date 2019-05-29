package com.Avioane;

public abstract class Avioane {
	protected String groupname;
	protected String planeID;
	protected int totalEnegeinPower;
	protected boolean flying = false;
	
	Avioane(String planeID, int totalEngeinPower){
		this.groupname = "Simplu " ;
		this.planeID = planeID;
		this.totalEnegeinPower = totalEngeinPower;
	}
	
	public String getPlaneID() {
		return planeID;
	}
	
	public int getTotalEnginePower() {
		return totalEnegeinPower;
	}
	
	public void takeOff() {
		System.out.println(groupname + " : " + planeID );
		if(!flying) {
			System.out.println("\t Initiating takeoff procedure - Starting engines - Accelerating " +
					"down the runway - Taking off - Retracting gear - Takeoff complete");
			flying = true;
		}
		else {
			System.out.println("\t Error, plane already flying!");
		}
	}
	
	public void land() {
		System.out.println(groupname + " : " + planeID );
		if(flying) {
			System.out.println("\t Initiating landing procedure - Enabling airbrakes - Lowering gear" +
					"- Contacting runway - Decelerating - Stopping engines - Landing complete.");
			flying = false;
		}
		else {
			System.out.println("\t Error, plane already landed!");
		}
	}
	
	public String flyState() {
		if(flying)
			return " is flying.";
		else
			return " is parked.";
	}
	
	public String toString() {
		return groupname + " : " + planeID + "\n\t" + flyState() + 
			   "\n\t Plane have " + totalEnegeinPower + " horsepower.";
	}
}
