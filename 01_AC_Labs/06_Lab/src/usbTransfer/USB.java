package usbTransfer;

public class USB {
	
	public void transferPCToDevice(PC pc, Device device) {
		
		device.store(pc.load());
		System.out.println("PC to Device "	+ pc.load());
	}

	public void transferDeviceToPC(PC pc, Device device) {
		
		pc.store(device.load());
		System.out.println("Device to PC "	+ device.load());
	}
}
