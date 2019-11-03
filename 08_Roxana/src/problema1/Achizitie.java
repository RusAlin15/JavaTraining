package problema1;

public class Achizitie {

	private String NumeAchizitie;
	private int cantitate;
	private double pret;

	public Achizitie(String numeAchizitie, int cantitate, double pret) {
		super();
		NumeAchizitie = numeAchizitie;
		this.cantitate = cantitate;
		this.pret = pret;
	}

	public double getPretTotal() {
		return cantitate * pret;
	}

	@Override
	public String toString() {
		return "NumeAchizitie=" + NumeAchizitie + ", cantitate=" + cantitate + ", pret=" + pret + ", pret total="
				+ this.getPretTotal() + System.lineSeparator();
	}

}
