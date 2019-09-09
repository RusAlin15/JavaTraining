package model;

import java.io.Serializable;
import java.util.HashMap;

public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	private String name;
	private HashMap<String, Boolean> orders = new HashMap<>();

	public User(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "   " + name;
	}

	public String getName() {
		return name;
	}

}
