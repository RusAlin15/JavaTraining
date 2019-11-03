package problema1;

public class AparatElectrocasnic extends Achizitie{
	
	
	public AparatElectrocasnic(String numeAchizitie, int cantitate, double pret, int garantie) {
		super(numeAchizitie, cantitate, pret);
		this.garantie = garantie;
	}

	public AparatElectrocasnic(String numeAchizitie, int cantitate, double pret) {
		super(numeAchizitie, cantitate, pret);
		// TODO Auto-generated constructor stub
	}

	private int garantie;

	public int getGarantie() {
		return garantie;
	}

	public void setGarantie(int garantie) {
		this.garantie = garantie;
	}

	@Override
	public String toString() {
		return "AparatElectrocasnic [garantie=" + garantie + "]";
	}
	

}
