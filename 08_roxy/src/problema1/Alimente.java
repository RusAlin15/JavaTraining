package problema1;

public class Alimente extends Achizitie {
	
	public Alimente(String numeAchizitie, int cantitate, double pret) {
		super(numeAchizitie, cantitate, pret);
		// TODO Auto-generated constructor stub
	}
	public Alimente(String numeAchizitie, int cantitate, double pret, int dataDeExpirare) {
		super(numeAchizitie, cantitate, pret);
		this.dataDeExpirare = dataDeExpirare;
	} 
	public int getDataDeExpirare() {
		return dataDeExpirare;
	}

	public void setDataDeExpirare(int dataDeExpirare) {
		this.dataDeExpirare = dataDeExpirare;
	}

	private int dataDeExpirare;

	@Override
	public String toString() {
		return "Alimente [dataDeExpirare=" + dataDeExpirare + "]";
	}




}
