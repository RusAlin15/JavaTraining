package usbTransfer;

abstract public class Device {
	
	protected String informatie;
	
	Device(){
		informatie = "";		
	}
	
	Device( String informatie ){
		this.informatie = informatie;
	}
	
	public void store ( String informatie ) {
		this.informatie = informatie;
	}
	
	public String load() {
		return informatie;
	}
}
