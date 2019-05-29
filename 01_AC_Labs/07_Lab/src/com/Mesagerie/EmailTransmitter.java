package com.Mesagerie;

public class EmailTransmitter implements Transmitter{
	
	private Message message;
	private String type_name;
	
	public EmailTransmitter() {
		type_name = "E-mail";
	}
	
	@Override
	public String getTypeName() {
		return type_name;
	}

	@Override
	public void store(Message par_message) {
		this.message = par_message;
		message.getReceiver().recieve(this);
	}

	@Override
	public Message retrieve(Person reciever) {
		return message;
	}
}
