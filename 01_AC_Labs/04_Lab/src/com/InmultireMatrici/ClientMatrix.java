/*
 * 
 * Sa se scrie un program Java care cite�ste de la tastatura doua matrice de numere
reale de dimensiune NxM, respectiv MxP, inmult�e�ste cele doua matrice �si scrie ntrun
fi�sier matricea rezultata. Toate matricele trebuie sa cont�ina ca elemente obiecte
Double.
 * 
 * 
 */

package com.InmultireMatrici;

public class ClientMatrix {

	public static void main(String[] args) {
			
		Matrix m1 = new Matrix("init");
		Matrix m2 = new Matrix("init");
		Matrix mp;
		Matrix.afisareMatrix(m1);
		mp = Matrix.inmultire(m1, m2);
		Matrix.afisareMatrix(mp);
		
	}

}

