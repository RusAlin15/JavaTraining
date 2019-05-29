/*
 * um determinat¸i dac˘a dou˘a obiecte Boolean ˆınf˘a¸soar˘a aceea¸si valoare logic˘a, f˘ar˘a a
utiliza metoda booleanValue()? Verificat¸i r˘aspunsul printr-un program Java.
 */

package com.Boolean;

public class Boolex {

	public static void main(String[] args) {
		Boolean obiect1 = new Boolean(true);
		Boolean obiect2 = new Boolean(false);
		
		if(obiect1.equals(obiect2))
			System.out.println("Adevarat");

	}

}
