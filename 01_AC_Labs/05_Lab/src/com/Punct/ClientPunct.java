
/*
 * 
 * Fie o clasa Punct care are dou˘a cˆampuri private x ¸si y reprezentˆand coordonatele sale
ˆın plan. Clasa are un singur constructor cu doi parametri care permite init¸ializarea
coordonatelor unui obiect Punct la crearea sa. Clasa PunctColorat extinde (mo¸stene
¸ste) clasa Punct ¸si mai cont¸ine un cˆamp c reprezentˆand codul unei culori. Argumentat
¸i dac˘a este sau nu necesar˘a existent¸a unui constructor ˆın clasa PunctColorat
pentru ca s˘a putem crea obiecte PunctColorat ¸si, dac˘a da, dat¸i un exemplu de posibil
constructor pentru aceast˘a clas˘a.
 * 
 */

package com.Punct;

public class ClientPunct {

	public static void main(String[] args) {
		Punct unu = new Punct(2, 4);
		PunctColorat doie = new PunctColorat(4, 2, "red");
		
	}
}
