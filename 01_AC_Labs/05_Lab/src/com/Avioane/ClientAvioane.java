package com.Avioane;

public class ClientAvioane {

	public static void main(String[] args) {
		AvioaneConcorde avion_calatori = new AvioaneConcorde("FR65",4000, 398);
		AvioaneConcorde avion_concorde = new AvioaneConcorde("LD333",2500, 700);
		
		AvioaneTomCat avion_tomcat = new AvioaneTomCat("RT56", 65999);
		AvioaneMig avion_mig = new AvioaneMig("TY78", 65700);
		
		avion_calatori.takeOff();		
		avion_concorde.takeOff();
		
		avion_tomcat.takeOff();
		avion_tomcat.launchMissile();
		avion_tomcat.launchMissile();
		avion_tomcat.refuel();
		
		avion_mig.takeOff();
		avion_mig.highSpeedGeometry();
		
		System.out.println(avion_calatori);
		System.out.println(avion_concorde);
		
		avion_calatori.land();	
		avion_concorde.land();
		
		System.out.println(avion_calatori);
		System.out.println(avion_concorde);
		
		System.out.println(avion_tomcat);
		System.out.println(avion_mig);
	}

}
