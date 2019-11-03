package problema1;

public abstract class Achizitie {

	private String numeAchizitie;
	private int cantitate;
	private double pret;

	public Achizitie(String numeAchizitie, int cantitate, double pret) {
		super();
		numeAchizitie = numeAchizitie;
		this.cantitate = cantitate;
		this.pret = pret;
	}

	public double getPretTotal() {
		return cantitate * pret;
	}

	@Override
	public String toString() {
		return "Cantitate=" + cantitate + ", pret=" + pret + ", pret total=" + this.getPretTotal();
	}

	public abstract int getSpecialDate();

}
