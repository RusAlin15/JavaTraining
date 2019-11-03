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

	public String getNumeAchizitie() {
		return NumeAchizitie;
	}

	public void setNumeAchizitie(String numeAchizitie) {
		NumeAchizitie = numeAchizitie;
	}

	public int getCantitate() {
		return cantitate;
	}

	public void setCantitate(int cantitate) {
		this.cantitate = cantitate;
	}

	public double getPret() {
		return pret;
	}

	public void setPret(double pret) {
		this.pret = pret;
	}

	public double getPretTotal() {
		return cantitate * pret;
	}

	//
	//
	// public class PretTotalComparator implements Comparator <Achizitie> {
	//
	// @Override
	// public int compare(Achizitie a1, Achizitie a2) {
	//
	//
	//
	//
	//
	// }

	public int compareTo(Object o) {
		if (o instanceof Achizitie) {
			Achizitie a1 = (Achizitie) o;
			Achizitie a2 = (Achizitie) o;

			return a1.getPretTotal() > a2.getPretTotal() ? 1 : (a1.getPretTotal() < a2.getPretTotal() ? -1 : 0);
		}

		return 0;
	}

}
