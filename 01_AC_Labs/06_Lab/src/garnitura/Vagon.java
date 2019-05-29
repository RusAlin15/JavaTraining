package garnitura;

abstract public class Vagon {

	protected int capacitate_persoane;
	protected int capacitate_colete;
	
	public Vagon(int capacitate_persoane, int capacitate_colete) {
		this.capacitate_colete = capacitate_colete;
		this.capacitate_persoane = capacitate_persoane;
	}
	
	public int getCapcitateColete() {
		return capacitate_colete;
	}
	
}
