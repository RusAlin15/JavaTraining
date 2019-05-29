package contribuabil;

public class Adresa {
	private String strada;
	private String numar;
	
	public Adresa() {
		strada = "";
		numar = "";
	}
	
	public Adresa(String strada, String numar) {
		this.strada = strada;
		this.numar = numar;
	}
	
	public String getStrada() {
		return strada;
	}
	
	public String getNumar() {
		return numar;
	}
}
