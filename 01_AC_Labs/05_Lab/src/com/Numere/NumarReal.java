package com.Numere;

public class NumarReal  extends NumarComplex{

	public NumarReal(double re) {
		super(re,0);
	}
	
	public boolean maiMare(NumarReal n) {
		return re > n.re;
	}
	

}
