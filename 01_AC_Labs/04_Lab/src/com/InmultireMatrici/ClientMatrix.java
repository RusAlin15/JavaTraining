/*
 * 
 * Sa se scrie un program Java care cite퇿te de la tastatura doua matrice de numere
reale de dimensiune NxM, respectiv MxP, inmult퇯퇿te cele doua matrice 퇿i scrie ntrun
fi퇿ier matricea rezultata. Toate matricele trebuie sa cont퇳na ca elemente obiecte
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

