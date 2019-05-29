package usbTransfer;

public class PhotoDevice extends Device {

	public PhotoDevice(String informatie) {
		super(informatie);
	}
	
	public void takePicture() {
		System.out.println("Taking picture...");
		String picture = "picture taken";
		this.store(picture);
	}
}
