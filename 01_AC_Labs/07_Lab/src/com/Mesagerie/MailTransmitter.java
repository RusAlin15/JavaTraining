package com.Mesagerie;

public class MailTransmitter implements Transmitter {

	private Message[] message_buffer;
	private String type_name;
	private int buffer_size;
	private int index = 0;

	public MailTransmitter(int buffer_size) {
		this.type_name = "Mail";
		this.buffer_size = buffer_size;
		message_buffer = new Message[buffer_size];
	}

	@Override
	public void store(Message message) {

		message_buffer[index] = message;
		index++;

		if (index == buffer_size) {
			index = 0;
			for (int i = 0; i < buffer_size; i++) {
				message_buffer[i].getReceiver().recieve(this);
			}

		}
	}

	@Override
	public Message retrieve(Person reciver) {
		Message temp_message = null;

		for (int i = 0; i < buffer_size; i++) {
			if (reciver.getName() == message_buffer[i].getReceiver().getName()) {
				temp_message = message_buffer[i];
				for (int j = i; j < buffer_size - 1; j++) {

				}
			}
		}
		return temp_message;
	}

	@Override
	public String getTypeName() {
		return type_name;
	}
}
