package com.InmultireMatrici;

import java.io.*;

public class Matrix {
	private int numar_linii;
	private int numar_coloane;
	private Double[][] content;
	
	Matrix (int numar_linii, int numar_coloane){
		this.numar_linii = numar_linii;
		this.numar_coloane = numar_coloane;
		
		int i;
		int j;
		content = new Double[numar_linii][numar_coloane];
		for(i = 0; i < numar_linii; i++)
			for(j = 0; j < numar_coloane; j++) {
				content[i][j] = (double)0;
			}
	}
	
	Matrix (String a) {
				
		try {
			BufferedReader in_stream_char = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("Introduce ti numarul de linii pentru matrice: ");
			numar_linii= (Integer.parseInt(in_stream_char.readLine()));
			
			System.out.println("introduce ti numarul de coloane pentru matrice: ");
			numar_coloane= (Integer.parseInt(in_stream_char.readLine()));
			
			content = new Double[numar_linii][numar_coloane];

			int i;
			int j;
			System.out.println("In contiunuare ve-ti introduce elementele matricei: ");
			for(i = 0; i < numar_linii; i++)
				for(j = 0; j < numar_coloane; j++) {
					System.out.println("Valoare element [" + (i+1) + "][" + (j+1) +"]: ");
					content[i][j] = Double.parseDouble(in_stream_char.readLine());
					
				}
				
		} catch(IOException e) {
			System.out.println("ERROR!");
			System.exit(1);
		}
	}
		
		 public static void afisareMatrix(Matrix m1) {
			 try {
				 PrintStream out_stream = new PrintStream( new FileOutputStream("matrixoutput.txt"));
				 int i;
				 int j;
				 
				 for(i = 0; i < m1.numar_linii; i++) {
					    out_stream.print("| ");
						for(j = 0; j < m1.numar_coloane; j++) {
							out_stream.print(m1.content[i][j] + " ");					
						}
						out_stream.println("|");
				 }
				 System.out.println("\n\n\n");
				 				 
				 out_stream.close();
			 } catch(IOException e) {
				 
				 System.exit(1);
			 }
			 
		 }
	
		 public static Matrix inmultire(Matrix m1, Matrix m2) {
			 int i;
			 int j;
			 int k;
			 Matrix temporar = new Matrix(m1.numar_linii,m2.numar_coloane);
			 if(m1.numar_coloane == m2.numar_linii) {
			 for(i = 0; i < m1.numar_linii; i++)
					for(j = 0; j < m2.numar_coloane; j++) {
						for( k = 0; k < m2.numar_linii; k++) {
								temporar.content[i][j] += ( m1.content[i][k] * m2.content[k][j]);						
							}
					}
			 }
			 return temporar;
			 
			 }
		 

	
}