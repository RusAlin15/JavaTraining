package problema1;

public class Alimente extends Achizitie {

	private int dataDeExpirare;

	public Alimente(String numeAchizitie, int cantitate, double pret, int dataDeExpirare) {
		super(numeAchizitie, cantitate, pret);
		this.dataDeExpirare = dataDeExpirare;
	}

	public int getSpecialDate() {
		return dataDeExpirare;
	}

	@Override
	public String toString() {
		return "Aliment: " + super.toString() + ", dataExpirare: " + dataDeExpirare + System.lineSeparator();
	}

}
