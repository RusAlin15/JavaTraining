/*
 * 5. Se da un fi¸sier “intervale.dat” care contine perechi de intregi pozitivi (cate un intreg
pe linie) reprezentand intervale numerice si un numar oarecare de fisiere care contin
numere reale. 
Sa se scrie un program Java care calculeaza pentru fiecare interval
dat procentul de numere reale (din fisierele mentionate mai sus) continute.
Programul trebuie sa respecte urmatoarele cerinte:
• toate numerele reale citite din fisiere trebuie utilizate ca obiecte Double sau
Float si nu ca variabile de tip primitiv double sau float.
• numele fisierelor ce contin numerele reale se citesc de la tastatura unul cate
unul.
• numerele reale dintr-un fisier nu se prelucreaza de mai multe ori; daca utilizatorul
furnizeaza acelasi fisier de mai multe ori, programul atrage atentia
utilizatorului asupra erorii.

dupa prelucrarea tuturor fisierelor cu numere reale, statistica trebuie scrisa
intr-un fisier al carui nume este specificat ca argument al programului; daca
nu se specifica nici un argument, statistica va fi tiparita in fisierul standard de
iesire (ecran).
• fiecare interval va fi reprezentat printr-un obiect; clasa acestuia va contine
campuri private pentru limitele intervalului, pentru numarul de numere testate
si pentru numarul de numere testate continute de intervalul respectiv;
clasa mai contine: un constructor ce permite initializarea corespunzatoare a
campurilor (cele care trebuie initializate), o metoda de testare ce preia ca
parametru un obiect Double/Float si care verifica apartenenta parametrului la
intervalul respectiv actualizand corespunzator campurile mai sus amintite si o
metoda care ia ca parametru un flux de iesire in care scrie rezultatele obtinute
(intervalul respectiv si procentul obtinut).
 * 
 * 
 * 
 * 
 * 
 * 
 */


package com.Intervale;

import java.io.*;

public class ClientIntervale {
	public static void main(String[] args) {
	

		Intervale[] lista_intervale = returnListaIntervale();
		String[] lista_nume_fisiere = returnListaFisiere();
			

	try {
		Double temporar_double;
		for(int i = 0; i< lista_nume_fisiere.length; i++) {
			BufferedReader reader = new BufferedReader(new FileReader(lista_nume_fisiere[i]));
			while(reader.ready()) {
				temporar_double = Double.valueOf(reader.readLine());
				for(int j = 0; j < lista_intervale.length; j++) {
					lista_intervale[j].verificaNumar(temporar_double);
				}
			}
			reader.close();
		}
		
	} catch (IOException a) {
		System.out.println("Erroare, at-ti introdus numele unui fisier inexistent");
		System.exit(1);
	}
	
	for(int i = 0; i< Intervale.getNumarIntervale(); i++) {
		System.out.println(lista_intervale[i]);
	}
	Intervale.afisareStatistica(lista_intervale);		
	}
	
	public static Intervale[] returnListaIntervale() {
		int limita_inferioara;
		int limita_superioara;
		int numar_elemente = 0;
		Intervale[] interval_temporar = new Intervale[100];
		try {
			
			BufferedReader reader = new BufferedReader(new FileReader("intervale.dat"));
			
			while(reader.ready()) {
				limita_inferioara = Integer.parseInt(reader.readLine());
				if(reader.ready()) {
					limita_superioara = Integer.parseInt(reader.readLine());
					if(limita_inferioara > limita_superioara) {
						interval_temporar[Intervale.getNumarIntervale()] = new Intervale(limita_superioara,limita_inferioara);
						numar_elemente++;
					} else {
						interval_temporar[Intervale.getNumarIntervale()] = new Intervale(limita_inferioara,limita_superioara);
						numar_elemente++;
						}
					}
				}
						
			reader.close();
	} catch (IOException e) {
		System.out.println("Error!");
		System.exit(1);
	}
		Intervale[] interval = new Intervale[numar_elemente];
		System.arraycopy(interval_temporar, 0, interval, 0, numar_elemente);
		return interval;
	}
	
	public static String[] returnListaFisiere() {
	
		String[] lista_nume_fisiere_temporar = new String[100];
		int numar_elemente = 0;
		
		try {
			String temporar;
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in) );
			System.out.println("Introduce-ti numele fisierelor ce trebuiesc citite.");
			System.out.println("Introduce-ti exit pentru a termina.");
			
			
			boolean flag = true;
			
			while(flag) {			
			temporar =reader.readLine();
			boolean exista = true;

			if(temporar.compareTo("exit") != 0 ) {
			for(int j = 0; j < numar_elemente; j++) {
				if((temporar + ".txt").compareTo(lista_nume_fisiere_temporar[j]) == 0) {
					System.out.println("Acest nume a mai fost introdus. Reintroduce-ti un alt nume.");
					System.out.println("Introduce-ti exit pentru a termina.");
					exista = false;
					break;
					}
				}
			if(exista) {
				lista_nume_fisiere_temporar[numar_elemente] = temporar + ".txt";
				numar_elemente++;
			}
			} else {
				flag =false;
			}
			}
			reader.close();
		} catch (IOException a) {
			System.out.println("Error!");
			System.exit(1);
		}
		
		String[] lista_nume_fisiere = new String[numar_elemente];
		System.arraycopy(lista_nume_fisiere_temporar, 0, lista_nume_fisiere, 0, numar_elemente);
		return lista_nume_fisiere;
		
	}
}