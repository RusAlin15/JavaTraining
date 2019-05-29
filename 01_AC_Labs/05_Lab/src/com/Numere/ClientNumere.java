/*
 * 
 * 3. Ad˘augat¸i clasei NumarComplex dat˘a ca exemplu ˆın Sect¸iunea 5.5 o metod˘a pentru
ˆınmult¸irea a dou˘a numere NumarComplex. Apoi scriet¸i un program care cite¸ste de
la tastatur˘a o matrice de dimensiuni NxM ¸si o matrice de dimensiuni MxP, ambele
putˆand cont¸ine atˆat numere reale cˆat ¸si numere complexe (la citirea fiec˘arui num˘ar
utilizatorul specific˘a dac˘a introduce un numar complex sau unul real). ˆIn continuare,
programul ˆınmult¸e¸ste cele dou˘a matrice (f˘acˆand uz de metodele de adunare ¸si
ˆınmult¸ire care sunt deja disponibile) ¸si afi¸seaz˘a rezultatul pe ecran. ˆInmult¸irea trebuie
realizat˘a ˆıntr-o metod˘a static˘a ce prime¸ste ca parametri matricele de ˆınmult¸it.
 * 
 * 
 * 
 */

package com.Numere;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class ClientNumere {

	private static NumarComplex[][] temp;

	public static void main(String[] args) {
		NumarComplex a = new NumarComplex(3, 2);
		NumarComplex b = new NumarComplex(1,7);
		
		DecimalFormat df = new DecimalFormat("#.##");
		
		System.out.println("Numarul este: " + a);
		System.out.println("Modulul sau este: " + df.format(a.modul()));
		
		NumarReal unu = new NumarReal(5);
		NumarReal doi = new NumarReal(-3);
		
		System.out.println("Primul numar este: " + unu);
		System.out.println("Modulul lui este: " + df.format(unu.modul()));
		
		System.out.println("Al doilea numar este: " + doi);
		System.out.println("Modulul lui este: " + df.format(doi.modul()));
		
		System.out.println("Este primul numar mai mare decat al doilea ?  -  " + unu.maiMare(doi));
		
		System.out.println("Suma este: " + a.suma(unu));
		System.out.println("Suma este: " + doi.suma(a));
		System.out.println("Suma este: " + unu.suma(doi));
		
		NumarComplex.test(a);
		NumarComplex.test(unu);
		
		System.out.println("Produsul celor 2 numere este: " + doi.multiply(unu));
		
		NumarComplex[][] mat1 = citireMatrice(1, 2);
		NumarComplex[][] mat2 = citireMatrice(2, 1);
		
		System.out.println("Matricea 1");
		afiseazaMatrix(mat1);
		System.out.println("Matriceea 2");
		afiseazaMatrix(mat2);
		System.out.println("Inmultirea");
		afiseazaMatrix(inmultesteMatrix(mat1, mat2)); 
	}
	
	public static NumarComplex[][] citireMatrice(int numar_linii, int numar_coloane){
		System.out.println("In continuare citim elementele unei matrici.");
		NumarComplex[][] temp = new NumarComplex[numar_linii][numar_coloane];
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			for(int i= 0; i<numar_linii; i++ )
				for(int j = 0; j < numar_coloane; j++) {
					System.out.println("Apasati tasta R pentru numar real sau tasta C pentru numar complex");
					switch(reader.readLine()) {
						case "r":
							System.out.println("Introduce-ti elementul real [" + i + "][" + j + "]:");
							temp[i][j] = new NumarReal(Double.parseDouble(reader.readLine()));
							break;
	
						case "c":
							System.out.println("Introduce-ti elementul complex [" + i + "][" + j + "]:");
							System.out.println("Mai intai ve-ti introduce numarul real iar mai apoi pe cel imaginar");
							temp[i][j] = new NumarComplex(Double.parseDouble(reader.readLine()), Double.parseDouble(reader.readLine()));
							break;
					}	
				}
		} catch (IOException e) {
			System.out.println("Error!");
			System.exit(1);
		}
		return temp;
	}
	
	public static void afiseazaMatrix( NumarComplex[][] mat) {
		
		for(int i = 0; i < mat.length; i++) {
			System.out.println();
			for(int j = 0; j < mat[i].length;j++) {
				System.out.print("   " + mat[i][j] + "   ");
			}
		}
	}
	
	public static NumarComplex[][] inmultesteMatrix( NumarComplex[][] mat1, NumarComplex[][] mat2) {
		
		NumarComplex[][] tmp = new NumarComplex[mat1.length][mat2[0].length];
		if(mat2.length == mat1[0].length) {
		
		for(int i = 0; i < mat1.length; i++)
			for(int j = 0; j < mat2[0].length;j++) {
				tmp[i][j] = new NumarComplex(0, 0);
			}
		
		for(int i = 0; i < mat1.length; i++)
			for(int j = 0; j < mat2[i].length;j++)
				for(int k = 0; k < mat2.length; k++){
					tmp[i][j] = tmp[i][j].suma(mat1[i][k].multiply(mat2[k][i]));
			}
		} else {
			System.out.println("Matricile incopatibile pentru a fi inmultite");
		}
	
		return tmp;
	}

}
