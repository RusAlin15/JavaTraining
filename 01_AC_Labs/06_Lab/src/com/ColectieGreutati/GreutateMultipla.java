package com.ColectieGreutati;

public class GreutateMultipla extends Greutate{
	
	public GreutateMultipla(Greutate[] gm){
		for(int i =0; i< gm.length; i++) {
			this.greutate += gm[i].getGreutate();
		}
	}
}