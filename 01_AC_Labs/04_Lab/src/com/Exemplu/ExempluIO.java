/*
 * ˆIn continuare vom vedea un exemplu de utilizare a claselor descrise ˆın aceast˘a sect¸iune.
Programul urm˘ator cite¸ste un num˘ar de ˆıntregi de la tastatur˘a ¸si calculeaz˘a suma lor.
Numerele citite vor fi memorate ˆıntr-un fi¸sier. ˆIn final, suma lor este scris˘a la rˆandul
ei ˆın acela¸si fi¸sier dar va fi ¸si afi¸sat˘a pe ecran.
 */



package com.Exemplu;

import java.io.*;

public class ExempluIO {
	public static void main (String argv[]) {
		int n,i,suma,temporar;
		try {
			BufferedReader in_stream_char = 
					new BufferedReader(new InputStreamReader(System.in));
			PrintStream out_stream = new PrintStream(new FileOutputStream ("out.txt"));
			
			System.out.println("Dati numarul de intregi: ");
			n = Integer.parseInt(in_stream_char.readLine());
			
			suma =0;
			for( i = 0; i< n; i++) {
				System.out.println("Dati numarul " + i + ":");
				temporar = Integer.parseInt(in_stream_char.readLine());
				suma += temporar;
				out_stream.println(temporar);
			}	
				out_stream.println(suma);
				System.out.println("Suma este: " +suma);
				out_stream.close();
				
		}  catch(IOException e) {
			System.out.println("Eroare detectata la operatiile de intrare-iesire");
			System.exit(1);
		}
	}

}
