package com.NumereComplexe;

public class ClientComplex {

	public static void main(String[] args) {
		Complex numar1 = new Complex(5,5);
		Complex numar2 = new Complex(10,10);
		
		numar1.tipareste();
		numar2.tipareste();
		
		Complex numar3 = numar1.adunare(numar2);
		numar1.tipareste();
		numar2.tipareste();
		numar3.tipareste();
		
		
		Complex.getAfisari();
	}

}
