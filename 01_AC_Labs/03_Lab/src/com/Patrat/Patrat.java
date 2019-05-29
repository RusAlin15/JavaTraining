package com.Patrat;

public class Patrat {
	int latura_patrat;
	int aria_patrat = latura_patrat*latura_patrat;
	
	Patrat(){
		latura_patrat = 10;
		aria_patrat = latura_patrat*latura_patrat;
		
	}	
	
	Patrat(int latura_patrat){
		this.latura_patrat = latura_patrat;
		aria_patrat = latura_patrat*latura_patrat;
	}

	public String toString() {
		return " Patrat " + latura_patrat + " avand Aria " + aria_patrat;
	}
}
