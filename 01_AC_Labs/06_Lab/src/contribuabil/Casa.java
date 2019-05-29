package contribuabil;

public class Casa extends Proprietate {
	
	public Casa(String strada, String numar, int suprafata) {
		super(strada,numar,suprafata);
		calculCost();
	}

	@Override
	public void calculCost() {
		cost = suprafata * 0.5;
	}

	@Override
	public String toString() {
		return "\n Cladire: \n\t Strada " + adresa.getStrada() + " Nr. " + adresa.getNumar() + 
				"\n\t Suprafata: " + suprafata + " mp" + "\n\t Cost: " + cost + " lei";
	}
		
}
