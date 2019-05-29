package com.Patrat;

/*
Un p˘atrat este caracterizat de latura sa. Scriet¸i o clas˘a Patrat ce are doi constructori,
un constructor f˘ar˘a nici un parametru care seteaz˘a latura p˘atratului ca fiind 10
iar altul care seteaz˘a latura cu o valoare egal˘a cu cea a unui parametru transmis
constructorului. Ata¸sat¸i clasei o metod˘a potrivit˘a pentru tip˘arirea unui p˘atrat sub
forma ”Patrat” l ”Aria” a, unde l este valoarea laturii iar a este valoarea ariei
p˘atratului. Creat¸i ˆıntr-o metod˘a main diferite obiecte de tip Patrat ¸si tip˘arit¸i-le.
*/

public class ClientPatrat {
	
	public static void main(String[] args) {
		Patrat p1 = new Patrat();
		Patrat p2 = new Patrat(11);
		
		System.out.println(p1);
		System.out.println(p2);
	}

}
