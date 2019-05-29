package usbTransfer;

public class VideoDevice extends Device {
	private String producer;
	
	public VideoDevice(String information, String producer) {
		super(information);
		this.producer = producer;
	}
	
	public void film() {
		System.out.println("film...");
		String video = "filmed";
		this.store(video);
	}
	
	public String load() {
	return producer + " " + super.load();
	}
	}
