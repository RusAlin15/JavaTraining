package com.BirouSertar;


/*Un sertar este caracterizat de o l˘at¸ime, lungime ¸si ˆınalt¸ime. Un birou are dou˘a
sertare ¸si, evident, o l˘at¸ime, lungime ¸si ˆınalt¸ime. Creat¸i clasele Sertar ¸si Birou
corespunz˘atoare specificat¸iilor de mai sus. Creat¸i pentru fiecare clas˘a constructorul
potrivit astfel ˆıncˆat carateristicile instant¸elor s˘a fie setate la crearea acestora.
Clasa Sertar cont¸ine o metod˘a tipareste al c˘arei apel va produce tip˘arirea pe ecran
a sertarului sub forma ”Sertar ” + l + L + H, unde l, L, H sunt valorile coresupunz
˘atoare l˘at¸imii, lungimii ¸si ˆınalt¸imii sertarului. Clasa Birou cont¸ine o metod˘a
tipareste cu ajutorul c˘areia se vor tip˘ari toate componentele biroului. Creat¸i ˆıntr-o
metod˘a main dou˘a sertare, un birou ¸si tip˘arit¸i componentele biroului.
(c) Ed. Politehnica Timisoara. 2006.
C. Marinescu

*/
public class ClientBirou {

	public static void main(String[] args) {
		
		Sertar sertar1 = new Sertar(10,20,5);
		Sertar sertar2 = new Sertar(10,20,10);
		sertar1.tipareste();
		sertar2.tipareste();
		
		Birou birou1 = new Birou("Diana",30,50,100);
		birou1.tipareste();
		
		Birou birou2 = new Birou("Sorina", sertar1, sertar2);
		birou2.tipareste();  // am presupus lungimea si latimea sertarelor ca find egale
		
	}

}
