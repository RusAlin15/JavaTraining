package model;

import java.io.Serializable;

public class Bank implements Serializable {
	private static final long serialVersionUID = 1L;
	String name;

	public Bank(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Bank name: " + name;
	}

}
