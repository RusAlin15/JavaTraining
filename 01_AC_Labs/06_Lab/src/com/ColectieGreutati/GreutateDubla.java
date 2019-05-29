package com.ColectieGreutati;

public class GreutateDubla extends Greutate{
	
	public GreutateDubla(Greutate g1, Greutate g2) {
		this.greutate = g1.getGreutate() + g2.getGreutate();
	}
}
