package contribuabil;

public class Teren extends Proprietate{
	
	private int rang;
	
	public Teren() {
		super();
		rang = 0;
	}

	public Teren(String strada, String numar, int suprafata, int rang) {
		super(strada,numar,suprafata);
		this.rang = rang;
		calculCost();
	}
	
	@Override
	public void calculCost() {
		cost = (suprafata * 0.35) / rang;
		
	}

	@Override
	public String toString() {
		return "\n Teren: \n\t Strada " + adresa.getStrada() + " Nr. " + adresa.getNumar() + 
				"\n\t Suprafata: " + suprafata + " mp" + " , Rang: " + rang + "\n\t Cost: " + cost + " lei";
	}
}
