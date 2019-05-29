package com.ColectieGreutati;

public class ClientGreutate {
	public static void main(String[] args) {
		GreutateSimpla gs1 = new GreutateSimpla(1);
		GreutateSimpla gs2 = new GreutateSimpla(2);
		GreutateDubla gd1 = new GreutateDubla(gs1,gs2);
		
		Greutate[] array1 = {gs1,gs2,gd1};
		GreutateMultipla gm1 = new GreutateMultipla(array1);
		
		Greutate[] array2 = {gd1,gs1,gs1,gm1};
		GreutateMultipla gm2 = new GreutateMultipla(array2);
		
		ColectieGreutati colectie = new ColectieGreutati(4);
		colectie.addGreutate(gs1);
		colectie.addGreutate(gd1);
		colectie.addGreutate(gm1);
		colectie.addGreutate(gm2);
		
		
		System.out.println(gs1);
		System.out.println(gd1);
		System.out.println(gm1);
		System.out.println(gm2);
		
		System.out.println(colectie);
		
	}
	

}
