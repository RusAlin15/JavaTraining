package com.Intervale;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.text.DecimalFormat;

public class Intervale {

	private int limita_inferioara;
	private int limita_superioara;
	private int numere_testate = 0;
	private int numere_apartenente = 0;
	private double avarage;
	static int numar_intervale = 0;
	
	Intervale(int limita_inferioara, int limita_superioara){
		this.limita_inferioara = limita_inferioara;
		this.limita_superioara = limita_superioara;
		this.numere_apartenente = 0;
		numar_intervale++;
		
	}
	
	
	public void verificaNumar(Double test) {
		numere_testate++;
		DecimalFormat df = new DecimalFormat("#.##");
		if(Double.valueOf(test) >= limita_inferioara && Double.valueOf(test) <= limita_superioara) {
			numere_apartenente++;		
		}
		avarage = Double.valueOf(df.format(((double)numere_apartenente/numere_testate)*100));
	}
	
	public static int getNumarIntervale() {
		return numar_intervale;
	}
	
	public int getNumereTestate() {
		return numere_testate;
	}
	
	public int getNumereApartente() {
		return numere_apartenente;
	}
	
	public String toString() {
		return ("[ " + limita_inferioara + " : " + limita_superioara + " ] : a fost testata de " 
				+ numere_testate + " numere, dintre care " + numere_apartenente + " numere sunt apartenente intervalului."
						+ "Media de apartenenta este: " + avarage +"");
	}
	
	public static void afisareStatistica(Intervale[] lista_int) {
		 try {
			 PrintStream out_stream = new PrintStream( new FileOutputStream("IntervalStatistic.txt"));
			 
			 for(int i = 0; i < Intervale.getNumarIntervale(); i++) {
				    out_stream.println("[ " + lista_int[i].limita_inferioara + " : " + lista_int[i].limita_superioara 
				    		+ " ] : a fost testata de " + lista_int[i].numere_testate + " numere, dintre care " 
				    		+ lista_int[i].numere_apartenente + " numere sunt apartenente intervalului."
							+ "Media de apartenenta este: " + lista_int[i].avarage);
							
					}
			
			 out_stream.close();
		 } catch(IOException e) {
			 
			 System.exit(1);
		 }
		 
	 }
}
