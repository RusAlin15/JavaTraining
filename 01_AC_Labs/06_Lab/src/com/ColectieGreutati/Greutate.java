package com.ColectieGreutati;

abstract public class Greutate {
	
	protected int greutate;
	public Greutate() {
		greutate = 0;
	}
	
	public Greutate(int greutate) {
		this.greutate = greutate;
	}
	
	public int getGreutate() {
		return greutate;
	}

	public String toString() {
		return "Greutatea este: " +  greutate;
	}
}
