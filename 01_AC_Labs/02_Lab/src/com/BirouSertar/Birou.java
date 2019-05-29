package com.BirouSertar;

public class Birou extends Sertar{

	protected String nume;
	static final double MARGIN_OFFSET = 1.5;
	protected Sertar sertar1;
	protected Sertar sertar2;
	
	Birou(String nume, int latime, int lungime, int inaltime){
		super(latime,lungime,inaltime);
		this.nume = nume;
		sertar1 = new Sertar((latime-(2*MARGIN_OFFSET)),lungime,((inaltime/2)-(2*MARGIN_OFFSET)));	
		sertar2 = sertar1;
	}
	
	Birou(String nume, Sertar s1, Sertar s2){
		super(s1.latime+(2*MARGIN_OFFSET),s1.lungime,s1.inaltime+(2*MARGIN_OFFSET)+s2.inaltime);
		
			sertar1 = new Sertar(s1.latime,s1.lungime,s1.inaltime);
			sertar2 = new Sertar(s2.latime,s2.lungime,s2.inaltime);
		
	}
	
	public void tipareste() {
		System.out.println("Biroul " + nume + " are l: " + latime + " L:  " + lungime + " H: " + inaltime);
		System.out.println("Are in componenta sa si 2 sertare:");
		sertar1.tipareste();
		sertar2.tipareste();
	}
}