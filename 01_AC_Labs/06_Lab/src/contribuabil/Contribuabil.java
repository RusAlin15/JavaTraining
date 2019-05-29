package contribuabil;

public class Contribuabil {
	
	private Proprietate[] proprietati = new Proprietate[4];
	private String nume;
	private double cost;
	
	public Contribuabil(String nume) {
		this.nume = nume;
		proprietati[0] = new Casa( "Gheorghe Lazar" , "14" , 66 );
		proprietati[1] = new Teren( "Albac" , "12A/5" , 3400, 4);
		proprietati[2] = new Casa( "Tache Ionescu" , "15" , 400);
		proprietati[3] = new Teren( "Alexandru Averescu" , "15" , 900, 1);
		calculCost();
	}
	
	public void calculCost() {
		for(int i = 0 ; i < proprietati.length ; i++) {
			cost += proprietati[i].getCost();
		}
	}
	
	public void afiseazaFluturas() {
		System.out.println("Contribuabil: " + nume);
		for(int i = 0 ; i < proprietati.length ; i++) {
			System.out.println(proprietati[i]);
		}
		System.out.println("\n Suma totala: " + cost);
	}
	
}
