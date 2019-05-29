package com.Mesagerie;

public interface Transmitter {
	
	public void store ( Message message );
	public Message retrieve ( Person reciver );
	public String getTypeName();

}
