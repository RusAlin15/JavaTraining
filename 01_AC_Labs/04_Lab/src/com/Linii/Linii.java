
/*
 * Scriet¸i un program Java care cite¸ste de la tastatur˘a o linie de text ¸si numele unui
fi¸sier. Programul trebuie s˘a determine ¸si s˘a afi¸seze pe ecran num˘arul de linii de text
din fi¸sierul indicat care sunt egale cu linia de text citit˘a de la tastatur˘a.
 */


package com.Linii;

import java.io.*;

public class Linii {

	public static void main (String[] argv) {
		String nume_fisier;
		String text, temporar;
		int contor_linii_egale = 0;
		try {
			BufferedReader in_stream_char =  new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Introduce-ti un text: ");
			text = in_stream_char.readLine();
			
			System.out.println("Dati un nume fisierului dorit: ");
		//	nume_fisier = in_stream_char.readLine() + ".txt";
			nume_fisier = "one.txt";
			BufferedReader in_stream_temporar = new BufferedReader(new FileReader(nume_fisier));
			
			while((temporar = in_stream_temporar.readLine()) != null) {
			
			if((text.compareTo(temporar)) == 0) {
				contor_linii_egale++;
			}
			}
			in_stream_temporar.close();
			
		} catch(IOException e) {
			System.out.println("Error!");
			System.exit(1);
		}
		
		System.out.println("Numarul liniilor identice cu textul introdus este: " + contor_linii_egale);
	}
}
