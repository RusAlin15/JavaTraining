package com.BirouSertar;

public class Sertar {
	protected double latime;
	protected double lungime;
	protected double inaltime;
	
	Sertar(){
		
	}
	public Sertar(double latime, double lungime, double inaltime) {
		this.latime = latime;
		this.lungime = lungime;
		this.inaltime = inaltime;
		
	}
	
	public void tipareste() {
		System.out.println("Sertarul are l: " + latime + " L:  " + lungime + " H: " + inaltime);
		System.out.println();
	}
	public double getLatime() {return latime;}
	public double getLungime() {return lungime;}
	public double getInaltime() {return inaltime;}

}

