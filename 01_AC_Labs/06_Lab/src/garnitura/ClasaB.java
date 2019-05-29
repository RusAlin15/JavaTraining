package garnitura;

public class ClasaB extends Vagon {
	
	public ClasaB() {
		super( 50 , 400 );
	}

	public void openDoors() {
		System.out.println("Opening doors...");
	}

	public void closeDoors() {
		System.out.println("Closing doors...");
	}
	
	public void blockWindows() {
		System.out.println("Blocking windows...");
	}

}
