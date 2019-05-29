package com.NumereComplexe;

public class Complex {

	protected double real;
	protected double imaginar;
	static int numar_afisari = 0;
	
	Complex(double real, double imaginar){
		this.real = real;
		this.imaginar =	imaginar;
			
	}
	
	public double getModul() {
		return Math.sqrt((this.real*this.real) + (this.imaginar * this.imaginar));
	}
	
	public void tipareste() {
		System.out.println("Numarul complex este: " + this.real + " i*" + this.imaginar);
		numar_afisari++;
	}
	
	
	public Complex adunare(Complex numar) {
		Complex provizoriu = new Complex(this.real + numar.real, this.imaginar + numar.imaginar);
		return provizoriu;		
	}
	
	static void getAfisari() {
		System.out.println("Sa folosit functia de afisare de: " + numar_afisari);
	}
}
