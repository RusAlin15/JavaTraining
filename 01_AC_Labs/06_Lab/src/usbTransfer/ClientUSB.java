package usbTransfer;
/*
 * 
Modificat¸i ultima implementare a metodei transferPCToDevice din Sect¸iunea 6.2
astfel ˆncˆat aceasta sa respecte principiul OCP iar apelul acesteia sa produca acela¸si
efect. Putet¸i modifica oricare din clasele Device, PhotoDevice ¸si VideoDevice. Care
sunt beneficiile modificarii?
 * 
 * 
 */
public class ClientUSB {

	public static void main(String[] args) {
		Device photo, video;
		PC pc;
		USB usb;
		
		photo = new PhotoDevice("photoData");
		video = new VideoDevice("videoData", "Samsung");
		pc = new PC();
		usb = new USB();
		
		usb.transferDeviceToPC(pc, photo);
		usb.transferDeviceToPC(pc, video);
		usb.transferPCToDevice(pc, video);
		
		usb.transferDeviceToPC(pc, photo);
		usb.transferDeviceToPC(pc, video);
		usb.transferPCToDevice(pc, video);
		
		usb.transferDeviceToPC(pc, video);
		

	}

}
