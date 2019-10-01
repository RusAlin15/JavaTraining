package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	private String name;
	private int avialableAccounts = 0;

	private List<Account> accounts = new ArrayList<Account>();

	public User(String name, String adress) {
		this.name = name;

	}

	@Override
	public String toString() {
		return "Client [name=" + name;
	}

	public String getName() {
		return name;
	}

}
