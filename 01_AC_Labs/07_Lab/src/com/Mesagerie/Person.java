package com.Mesagerie;

public class Person {
	private Transmitter ail;
	private String nume;
	
	public Person(String nume) {
		this.nume = nume;
	}
	
	public void setTransmitter(Transmitter ail){
		this.ail = ail;
	}
	
	public void send(Person reciver, String message) {
		Message message_temp = new Message(this, reciver, message);
		ail.store(message_temp);
	}
	
	public void recieve(Transmitter transmitter) {
		transmitter.retrieve(this).afiseazaMesaj(transmitter.getTypeName());
		
	}
	
	public String getName() {
		return nume;
	}
}
