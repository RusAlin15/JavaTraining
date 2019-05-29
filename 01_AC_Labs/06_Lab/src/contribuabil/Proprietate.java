package contribuabil;

abstract public class Proprietate {

	protected Adresa adresa;
	protected int suprafata;
	protected double cost;
	
	public Proprietate() {
		adresa = new Adresa();
		suprafata = 0;
		cost = 0;
	}
	
	public Proprietate(String strada, String numar, int suprafata) {
		adresa = new Adresa(strada,numar);
		this.suprafata = suprafata;
	}
	
	public double getCost() {
		return cost;
	}
	
	abstract public void calculCost();
	
	abstract public String toString();
	
}
