package com.Mesagerie;

public class Message {

	private Person sender;
	private Person receiver;
	private String message;

	public Message(Person sender, Person receiver, String message) {
		this.sender = sender;
		this.receiver = receiver;
		this.message = message;
	}

	public Person getSender() {
		return sender;
	}

	public Person getReceiver() {
		return receiver;
	}

	public String getMessage() {
		return message;
	}

	public void afiseazaMesaj(String type_name) {
		System.out.println(sender.getName() + " said to " + receiver.getName() + "( " + type_name + " ): " + message);
	}
}
