package com.Piramida;

public class Piramida {

		private int atribut;
		
		Piramida(){
			atribut = 4;
		}
		
		Piramida(int n){
			atribut = n;
		}
		
		
	public String getsir(int a, int b) {
		if(a <= atribut) {
			a++;
			return b + " "  + getsir(a,b);
		}
		else if(b != atribut){
			b++;
			a = b;
			return "\n"  + getsir(a,b);
		}

		return "          --> " + atribut;
	}
}
