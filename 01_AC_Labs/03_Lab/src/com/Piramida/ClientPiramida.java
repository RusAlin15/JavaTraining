package com.Piramida;


/*
 * 
Creat¸i o clas˘a Piramida ce are un atribut ˆıntreg n. Ata¸sat¸i clasei o metod˘a potrivit˘a
pentru tip˘arirea unei piramide ca mai jos:
1 1 1 1
2 2 2
3 3
4 --> n
 * 
 */

public class ClientPiramida {

	public static void main(String[] args) {
		Piramida piramida1 = new Piramida();
		Piramida piramida2 = new Piramida(8);
		System.out.println(piramida1.getsir(1,1));
		System.out.println();
		System.out.println(piramida2.getsir(1,1));

	}

}
