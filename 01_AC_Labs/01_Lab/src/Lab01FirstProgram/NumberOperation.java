package Lab01FirstProgram;

/*
1. Compilati si lansati n executie programul “Hello World!” dat ca exemplu ın Sectiunea 1.2.6.
2. Scrieti un program Java care initializeaza doua variablile ıntregi cu doua valori constante oarecare.
In continuare, programul va determina variabila ce contine valoarea maxima si va tipari continutul ei pe ecran.
3. Scrieti un program Java care afiseaza pe ecran numerele impare si suma numerelor pare cuprinse ın intervalul 1-100 inclusiv.
**/

public class NumberOperation {

	public static void main(String[] args) {
		System.out.println("Hello World");
		
		Numar a = new Numar();
		Numar b = new Numar();
		
		System.out.println("Valoarea numarului este: " + a.getValue() + '\n');
		System.out.println("Valoarea numarului este: " + b.getValue() + '\n');
		
		a.comparaNumar(b);
		
		Numar[] sir;
		sir = new Numar[100];
		for (int i=0; i<100;i++) {
			sir[i] = new Numar(i+1);
		}
		
		
		int sumaImpare = 0;
		for (int i=0; i<100;i++) {
			if( (sir[i].getValue())%2 != 0) {
				System.out.print(sir[i].getValue() + " ");
				sumaImpare +=sir[i].getValue();
			}
		}
		
		int sumaPare = 0;
		for (int i=0; i<100;i++) {
			if( (sir[i].getValue())%2 == 0) {
				sumaPare +=sir[i].getValue();
			}
		}
		System.out.println("\nSuma numerleor pare este: " + sumaPare);
		System.out.println("Suma numerleor impare este: " + sumaImpare);


}

}
