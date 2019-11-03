package problema1;

public class AparatElectrocasnic extends Achizitie {
	private int garantie;

	public AparatElectrocasnic(String numeAchizitie, int cantitate, double pret, int garantie) {
		super(numeAchizitie, cantitate, pret);
		this.garantie = garantie;
	}

	@Override
	public int getSpecialDate() {
		return garantie;
	}

	@Override
	public String toString() {
		return "AparatElectro: " + super.toString() + ", garntie: " + garantie + System.lineSeparator();
	}

}
