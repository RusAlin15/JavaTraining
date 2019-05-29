package com.Numere;

public class NumarComplex {

	protected double re;
	protected double im;
	
	public NumarComplex(double re, double im) {
		this.re = re;
		this.im = im;
	}
	
	public double modul() {
		
		return Math.sqrt(re*re + im*im); 
	}
	
	public String toString() {
		if(this.im == 0) {
			return re + "";
		} else {
			return re + " + " + im + " *i";
		}
	}
	
	public NumarComplex suma(NumarComplex n) {
		return new NumarComplex(this.re + n.re, this.im + n.im);
	}
	
	public static void test(NumarComplex a) {
		if (a instanceof NumarReal) {
			NumarReal tmp = new NumarReal(0);
			if(((NumarReal) a).maiMare(tmp)){
				System.out.println("Numarul real este mai mare decat 0.");
			} else {
				System.out.println("Numarul real este mai mic sau egal cu 0.");
			}
		} else {
			System.out.println("Numarul este complex.");
		}
	}
	
	public NumarComplex multiply(NumarComplex n) {
		
		return new NumarComplex(((this.re * n.re) - (this.im * n.im)), ((this.re * n.im) + (this.im * n.re)));
				
	}
}
