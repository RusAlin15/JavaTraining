package Lab01FirstProgram;

public class Numar {
	private double value;
	Numar(){
		value = Math.random()*10;
	}
	
	Numar(int i){
		
		value = i;
	}
	
	void comparaNumar (Numar x2) {
		
		if(this.value >= x2.value) {
			System.out.println("Numarul " + this.value + " este mai mare sau egal cu " + x2.value);
			
		}
		else {
			System.out.println("Numarul " + this.value + " este mai mic decat " + x2.value);
		}
	}

	double getValue() {
		return this.value;
	}

}
