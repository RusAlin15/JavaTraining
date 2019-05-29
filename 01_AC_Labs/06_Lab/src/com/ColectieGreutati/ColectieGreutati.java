package com.ColectieGreutati;

public class ColectieGreutati extends Greutate{
	
	private Greutate colectie[];
	private int numar_maxim_greutati;
	private int numar_curent = 0;
	private double media;
	public ColectieGreutati(int numar_maxim_greutati) {
		this.numar_maxim_greutati = numar_maxim_greutati;
		colectie = new Greutate[numar_maxim_greutati];
	}
	
	public void addGreutate(Greutate greutate) {
		if(numar_curent < numar_maxim_greutati) {
			colectie[numar_curent] = greutate;
			numar_curent++;
		} else {
			System.out.println("Colectia a ajuns la limita maxima de greutati!");
		}
		this.greutate += greutate.getGreutate();
		calculMedia();
	}
	
	public double calculMedia() {	
		if(numar_curent != 0) {
		media = ( this.greutate / (double)numar_curent);
		}
		return media;
	}
	
	public String toString() {
		return "Greutatea colectiei : " +  greutate 
				+ "\n Greutatea medie: " + calculMedia();
	}
	
}
