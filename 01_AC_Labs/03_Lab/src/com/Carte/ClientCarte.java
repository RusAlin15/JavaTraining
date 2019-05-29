package com.Carte;
/*
 * O carte este caracterizat˘a printr-un num˘ar de pagini. Spunem c˘a dou˘a c˘art¸i sunt
identice dac˘a acestea au acela¸si num˘ar de pagini. Creat¸i clasa Carte ¸si ata¸sat¸i-i o
metod˘a potrivit˘a pentru compararea a dou˘a c˘art¸i. Apelat¸i metoda care realizeaz˘a
compararea a dou˘a c˘art¸i ˆıntr-o metod˘a main.

 */

public class ClientCarte {

	public static void main(String[] args) {
		Carte carte1 = new Carte(20);
		Carte carte2 = new Carte(20);
		
		
		if (carte1.equals(carte2))
			System.out.println(" cartile au acelasi nr de pagini");
		else
			System.out.println("Paginile cartilor difera");

		

	}

}
