package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Client implements Serializable {
	private static final long serialVersionUID = 1L;

	private String name;
	private String adress;
	private int avialableAccounts = 1;

	private List<Account> accounts = new ArrayList<Account>();

	public Client(String name, String adress) {
		this.name = name;
		this.adress = adress;
	}

	@Override
	public String toString() {
		return "Client [name=" + name + ", city=" + adress + "]";
	}

	public String getName() {
		return name;
	}

}
